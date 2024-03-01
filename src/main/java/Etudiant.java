
/**
 * TP1 dev2
 *
 * @Abayev Amina
 */
public class Etudiant
{
    String nom;
    String prenom;
    String ine;
    Adresse adrss;
    char promo;
    
    Etudiant() {
        this.nom = "";
        this.prenom = "";
        this.ine = "";
        this.adrss = new Adresse();
        this.promo = '1';
    }
    
    Etudiant(String pfNom, String pfPrenom, String pfIne, char pfPromo, Adresse pfAdresse) {
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.ine = pfIne;
        this.promo = pfPromo;
        this.adrss = pfAdresse;
    }
}

