package actividad3;

import java.util.Scanner;

public class Actividad3 {
    
    public static Scanner ent = new Scanner(System.in);

    public static void suma(){
        int suma = 0;
        for(int i = 0; i <=10; i++){
            suma +=i;
            
        }
        System.out.println("La suma consecutiva del 0 al 10 es " + suma);
    }
    
    public static void factorial(){
        int factor = 1;
        for (int i = 1; i <= 10; i++) {
            factor *=i;  
        }
        System.out.println("El factorial de 10 es " + factor);
    }
    public static void factorialUsuario(){
        int factor = 1, numero = 0;
        System.out.println("Ingrese el numero a calcular su factorial");
        numero = ent.nextInt();
        for (int i = 1; i <= numero; i++) {
            factor *=i;  
        }
        System.out.println("El factorial de "+ numero + " es " + factor);
    }
    public static void media(){
        double suma = 0, media = 0;
        int num = 0;
        
        System.out.println("Ingrese un numero para calcular su media desde 0 hasta el número indicado");
        num = ent.nextInt();
        
        for(int i = 0; i <= num; i++){
            suma+=i;
        }
        media = suma / (num+1);
        System.out.println("La media de la suma consecutiva es " + media);
    }
    public static void mediaNum(){
        double num = 0, suma = 0, media = 0, min = 0, max = 0;
        int cant = 0;
        System.out.println("Ingrese la cantidad de numeros a promediar");
        cant = ent.nextInt();
        
        for(int i = 1; i <= cant; i++){
            System.out.println("Ingrese un numero");
            num = ent.nextDouble();
            if(i == 1){
                max = num;
                min = num;
            }else if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
            suma+=num;
        }
        media = suma / cant;
        System.out.println("La suma es " + suma);
        System.out.println("El promedio de la suma es " + media);
        System.out.println("El mayor numero introducido es " + max);
        System.out.println("El menor numero introducido es " + min);
        System.out.println("Y la distancia entre estos es " + (max-min));
    }
    public static void semana(){
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        for(int i = 1; i <= 7; i++){
            System.out.println(i + "- " +dias[i-1]);
        }
    }
    public static void gato(){
        String [][] lugares  = {{"0,0", "0,1", "0,2"},{"1,0", "1,1", "1,2"},{"2,0", "2,1", "2,2"}}; 
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                if(j == 2){
                    System.out.println("  " + lugares[i][j] + "  \n");
                }else{
                    System.out.print("  " + lugares[i][j] + "  ");
                }
            }
        }
    }
    public static void selec(int resp){
        
        switch(resp){
            case 1:
                suma();
                break;
            case 2:
                factorial();
                break;
            case 3:
                factorialUsuario();
                break;
            case 4:
                media();
                break;
            case 5:
                mediaNum();
                break;
            case 6:
                semana();
                break;
            case 7:
                gato();
                break;
            
        }
    }
    public static void main(String[] args) {
        int resp = 0;
        System.out.println("Ingrese el método a ejecutar \n1- Suma del 0 al 10 \n2- Factorial de 10 \n3- Factorial de cualquier numero \n4- Promedio del 0 hasta un número dado \n5- Promedio de numeros ingresados \n6- Dias de la Semana \n7- Modelo del juego de Gato");
        System.out.print("Esperando respuesta: ");
        resp = ent.nextInt();
        selec(resp);
        
        
    }
    
}
