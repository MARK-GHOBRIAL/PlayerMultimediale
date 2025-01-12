import Progetto.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for(int i=0 ; i<5 ; i++){
            System.out.println("scegli il tipo di elemento, numero" + (i+1));
            System.out.println("1:audio");
            System.out.println("2:video");
            System.out.println("3:immagine");

            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("inserisci il titolo");
            String titolo = scanner.nextLine();


            switch (scelta){
                case 1 :
                    System.out.println("inserisci durata del brano");
                    int durataDelBrano = scanner.nextInt();
                    System.out.println("scegli il volume");
                    int volume = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Audio(nome, durataDelBrano, volume);
                    break;

                case 2 :
                    System.out.println("inserisci durata del video");
                    int durataDelVideo = scanner.nextInt();
                    System.out.println("scegli il volume");
                    int volumeDelVideo = scanner.nextInt();
                    System.out.println("inserisci luminosità");
                    int luminosità = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(nome, durataDelVideo, volumeDelVideo, luminosità);
                    break;
            }
        }
    }
}