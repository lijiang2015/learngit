package demo.sanguo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnUtil {
	
	private static String driverClass = "com.mysql.jdbc.Driver";//驱动类名
	private static String url = "jdbc:mysql://192.168.100.123:3306/wukong_db";
	private static String usr = "wukong";
	private static String pwd = "123";
	
	private static Connection conn = null;//唯一连接
	
	//驱动类只需要加载一次，所以放在静态代码块里
	static{
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库连接
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection() {
		try {
			//如果连接是空的或者已经关闭，创建新连接
			if(conn==null||conn.isClosed()){
			//if(conn.isClosed()||conn==null){
				conn = DriverManager.getConnection(url,usr,pwd);
				System.out.println("ConnUtil:创建新的连接--成功！");
			}
			System.out.println("ConnUtil:获取连接--成功！");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return conn;
	}
	
	
	public static void close(ResultSet rs,Statement st,Connection conn){
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(conn!=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
