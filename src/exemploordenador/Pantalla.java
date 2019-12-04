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
public class Pantalla {

    private String marca;
    private float pulgadas;

    /**
     *Builder with params
     * @param marca type String
     * @param pulgadas type float
     */
    public Pantalla(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    /**
     *getter of marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * setter of marca
     * @param marca setMarca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * getter of pulgadas
     * @return
     */
    public float getPulgadas() {
        return pulgadas;
    }

    /**
     * setter of pPulgadas
     * @param pulgadas setPulgadas
     */
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    /**
     * buider without params
     */
    public Pantalla() {
    }
}
