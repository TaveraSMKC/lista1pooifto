import java.util.Scanner;

public class lista1n2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o valor do Dolar atual: ");
        double dolar = scanner.nextDouble();

        double valorfinal = n1*dolar;

        System.out.println(String.format("O valor em dolares é: %.2f", valorfinal));

    }
}
