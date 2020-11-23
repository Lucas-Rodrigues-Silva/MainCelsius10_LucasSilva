package celsiu_lucasrodriguessilva;
import java.util.Scanner;
/**
 *
 * @author Menino Moleque Luquinha
 */
public class Celsiu_LucasRodriguesSilva {

    public static void main(String[] args) {
        int i = 10;
        double C, F = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite os graus em Celsius: ");
        
        C = entrada.nextDouble();
        
        while(i <= 100 ){  
                if(i == 10)
                {
                    F = (C*1.8) + 32;
                    
                    System.out.println(F);

                    i = i + 10;
                }
                else
                {
                    F = F + 10;
                    System.out.println(F);
                    i = i + 10;
                }
        }
        
    }
    
}
