import java.util.Scanner;

public class Tinta
{
    public static void main(String args[])
    {
        double comprimento = 0.0;
        double altura = 0.0;
        double area = 0.0;
        double lata = 0.0;
        double tinta = 6;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o comprimento do muro:  ");
        comprimento = entrada.nextDouble();

        System.out.println("Informe a altura do muro:  ");
        altura = entrada.nextDouble();

        area = comprimento * altura;
        lata = area / tinta;

        System.out.println("A area para pintar o muro e " + area + "m2 sera necessario " + lata + " latas de tinta");
        entrada.close();
    }
}