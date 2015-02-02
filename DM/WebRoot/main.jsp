<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/Login_head.jsp"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:if test="#session.teacher==null">
	<jsp:forward page="/common/ToLogin.jsp"/>
</s:if>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=basepath%>/images/favicon.ico" rel="SHORTCUT ICON">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
