import java.util.Scanner;

public class lista1n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salario: ");
        double salario = scanner.nextDouble();
        double aumento = salario* 0.15;
        double valorfinal = salario+aumento;

        System.out.println(String.format("O valor do Salario com o aumento é de: %.2f", valorfinal));

    }
}
