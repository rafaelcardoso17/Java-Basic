/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operad_log_relac;

/**
 *
 * @author rjosecar
 */
public class OperLogRel {
    
    public static void main(String[] args) {
      int n1 = 10;
      int n2 = 15;
      int n3 = 9;
      int resultado;      
      resultado = (n1>n2)?1:0;
      System.out.println("Resultado Final: "+resultado);
      boolean t;
      t=(n1<n2 ^ n3<n2)?true:false;
      System.out.println("T : "+t);
    
    }
    
}
