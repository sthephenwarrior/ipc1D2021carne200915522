package escalando;
import java.util.Random;
import java.util.Scanner;
/*
 * @author sthephan garcia 200915522
 */
public class Escalando {
    
    boolean partida= false;//validador si hay partida guardada
    String valores[];//valores
    String matrix[][]= new String[8][8];
    
    public Escalando(){
        inicio();
    
    }
    
    public static void main(String[] args) {
        new Escalando();
    }    
    
    public void inicio(){
        //Menu incial del prograna
        System.out.println("**************Escalando**************");
        System.out.println("==============  Menu  ===============");
        System.out.println("* 1. Iniciar juego                  *");
        System.out.println("* 2. Retomar juego                  *");
        System.out.println("* 3. Generar reportes               *");
        System.out.println("* 4. Salir                          *");
        System.out.println("*************************************");
        System.out.print("Ingrese la opción que desea ejecutar:");                
        Scanner opcion = new Scanner(System.in);        
        
        try{                        
            int ingresado=opcion.nextInt();
            switch(ingresado){
                case 1:
                    if(partida==false){//validar si hay un juego guaradado con un if                         
                        
                        for(int i=0;i<8;i++){
                            
                            //dar un numero aleatorio entre 2 y 4 aleatoria entre cada fila
                            int prob=0;
                            Random probabilidad_penalizacion= new Random();
                            prob=2+probabilidad_penalizacion.nextInt(2);

                            //dar las posiciones aleatorias en la fila, ls cuales seran las penalizaciones
                            int posiciones[]= new int[prob];
                            System.out.println("canti"+prob);

                            
                            //usamos un while para validar que hagan numeros repetidos
                            Random posic = new Random();
                            int contador=0;
                            while(contador<prob){
                                
                                int val=posic.nextInt(8);
                                
                                if(contador==0){
                                    posiciones[contador]=val;
                                    contador++;
                                }else{
                                    int contador2=0;                                    
                                    while(contador2<contador){
                                        if(val!=posiciones[contador2]){
                                            contador2++;
                                            if(contador2==contador){
                                                posiciones[contador]=val;                                                
                                            }                                            
                                        }                                    
                                    }
                                    contador++;
                                }
                                System.out.println(val);
                            }
                            
                            
                            /*for(int j=0;j<4;j++){
                                System.out.println(posiciones[j]);
                            }*/
                        System.out.println("lol");
   
                        }
                        juego();
                    }else{
                        System.out.println("¡Hay una partida alamacenada!,¿Desea descartarla? Si(s),No(n)");
                        
                        //codigo de descartar partida
                    }                    
                    break;
                case 2:
                    if(partida==true){//validar si hay un juego guardado tambiem

                    }else{

                    };
                    break;
                case 3:
                    System.exit(0);                
            }                        
        }catch(Exception e){
            System.out.println("¡opción ingresada invalida!\n");
            inicio();            
        }
        
        
    }
    
    
    
    public void juego(){
        System.out.println("¿Que empieze el reto!\n");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("|      |      |      |      |      |      |");
        System.out.println("-------------------------------------------");
        
    }
    
    public void juego(String valores[]){
    
    }
}
