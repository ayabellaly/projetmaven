package ma.bankati.model;

public class Admin extends Utilisateur{
    private static Admin Admin =new Admin();
    public static Admin getInstance(){return Admin;}
    private  Admin(){
        login ="admin ";
        pass = "admin2000";
        role="admin";
        nom="aya";

    }




    }

