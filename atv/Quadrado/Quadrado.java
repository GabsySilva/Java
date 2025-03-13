import java.util.Scanner;

public class Quadrado
{
    public static void main(String args[])
    {
        double lado = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o lado do quadrado: ");
        lado = entrada.nextDouble();

        System.out.println("A area do quadrado e:  " + lado * lado);
        entrada.close();
    }
} 