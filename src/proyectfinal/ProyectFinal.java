package proyectfinal;

import java.util.Scanner;

import java.util.Scanner;

public class ProyectFinal { 
    
static Scanner scanner= new Scanner (System.in);

    public static void main(String[] args) {
        
        int opcion=0;
        
        do{
            System.out.println("--SEA BIENVENIDO AL SISTEMA DE OPERACIONES DE MATEMATICAS");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        
        System.out.println("Por favor ingrese la opción");
            opcion=scanner.nextInt();
                switch(opcion){
            case 1:
            suma();
            break;
            case 2:
            resta();
            break;
            case 3:
            multiplicacion();
            break;
            case 4:
            division();
            break;
        }
        }while(opcion!=5);
        System.out.println("EL PROGRAMA HA FINALIZADO");
    }
    static void suma(){
        System.out.println("OPERACION: SUMA");
        System.out.println("Digite el sumando 1");
        int numero1=scanner.nextInt();
        System.out.println("Digite el sumando 2");
        int numero2=scanner.nextInt();
        int resultado=numero1+numero2;
        System.out.println("El resultado es: "+resultado);
    }
    static void resta(){
        System.out.println("OPERACION: RESTA");
        System.out.println("Digite el sumando 1");
        int numero1=scanner.nextInt();
        System.out.println("Digite el sumando 2");
        int numero2=scanner.nextInt();
        int resultado=numero1-numero2;
        System.out.println("El resultado es: "+resultado);
    }
    static void multiplicacion(){
        System.out.println("OPERACION: MULTIPLICACION");
        System.out.println("Digite el sumando 1");
        int numero1=scanner.nextInt();
        System.out.println("Digite el sumando 2");
        int numero2=scanner.nextInt();
        int resultado=numero1*numero2;
        System.out.println("El resultado es: "+resultado);
    }
    static void division(){
        System.out.println("OPERACION: DIVISION");
        System.out.println("Digite el sumando 1");
        int numero1=scanner.nextInt();
        System.out.println("Digite el sumando 2");
        int numero2=scanner.nextInt();
        int resultado=numero1/numero2;
        System.out.println("El resultado es: "+resultado);
    }

    public static class Ejercicio2 {
    }
}

    


