
//Neste desafio, faça um programa que calcule o valor de H com N termos.
//
//Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (int i = 1; i <= n; i++) {
            h += 1/(double)i;
        }

        System.out.printf("%.2f",h);
    }
}



