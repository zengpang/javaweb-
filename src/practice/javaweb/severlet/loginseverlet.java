package practice.javaweb.severlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.javaweb.dao.SqlSeverOperationDao;
import practice.javaweb.daoimp.SqlSeverDaoImp;
import practice.javaweb.enity.UserInformation;

/**
 * Servlet implementation class loginseverlet
 */
@WebServlet("/loginseverlet")
public class loginseverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public loginseverlet() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String information=null;
		boolean Switch=false;
		UserInformation user=new UserInformation();
		
		SqlSeverDaoImp sever=new SqlSeverDaoImp();
		
		String dr_name=request.getParameter("dr_nametext");
		String dr_password=request.getParameter("dr_password");
	    if(dr_password.equals(null)||dr_name.equals(null))
	    {
	    	information="密码或用户名为空";
	    	
	    	
	    }
	   
	    else if(dr_password.equals(sever.SqlSeverPassWordSelectDao(dr_name).trim()))
	    {
	    	information="欢迎"+dr_name+"用户";
	    	
	    	Switch=true;
	    }
	    else
	    {
	    	information="密码错误";
	    	
	    }
	    System.out.println(sever.SqlSeverPassWordSelectDao(dr_name));
	    request.setAttribute("editor", information);
	    
	    if(Switch)
	    {
	    	user=sever.SqlSeverAllSelectDao();
	    	request.setAttribute("output_hody", user.getUserHody());
	    	request.setAttribute("output_sex", user.getUserSex());
	    	
	    	request.getRequestDispatcher("self_homepage.jsp").forward(request,response);
	    }
	    else
	    {
	    	request.getRequestDispatcher("faillure.jsp").forward(request, response);
	    }
	    
		
		
	}

}
