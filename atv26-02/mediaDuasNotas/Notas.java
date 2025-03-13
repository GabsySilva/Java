import java.util.Scanner;

public class Notas
{
    public static void main(String[] args)
    {
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        String aluno = "";
        Double media = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do aluno:  ");
        aluno = entrada.nextLine();

        
        System.out.println("Informe a primeira nota  ");
        nota1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota  ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;

        if(media > 7){
            System.out.println("O aluno " + aluno + " foi aprovado com media " + media);
        }
        else{
            
            if(media < 4){
                System.out.println("O aluno " + aluno + " foi aprovado com media " + media);
            }
            else{
                System.out.println("O aluno " + aluno + " foi reprovado com media " + media);
            }
        }
        
              
    }
}