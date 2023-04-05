package ma.bankati.dao.daoMySql;

import com.sun.jdi.connect.spi.Connection;
import dao.Factory;
import dao.IDao;
import model.*;

import java.sql.SQLException;

public  class factoryMySql extends Factory {

    private  static Connection connection ;
    private String url,login , pass;




    private factoryMySql(String url,String Login, String pass) throws SQLException{}


    public static  Connection getConnection;

    public static Factory INSTANCE() {
    }

    @Override
    public IDao<Client, Long> getClientDao() {
        return null;
    }

    @Override
    public IDao<Compte, Long> getCompteDao() {
        return null;
    }

    @Override
    public IDao<Admin, Long> getAdminDao() {
        return null;
    }

    @Override
    public IDao<Utilisateur, Long> getUtilisateurDao() {
        return null;
    }

    @Override
    public IDao<Banque, Long> getBanqueDao() {
        return null;
    }




}
