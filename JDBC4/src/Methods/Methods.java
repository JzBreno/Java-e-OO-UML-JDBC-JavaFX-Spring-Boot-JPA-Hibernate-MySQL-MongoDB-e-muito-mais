package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbintegritException;

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
<<<<<<< HEAD
	        //dizendo qual ? irá receber o valor 600.0
	        this.st.setDouble(1, 600.00);
	        //dizendo qual ? irá receber o indice
=======
	        this.st.setDouble(1, 900.00);
>>>>>>> c7777522e92217ab4bffb7371827b08175df40de
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
<<<<<<< HEAD
			        e.printStackTrace();
			    //finalizando e fechando Statement e Connection 
=======
			        throw new DbintegritException(e.getMessage());
>>>>>>> c7777522e92217ab4bffb7371827b08175df40de
			    } finally {
			        DB.closeStatement(st);
			        DB.closeConnection();
			    }
	}
	
	
	
}
		
