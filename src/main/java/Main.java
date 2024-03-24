import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite os dois números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        // Verifica qual número é menor para definir o início e o fim do intervalo
        int inicio, fim;
        if (numero1 < numero2) {
            inicio = numero1;
            fim = numero2;
        } else {
            inicio = numero2;
            fim = numero1;
        }

        // Imprime os números no intervalo compreendido por eles e calcula a soma
        System.out.println("Números no intervalo entre " + inicio + " e " + fim + ":");

        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números no intervalo é: " + soma);

        scanner.close();
    }
}
