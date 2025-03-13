import java.util.Scanner;

public class Somar{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Double n1 = 0.0;
        Double n2 = 0.0;
        Double n3 = 0.0;
        Double n4 = 0.0;
        Double n5 = 0.0;
        Double n6 = 0.0;
        Double n7 = 0.0;
        Double soma = 0.0;
        Double media = 0.0;

        System.out.println("Informe o num 1  ");
        n1 = entrada.nextDouble();

        System.out.println("Informe o num 2  ");
        n2 = entrada.nextDouble();

        System.out.println("Informe o num 3  ");
        n3 = entrada.nextDouble();

        System.out.println("Informe o num 4  ");
        n4 = entrada.nextDouble();

        System.out.println("Informe o num 5  ");
        n5 = entrada.nextDouble();

        System.out.println("Informe o num 6  ");
        n6 = entrada.nextDouble();

        System.out.println("Informe o num 7  ");
        n7 = entrada.nextDouble();

        soma = (n1 + n2 + n3 + n4 + n5 + n6 + n7);
        media = soma/7;

        System.out.println("A soma dos 7 num e " + soma);
        System.out.println("A media e " + media);
    }
}