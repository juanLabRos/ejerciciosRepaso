/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prubasrepasojava;

import java.util.Scanner;

/**
 *
 * @author Jon
 */
public class PrubasRepasoJava {
//creación del scanner para poder leer 

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	System.out.println("Repaso Java");

	/*//ponemos que queremos que haga el usuario
	System.out.println("Introduzca un número: ");
	//se inicializa el scanner y detecta que es un INT lo que tiene que leer
	int num = sc.nextInt();

	System.out.println("Ha introducido el "+num);*/

	//arrayIntroducir();
	
	problemasRepaso();
    }
    public static void arrayIntroducir(){
	//array pidiendo datos(variable que queremos pedir, nombre = new variable, datos que queremos dentro del array
		int ar[] = new int[3];
	Scanner scn = new Scanner(System.in);
	
	//bucle for para recorrer el array
	for(int i=0;i<ar.length;i++){
	    
	    System.out.println("Introduzca un número  ");
	    ar[i]=scn.nextInt();
	}
	for(int i=0;i<ar.length;i++){
	    System.out.println(" \n "+ar[i]);
    }
}
    
    public static void problemasRepaso(){
	
	//Declarar un String que contenga un nombre, luego que ponga un mensaje de bienvenida + el nombre
	
	//DEclaramos las variables y creamos el scanner
	Scanner sc = new Scanner (System.in);
	 String nombre;
	 System.out.println("Introduzca un nombre: ");
	 nombre = sc.nextLine();
	 System.out.println("Bienvenido "+nombre);
	
    }
}
