import java.util.Scanner;

public class lista1n6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos cavalos há no haras: ");
        int ncavalos = scan.nextInt();

        int ferraduras = ncavalos*4;

        System.out.println("O número de ferraduras necessária para equipar os cavalos é de: " + ferraduras + " ferraduras");

    }
}
