<%@ page import="bean.SurveyTask" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dog_o
  Date: 2017/12/29
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>填写报名数据</title>
    <% SurveyTask task=(SurveyTask)request.getAttribute("surveytask");%>
</head>
<body>
填写报表
<s:form action="survey.action">

</s:form>
</body>
</html>
