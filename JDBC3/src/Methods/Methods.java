package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Methods {
	private static Connection conn = null;
	//a interface preparedStatemnt se pode receber variaveis 
	//coisa que a Statement nao poderá
	private static PreparedStatement st = null;
	//criando tipo de data no java
	private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Methods(Connection conn){
		Methods.conn = conn;
	}
	
	public void InsertAll() {
		//tratando possiveis erros
		try {
			//iniciando nossa conexão
			conn = DB.getConnection();
			//iniciando a statement com essa conexão
			
			st = conn.prepareStatement("INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"		//essa função retorna as chaves inseridas
					+ "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			//setando com os tipos das variaveis do banco
			st.setString(1, "hercules");
			st.setString(2, "hercules@com.br");
			st.setDate(3,new java.sql.Date(sdf.parse("09/10/2017").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 2);
			//para o insert sem bem sucedido se precisa usar o metodo executeUpdate();
			//retorna o numero de linhas afetadas
			int rows = st.executeUpdate();
			//mostrando quantas linhas foram afetadas na tela
			if(rows > 0) {
				//guardando a saida do statement
				ResultSet rs = st.getGeneratedKeys();
				//esse while irá percorrer toda o rs
				while(rs.next()) {
					int id = rs.getInt(1);
					//mensagem que retornara indice inserido
					System.out.println("Done! Id = "+id);
				}
			}else {
				System.out.println("No rows Affected!");
			}
			//tratando possiveis erros
		} catch (SQLException e) {
			e.printStackTrace();
			//trtando possiveis erros
		}catch(ParseException e) {
			e.printStackTrace();
			//fechando statement e connections
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
			
		}
		
		

	}
		
	public void InserOne(String Query) {
		try {
			st = conn.prepareStatement(Query, Statement.RETURN_GENERATED_KEYS);
			int rows = st.executeUpdate();
			
			if (rows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
					System.out.println("Your Query: "+ Query);
				}
			}else {
				System.out.println("no row affected!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			//trtando possiveis erros
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
			
		}
		
	}
	
	
	
	}
		
