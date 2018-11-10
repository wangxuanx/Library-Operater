package main;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBUTill {

	/*
	 * 打开数据库
	 */
	public static Connection open(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	/*
	 * 关闭数据库
	 */
	public static void close(Connection conn){
		
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	static{
		Properties prop=new Properties();
		Reader in;
		try {
			in = new FileReader("src\\config.properties");
			prop.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver=prop.getProperty("driver");
		url=prop.getProperty("url");
		username=prop.getProperty("username");
		password=prop.getProperty("password")
;	}
}

