import java.util.Scanner;

public class Salario{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nome = "";
        Double salario = 0.0;
        Double anosTrab = 0.0;
        Double somaSalarios = 0.0;

        for(int i = 1; i <= 10; i++){

            System.out.println("Informe o nome ");
            nome = entrada.nextLine();

            System.out.println("Informe o salario ");
            salario = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("Informe os anos trabalhados");
            anosTrab = entrada.nextDouble();
            entrada.nextLine();

            if(anosTrab <= 3){
                salario = (1 + 0.05) * salario;
            }
            else if(anosTrab >= 3 && anosTrab <= 10){
                salario = (1 + 0.15) * salario;
            }
            else{
                salario = (1 + 0.2) * salario;
            }

            somaSalarios += salario;
    
            System.out.println("O funcionario " + nome + " teve aumento de " + salario);
            System.out.println("A soma de todos os salarios e " + somaSalarios);

        }

        
    } 
}