import java.util.Scanner;

public class Salario{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nome = "";
        Double salario = 0.0;
        Double anosTrab = 0.0;

        System.out.println("Informe o nome do funcionario ");
        nome = entrada.nextLine();

        System.out.println("Informe o salario do funcionario ");
        salario = entrada.nextDouble();

        System.out.println("Informe os anos trabalhados do funcionario ");
        anosTrab = entrada.nextDouble();

        if(anosTrab <= 3){
            salario =  (1 + 0.05) * salario;
        }
        else if(anosTrab >= 3 && anosTrab <= 10){
            salario = (1 + 0.15) * salario;
        }
        else{
            salario = (1 + 0.2) * salario;
        }

        System.out.println("O funcionario " + nome + " tera o aumento de  R$" + salario);
    }
}