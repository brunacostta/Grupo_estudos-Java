package For;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============Exercicio 2 - Ler valor inteiro===================\n");

        System.out.println("Quantos números quer digitar: ");
        int numero = sc.nextInt();

        int num = 0;
        int cont = 0;

        for (int i = 0; i < numero; i++) {
            System.out.printf("%d Digite um número: \n", i+1);
            num = sc.nextInt();
            if (num >=10 && num<=20) {
                cont++;
            }
        }
        System.out.printf("Números dentro do intervalo %d\n", cont);
        System.out.printf("Números fora do intervalo %d", numero - cont);
    }
}

