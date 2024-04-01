package software.tux.polo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[]{
            "primera", //0
            "segunda",
            "tercera",
            "cuarta",
            "quinta",
            "séptima",
            "octava",
            "novena",
            "décima",
        };
        int numero = 0;
        int intentos = 0;
        int intentosMax = 100; //habrá otra manera pero idk y null no deja so
        //System.out.println(numeroaleatorio);
        System.out.println("El juego del número aleatorio.");
        while (intentosMax > 10){
            System.out.println("¿Cuantos intentos quieres tener? (Máximos 10)");
            intentosMax = scanner.nextInt();
        }

        while (numero <= 1){
            System.out.println("¿Hastá qué numero quieres que genere el juego?");
            numero = scanner.nextInt();
        }


        int numeroinfo = numero;
        int numeroaleatorio = ThreadLocalRandom.current().nextInt(1, numero); //generar el número aleatorio y definirlo

        while (numero != numeroaleatorio && intentos < intentosMax) { //Bucle para comprobar el número aleatorio y dar 3 intentos
            intentos = intentos+1;
            System.out.println("Introduce un número del 1 al "+ numeroinfo +":");
            numero = scanner.nextInt();
        }

        if(numero == numeroaleatorio) {

            System.out.println("Felicidades! Adivinaste el número aleatorio.\nEl número era: " + numeroaleatorio + " \nY lo adivinaste a la " + array[intentos-1] + " vez."); //el -1 es porque el array empieza desde el 0 no desde el 1
            System.exit(0); //System.exit así saldrá sin que se ejecute el if de abajo, de esta manera si al tercer intento lo adivinaste te saldrá el felicidades no el intentos
        }

        if(intentos >= intentosMax){
            System.out.println("Has tenido "+ intentosMax +" intentos para comprobar el número pero no lo adivinaste.");
            System.exit(0);
        }


    }
}
