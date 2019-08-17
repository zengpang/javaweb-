<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      
     <h1><%=request.getAttribute("editor") %></h1><br/>
     <input type="button" value="返回登入页面" onclick="registered_jump()"/><br/>
     <input type="button" value="返回注册页面" onclick="welcome_jump()"/><br/>
     <script type="text/javascript">
       function registered_jump() {
		var url="registered.jsp";
		 window.location.href= url;
		
	}
       function welcome_jump() {
    	   var url="welcome.jsp";
    	   window.location.href=url;
    	   
		
	}
     </script>
     
     
     
</body>
</html>