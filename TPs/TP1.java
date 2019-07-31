public class TP1 { 
  
  /**

    Exercice 1 

    Écrivez une méthode heure qui affiche un
    certain nombre de secondes sous la forme:
    _ _ heures, _ _ minutes et _ _ secondes

    Par exemple 9999 donner: 
    2 heures, 46 minutes et 39 secondes
   */

  public static void heure(int nombre) {
    int hour, min, sec, reste;

    reste = nombre;

    hour = reste / 3600;
    reste = reste - hour * 3600;

    min = reste / 60;
    reste = reste - min * 60;

    sec = reste;

    System.out.println(hour + " heures, " + min + " minutes et " + sec + " secondes"); 
  }

  public static void heure_bis(int nombre) {
    int hour, min, sec, reste;

    hour = nombre / 3600;
    reste = nombre % 3600;

    min = reste / 60;
    sec = reste % 60;

    System.out.println(hour + " heures, " + min + " minutes et " + sec + " secondes"); 
  }

  /**
    Exercice 2

    Écrivez une méthode moyenne qui prend deux
    entiers en entrée, et renvoie leur moyenne
    (float) en sortie.

    Ensuite, écrivez dans le main un programme
    qui demande à l’utilisateur d’entrer les deux
    nombres, avant d'appeler la méthode et
    d’afficher le résultat.
   */

  public static void moyenne(int x, int y) {
    float moyenne = (x + y) / 2;

    System.out.println("La moyenne de " + x + " et " + y + " est " + moyenne); 
  }

  public static void moyenne_bis() {
    // TBD
  }

  /**
    Exercice 3

    Écrivez une méthode volume qui reçoit le
    rayon du sphère en entrée, et renvoie en sortie
    le volume du sphère (4πr³/3), ainsi qu'une
    méthode surface qui renvoie sa surface (4πr²).
   */

  public static void volume(int rayon) {
    float volume = (float) (4 * Math.PI * Math.pow(rayon, 3)) / 3;

    System.out.println(volume);
  }

  /**
    Exercice 4

    Écrivez une méthode changer qui reçoit une
    chaîne de caractère en entrée, et renvoie en
    sortie cette chaîne où toutes les lettres 'r'
    seront remplacées par 'l'.

    Pour aller plus loin, vous pouvez également
    permettre à l’utilisateur de rentrer la lettre à
    remplacer ainsi que la lettre qui la remplacera.
   */

  public static void changer(String chaine) {
    String chaineChangee = chaine.replace("r", "l");

    System.out.println(chaineChangee);
  }

  public static void changer_bis(String chaine) {
    // TBD
  }

  /**
    Exercice 5

    Écrivez une méthode mirroir qui prend 5 lettres
    en entrée et renvoie en sortie une chaîne de
    caractères composée de ces 5 lettres dans
    l'ordre inverse.
    */

  public static void mirroir(String chaine) {
    String reverse = "";

    for(int i = chaine.length() - 1; i >= 0; i--) {
      reverse = reverse + chaine.charAt(i);
    }

    System.out.println(reverse);
  }
  
  public static void main(String[] args) {
    heure(9999);
    heure_bis(9999);
    moyenne(4, 10);
    // moyenne();
    volume(3);
    changer("Recherchez les r dans cette phrase.");
    // changer_bis();
    mirroir("abcdef");
  }

}
