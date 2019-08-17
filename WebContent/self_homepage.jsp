<%@page import="practice.javaweb.enity.UserInformation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人页面</title>
</head>
<body>
      <h1><%=request.getAttribute("editor") %></h1>
      <h2><% String OUTPUT_HODY="用户兴趣爱好为";
      OUTPUT_HODY=OUTPUT_HODY+request.getAttribute("output_hody").toString();
      out.print(OUTPUT_HODY);
      
      
             
              %></h2>
       <h2><% String OUTPUT_SEX="用户性别为";
              String SEX="女";
              if(Integer.parseInt(request.getAttribute("output_sex").toString())>0)
              {
            	  SEX="男";
              }
              out.print(OUTPUT_SEX+SEX);%></h2>
</body>
</html>