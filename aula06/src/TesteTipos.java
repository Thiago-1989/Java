public class TesteTipos {
    public static void main(String[] args) {
        int idade = 20;
        /*
         * String valor = idade;
         * String valor = (String) idade;
         */
        String valor = Integer.toString(idade);
        int idade2 = Integer.parseInt(valor);

        String temp = "30.5";
        Float tempStr = Float.parseFloat(temp);

    }
}
