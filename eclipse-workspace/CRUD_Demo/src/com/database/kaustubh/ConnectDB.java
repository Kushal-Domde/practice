package com.database.kaustubh;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB 
{
		public Connection getConnection() 
		{
			Connection c = null;
			try 
			{
					if (c== null)
					{
						System.out.println("in Connection try .........");
						Class.forName("org.postgresql.Driver");
						c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","postgres");
						System.out.println("connection " + c);
						System.out.println("Connection to database sucessfully");
						
					}
			}
			catch (Exception e) 
			{
					e.printStackTrace();
					System.err.println(e.getClass().getName()+": "+e.getMessage());
			         System.exit(0);
			}
			return c;
		}
}
