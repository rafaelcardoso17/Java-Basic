/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculmedia;

import java.util.Scanner;

/**
 *
 * @author rjosecar
 */
public class CalculaMedia {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite uma quantidade de pernas:");
        
        int perna = tec.nextInt();
        
        String tipo;
        
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println("Condição usando switch (Não ser pra intervalos e só serve para inteiros)");
        System.out.println("Tipo: "+tipo);
        
        if(perna ==1 ){
            tipo = "Saci";
        }
        else if(perna ==2 ){
            tipo = "Bípede";
        }
        else if(perna ==3 ){
            tipo = "Tripé";
        }
        else if(perna ==4 ){
            tipo = "Quadrúpede";
        }
        else if(perna ==6 ){
            tipo = "Aranha";
        }
        else{
            tipo = "ET";
        }
        System.out.println("Condição usando if");
        System.out.println("Tipo: "+tipo);
        
        int s= 0 ;
        System.out.println("Estrutura de repetição- FOR");
        for(int i=0;i<3;i++){
            
            s = s + i ;
            System.out.println(s);
        
        }
        
        int cont = 0 ;
        System.out.println("Estrutura de repetição- While");
        
        while(cont <2){
            System.out.println(cont);
            cont++;
        }
        
        cont = 0 ;
        System.out.println("Estrutura de repetição- Do While");
       
        
    }
    
}
