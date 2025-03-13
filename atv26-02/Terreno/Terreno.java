import java.util.Scanner;

public class Terreno{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Double largura = 0.0;
        Double comprimento = 0.0;
        Double area = 0.0;

        System.out.println("Informe a largura");
        largura = entrada.nextDouble();

        System.out.println("Informe o comprimento");
        comprimento = entrada.nextDouble();

        area = largura * comprimento;

        if(area < 100){
            System.out.println("Terreno popular");
        }
        else if(area >= 100 && area <= 500){
            {
                System.out.println("Terreno Master");
            }
        }
        else{
                System.out.println("Terreno VIP");
        }
        System.out.println("Possui area de " + area + " m2");
    }
}