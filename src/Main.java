import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int resultado = soma (1, 2, 3);
        System.out.println("Ex 1: " + resultado);

        int[] numeros = {1,2,3,4,5};
        int resultadoArray = soma(numeros);
        System.out.println("Ex 2: " + resultadoArray);

        System.out.println("Ex 3: " + calculaMedia(numeros));

        System.out.println("Ex 4: " + localizaMaior(numeros));

        String palavra = "Argentina";
        System.out.println("Ex 5: " + contaVogais(palavra));

        System.out.println("Ex 6: " + contaCaracteres(palavra, 'a'));

        System.out.println("Ex 7: " + inverteString(palavra));

        System.out.println("Ex 8: " + palavra +" "+ ehPalindromo(palavra));

        System.out.println("Ex 9: " + );
    }

    //1. CRIE UM METODO QUE RETORNE A SOMA DE 3 NUMEROS INTEIROS
    static int soma (int a, int b, int c) {
        return a + b + c;
    }
    //2. RECEBE ARRAY DE INTEIROS E RETORNA A SOMA
    static int soma (int[] inteiros) {
        int resultado = 0;
        for (int i = 0;i < inteiros.length;i++) {
            resultado = resultado + inteiros[i];
        }
        return resultado;
    }
    //3. CALCULA A MEDIA DE UM ARRAY DE INTEIROS
    static double calculaMedia (int[] inteiros) {
        return (double) soma(inteiros)/inteiros.length;

    }
    //4. RETORNA O MAIOR VALOR DE UM ARRAY DE INTEIROS
    static int localizaMaior(int[] inteiros) {
        int maior = inteiros[0];
        for (int i = 0;i < inteiros.length;i++) {
            if (inteiros[i] > maior) {
                maior = inteiros[i];
            }
        }
        return maior;
    }
    //5. RETORNA O NUMERO DE VOGAIS EM UMA STRING
    static int contaVogais(String texto) {
        int vogais = 0;
        for (int i = 0;i<texto.length();i++) {
            switch(texto.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    vogais++;
            }
        }
        return vogais;
    }
    //6.
    static int contaCaracteres (String texto, char caractere) {
          int caracteres = 0;
          for (int i = 0;i<texto.length();i++) {
              if (texto.charAt(i) == caractere) {
                  caracteres++;
              }
          }
          return caracteres;
    }
    //7. METODO QUE INVERTE STRING
    static String inverteString(String str) {
        String stringInvertida = "";
        for(int i = str.length() - 1;i >= 0;i--) {
            stringInvertida += str.charAt(i);
        }
        return stringInvertida;
    }
    //8.
    static String ehPalindromo (String palavra) {
        boolean palindromo = false;
        String palindromoS = "é palindromo";
        String palindromoN = "Nao é palindromo";

        String palavraInvertida = inverteString(palavra);
        if (palavraInvertida.equalsIgnoreCase(palavra)) {
            palindromo = true;
            return palindromoS;
        }
        else {
            return palindromoN;
        }
    }
    static int fill (int[] numeorsIn) {


    }
}

