package application;

import java.sql.Connection;

import Methods.Methods;
import db.DB;

public class Program {
	//nosso programa principal onde chamaremos nossas classes de auxilio
	public static void main(String[] args) {
		
		Connection conn = null;
		conn = DB.getConnection();
		Methods md = new Methods(conn);
		String Query = "insert into department (Name) values ('D1'),('D2')";
		
		md.InserOne(Query);
		
		
	}
}
