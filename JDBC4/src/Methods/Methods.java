package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbintegritException;

public class Methods {
	
	private Connection conn = null;
	private PreparedStatement st = null;
	
	public Methods(Connection conn){
		this.conn = conn;
	}
	
	public void Atualize(int IndiceDepartamento) {
	    try {
	        this.st = conn.prepareStatement("UPDATE seller "
	                + "SET BaseSalary = BaseSalary + ? "
	                + "WHERE DepartmentId = ?");
	        this.st.setDouble(1, 900.00);
	        this.st.setInt(2, IndiceDepartamento);
	        int rowsAffected = st.executeUpdate();
	        System.out.println("Done, rows affected: " + rowsAffected);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        DB.closeStatement(st);
	        DB.closeConnection();
	    }
	}

	public void Deletar(int indice) {
		   try {
		        this.st = conn.prepareStatement("DELETE FROM department"
		        		+ " WHERE Id = ?");
		        this.st.setInt(1, indice);
			    int row = st.executeUpdate();
			    
			    System.out.println("Done! rows Affected: " + row);
			    
			    } catch (SQLException e) {
			        throw new DbintegritException(e.getMessage());
			    } finally {
			        DB.closeStatement(st);
			        DB.closeConnection();
			    }
	}
	
	
	
}
		
