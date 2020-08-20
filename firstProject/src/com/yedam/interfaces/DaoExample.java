package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
//		DataAccessObject dao = new OracleDb(); //oracledb -> mysql
//		MysqlDb dao = new MysqlDb(); 
		DataAccessObject dao =  new MysqlDb();
		
		dao.select();
		dao.insert();
		dao.update();
	}
}
