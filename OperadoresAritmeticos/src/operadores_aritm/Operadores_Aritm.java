/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores_aritm;

/**
 *
 * @author rjosecar
 */
public class Operadores_Aritm {
    public static void main(String[] args) {
        int n = 10;
        int valor = 5 + n--;
        System.out.println("Valor Final: "+valor );
        System.out.println("Valor do numero: "+n+ " OK");
        int x = 25;
        float y = (float) 5.6;
        System.out.println("Raiz quadrada de x : "+ Math.sqrt(x));
        System.out.println("Potência de x : "+ Math.pow(x,2));
        System.out.println("Valor absoluto de y: " +Math.abs(y));
        System.out.println("Arrendondamento para baixo de y: "+Math.floor(y));
        System.out.println("Arrendondamento para cima de y: "+Math.ceil(y));
        System.out.println("Arrendondamento Aritmeticamente de y: "+Math.round(y));
        
        double aleatorio = Math.random();
        int number = (int)(30 + aleatorio *(60-30));
        System.out.println("Aleatorio : "+number);
        
    }
    
    
}
