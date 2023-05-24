package JavaExercises;

import java.util.Scanner;

public class PrimeNumber_OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int number = sc.nextInt();

        if(verify(number)){
            System.out.println("O número é primo");
        }else {
            System.out.println("O número não é primo");
        }
    }

    private static boolean verify(int number) {
        return number % 2 != 0;
    }
}
