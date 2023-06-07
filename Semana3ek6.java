/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3ek6;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Semana3ek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma =0;
        int i = 0;
        int aprobado=0;
        int mayor=0;
        int menor=100;
        int num=0;
        int nota=0;
        
            
        
        do {
           
        String notaa = JOptionPane.showInputDialog("Digite la nota");
        nota = Integer.parseInt(notaa);
        
            suma = suma+nota;
            
            if (nota>=70)
                aprobado=aprobado+1;
                
            if (nota>mayor)
                mayor=nota;
            
            if (nota<menor)
                menor=nota;
            
            num=num+1;
            i++;
            
            } while (nota>=0);
        int op = suma/num;
        
        System.out.println("Promedio es: "+ op);
        System.out.println("Aprobados: "+ aprobado);
        System.out.println("Nota mayor es: "+ mayor);
        System.out.println("Nota menor es:"+ menor);
    }
    
}
