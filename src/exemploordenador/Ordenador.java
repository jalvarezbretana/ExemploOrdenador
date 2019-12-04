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

    /**
     * builder without params
     */
    public Ordenador() {
    }

    /**
     * builder with params
     * @param rato
     * @param pantalla
     * @param cpu
     */
    public Ordenador (Rato rato, Pantalla pantalla, CPU cpu){
    this.rato=rato;
    this.pantalla=pantalla;
    this.cpu=cpu;
    }

    /**
     * getter rato
     * @return
     */
    public Rato getRato() {
        return rato;
    }

    /**
     * setter rato
     * @param rato
     */
    public void setRato(Rato rato) {
        this.rato = rato;
    }

    /**
     * getter pantalla
     * @return
     */
    public Pantalla getPantalla() {
        return pantalla;
    }

    /**
     * setter pantalla
     * @param pantalla
     */
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    /**
     * geter cpu
     * @return
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * setter cpu
     * @param cpu
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * visualizar named amosar
     */
    public void amosar() {
        System.out.println("Tipo do rato: " + rato.getTipo()
                + "\nMarca da pantalla: " + pantalla.getMarca()
                + "\nPulgadas da pantalla: " + pantalla.getPulgadas()
                + "\nMemoria da CPU: " + cpu.getMemoria()
                + "\nVelocidade da CPU: " + cpu.getVelocidade());
    }

}
