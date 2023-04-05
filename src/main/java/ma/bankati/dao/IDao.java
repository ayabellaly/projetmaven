package ma.bankati.dao;

public interface IDao <T,ID>{
    T trouverParId(ID id);
}
