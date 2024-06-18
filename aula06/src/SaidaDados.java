public class SaidaDados {
    public static void main(String[] args) {
        float nota = 9.5f;
        System.out.print("Sua nota é " + nota);
        System.out.println("Sua nota é " + nota);
        String nome = "Thiago";
        System.out.printf("A nota de %s é %.1f\n", nome, nota);
        System.out.format("A nota de %s é %.1f\n", nome, nota);
    }
}
