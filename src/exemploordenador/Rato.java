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
public class Rato {

    private String tipo;

    /**
     * builder with params
     * @param tipo
     */
    public Rato(String tipo) {
        this.tipo = tipo;
    }

    /**
     * getter of tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * setter of tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * builder without params
     */
    public Rato() {
    }
}
