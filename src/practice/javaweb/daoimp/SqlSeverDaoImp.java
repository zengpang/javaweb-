package practice.javaweb.daoimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import practice.javaweb.dao.SqlSeverOperationDao;
import practice.javaweb.enity.UserInformation;

public class SqlSeverDaoImp implements SqlSeverOperationDao  {
    private String SqlSeverDate_Name="sa";
    private String SqlSeverDate_PassWord="wqj13873258866";
    private String SqlSeverDate_Url="jdbc:sqlserver://localhost:1433;DatabaseName=STU_DB";
    private String SqlSeverDate_ClassUrl="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection connection=null;
    private PreparedStatement pstm=null;
    
    public SqlSeverDaoImp()
    {
    	try {
			Class.forName(SqlSeverDate_ClassUrl);
			connection=DriverManager.getConnection(SqlSeverDate_Url,SqlSeverDate_Name,SqlSeverDate_PassWord);
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	
    }
    
    
	@Override
	public boolean SqlSeverAddDao(UserInformation user) {
	  boolean result_add=false;
	  
	  try {
		pstm=connection.prepareStatement("insert into DBFORSTU values(?,?,?,?)  ");
		pstm.setString(1, user.getUserName());
		pstm.setString(2, user.getPassWord());
		pstm.setString(3, user.getUserHody());
		pstm.setInt(4, user.getUserSex());
		
		if(pstm.executeUpdate()>0)
		{
			result_add=true;
		}
		
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	  
		return result_add;
		
	}

	@Override
	public void SqlSeverDeleteDao() {
		
		
	}

	@Override
	public boolean SqlSeverChangeDao(String name,String PassWord) {
		boolean results=false;
         try {
        	 String sql="update DBFORSTU set Stu_PassWord=？ where Stu_Name=?";
        	 
        	 
        	 
			pstm=connection.prepareStatement("sql");
			pstm.setString(1, PassWord);
			pstm.setString(2, name);
			 results=pstm.execute();
			
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
         return results;
         
        		 
		
	}


	@Override
	public String SqlSeverPassWordSelectDao(String Name) {
		String PassWord=null;
		
		// TODO 自动生成的方法存根
		try {
			pstm=connection.prepareStatement("select * from DBFORSTU where Stu_Name=?");
			pstm.setString(1, Name);
			
			ResultSet resultSet=pstm.executeQuery();
			resultSet.next();
			PassWord=resultSet.getString("Stu_PassWord");
			
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return PassWord;
		
		
	}


	@Override
	public UserInformation SqlSeverAllSelectDao() {
		// TODO 自动生成的方法存根
		UserInformation user=new UserInformation();
		try {
			pstm=connection.prepareStatement("select * from DBFORSTU");
			ResultSet resultSet=pstm.executeQuery();
			while(resultSet.next())
			{
				user.setUserName(resultSet.getString("Stu_Name"));
				user.setPassWord(resultSet.getString("Stu_PassWord"));
				user.setUserHody(resultSet.getString("Stu_Hody"));
				user.setUserSex(resultSet.getInt("Stu_Sex"));
				
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return user;
		
		
		
	}

}
