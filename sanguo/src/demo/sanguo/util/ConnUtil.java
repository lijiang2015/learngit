package demo.sanguo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnUtil {
	
	private static String driverClass = "com.mysql.jdbc.Driver";//��������
	private static String url = "jdbc:mysql://192.168.100.123:3306/wukong_db";
	private static String usr = "wukong";
	private static String pwd = "123";
	
	private static Connection conn = null;//Ψһ����
	
	//������ֻ��Ҫ����һ�Σ����Է��ھ�̬�������
	static{
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection() {
		try {
			//��������ǿյĻ����Ѿ��رգ�����������
			if(conn==null||conn.isClosed()){
			//if(conn.isClosed()||conn==null){
				conn = DriverManager.getConnection(url,usr,pwd);
				System.out.println("ConnUtil:�����µ�����--�ɹ���");
			}
			System.out.println("ConnUtil:��ȡ����--�ɹ���");
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
