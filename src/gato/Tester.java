package gato;

public class Tester {
    public static void main(String[] args){
        Tablero t = new Tablero();
        
        t.inicializarTablero();
        t.imprimirTablero();
        t.asignarPosicion(1,1,'x');
        System.out.println("\n||||||||||||||||||");
        t.imprimirTablero();
    }
}