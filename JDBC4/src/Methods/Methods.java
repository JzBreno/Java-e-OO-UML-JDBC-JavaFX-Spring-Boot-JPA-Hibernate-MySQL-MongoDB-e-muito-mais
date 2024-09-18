package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Methods {
	//nossas connections
	private Connection conn = null;
	private PreparedStatement st = null;
	
	//construtor
	public Methods(Connection conn){
		this.conn = conn;
	}
	
	//atualizando com indice
	public void Atualize(int IndiceDepartamento) {
		//tratatando possiveis erros
	    try {
	    	//inserindo query que ira atualizat a base de salario
	        this.st = conn.prepareStatement("UPDATE seller "
	                + "SET BaseSalary = BaseSalary + ? "
	                + "WHERE DepartmentId = ?");
	        //dizendo qual ? irá receber o valor 600.0
	        this.st.setDouble(1, 600.00);
	        //dizendo qual ? irá receber o indice
	        this.st.setInt(2, IndiceDepartamento);
	        //realizando alterações 
	        int rowsAffected = st.executeUpdate();
	        //mostrando linhas afetadas
	        System.out.println("Done, rows affected: " + rowsAffected);
	        //capturando erros SQL
	    } catch (SQLException e) {
	        e.printStackTrace();
	        //fechando statement e connections
	    } finally {
	        DB.closeStatement(st);
	        DB.closeConnection();
	    }
	}
	
	//Função para deletar que recebe o indice
	public void Deletar(int indice) {
		//tratando provaveis erros
		   try {
			   //varivel statement recebe a query que será deletada
		        this.st = conn.prepareStatement("DELETE FROM department"
		        		+ " WHERE Id = ?");
		        //incluindo com set(tipo) oque o ? irá receber
		        this.st.setInt(1, indice);
		        //executando as alterações e guardando o retono no nosso row
			    int row = st.executeUpdate();
			    //pritando linhas afetadas
			    System.out.println("Done! rows Affected: " + row);
			    //capturando erro
			    } catch (SQLException e) {
			        e.printStackTrace();
			    //finalizando e fechando Statement e Connection 
			    } finally {
			        DB.closeStatement(st);
			        DB.closeConnection();
			    }
	}
	
	
	
}
		
