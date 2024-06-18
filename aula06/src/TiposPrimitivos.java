public class TiposPrimitivos {
    public static void main(String[] args) {
        String name = "Thiago"; // String é uma classse assim como Integer
        String nome = new String("João"); // Podemos criar um objeto "nome" da classe "String" e encapsular o valor "João"

        int age = 35;
        Integer numero = 123;
        Integer idade = new Integer(23); // Criamos um objeto idade da classe Integer (wrapper class)

        float altura = 1.65f;
        double salario = 10000.55;

        char sexo = 'M';
        Character letra = 'A';

        boolean casado = (boolean) true;
        boolean casado2 = (boolean) false;
        Boolean casado3 = (Boolean) Boolean.TRUE;
        Boolean casado4 = new Boolean(true);

        System.out.println("Hello world!");
        System.out.println(idade);
    }
}