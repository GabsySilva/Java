import java.util.Scanner;

public class Muro {
    public static void main(String[] args) {
        double comprimento = 0.0;
        double altura = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.println("Informe a largura: ");
        altura = entrada.nextDouble();

        System.out.println("A area do muro e: " +  comprimento * altura);
        entrada.close();
    }
}
