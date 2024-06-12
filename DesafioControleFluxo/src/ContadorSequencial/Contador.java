package ContadorSequencial;
import java.util.Locale;
import java.util.Scanner;


//TODO: pede para digitar dois valores.
//imprime a sequência.
//Faz o Tratamento de exceções.

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para imprimir uma sequância entre números,");
        System.out.println("digite o primeiro número");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();
        scanner.close();


        try{
        sequenciador(numero1, numero2);
        
            
        } catch (ParametrosInvalidosException e) {
            // TODO: Trata da exceção caso o primeri numero seja maior.
            System.out.println(" O Primeiro número deve ser menor que o segundo!");
        }

    }

    public static void sequenciador(int entrada1, int entrada2) throws ParametrosInvalidosException  {
        if(entrada1>entrada2){
            throw new ParametrosInvalidosException();
        }
        for (int x = entrada1; x <= entrada2; x++) {
            System.out.println("Imprimindo Número " + x);
        }
    }
}
