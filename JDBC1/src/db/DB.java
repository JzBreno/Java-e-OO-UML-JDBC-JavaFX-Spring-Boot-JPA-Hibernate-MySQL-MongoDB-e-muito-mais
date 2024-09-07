package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	// criando objeto conection
	private static Connection conn = null;
	//metodo que estabelece conexão com banco de dados
	public static Connection getConnection() {
		//checando caso ainda não tenha sido iniciada a conexão
		if(conn == null ) {
			//try catch para tratamento de supostos erros
			try {
				//esse objeto props carrega nossos dados de conexao, login/senha
				Properties props = loadProperties();
				//guardando o url do nosso banco para facilitar o acesso
				String url = props.getProperty("dburl");
				//iniciando 
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
			
		}
		return conn;
	}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new DbException(e.getMessage());
			}
		}
	}
	

	private static Properties loadProperties() {
		try( FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch(IOException e){
			throw new DbException(e.getMessage());
		}
	}
	
	
	
}
