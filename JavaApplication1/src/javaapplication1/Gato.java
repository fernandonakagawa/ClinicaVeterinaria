/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author senai
 */
public class Gato {
    String nome;
    String cor;
    int anoNasc;
    String raca;
    
    public Gato(String nome, String cor, int anoNasc,
            String raca){
        this.nome = nome;
        this.cor = cor;
        this.anoNasc = anoNasc;
        this.raca = raca;
    }
    public Gato(String nome, String cor, int anoNasc){
        this.nome = nome;
        this.cor = cor;
        this.anoNasc = anoNasc;
        this.raca = "SRD";
    }
}
