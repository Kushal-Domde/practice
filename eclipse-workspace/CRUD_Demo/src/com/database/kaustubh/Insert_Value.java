package com.database.kaustubh;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value
{
	public static void main(String[] args)
	{		
		Connection c = null;
		Statement st = null;
		ConnectDB con=new ConnectDB();
		c=con.getConnection();
		try
		{
			String query="INSERT INTO BOOK(BOOKNAME,BOOKID,NOOFPAGES,AUTHORNAME)" + "VALUES('DENIAL@GMAIL.COM','D140','100','SJHH')";
			
			
			st=c.createStatement();
			int i=st.executeUpdate(query);
			st.close();
			c.close();
			System.out.println(i +
					" record inserted");                 
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
	
}
}