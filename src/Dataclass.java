//���ݿ�����ࣨȫ����������Ϊ��̬���������  ���磺 Dataclass.executeQuery(sql)
import java.sql.*;

public class Dataclass {
	private static Connection conn = null;
	String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Java�γ�������ݿ� "; 
    String userName="sa";    //Ĭ���û��� 
    String userPwd="1111";     //���� 
	
	//���캯��
	public Dataclass(){      //������������
		try {
		if (conn == null) {
			Class.forName(driverName);
			conn = DriverManager.getConnection(dbURL, userName, userPwd);
		}
		else
			return;
		}
		catch (Exception e) {  //�������ݿ����Ӳ��ɹ��쳣
		       e.printStackTrace();
	    }
	}//���캯������
	
	public static ResultSet executeQuery(String sql) {    //���ͷ��ؽ������SQL���
		try {
			if(conn==null)
			new Dataclass();     //���ù��캯���������ݿ�
			return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery(sql); //���ؿɹ����Ĳ����¼�
		} 
		catch (SQLException e) {     //����������ݿ�ʧ���쳣
			e.printStackTrace();
			return null;
		} 
	}
	
	public static boolean executeUpdate(String sql) { //���Ͳ����ؽ������SQL���
		try {
			if(conn==null)
				new Dataclass();  //���ù��캯���������ݿ�
			int i = conn.createStatement().executeUpdate(sql);
			if(i != 0)
				return true;
		} 
		catch (SQLException e) {      //����������ݿ�ʧ���쳣
			System.out.println(e.getMessage());
			return false;                //���ɹ�����-1
		} 
		return false;
	}
	
	/*public static boolean sqlInsert(String sql){//�������
		try{
			if(conn==null)
				new Dataclass();  //���ù��캯���������ݿ�
			int i = conn.createStatement().executeUpdate(sql);
			
		}
		catch (SQLException e) {      //����������ݿ�ʧ���쳣
			System.out.println(e.getMessage());
			return false;                //���ɹ�����-1
		} 
		return false;
	}*/
	
	public static void close() {   //�Ͽ����ݿ����ӷ���
		try {
			conn.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			conn = null;        //�����ݿ����Ӷ���Ϊ��
		}
	}

}