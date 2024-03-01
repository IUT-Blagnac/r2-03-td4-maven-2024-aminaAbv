
/**
 * TP1 dev2
 *
 * @Abayev Amina
 */
import java.util.Calendar;

public class ProgrammePersonne
{
    public static void main(String arguments[]) {
        Personne pers;
        pers = new Personne(); 
        
        pers.prenom = "Thelma";
        pers.anneeN = 1995;
        pers.age = Calendar.getInstance().get(Calendar.YEAR) - pers.anneeN ;
        
        System.out.println("pers.prenom = "+pers.prenom);
        System.out.println("pers.anneeN = "+pers.anneeN);
        System.out.println("pers.age = "+pers.age);
        
        System.out.println("----------------------------");
        
        Personne pers2;
        pers2 = new Personne("Amina", 2005, 18);
        
        System.out.println("2eme pers - Prénom = "+pers2.prenom);
        System.out.println("2eme pers - Date de naissance = "+pers2.anneeN);
        System.out.println("2eme pers - age = "+pers2.age);
  }
}

