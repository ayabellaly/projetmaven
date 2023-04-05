package ma.bankati.model;

import java.util.Date;
import java.util.Objects;

public class Compte {

    long idc;
    Date datecreation;
     double solde;
     Client proprietaire;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte compte)) return false;
        return idc == compte.idc && Double.compare(compte.solde, solde) == 0 && Objects.equals(datecreation, compte.datecreation) && Objects.equals(proprietaire, compte.proprietaire);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "idc=" + idc +
                ", datecreation=" + datecreation +
                ", solde=" + solde +
                ", proprietaire=" + proprietaire +
                '}';
    }
}
