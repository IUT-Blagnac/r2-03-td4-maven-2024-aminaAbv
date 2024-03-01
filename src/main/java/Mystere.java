
/**
 * TP1 dev2
 *
 * @Abayev Amina
 */
public class Mystere {
    
  String chaine ;
  int entier ;
    
  Mystere(){ 
        this.chaine = "Nouveau" ;  
        // this.chaine est le champ chaine du nouvel objet
        this.entier = 0 ;
  }

  Mystere(String pfValeurInitialeChaine){ 
        this.chaine = pfValeurInitialeChaine ;
        this.entier = 1 ;
  }

  Mystere(int pfValeurInitialeEntier){ 
        this.chaine = "Bla bla" ;
        this.entier = pfValeurInitialeEntier ;
  }

  Mystere(String pfValeurInitialeChaine, int pfValeurInitialeEntier){ 
        this.chaine = pfValeurInitialeChaine ;
        this.entier = pfValeurInitialeEntier ;
  }
}

