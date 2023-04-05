package ma.bankati.dao;

import model.Credit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CreditDao implements IDao <Credit, Long> {
    public static Set<Credit> BdCredit(){
        return new HashSet<Credit>(
                Arrays.asList(
                        new Credit(1L,300000.0, 120,2.5,"hiba",0.0),
                        new Credit(2L,300000.0, 130,2.4,"aya",0.0),
                        new Credit(3L,300000.0, 110,2.6,"anissa",0.0)

        ));
    }

    public Credit trouverParId(Long id){

        return BdCredit().stream().filter(credi -> credi.getId()== id).findFirst().orElse(null);
    }


    }

