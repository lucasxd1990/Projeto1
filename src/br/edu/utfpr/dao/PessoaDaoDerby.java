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
            System.out.println("Conexão estabelecida");
        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA (NOME, SOBRENOME, IDADE) VALUES ("+"'"+p.getNome()   +"', "+"'"+p.getSobrenome() +"', "+p.getIdade()  +")";
                 
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }

    }

    @Override
    public void remover(Pessoa p) {
        String instrucao = "DELETE FROM PESSOA WHERE NOME = 'Jose'";
        
         System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

    @Override
    public void listarTudo() {
        String instrucao = "SELECT * PESSOA";
        
        System.out.println(instrucao);
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            
            while(rs.next()){
                System.out.println("Nome: " + rs.getString("NOME") + "Sobrenome: " + rs.getString("SOBRENOME") + "idade: " + rs.getString("IDADE"));
            }
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }

}
