public class Boucle {


  public static void w(int number) {

    int cpt = 1;

    // Tant que la condition est vraie
    while (cpt <= number) 
    {
      System.out.println("Compteur :" + cpt + " est-til égal à " + number + " ?");

      cpt = cpt + 1;
    }

  }

  public static void f(int number) {

    for ( int cpt = 1 ; cpt <= number ; cpt = cpt + 1 ) 
    {
      System.out.println("Compteur :" + cpt + " est-til égal à " + number + " ?");
    }

  }

  public static void main(String[] args) {

    w(3);
    f(10);

  }

}
