/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ftana
 */
public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/gerenciador";
    private static final String user = "root";
    private static final String senha = "fabio";

    public Connection Conectar() {
        Connection conn = null;
        
        try{
            
            if (conn == null || conn.isClosed()){
                conn = DriverManager.getConnection(url, user, senha);
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    
    
    
}
