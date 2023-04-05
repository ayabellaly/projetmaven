package ma.bankati.dao;

import model.*;

public class FactoryId extends Factory {
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
