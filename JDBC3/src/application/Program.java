package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	//nosso programa principal onde chamaremos nossas classes de auxilio
	public static void main(String[] args) {
		//criando tipo de data no java
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//criando conexão 
		Connection conn = null;
		//a interface preparedStatemnt se pode receber variaveis 
		//coisa que a Statement nao poderá
		PreparedStatement st = null;
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
			st.setString(1, "wanessa kk");
			st.setString(2, "wanessa@com.br");
			st.setDate(3,new java.sql.Date(sdf.parse("13/10/1993").getTime()));
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

}
