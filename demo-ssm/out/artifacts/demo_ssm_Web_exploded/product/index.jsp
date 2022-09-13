<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath());
%>
<html>
<head>
    <title>SSM_Yk</title>

    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <link href="bootstrap-3.4.1-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>

</head>
<body>

<p><a href="${basePath}/api/v1/pub/yk/listYks.action">查看所有的用户</a></p>
<%--<p><a href="${basePath}/addUserUI.action">添加用户信息</a></p>--%>

<%--<button class="btn btn-success" type="submit">提交</button>--%>

</body>
</html>