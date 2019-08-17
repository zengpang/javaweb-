package practice.javaweb.enity;

public class UserInformation {
      private String UserName;
      private String PassWord;
      private String UserHody;
      private int UserSex;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getUserHody() {
		return UserHody;
	}
	public void setUserHody(String userHody) {
		UserHody = userHody;
	}
	public int getUserSex() {
		return UserSex;
	}
	public void setUserSex(int userSex) {
		UserSex = userSex;
	}
      
}
