/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author senai
 */
public class Clinica {
    String nome;
    String endereco;
    String telefone;
    ArrayList<Atendimento> atendimentos;
    public Clinica(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        atendimentos =  new ArrayList<>();
    }
    public void criarAtendimento(Date data, boolean retorno,
            Gato g, Veterinario v){
        Atendimento a = new Atendimento(data, retorno, g, v);
        this.atendimentos.add(a);
    }
    public void listarAtendimentos(){
        System.out.println("Atendimentos da clínica " + this.nome);
        for(Atendimento a: this.atendimentos){
            System.out.println(a.date + " | " + a.atendido + " | "
            + a.retorno + " | " + a.g.nome + " | " + a.v.nome);
        }
    }
}
