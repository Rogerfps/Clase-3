/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3.ek5;

import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Semana3Ek5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nume = JOptionPane.showInputDialog("Digite el numero de estudiantes");
        int num = Integer.parseInt(nume);
        
        int suma =0;
        int i = 0;
        int aprobado=0;
        int mayor=0;
        int menor=100;
        
        while (i<num){
            String notaa = JOptionPane.showInputDialog("Digite la nota");
            int nota = Integer.parseInt(notaa);
            
            suma = suma+nota;
            
            if (nota>=70)
                aprobado=aprobado+1;
                
            if (nota>mayor)
                mayor=nota;
            
            if (nota<menor)
                menor=nota;
            
            i++;
            
            }
        int op = suma/num;
        
        System.out.println("Promedio es: "+ op);
        System.out.println("Aprobados: "+ aprobado);
        System.out.println("Nota mayor es: "+ mayor);
        System.out.println("Nota menor es:"+ menor);
        
        
        
            
    }
    
}
