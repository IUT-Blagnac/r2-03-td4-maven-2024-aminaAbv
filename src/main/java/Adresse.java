
/**
 * TP1 dev2
 *
 * @Abayev Amina
 */
public class Adresse
{
    int rue;
    String nomRue;
    String codePostal;
    String ville;
    
    Adresse() {
        this.rue = 1;
        this.nomRue = "";
        this.codePostal = "";
        this.ville = "";
    }
    
    Adresse(int pfRue, String pfNomRue, String pfcodePostal, String pfVille) {
        this.rue = pfRue;
        this.nomRue = pfNomRue;
        this.codePostal = pfcodePostal;
        this.ville = pfVille;
    }
}

