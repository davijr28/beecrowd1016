
import java.util.Scanner;

public class Beecrowd1016 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variável
        int distance;
        
        //ler variável
        distance = leitor.nextInt();
        
        //mostrar o resultado no console
        System.out.printf("%d minutos%n", distance*2);
    }
}