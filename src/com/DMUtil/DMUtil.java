package com.DMUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DMUtil {
  private String url = "jdbc:mysql://localhost:3306/dormitory?characterEncoding=utf8";
  private String userName = "root";
  private String userPassword = "";
  private String jdbcName = "com.mysql.jdbc.Driver";
  
  public Connection getCon() throws Exception{
	  Class.forName(jdbcName);
	  Connection con = DriverManager.getConnection(url,userName,userPassword);
	  return con;
  }
  public void closeCon(Connection con) throws Exception{
	  if(con!=null){
		  con.close();
	  }
  }
  public static void main(String[] args){
	  DMUtil dmutil = new DMUtil();
	  Connection con = null;
	  try {
		con = dmutil.getCon();
		System.out.println("���ݿ����ӳɹ���");
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			dmutil.closeCon(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  }
}
