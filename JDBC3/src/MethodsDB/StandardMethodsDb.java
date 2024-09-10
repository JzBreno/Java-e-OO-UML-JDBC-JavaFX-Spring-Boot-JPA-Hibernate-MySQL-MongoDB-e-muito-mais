package MethodsDB;

import java.sql.ResultSet;

import db.DB;

public class StandardMethodsDb {
	public StandardMethodsDb(){}
	
	public void SelectAll(ResultSet rs) {
		try {
			//iniciando a conexão com nossa classe de inicialização DB
			conn = DB.getConnection();
			//criando variavel que ira receber o comando sql
			st = conn.createStatement();
			//atribuindo o comando ao rs onde receberá o retorno do banco
			rs = st.executeQuery("select * from department where id = 1;");
			//percorrendo todo banco, quando checar no ultimo o rs.next() retornará false
			while(rs.next()) {
				//printandoa saida em rs com os metodos getInt/getString e seus...
				//respectivos nomes das colunas 
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		//capturando todos os possiveis erros de banco
		}catch() {
			
		}
	}
}
