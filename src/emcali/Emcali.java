/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emcali;

/**
 *
 * @author lalej
 */
import javax.swing.*;
public class Emcali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int estratoSocial, consumoCliente, valorBase=0, total;
        
        consumoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de su último consumo"));
        estratoSocial = Integer.parseInt(JOptionPane.showInputDialog("Digite su estrato social"));
         
        switch(estratoSocial){
            case 1:
                valorBase = 5003;
                
                break;
            case 2:
                valorBase = 700;
                
                break;
            case 3:
                valorBase = 4800;
                
                break;
            case 4:
                valorBase = 6700;
                
                break;
            default:
                valorBase = 0;
        }
        
        total = consumoCliente + valorBase;
        
        if(!(valorBase == 0)){
            JOptionPane.showInputDialog("Estrato social: "+estratoSocial+"\n"+"valor básico adicionado: $"+valorBase+" \n"+"total a pagar: $"+total);
        }
    }
}
