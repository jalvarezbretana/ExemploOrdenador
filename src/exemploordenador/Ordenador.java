/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author jalvarezbretana
 */
public class Ordenador {

    private Rato rato = new Rato();
    private Pantalla pantalla = new Pantalla();
    private CPU cpu = new CPU();

    public Ordenador() {
    }
    public Ordenador (Rato rato, Pantalla pantalla, CPU cpu){
    this.rato=rato;
    this.pantalla=pantalla;
    this.cpu=cpu;
    }

    public Rato getRato() {
        return rato;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void amosar() {
        System.out.println("Tipo do rato: " + rato.getTipo()
                + "\nMarca da pantalla: " + pantalla.getMarca()
                + "\nPulgadas da pantalla: " + pantalla.getPulgadas()
                + "\nMemoria da CPU: " + cpu.getMemoria()
                + "\nVelocidade da CPU: " + cpu.getVelocidade());
    }

}
