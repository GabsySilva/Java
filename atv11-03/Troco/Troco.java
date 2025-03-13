import java.util.Scanner;

public class Troco{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        Double valorCompra = 0.0;
        Double valorPago = 0.0;
        Double troco = 0.0;

        System.out.println("Informe o valor compra  ");
        valorCompra = entrada.nextDouble();

        System.out.println("Informe o valor pago  ");
        valorPago = entrada.nextDouble();

        troco = valorPago - valorCompra;
        System.out.println("O troco para devolver ao cliente e R$" + troco);
    }
}