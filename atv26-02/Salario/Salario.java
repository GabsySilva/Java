import java.util.Scanner;

public class Salario
{
    public static void main(String[] args)
    {
        int salario = 0;
        int diasTrab = 0;
        String nome = "";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informar o nome do funcionario:  ");
        nome = entrada.nextLine();

        System.out.println("Informar os dias trabalhados:  ");
        diasTrab = entrada.nextInt();

        salario = (diasTrab * 200);
        System.out.println("O funcionario " + nome + " tera o salario de " + salario);

    }
}