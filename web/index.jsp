<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2017/12/21
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>交作业页面</title>
  </head>
  <body>
  请选择要上传的文件：
  <s:form action="file_up" method="post" enctype="multipart/form-data" theme="simple">
    <s:file name="upload" cssStyle="width:300px;"/>
    <s:submit value="确定"/>
  </s:form>
  </body>
</html>
