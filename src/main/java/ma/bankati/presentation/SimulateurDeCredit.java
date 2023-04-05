package ma.bankati.presentation;

import dao.CreditDao;
import dao.IDao;
import metier.CreditMetier;
import metier.IMetierCredit;
import model.Credit;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;




public class SimulateurDeCredit {
    static ICreditController creditController;
    static Scanner clavier = new Scanner(System.in);
    private static boolean estUnNombre(String input){
        try { Integer.parseInt(input);
            return true;
        }catch (Exception e){ return false;} }
    public static void test1(){
        var dao = new CreditDao();
        var metier = new CreditMetier();
        var controleur =new CreditController();
        metier.setCreditDao(dao);
        controleur.setCreditMetier(metier);
        String rep ="";
        do {
            System.out.println("[test1]=>calcule de mensualite de credit ");
            try {
                String input ="";
                while (true){
                    System.out.println("=>entrer l id du credit");
                    input= clavier.nextLine();
                    if (estUnNombre(input))break;
                    System.out.println("entrer non valide");
                }
                long id = Long.parseLong(input);
                controleur.afficher_Mensualite(id);
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }while (!rep.equalsIgnoreCase("oui"));
        System.out.println("au revoir");

    }

    public static void test2() throws Exception{
        String daoClass ;
        String serviceClass ;
        String ControllerClass ;

        Properties properties = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesFile = classLoader.getResourceAsStream("src/presentation/config.properties");
        if(propertiesFile==null)throw new Exception("fichier config introuvable");
        else{
            try{
                properties.load(propertiesFile);
                 daoClass = properties.getProperty("DAO");
                 serviceClass = properties.getProperty("service");
                 ControllerClass= properties.getProperty("Controller");
                 propertiesFile.close();
            }catch (IOException e){
                throw new Exception("probleme de chargement des propriete du fichier config");
            } finally {
                properties.clear();
            }
            try {
                Class cDao= Class.forName(daoClass);
                Class cMetier= Class.forName(serviceClass);
                Class cController =Class.forName(ControllerClass);

                var dao =(IDao<Credit,Long>)cDao.getDeclaredConstructor().newInstance();
                var metier = (IMetierCredit) cMetier.getDeclaredConstructor().newInstance();
                creditController = (ICreditController) cController.getDeclaredConstructor().newInstance();
                Method setDao = cMetier.getMethod("setCreditDao",IDao.class);
                setDao.invoke(metier,dao);
                Method setMetier = cController.getMethod("setCreditMetier",IMetierCredit.class);
                setMetier.invoke(creditController,metier);
                creditController.afficher_Mensualite(1L);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)throws Exception {test2();}
}
