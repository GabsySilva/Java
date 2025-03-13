import java.util.Scanner;

public class desconto{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String sexo ="";
        String nome = "";
        Double preco = 0.0;
        Double valorFinal = 0.0;
        Double desconto = 0.0;

        System.out.println("Informe o nome do cliente  ");
        nome = entrada.nextLine();

        System.out.println("Informe o sexo  Feminino ou Masculino");
        sexo = entrada.nextLine();

        System.out.println("Informe o valor da compra ");
        preco = entrada.nextDouble();

        if(sexo.equalsIgnoreCase("Feminino")){
           desconto = 0.10;
        }
        else if(sexo.equalsIgnoreCase("Masculino")){
            desconto = 0.05;
        }
        else{
            System.out.println("Sexo invalido");
            entrada.close();
            return;
        }

        valorFinal = preco * (1 - desconto);

        System.out.println("Cliente: " + nome);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
    }
}