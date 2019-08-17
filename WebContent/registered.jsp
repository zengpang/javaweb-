<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
   <form action="registeredseverlet" method="post">
     姓名:<input type="text" name="z_name" id="z_name" /><br/>
    密码 ：<input type="password" name="z_password" id="z_password"/><br/>
   确定密码:  <input type="password" name="z_qdpassword" id="z_qdpassword"/><br/>
   兴趣爱好:<input type="text" name="z_hody" id="z_hody"/><br/>
   性别:<br/><input type="checkbox" name="z_sex" id="z_sex" value="man"/>男<br/>
      <input type="checkbox" name="z_sex" id="z_sex" value="woman" />女<br/>
      
   
   
     <input type="submit" value="注册"/>
     <input type="button" onclick="welcomejump()" value="登入"/>
       <script type="text/javascript">
             function welcomejump() {
            	 var url="welcome.jsp";
            	 
            	 window.location.href= url;
            	
				
			}
          </script>
   </form>
</body>
</html>