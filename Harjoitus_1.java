import java.util.Scanner;

public class Harjoitus_1 {

  public static void main (String [] args){

    Scanner console = new Scanner(System.in);

    int numero;
    int summa = 0;
    int lukumaara = 0;
    double keskiarvo = 0.0;
    int suurin = Integer.MIN_VALUE;
    int pienin = Integer.MAX_VALUE;

    do
    {
      System.out.print("Anna jokin kokonaisluku \n");
      numero = console.nextInt();

      if (numero > 0){
        lukumaara++;
        summa = summa + numero;

        if (numero > suurin){
          suurin = numero;
        }

        if (numero < pienin){
          pienin = numero;
        }
      }


    }while (numero > 0);

    if (lukumaara > 0){
      keskiarvo = (double)summa/lukumaara;
      System.out.printf("Annettujen lukujen keskiarvo on %.2f %n", keskiarvo);
      System.out.printf("Annetuista luvuista suurin on %d ja pienin on %d %n", suurin, pienin);
    }else{
      System.out.println("Et syottanyt yhtaan kelvollista lukua \n");
    }
  }
}
