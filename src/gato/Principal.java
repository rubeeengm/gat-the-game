package gato;

import java.util.Scanner;

public class Principal{
    private Tablero t;
    private Scanner teclado;
    
    public Principal(){
        t = new Tablero();
        teclado = new Scanner(System.in);
    }
    
    public static void main(String[] args){
        Principal p = new Principal();
        int opc;
        
        do{
            opc = p.menu();
            switch(opc){
                //case 1:
                    //p.1Jugador();
                 //   break;
                case 1:
                    p.multijugador();
                    break;
                case 2:
                    p.acercaDe();
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Opción no válida, verificala por favor");
                    break;
            }
        }while(opc!=3);
    }
    
    public int menu(){
        System.out.println("¡Bienvenido!\n");
        System.out.println("MENU PRINCIPAL");
        //System.out.println("1.Nuevo Juego (1 Jugador)");
        System.out.println("1.Nuevo Juego (Multijugador)");
        System.out.println("2.Acerca de");
        System.out.println("3.Salir");
        
        int opc = teclado.nextInt();
        return opc;
    }
    
    public void multijugador(){
        char tiro;                  //ALMACENA EL VALOR DEL TIRO DEPENDIENDO DEL JUGADOR
        boolean cambJ;              //AYUDA A SABER SI SE PUEDE HACER EL CAMBIO DE JUGADOR
        int numCas = 0;             //HACE REFERENCIA AL NUMERO DE CASILLLA ELEGIDA
        boolean ok;                 //DA EL AVISO SI LA CASILLA ELEGIDA ES CORRECTA
        int cont = 1;               //CONTROLA EL NUMERO DE MOVIMIENTOS
        int turnoJugador = 0;       //INDICA DE QUIEN ES EL TURNO A LOS JUGADORES
        
        t.inicializarTablero();
        t.imprimirTablero();
        
        do{
            do{
                cambJ = false;
                
                //DEPENDIENDO DEL VALOR DETERMINA A QUE JUGADOR LE TOCA HACER EL MOVIMIENTO
                if(cont%2 == 1){
                    tiro = 'x';
                    turnoJugador = 1;
                }
           
                else{
                    tiro = 'o';
                    turnoJugador = 2;
                }
                
                //COMPRUEBA SI LA CASILLA ELEGIDA ES CORRECTA
                do{
                    ok = false;
                    System.out.printf("\nJugador #%d, ingrese el numero de casilla: ",turnoJugador);
                    numCas = teclado.nextInt();
                    if(numCas > 0 && numCas <10){
                        ok = true;
                    }
        
                    else{
                        System.out.println("Casilla ingresada erronea, verificala por favor");
                    }
                }while(ok == false);            
                
                //EJECUTA EL CODIGO BASADO EN LA OPCION
                switch(numCas){
                    case 1:
                        //COMPRUEBA SI LA CASILLA EST�? OCUPADA
                        if(t.getPosicionTablero(0,0)=='x'||t.getPosicionTablero(0,0)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                        
                        else{
                            t.asignarPosicion(0,0,tiro);    //ASIGNA LA JUGADA EN LA POSICION DETERMINADA
                            cambJ = true;                   //HACE VALIDO EL CAMBIO DE JUGADOR
                            cont++;                         //INCREMENTA EL NUMERO DE MOVIMIENTOS
                        }
                
                        break;
                    case 2:
                        if(t.getPosicionTablero(0,1)=='x'||t.getPosicionTablero(0,1)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(0,1,tiro);
                            cambJ = true;
                            cont++;
                        }   
            
                        break;
                    case 3:
                        if(t.getPosicionTablero(0,2)=='x'||t.getPosicionTablero(0,2)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(0,2,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 4:
                        if(t.getPosicionTablero(1,0)=='x'||t.getPosicionTablero(1,0)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(1,0,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 5:
                        if(t.getPosicionTablero(1,1)=='x'||t.getPosicionTablero(1,1)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(1,1,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 6:
                        if(t.getPosicionTablero(1,2)=='x'||t.getPosicionTablero(1,2)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(1,2,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 7:
                        if(t.getPosicionTablero(2,0)=='x'||t.getPosicionTablero(2,0)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }   
                
                        else{
                            t.asignarPosicion(2,0,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 8:
                        if(t.getPosicionTablero(2,1)=='x'||t.getPosicionTablero(2,1)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }   
                
                        else{
                            t.asignarPosicion(2,1,tiro);
                            cambJ = true;
                            cont++;
                        }
            
                        break;
                    case 9:
                        if(t.getPosicionTablero(2,2)=='x'||t.getPosicionTablero(2,2)=='o'){
                            System.out.println("La casilla elegida ya está ocupada, elige otra por favor");
                        }
                
                        else{
                            t.asignarPosicion(2,2,tiro);
                            cambJ = true;
                            cont++;
                        }
                
                        break;
                }
            
                t.imprimirTablero();
            }while(cambJ = false);                      //COMPRUEBA SI SE PUEDE HACER EL CAMBIO DE JUGADOR
        }while(cont <10 && buscarGanador() == false);   //COMPRUEBA SI YA SE ACABARON TODAS LOS POSIBLES MOVIMIENTOS...
                                                        //...Y SI ALGUNO DE LOS JUGADORES YA GANÓ
        decidirGanador(turnoJugador);
    }
    
    //METODO QUE COMPRUEBA SI ALGUNO DE LOS JUGADORES YA GANÓ
    public boolean buscarGanador(){
        boolean ganador = false;
        
        //COMPRUBA LAS 3 POSIBILIDADES DE GANAR DE FORMA HORIZONTAL
        for(int i = 0; i < 3; i++){
            for(int j = 1; j < 2; j++ ){
                if(((t.getPosicionTablero(i,j-1)=='x')&&(t.getPosicionTablero(i,j)=='x')&&(t.getPosicionTablero(i,j+1)=='x')) || ((t.getPosicionTablero(i,j-1)=='o')&&(t.getPosicionTablero(i,j)=='o')&&(t.getPosicionTablero(i,j+1)=='o'))){
                    ganador = true;
                }
            }
        }
        
        //COMPRUEBA LAS 3 POSIBILIDADES DE GANAR DE FORMA VERTICAL
        for(int i = 0; i < 3; i++){
            for(int j = 1; j < 2; j++ ){
                if(((t.getPosicionTablero(j-1,i)=='x')&&(t.getPosicionTablero(j,i)=='x')&&(t.getPosicionTablero(j+1,i)=='x')) || ((t.getPosicionTablero(i,j-1)=='o')&&(t.getPosicionTablero(i,j)=='o')&&(t.getPosicionTablero(i,j+1)=='o'))){
                    ganador = true;
                }
            }
        }
        
        //LOS DOS SIGUIENTES COMPRUEBAN LAS 2 POSIBILIDADES DE GANAR DE FORMA DIAGONAL
        if(((t.getPosicionTablero(0,0)=='x')&&(t.getPosicionTablero(1,1)=='x')&&(t.getPosicionTablero(2,2)=='x')) || ((t.getPosicionTablero(0,0)=='o')&&(t.getPosicionTablero(1,1)=='o')&&(t.getPosicionTablero(2,2)=='o'))){
            ganador = true;
        }
            
        if(((t.getPosicionTablero(2,0)=='x')&&(t.getPosicionTablero(1,1)=='x')&&(t.getPosicionTablero(0,2)=='x')) || ((t.getPosicionTablero(2,0)=='o')&&(t.getPosicionTablero(1,1)=='o')&&(t.getPosicionTablero(0,2)=='o'))){
            ganador = true;
        }
        
        return ganador;
    }
    
    //METODO QUE IMPRIME EL RESULTADO DEL JUEGO
    public void decidirGanador(int turnoJugador){
        if(buscarGanador() == true){
            if(turnoJugador == 1){
                System.out.println("\nEl Jugador 1 ha ganado");
            }
            else{
                System.out.println("\nEl Jugador 2 ha ganado");
            }
        }
        
        else{
            System.out.println("\nEl juego ha terminado empatado");
        }
    }
    
    public void acercaDe(){
        System.out.println("'Gat The Game Version 1.0'");
        System.out.println("Autores:");
        System.out.println("-Israel Marcial Parra");
        System.out.println("-Manuel Fernando Enriquez Parroquin");
        System.out.println("-Rubén Gustavo García Málaga");
        System.out.println("Agradecimientos Ing. Senen Juarez Tinoco");
    }
}