package practice.javaweb.severlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.javaweb.daoimp.SqlSeverDaoImp;
import practice.javaweb.enity.UserInformation;

/**
 * Servlet implementation class registeredseverlet
 */
@WebServlet("/registeredseverlet")
public class registeredseverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registeredseverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String z_name=request.getParameter("z_name");
		String z_password=request.getParameter("z_password");
		String hody=request.getParameter("z_hody");
	    String sex=request.getParameter("z_sex");
	    int sex_state=0;
	    if(sex.equals("man"))
	    {
	    	sex_state=1;
	    	
	    }
	    SqlSeverDaoImp sever=new SqlSeverDaoImp();
	    UserInformation user=new UserInformation();
	    user.setUserName(z_name);
	    user.setPassWord(z_password);
	    user.setUserHody(hody);
		user.setUserSex(sex_state);
		if(sever.SqlSeverAddDao(user))
		{
		
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("zc_state", "×¢²áÊ§°Ü");
			request.getRequestDispatcher("faillure.jsp").forward(request, response);
			
		}
		
	}

}
