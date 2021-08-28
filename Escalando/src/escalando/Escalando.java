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
    int posicion =0;
    
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
                        //definir en memoria los espacios tipos string de la matriz
                        for(int i=0;i<8;i++){
                            for(int j=0;j<8;j++){
                                matrix[i][j]=new String("      ");
                            }
                        }
                        
                        
                        for(int i=0;i<8;i++){//por cada fila de la matriz                            
                            //dar un numero aleatorio entre 2 y 4 aleatoria entre cada fila
                            int prob=0;
                            Random probabilidad_penalizacion= new Random();
                            prob=2+probabilidad_penalizacion.nextInt(3);
                            
                            //dar las posiciones aleatorias en la fila, ls cuales seran las penalizaciones
                            int posiciones[]= new int [prob];
                            
                            //usamos un while para validar que no hagan numeros repetidos
                            Random posic = new Random();
                            int contador=0;
                            while(contador<prob){                                
                                int val=posic.nextInt(8);//generamos un valor aleatorio entre 0 y 7                                
                                //llenamos espacios y validamos que no se repitan con un contador de psosiones y un foreach para revisar
                                if(contador==0){
                                    posiciones[contador]=val;                                     
                                    //lenamos la matriz con las posiciones                            
                                     matrix[i][val]="#     ";                                    
                                    contador++;
                                }else{
                                    int temp[]= new int[contador];
                                    for(int j=0;j<contador;j++){
                                        temp[j]=posiciones[j];                                        
                                    }                                    
                                    int tempCont=0;//vector temporal para añadir y ver con una posicion menor de esqacio los que ya han sido añadidos no se repitan aleatorio generado
                                    for(int valBuscar:temp){
                                        if(valBuscar==val){
                                            tempCont++;                                            
                                        }                                    
                                    }                                    
                                    if(tempCont==0){
                                        posiciones[contador]=val;
                                        matrix[i][val]="#     ";                                    
                                        contador++;                                        
                                    }                                
                                }                               
                            }
                            
                               
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
            System.out.println(e);
            System.out.println("¡opción ingresada invalida!\n");
            inicio();            
        }
    }
    
    
    public void juego(){
        
        String lol= new String();
        if(posicion==0){
            lol="@";
            System.out.println("¡Que empieze el reto!\n");
            impresion(lol);
        }else{
            lol="";
            impresion(lol);
        }
        
    }
    
    
    public void impresion(String lol2){        
        System.out.print("---------------------------------------------------------");System.out.println("     ******************** Bienvenido a Escalando ********************");

        String reglas[] = new String[8];

        for(int i=0;i<8;i++){
        reglas[i]=new String();
        }

        reglas[0]= "     1. El “@” indica tu posicion en el teclado.                    ";
        reglas[1]= "     2. Para avanzar, deberas lanzar un dado, conla letra 'd' o 'D' ";
        reglas[2]= "     lanzas y avanzas las casillas que te indica el dado.           "; 
        reglas[3]= "     3. si caes en una penalización, deberas resolver el reto       ";
        reglas[4]= "     4. al final se veran tus reultados                             ";
        reglas[5]= "     5. para pausar presiona 'p' o 'P'                              ";
        reglas[6]= "     6. solo puede ser penalizado un maximo de 2 veces por fila :)  ";
        reglas[7]= "     7. para salir del juego y descartarlo presiona 'x' o 'X'       ";

        //dolor de cabeza pero salio visualmente con las psocionea de las filas 1 a 6
            for(int i=0;i<6;i++){
                for(int j=0;j<8;j++){                    
                    if(i%2==0){                    
                        System.out.print("|    "+(((8-i)*(8))-(7)+(j)));                                                
                    }else{
                        System.out.print("|    "+(((8-i)*(8))-(j)));                           
                    }
                }


                System.out.print("|");System.out.println(reglas[i]);                                
                for(int j=0;j<8;j++){
                    System.out.print("|"+matrix[i][j]);         
                }
                System.out.println("|");
                System.out.println("---------------------------------------------------------");
            }

        //dolor de cabeza en trabajar las ultimas dol filas que dse defasaban

            for(int i=6;i<8;i++){                

                if(i%2==0){                    
                        System.out.print("|     "+(((8-i)*(8))-(7)));
                }else{
                        System.out.print("|     "+(((8-i)*(8))));
                }

                for(int j=1;j<8;j++){                    
                    if(i%2==0){                    
                        System.out.print("|    "+(((8-i)*(8))-(7)+(j)));                        
                    }else{
                        System.out.print("|     "+(((8-i)*(8))-(j)));
                    }
                }
                System.out.print("|");System.out.println(reglas[i]);                                

                for(int j=0;j<8;j++){
                    System.out.print("|"+matrix[i][j]);         
                }

                if(i%2!=0){
                    System.out.println("|"+lol2);

                }else{                    
                    System.out.println("|");                
                }
                System.out.println("---------------------------------------------------------");
            }

            boolean validador_de_juego = false;
            while(validador_de_juego==false){
                Scanner seguidor_de_juego = new Scanner(System.in);
                String opcionseguida = seguidor_de_juego.next();            
                switch(opcionseguida){
                    case "d":validador_de_juego=true;
                    dado();
                    break;
                    case "D":validador_de_juego=true;
                    dado();
                    break;
                    case "p":validador_de_juego=true;
                    break;
                    case "P":validador_de_juego=true;
                    break;
                    case "x":validador_de_juego=true;inicio();
                    break;
                    case "X":validador_de_juego=true;inicio();
                    break;
                    default:validador_de_juego=false;
                }            
            }
    
    
    
    }
    
    
    public void dado(){
        Random numer_alea = new Random();
        int receiver = 2+numer_alea.nextInt(5);
        posicion=posicion+receiver;
        
        double coscien= Double.valueOf(posicion)/8;
        
        int fila=4;
        int columna=0;
        
        
        if(coscien<=1){//<-
            if(posicion==8){
                columna=0;
            }else{
                columna=8-(posicion%8);
            }            
            fila=7;    
        }
        if((coscien<=2)&&(coscien>1)){//->
            if(posicion==16){
                columna=7;
            }else{
                columna=(posicion%8)-1;
            }
            fila=6;
    
        }
        if((coscien<=3)&&(coscien>2)){//<-
            if(posicion==24){
                columna=0;
            }else{
                columna=8-(posicion%8);
            }
            fila=5;
        }
        if((coscien<=4)&&(coscien>3)){//->
            if(posicion==32){
                columna=7;
            }else{
                columna=(posicion%8)-1;
            }
            fila=4;
        }
        if((coscien<=5)&&(coscien>4)){//<-
            if(posicion==40){
                columna=0;
            }else{
                columna=8-(posicion%8);
            }
            fila=3;
        }
        if((coscien<=6)&&(coscien>5)){//->
            if(posicion==48){
                columna=7;
            }else{
                columna=(posicion%8)-1;
            }
            fila=2;
        }
        if((coscien<=7)&&(coscien>6)){//<-
            if(posicion==56){
                columna=0;
            }else{
                columna=8-(posicion%8);
            }
            fila=1;
        }
        if((coscien<=8)&&(coscien>7)){//->
            if(posicion==64){
                columna=7;
            }else{
                columna=(posicion%8)-1;
            }
            fila=0;
        }
        
        //si esta vacia y no hay nada
        if(matrix[fila][columna].equals("      ")){            
            System.out.println("jjj"+fila+""+columna+" pos"+posicion);
            matrix[fila][columna]="     @";
        }
        
        //si hay un penalizacion
        if(matrix[fila][columna].equals("#     ")){
            System.out.println("jjj"+fila+""+columna+" pos"+posicion);
            matrix[fila][columna]="#    @";        
        }
        //si ya hay una posicion
        if(matrix[fila][columna].equals("     @")){
            System.out.println("jjj"+fila+""+columna+" pos"+posicion);
            matrix[fila][columna]="#    @";        
        }
        
        juego();
        
    
    }
    
    public void penalizacion(){}
}
