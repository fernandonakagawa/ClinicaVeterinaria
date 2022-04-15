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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato("Mingau", "Branco", 2015, "Persa");
        Veterinario veterinario = new Veterinario("Leonardo", 
                "1234567890", 1234);
        Clinica clinica = new Clinica("Lovepet", "Rua Belém 844",
            "433333-3333");
        clinica.criarAtendimento(
                new Date(System.currentTimeMillis()), 
                false, gato, veterinario);
        clinica.criarAtendimento(new Date(System.currentTimeMillis()),
                true, gato, veterinario);
        Gato gato2 = new Gato("Nescau","Marrom",2010);
        clinica.criarAtendimento(new Date(System.currentTimeMillis()),
                false, gato2, veterinario);
        clinica.listarAtendimentos();
    }
    
}
