package application;

import java.sql.Connection;
import Methods.Methods;
import db.DB;


public class Program {
	//nosso programa principal onde chamaremos nossas classes de auxilio
	public static void main(String[] args) {
	
		Connection conn = DB.getConnection();
	
		Methods md = new Methods(conn);
		md.Deletar(2);
	}
}
