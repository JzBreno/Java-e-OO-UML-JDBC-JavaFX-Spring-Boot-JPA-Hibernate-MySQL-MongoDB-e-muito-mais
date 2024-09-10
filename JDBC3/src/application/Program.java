package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
;

public class Program {
	//nosso programa principal onde chamaremos nossas classes de auxilio
	public static void main(String[] args) {
		
		//conexão
		Connection conn = null;
		//recebera a consulta sql
		Statement st = null;
		//recebera o resultado da busca a consulta sql
		ResultSet rs = null;
		//tratando possiveis erros
		try {
			//inicializando nossa conexao e utilizando nosso metodo de classe criado para o banco
			conn = DB.getConnection();
			//iniciando nossa variavel statement com nossa conexao
			st = conn.createStatement();
			//rs recebe o resultado da consulta em u "par de chave"
			rs = st.executeQuery("select * from department");
			//esse while ira percorrer todo nosso banco ate o espaco vazio, onde retornara false
		
			while(rs.next()) {
				//printando nossos resultado utilizando os nomes das chaves
				System.out.println(rs.getInt("ID") + " | " +rs.getString("NAME"));
			}
		//tratando possiveis erros	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			//finalizando as instancias
			DB.closeresultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
