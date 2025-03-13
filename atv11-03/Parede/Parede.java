import java.util.Scanner;

public class Parede
{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        int comprimento = 0;
        int altura = 0;
        int area = 0;

        int lataTintaLitro = 0;
        int quantidadeLataTinta = 0;
        int custoTotalTinta = 0;

        System.out.println("Informe o comprimento");
        comprimento = entrada.nextInt();

        System.out.println("Informe a altura");
        altura = entrada.nextInt();
        
        area = comprimento * altura;
        quantidadeLataTinta = area/3;
        lataTintaLitro = quantidadeLataTinta/4;
        custoTotalTinta = lataTintaLitro*40;


        System.out.println("A area do muro e  " + area + "M2");
        System.out.println("A quantidade necessaria e " + lataTintaLitro + " lata de tinta");
        System.out.println("O valor a ser gasto e R$" + custoTotalTinta);
    }
}

