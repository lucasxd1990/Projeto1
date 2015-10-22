/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.*;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao {
    
    Statement stmt;

    public PessoaDaoDerby() {
        String username = "lucas";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBancoDeDados";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
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
