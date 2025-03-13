import java.util.Scanner;

public class Salario{   
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Double horasTrab = 0.0;
        Double valorHora = 0.0;
        Double percentualDesc = 0.0;
        Double salarioBruto = 0.0;
        Double salarioLiquido = 0.0;
        Double valorDesconto = 0.0;

        System.out.println("Informe o numero de horas trabalhados");
        horasTrab = entrada.nextDouble();

        System.out.println("Informe o valor da hora de trabalho");
        valorHora = entrada.nextDouble();

        System.out.println("Informe a porcentagem de desconto");
        percentualDesc = entrada.nextDouble();

        salarioBruto = horasTrab*valorHora;
        valorDesconto = percentualDesc/100;
        valorDesconto = valorDesconto * salarioBruto;
        salarioLiquido = salarioBruto - valorDesconto;

        System.out.println("Salario bruto " + salarioBruto);
        System.out.println("Valor do desconto " + valorDesconto);
        System.out.println("Salario liquido " + salarioLiquido);
    }
}