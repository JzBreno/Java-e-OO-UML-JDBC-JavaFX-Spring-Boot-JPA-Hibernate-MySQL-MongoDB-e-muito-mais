package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbintegritException;

public class Methods {
	
	private Connection conn = null;
	private PreparedStatement st = null;
	private Statement state = null;
	
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
	
	public void transacao() {
		try {
	        
		    state = conn.createStatement();
		    conn.setAutoCommit(false);
		    
		    int rows1 = state.executeUpdate("UPDATE seller SET BaseSalary = 28987 WHERE DepartmentId = 1;");
		    int x = 1;
		    if(x<2) {
		    	throw new SQLException("Fake Error");
		    }
		    int rows2 = state.executeUpdate("UPDATE seller SET BaseSalary = 39866 WHERE DepartmentId = 2;");
		    conn.commit();
		    System.out.println("Rows1: "+rows1);
		    System.out.println("Rows2: "+rows2);
		    
		} catch (SQLException e) {
		        try {
					conn.rollback();
					throw new DbException("Transaction rolled back! Caused by "+e.getMessage());
				} catch (SQLException e2) {
					throw new DbException("Error trying to rollback! Caused by: "+e.getMessage());
				}
		    } finally {
		        DB.closeStatement(st);
		        DB.closeConnection();
		    }
	}
	
	
	
}
		
