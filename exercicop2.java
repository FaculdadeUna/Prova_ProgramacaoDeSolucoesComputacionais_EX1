import java.util.Scanner;

public class exercicop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 – Somar");
            System.out.println("2 – Subtrair");
            System.out.println("3 – Multiplicar");
            System.out.println("4 – Dividir");
            System.out.println("5 – Sair");

            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção erraada. Por favor, escolha uma opção entre 1 e 5.");
                    break;
            }
        }
    }
}