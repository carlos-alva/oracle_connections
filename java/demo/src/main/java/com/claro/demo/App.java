package com.claro.demo;
import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;

class App
{
  public static void main (String args[]) throws SQLException
  {
    OracleDataSource ods = new OracleDataSource();
    ods.setURL("jdbc:oracle:thin:C15347/12345678@172.17.44.237:1521:CAPORACL");
    Connection conn = ods.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rset = stmt.executeQuery ("SELECT NOMBRE_REGION FROM LABCL01.CL_REGION");
    
    while (rset.next())
    	   System.out.println (rset.getString(1));
    rset.close();
    stmt.close();

  }
}