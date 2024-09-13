package Methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

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
	        this.st.setDouble(1, 600.00);
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

	
	
	
}
		
