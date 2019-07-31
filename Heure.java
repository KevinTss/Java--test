import java.util.Scanner;

public class Heure { 

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

  public static void heurebis(int nombre) {
    int hour, min, sec, reste;

    hour = nombre / 3600;
    reste = nombre % 3600;

    min = reste / 60;
    sec = reste % 60;

    System.out.println(hour + " heures, " + min + " minutes et " + sec + " secondes"); 
  }
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre un nombre de secondes");

    int input = scan.nextInt();

    heure(input);
    heurebis(input);

  }

}
