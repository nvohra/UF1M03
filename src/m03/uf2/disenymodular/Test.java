/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Test {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*Carta c1 = new Carta(4, "trebol");
         Carta c2 = new Carta(10, "diamantes");
         System.out.println(c1);
        
         Racional r1 = new Racional(5, 3);
         Racional r2 = new Racional(2, 5);
         Racional r3 = Racional.producto(r1, r2);
         System.out.println("El producto de " + r1 + " y " + r2 + " es igual " + r3);
         Racional r4 = Racional.division(r1, r2);
         System.out.println("La division de " + r1 + " y " + r2 + " es igual " + r4);*/

        //pertenece a la clase polinomio
        /*Polinomio p1 = new Polinomio(2, 3, 1);
         Polinomio p2 = new Polinomio (0, 1, -2);
         int numero = 2;
        
         Polinomio p3 = p1.suma(p2);
         System.out.println(p3);
        
         p1.producto(2);
         System.out.println(p1);
        
         Polinomio p5 = p1.resta(p2);
         System.out.println(p5);
        
         int res = p3.resolver(2);
         System.out.println(res);*/


        //pertenece a la clase mat
        /*System.out.println("Introduce un numero para dimensionar la matriz cuadrada: ");
         int dim = Test.teclado.nextInt();
        
         Mat m1 = new Mat(dim);
         Test.leermatriz(m1);
        
         Mat m2 = new Mat(dim);
         Test.leermatriz(m2);
        
         Mat m3 = m1.sumamat(m2);
         System.out.println("Suma de " + m3);
        
         m3 = m1.restamat(m2);
         System.out.println("Resta de " + m3);
        
         System.out.println("Introduce un escalar para multiplicar-lo con la matriz");
         int n = Test.teclado.nextInt();
         m1.multescalar(n);
         System.out.println("Escalar multiplicado por " + m1);*/

        //parte que pertenece a la clase dado
        /*Dado d = new Dado();
        System.out.println("Introduce el nombre de los 2 juadores: ");
        String nombre1 = Test.teclado.next();
        String nombre2 = Test.teclado.next();
        Jugador j1 = new Jugador(nombre1);
        Jugador j2 = new Jugador(nombre2);
        System.out.println("Introduce el numero de rondas de la partida: ");
        int n = Test.teclado.nextInt();
        System.out.println();
        int cont1 = 0;
        int cont2 = 0;
        int i = 1;
        while (i <= n) {
            if (j1.LanzarDado(d) == j2.LanzarDado(d)) {
                i = i - 1;
            }
            else if (j1.LanzarDado(d) > j2.LanzarDado(d)) {
                cont1++;
                j1.RondaGanada(cont1);
                System.out.println("El jugador " + nombre1 + " ha sacado un " + j1.LanzarDado(d));
                System.out.println("El jugador " + nombre2 + " ha sacado un " + j2.LanzarDado(d));
            } else {
                cont2++;
                j2.RondaGanada(cont2);
                System.out.println("El jugador " + nombre1 + " ha sacado un " + j1.LanzarDado(d));
                System.out.println("El jugador " + nombre2 + " ha sacado un " + j2.LanzarDado(d));
            }
            i++;
        }
        if (j1.getPartidasganadas() > j2.getPartidasganadas()) {
            j1.Estado("ganador");
            j2.Estado("perdedor");
        }
        else {
            j2.Estado("ganador");
            j1.Estado("perdedor");
        }
        System.out.println(j1);
        System.out.println(j2);*/
        
        //parte que pertenece a una calculadora
        /*System.out.println("Introdusca el numero de la operacion que quiere realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int operacion = Test.teclado.nextInt();
        
        System.out.println("Introdusca los valores: ");
        
        System.out.println("Operando1: ");
        int op1 = Test.teclado.nextInt();
        
        System.out.println("Operando2: ");
        int op2 = Test.teclado.nextInt();*/
        
        /*Calculadora c = new Calculadora(op1, op2);
        
        switch (operacion) {
            case 1:
                c.sumar();
                break;
            case 2:
                c.restar();
                break;
            case 3:
                c.multiplicar();
                break;
            case 4:
                c.dividir();
                break;
        }
        
        System.out.println(c);*/
        //versiion 2 de calculadora, donde los metodos si reciben argumentos
        /*Calculadora2 c = new Calculadora2();
        
        switch (operacion) {
            case 1:
                c.sumar(op1, op2);
                break;
            case 2:
                c.restar(op1, op2);
                break;
            case 3:
                c.multiplicar(op1, op2);
                break;
            case 4:
                c.dividir(op1, op2);
                break;
        }
        System.out.println(c);*/
        //version 3 de calculadora, donde solo hay metodo y sin pasarle argumentos
        /*Calculadora3 c = new Calculadora3(op1, op2);
        
        c.operar(operacion);
        
        System.out.println(c);*/
        //version 4 de calculadora, donde no hay objetos
        
        /*int resultado = 0;
        switch (operacion) {
            case 1:
                resultado = Calculadora4.sumar(op1, op2);
                break;
            case 2:
                resultado = Calculadora4.restar(op1, op2);
                break;
            case 3:
                resultado = Calculadora4.multiplicar(op1, op2);
                break;
            case 4:
                resultado = Calculadora4.dividir(op1, op2);
                break;
        }
        System.out.println(resultado);*/
        
        //programa punto
        /*Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(4, 5);
        Punto p3 = new Punto();
                
        p3.sumar(p1, p2);
        System.out.println(p3);
        
        double d = p1.distancia(p2);
        System.out.println("Distancia entre " + p1 + " y " + p2 + " es igual a " + d);
        
        boolean sonigual = p1.iguales(p2);
        if (sonigual) {
            System.out.println("El " + p1 + " y " + p2 + "son iguales");
        }
        else {
            System.out.println("El " + p1 + " y " + p2 + "son diferentes");
        }*/
        
    }
        

    /*private static void leermatriz(Mat m) {
     System.out.println("Introduce los valores de la matriz: ");
     for (int i = 0; i < m.longitud(); i++) {
     for (int j = 0; j < m.longitud(); j++) {
     int valor = Test.teclado.nextInt();
     m.setElemento(i, j, valor);
     }
     }
     }*/
}
