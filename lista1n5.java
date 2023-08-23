import java.util.Scanner;

public class lista1n5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do comprimento: ");
        int b = scan.nextInt();
        System.out.println("Digite o valor da largura: ");
        int h = scan.nextInt();
        int Area = b + h;

        System.out.println("O valor da area do terreno é de : " + Area + " metros");

    }
}
