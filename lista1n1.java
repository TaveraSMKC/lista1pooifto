import java.util.Scanner;

public class lista1n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double numero = scanner.nextDouble();
        double cubo = numero * numero * numero;
        System.out.println("O resultado do numero " + numero + " ao cubo é " + cubo);

    }
}
