//  Importe du code ecrit quelque part dans Java
import java.util.Scanner;

// Crée mon moule
public class TP1 { 
  
  // Ma function "main" qui est automatiquement
  // Appelé lorsque qu'on utilise la class
  public static void main(String[] args) {

    // Mettre une instance (objet) issue de la classe Scanner dans
    // une variable de type Scanner 'scan'
    Scanner scan = new Scanner(System.in);

    // Afficher dans mpon programme une phrase
    System.out.println("Entre ton nom");

    // Je vais placer ce que l'utilisateur entre dans une variable
    String userName = scan.nextLine();

    // Affiche le resultat concaténer 
    System.out.println("Nom est : " + userName); 
  }

}
