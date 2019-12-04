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
public class CPU {

    private int velocidade;
    private int memoria;

    /**
     *Builder with params
     * @param velocidade
     * @param memoria
     */
    public CPU(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    /**
     *getter of velocidade
     * @return
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     *setter of velocidade
     * @param velocidade
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     *getter of memoria
     * @return
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     *setter of memoria
     * @param memoria
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     *Builder without params
     */
    public CPU() {
    }
}
