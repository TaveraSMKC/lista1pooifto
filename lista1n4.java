import java.util.Scanner;

public class lista1n4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = scanner.nextDouble();

        double acrescimo1 = n1*0.30;
        double acrescimo2 = n2*0.25;

        double n1final = n1+acrescimo1;
        double n2final = n2+acrescimo2;

        System.out.println(String.format("O valor do primeiro acrescimo é de : %.2f",n1final));
        System.out.println(String.format("O valor do segundo acrescimo é de : %.2f",n2final));

    }
}
