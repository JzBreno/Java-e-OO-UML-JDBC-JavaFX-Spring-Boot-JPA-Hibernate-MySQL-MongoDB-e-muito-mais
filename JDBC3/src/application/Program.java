package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	//nosso programa principal onde chamaremos nossas classes de auxilio
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?,?,?,?,?)");
			st.setString(1, "Marcos neto");
			st.setString(2, "macos@com.br");
			st.setDate(3,new java.sql.Date(sdf.parse("13/10/2001").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 2);
			int rows = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
			
		}
		
		

	}

}
