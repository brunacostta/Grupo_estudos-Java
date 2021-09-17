package Do_While;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("=============Calculo Novo Salário===================\n");

        System.out.println("\t |1| Serviços Gerais   |2| Vigia    |3| Recepcionista    |4| Vendedor    |0| Sair");
        System.out.print("\t\nQual o seu cargo:\n");
        int op = sc.nextInt();

        while (op < 0 || op > 4){
            System.out.println("Opção invalida. Digite novamente.");
            op = sc.nextInt();
        }

        double calculo;
        double salario = 0;
        boolean invalido = true;

        //utilizando apenas while

        switch (op){
            case 1:
                System.out.println("Informe o seu salário: ");
                salario = sc.nextFloat();
                while (salario < 1) {
                    System.out.println("Salario inválido. Digite novamente: ");
                    salario = sc.nextFloat();
                }

                calculo = salario*1.5;
                System.out.printf("Seu novo salário é de: R$ %.2f.\n", calculo);
                break;

            //utilizando do-while
            case 2:
                do {
                    System.out.println("Informe o seu salário: ");
                    salario = sc.nextFloat();
                    if (salario < 1) {
                        System.out.println("Salario inválido. Digite novamente: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                calculo = salario*1.3;
                System.out.printf("Seu novo salário é de: R$ %.2f.", calculo);
                break;

            //utilizando apenas while
            case 3:
                System.out.println("Informe o seu salário: ");
                salario = sc.nextFloat();
                while (salario < 1) {
                    System.out.println("Salario inválido. Digite novamente: ");
                    salario = sc.nextFloat();
                }

                calculo = salario*1.25;
                System.out.printf("Seu novo salário é de: R$ %.2f.", calculo);
                break;

            //utilizando do-while
            case 4:
                do {
                    System.out.println("Informe o seu salário: ");
                    salario = sc.nextFloat();
                    if (salario < 1) {
                        System.out.println("Salario inválido. Digite novamente: ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                calculo = salario*1.15;
                System.out.printf("Seu novo salário é de: R$ %.2f.", calculo);
                break;

            case 0:
                System.out.println("Saindo ...");
                break;
        }
    }
}
