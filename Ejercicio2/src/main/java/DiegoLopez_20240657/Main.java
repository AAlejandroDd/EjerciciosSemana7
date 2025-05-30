package DiegoLopez_20240657;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean PostandNegat = false;

        //PARA SOLO NUMEROS
        while(!PostandNegat) {
            System.out.println("Ingrese un numero");

            if (sc.hasNextInt()){
                num = sc.nextInt();
                PostandNegat = true;
            } else {
                System.out.println("no valido");
                sc.next();
            }
        }

        if (num % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }
}