import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] resultados = processarEntradas(scanner);
            exibirResultados(resultados);
        } finally {
            scanner.close();
        }
    }

    private static int[] processarEntradas(Scanner scanner) {
        int numeroPares = 0;
        int numeroImpares = 0;
        int numeroMultiplosDe5 = 0;

        while (true) {
            System.out.print("insira um número inteiro positivo (ou um número negativo para sair): ");
            if (!scanner.hasNextInt()) {
                System.out.println("insira apenas números inteiros.");
                scanner.next();
                continue;
            }
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                numeroPares++;
            }
            if (numero % 2 != 0) {
                numeroImpares++;
            }
            if (numero % 5 == 0) {
                numeroMultiplosDe5++;
            }
        }

        return new int[]{numeroPares, numeroImpares, numeroMultiplosDe5};
    }

    private static void exibirResultados(int[] resultados) {
        System.out.println("Resultados:");
        System.out.println("Numeros pares: " + resultados[0]);
        System.out.println("Numeros impares: " + resultados[1]);
        System.out.println("Multiplos de 5: " + resultados[2]);
    }
}
