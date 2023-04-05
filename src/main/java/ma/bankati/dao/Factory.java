package ma.bankati.dao;

import dao.daoMySql.factoryMySql;
import model.*;

public abstract class Factory {



    public static final int MySQL_DAO_FACTORY = 0;
    public static final int File_DAO_FACTORY=1;
    public abstract  IDao<Client ,Long> getClientDao();

    public abstract  IDao<Compte,Long> getCompteDao();
    public abstract  IDao<Admin,Long> getAdminDao();
    public abstract  IDao<Utilisateur,Long> getUtilisateurDao();
    public abstract  IDao<Banque,Long> getBanqueDao();

    public static Factory getFactory(int type ){
        switch (type)
            case MySQL_DAO_FACTORY:
            return factoryMySql.INSTANCE();
         case File_DAO_FACTORY:
             return new FactoryId();
        default:
            return null;


    }






















}
