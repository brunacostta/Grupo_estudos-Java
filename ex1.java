package Do_While;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo Novo Salário");
        System.out.println("\t 1 - Serviços Gerais");
        System.out.println("\t 2 - Vigia");
        System.out.println("\t 3 - Recepcionista");
        System.out.println("\t 4 - Vendedor");
        System.out.println("\t 0 - Sair");
        System.out.print("\t\nQual o seu cargo:");

        int op = sc.nextInt();
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
                System.out.printf("Seu nova salário é de: R$ %f.", calculo);

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
                System.out.printf("Seu nova salário é de: R$ %f.", calculo);

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
                System.out.printf("Seu nova salário é de: R$ %f.", calculo);

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
                System.out.printf("Seu nova salário é de: R$ %f.", calculo);

                break;

            case 0:
                System.out.println("Saindo ...");
                break;

            default:

                System.out.println("Opcao invalida");
                break;
        }


    }
}
