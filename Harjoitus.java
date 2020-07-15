import java.util.Scanner;

public class Harjoitus{
    public static void main(String[] args){

        Scanner lukija = new Scanner(System.in);

        int luku = 0;
        int summa = 0;
        double keskiarvo = 0.0;
        int lukumaara = 0;
        int suurin = Integer.MIN_VALUE;
        int pienin = Integer.MAX_VALUE;

        do {

        System.out.println("Anna positiivisia kokonaislukuja");
        luku = lukija.nextInt();

        if (luku > 0){
            lukumaara++;
            summa = summa + luku;

            if (luku > suurin){
                suurin = luku;
            }
            if(luku < pienin){
                pienin = luku;
            }
        }

        } while (luku >= 0);

        if (lukumaara > 0){
            keskiarvo = (double)summa/lukumaara;
            System.out.printf("Lukujen summa on %d %n", summa);
            System.out.printf("Lukujen keskiarvo on %.3f %n", keskiarvo);
            System.out.printf("Pienin luku on %d ja suurin %d %n", pienin, suurin);
        } else {
            System.out.println("Et syottanyt yhtaan kelvollista lukua!");
        }
    }
}