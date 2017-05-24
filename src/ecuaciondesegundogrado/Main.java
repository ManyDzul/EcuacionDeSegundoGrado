/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;

/**
 *
 * @author many Glez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        
        EcuacionDeSegundoGrado ecuacionNumero1 = new EcuacionDeSegundoGrado(15, 1, -12);
        System.out.println("Ecuacion de segundo grado:" + ecuacionNumero1.getDiscriminante());
        System.out.println("RaicesCuadradas: " + ecuacionNumero1.getNumeroDeSoluciones());
        System.out.println("Prueba1.1: " + ecuacionNumero1.getRaiz1());
        System.out.println("Prueba1.2: " + ecuacionNumero1.getRaiz2());
    EcuacionDeSegundoGrado ecuacionNumero2 = new EcuacionDeSegundoGrado(10, -48, -900);
        System.out.println("Ecuacion de segundo grado: " + ecuacionNumero2.getDiscriminante());
        System.out.println("RaicesCuadradas: " + ecuacionNumero2.getNumeroDeSoluciones());
        System.out.println("Prueba2.1: " + ecuacionNumero2.getRaiz1());
        System.out.println("Prueba2.2: " + ecuacionNumero2.getRaiz2());
    EcuacionDeSegundoGrado ecuacionNumero3 = new EcuacionDeSegundoGrado(18, -3, -25);
        System.out.println("Ecuacion de segundo grado: " + ecuacionNumero3.getDiscriminante());
        System.out.println("RaicesCuadradas: " + ecuacionNumero3.getNumeroDeSoluciones());
        System.out.println("Prueba3.1: " + ecuacionNumero3.getRaiz1());
        System.out.println("Prueba3.2: " + ecuacionNumero3.getRaiz2());

        
        
    }
    
}
