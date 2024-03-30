package software.tux.polo;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        int intentos = 0;
        int intentosMax = 100; //habrá otra manera pero idk y null no deja so
        String intentostopalabra = "";
        //System.out.println(numeroaleatorio);
        System.out.println("El juego del número aleatorio.");
        while (intentosMax > 10){
            System.out.println("¿Cuantos intentos quieres tener? (Máximos 10)");
            intentosMax = scanner.nextInt();
        }

        System.out.println("¿Hastá qué numero quieres que genere el juego?");
        numero = scanner.nextInt();
        int numeroinfo = numero;
        int numeroaleatorio = ThreadLocalRandom.current().nextInt(1, numero); //generar el número aleatorio y definirlo

        while (numero != numeroaleatorio && intentos < intentosMax) { //Bucle para comprobar el número aleatorio y dar 3 intentos
            intentos = intentos+1;
            System.out.println("Introduce un número del 1 al "+ numeroinfo +":");
            numero = scanner.nextInt();
        }

        if(numero == numeroaleatorio) {
            switch (intentos) { //para definir primera, segunda, tercera vez sistema "eficiente"
                case 1:
                    intentostopalabra = "primera";
                break;
                case 2:
                    intentostopalabra = "segunda";
                break;
                case 3:
                    intentostopalabra = "tercera";
                break;
                case 4:
                    intentostopalabra = "cuarta";
                    break;
                case 5:
                    intentostopalabra = "quinta";
                    break;
                case 6:
                    intentostopalabra = "sexta";
                    break;
                case 7:
                    intentostopalabra = "séptiva";
                    break;
                case 8:
                    intentostopalabra = "octava";
                    break;
                case 9:
                    intentostopalabra = "novena";
                    break;
                case 10:
                    intentostopalabra = "décima";
                    break;
            }
            System.out.println("Felicidades! Adivinaste el número aleatorio.\nEl número era: " + numeroaleatorio + " \nY lo adivinaste a la " + intentostopalabra + " vez.");
            System.exit(0); //System.exit así saldrá sin que se ejecute el if de abajo, de esta manera si al tercer intento lo adivinaste te saldrá el felicidades no el intentos
        }

        if(intentos >= 3){
            System.out.println("Has tenido "+ intentosMax +" intentos para comprobar el número pero no lo adivinaste.");
            System.exit(0);
        }


    }
}
