package ma.bankati.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class Utilisateur {
  protected long id;
   String login;
   String pass;
   String role;
   String nom;



    }

