import java.util.Scanner;

public class Media  
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double nota1; 
        double nota2; 
        double nota3; 
        double media; 

        System.out.println("Informe seu nome:..");
        nome = entrada.nextLine();

        System.out.println("Informe valor nota1:..");
        nota1 = entrada.nextInt();

        System.out.println("Informe valor nota2:..");
        nota2 = entrada.nextInt();

        System.out.println("Informe valor nota3:..");
        nota3 = entrada.nextInt();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Ola " + nome + " sua nota é " + media);

        if(media>6)
        {
            System.out.println("Parabens vc foi aprovado");
        }
        else
        {
            System.out.println("Vc foi reprovado");
        }
    }
}