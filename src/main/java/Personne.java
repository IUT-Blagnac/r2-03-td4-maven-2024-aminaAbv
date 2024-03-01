
/**
 * TP1 DEV2
 *
 * @Abayev Amina
 */
public class Personne
{
    String prenom ;
    int anneeN ;
    int age ;
    
    Personne() {
        this.prenom = "Aucun";
        this.anneeN = 2023;
        this.age =  0;
    }
    
    Personne(String pfPrenom, int pfAnneN, int pfAge) {
        this.prenom = pfPrenom;
        this.anneeN = pfAnneN;
        this.age =  pfAge;
    }
}

