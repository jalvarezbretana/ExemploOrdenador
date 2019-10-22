/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class ExemploOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cal é o tipo do ratón? ");
        String tipo = teclado.nextLine();
        System.out.println("Cal é a marca da pantalla? ");
        String marca = teclado.nextLine();
        System.out.println("Cantas pulgadas ten a pantalla? ");
        float pulgadas = teclado.nextFloat();
        System.out.println("Cal é a velocidade da CPU? ");
        int velocidade = teclado.nextInt();
        System.out.println("Cal é a memoria da CPU? ");
        int memoria = teclado.nextInt();

        Rato rato = new Rato(tipo);
        Pantalla pantalla = new Pantalla(marca, pulgadas);
        CPU cpu = new CPU(velocidade, memoria);
        Ordenador ordenador = new Ordenador(rato, pantalla, cpu);
        ordenador.amosar();

    }

}
