import java.util.Scanner;
public class Desconto{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        Double horasTrab = 0.0;
        Double valorHora = 0.0;
        Double percDesconto = 0.0;
        Double salarioBruto = 0.0;
        Double valorDesc = 0.0;
        Double salarioLiq = 0.0;

        for(int i = 0; i <= 14; i++){

            System.out.println("Informe o numero de horas trabalhadas ");
            horasTrab = entrada.nextDouble();

            System.out.println("Informe o valor hora ");
            valorHora = entrada.nextDouble();

            System.out.println("Informe o perecentual de desconto ");
            percDesconto = entrada.nextDouble();

            salarioBruto = horasTrab * valorHora;
            valorDesc = percDesconto/100 * salarioBruto;
            salarioLiq = salarioBruto - valorDesc;

            System.out.println("Salario Bruto R$" + salarioBruto);
            System.out.println("percentual de desconto R$" + valorDesc);
            System.out.println("Salario liquido " + salarioLiq);
        }
    }
}