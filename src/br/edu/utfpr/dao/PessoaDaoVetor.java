/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor implements Dao{
    
    private Pessoa lista[];
    private int posicao;
    
    public PessoaDaoVetor(){
        int x = 0;
        lista = new Pessoa[x];
        posicao = 0;
    }

    @Override
    public void adicionar(Pessoa p) {
        
    }

    @Override
    public void remover(Pessoa p) {
        
    }

    @Override
    public void listarTudo() {
        
    }
    
}
