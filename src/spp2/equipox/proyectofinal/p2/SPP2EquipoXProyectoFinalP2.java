/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.equipox.proyectofinal.p2;
import javax.swing.JOptionPane;
/**
 *
 * @author Aldape
 */
public class SPP2EquipoXProyectoFinalP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        EquipoX:
            -Ana Silvia Aldape Felizardo
            -Maximiliano Turrubiates Gonzales
            -Roxana Reyes Cordova
            -Juan Pablo Castillo Luna
        */
       Calc();
     }
    
    public static int validacionEnteros(String mensaje){
        int num = 0;
        boolean flag;
        do{
            try{
            String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    
    public static double gastos(String mensaje){
        double n = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            n = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return n;
    }
    
    public static double[] Calc(){
        double suma=0;
        int var=validacionEnteros ("Introduzca el numero de gastos"); 
        double [] matriz = new double [var];
        
        for (int i=0; i<matriz.length; i++){
                matriz[i]= gastos("Introduzca la cantidad " + (i+1));
  
                if(matriz[i]>0){
                  suma = (suma + matriz[i]);  
                } else {
                    JOptionPane.showMessageDialog(null, "Error, solo se acepta cantidades positivas");
                }
            }
        
        JOptionPane.showMessageDialog (null, "El total de los gastos es: " + suma);
    return matriz;
    }
  
}
