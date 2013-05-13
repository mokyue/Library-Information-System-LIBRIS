//数据库操作类（全部方法设置为静态，方便调用  例如： Dataclass.executeQuery(sql)
import java.sql.*;

public class Dataclass {
	private static Connection conn = null;
	String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Java课程设计数据库 "; 
    String userName="sa";    //默认用户名 
    String userPwd="1111";     //密码 
	
	//构造函数
	public Dataclass(){      //用于连接数库
		try {
		if (conn == null) {
			Class.forName(driverName);
			conn = DriverManager.getConnection(dbURL, userName, userPwd);
		}
		else
			return;
		}
		catch (Exception e) {  //捕获数据库连接不成功异常
		       e.printStackTrace();
	    }
	}//构造函数结束
	
	public static ResultSet executeQuery(String sql) {    //传送返回结果集的SQL语句
		try {
			if(conn==null)
			new Dataclass();     //调用构造函数连接数据库
			return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery(sql); //返回可滚动的并发事件
		} 
		catch (SQLException e) {     //捕获访问数据库失败异常
			e.printStackTrace();
			return null;
		} 
	}
	
	public static boolean executeUpdate(String sql) { //发送不返回结果集的SQL语句
		try {
			if(conn==null)
				new Dataclass();  //调用构造函数连接数据库
			int i = conn.createStatement().executeUpdate(sql);
			if(i != 0)
				return true;
		} 
		catch (SQLException e) {      //捕获访问数据库失败异常
			System.out.println(e.getMessage());
			return false;                //不成功返回-1
		} 
		return false;
	}
	
	/*public static boolean sqlInsert(String sql){//插入操作
		try{
			if(conn==null)
				new Dataclass();  //调用构造函数连接数据库
			int i = conn.createStatement().executeUpdate(sql);
			
		}
		catch (SQLException e) {      //捕获访问数据库失败异常
			System.out.println(e.getMessage());
			return false;                //不成功返回-1
		} 
		return false;
	}*/
	
	public static void close() {   //断开数据库连接方法
		try {
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			conn = null;        //置数据库连接对象为空
		}
	}

}