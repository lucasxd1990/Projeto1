/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.Dao;
import dao.PessoaDaoArrayList;
import dao.PessoaDaoVetor;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("Joao","Silva", 20);
        Pessoa pedro = new Pessoa("Pedro","Silva", 18);
        Pessoa jose = new Pessoa("Jose","Silva", 16);
        
        Dao dao = new PessoaDaoVetor();
        dao.adicionar(joao);
        dao.adicionar(pedro);
        dao.adicionar(jose);
        
        dao.listarTudo();
        
        System.out.println("\n\n -------Vamos remover");
        dao.remover(joao);
        dao.remover(pedro);
        dao.remover(jose);
        
        dao.listarTudo();
    }
}
