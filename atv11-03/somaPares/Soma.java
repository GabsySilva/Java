import java.util.Scanner;

public class Soma{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        int somaPares = 0;

        System.out.println("Informe o primeiro numero ");
        n1 = entrada.nextInt();

        System.out.println("Informe o segundo numero");
        n2 = entrada.nextInt();

       for(int i = n1; i <= n2; i++){
        if(i % 2 == 0){
            somaPares = somaPares + i;
        }
       }

       System.out.println("A soma entre "+n1+" e " +n2+ " e " + somaPares);
    }
}