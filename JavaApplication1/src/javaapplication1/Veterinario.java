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
public class Veterinario {
    String nome;
    String cpf;
    int crmv;
    public Veterinario(String nome, String cpf, int crmv){
        this.nome = nome;
        this.cpf = cpf;
        this.crmv = crmv;
    }
    public void atender(Atendimento a){
        a.atendido = true;
    }
}
