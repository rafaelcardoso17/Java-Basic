package tipospromitivos;

import java.util.Scanner;


/**
 *
 * @author rjosecar
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Nome por favor:");
        String nome = teclado.nextLine();
        System.out.println("Digite a Nota por favor:");
        float nota = teclado.nextFloat();
        
        System.out.println("Nota = "+nota);
        System.out.printf("\nA Nota de %s =  %.2f",nome,nota);
        System.out.format("\nA Nota de %s =  %.2f\n",nome,nota);
        
        int idade = 25;
        String valor = Integer.toString(idade);
        System.out.println("Result: "+valor);
        
        String nome2 = "10";
        int idade2 = Integer.parseInt(nome2);
        System.out.println("Result2: "+idade2);
        
    }
    
}
