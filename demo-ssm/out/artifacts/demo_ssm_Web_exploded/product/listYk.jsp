<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath());
%>
<html>
<head>
    <title>用户列表页面</title>

    <style>
        body {
            background-color: lightcyan;
        }

        table {
            background-color: yellow;
            width: 600px;
            height: 150px;
            border: 1px solid black;
            margin: 100px auto;
            text-align: center;
            child-align: middle;

        }

        caption {
            font-size: 50px;
            font-weight: bold;

        }

    </style>
</head>
<body>

<div>
    <table cellpadding="10" cellspacing="0" border="1px">
        <caption>用户列表</caption>
        <br/>
        <tr>
            <th>id</th>
            <th>name</th>
<%--            <th>密码</th>--%>
<%--            <th>操作</th>--%>
        </tr>

        <c:forEach items="${listYk}" var="yk" varStatus="status">
            <tr>
                <td>${yk.id}</td>
                <td>${yk.name}</td>

                <td>
<%--                    <a href="${basePath}/editUser.action?id=${user.id}">修改</a>&nbsp;&nbsp;--%>
<%--                    <a onclick="return confirm('确认删除码？')"--%>
<%--                       href="${basePath}/deleteUser.action?id=${user.id}">删除</a>--%>
                </td>
            </tr>
        </c:forEach>


    </table>
</div>
</body>
</html>