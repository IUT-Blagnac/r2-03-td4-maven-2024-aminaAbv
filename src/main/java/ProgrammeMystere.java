
/**
 * TP1 dev2
 *
 * @Abayev Amina
 */
public class ProgrammeMystere
{

    public static void main(String arguments[]) {
        // création d'un nouvel enregistrement
        Mystere var;   
        var = new Mystere();  
        var.chaine = "des machines";
        var.entier = -16;

        // affichage du contenu de ses champs
        System.out.println("var.chaine = "+var.chaine);
        System.out.println("var.entier = "+var.entier);

        // création d'un nouvel enregistrement
        Mystere var1;
        var1 = new Mystere(); 
        //var1 va prendre la valeur this dans le constructeur

        // affichage de la valeur des champs de var1        
        System.out.println("var1.chaine = "+var1.chaine);
        System.out.println("var1.entier = "+var1.entier);

        // création d'un nouvel enregistrement
        Mystere var2;
        var2 = new Mystere("Claire");

        // affichage de la valeur des champs de var2        
        System.out.println("var2.chaine = "+var2.chaine);
        System.out.println("var2.entier = "+var2.entier);

        
        // création d'un nouvel enregistrement
        Mystere var3 ;
        var3 = new Mystere(2);

        // affichage de la valeur des champs de var3
        System.out.println("var3.chaine = "+var3.chaine);
        System.out.println("var3.entier = "+var3.entier);

        
        // création d'un nouvel enregistrement
        Mystere var4 ;
        var4 = new Mystere("Laure",36);

        // affichage de la valeur des champs de var4
        System.out.println("var4.chaine = "+var4.chaine);
        System.out.println("var4.entier = "+var4.entier);

        
    }
}

