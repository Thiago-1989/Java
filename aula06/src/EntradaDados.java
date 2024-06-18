import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = scan.nextLine();
        System.out.print("Idade: ");
        int age = scan.nextInt();
        System.out.print("Altura: ");
        float height = (float) scan.nextFloat();
        System.out.print("Peso: ");
        double weight = scan.nextDouble();
        System.out.print("Sexo: ");
        char gender = scan.next().charAt(0);
    }
}
