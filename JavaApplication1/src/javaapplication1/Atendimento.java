/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author senai
 */
public class Atendimento {
    Date date;
    boolean retorno;
    boolean atendido;
    Gato g;
    Veterinario v;
    public Atendimento(Date date, boolean retorno, Gato g, Veterinario v) {
        this.date = date;
        this.retorno = retorno;
        this.g = g;
        this.v = v;
        this.atendido = false;
    }
    
}
