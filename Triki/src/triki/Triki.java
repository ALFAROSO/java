/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triki;

/**
 *
 * @author alberth
 */
public class Triki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtributosMetodos jugar = new AtributosMetodos();
            
        //System.out.println();
        jugar.crearyllenartablero();
        jugar.mostrarTablero();
        
        
        do{
            System.out.println();
            jugar.movimientoJugador();
            jugar.mostrarTablero();
            boolean resultado = jugar.haGanado('O');
            if (resultado == true){
                System.out.println("\nHas ganado =D");
                break;
            }
            
            resultado = jugar.hayCeldaVacia();
            if (resultado == false){
                System.out.println("\nHemos empatado ;P");
                break;
            }

            
            System.out.println("\n Me toca jugar...");
            jugar.movimientoComputadora();
            jugar.mostrarTablero();
            resultado = jugar.haGanado('X');
            if (resultado == true){
            System.out.println("\nHas perdido =C");
                break;
            }
        }while(true);
    }        
}
    
