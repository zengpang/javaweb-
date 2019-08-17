package practice.javaweb.dao;

import practice.javaweb.enity.UserInformation;

public interface SqlSeverOperationDao {
    public boolean SqlSeverAddDao(UserInformation user);
    public void SqlSeverDeleteDao();
    public boolean SqlSeverChangeDao(String name,String PassWord);
    public String SqlSeverPassWordSelectDao(String Name);
    public UserInformation SqlSeverAllSelectDao();
    
    
    
}
