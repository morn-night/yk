<%--
  Created by IntelliJ IDEA.
  User: 76578
  Date: 2021/12/25
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/user/updateuser" method="post">
        <input type="hidden" name="student_id" value="${user.getStudent_id()}"/>
        人物名称：<input type="text" name="sname" value="${user.getSname()}"/>
        密码：<input type="text" name="password" value="${user.getSex()}"/>
        姓别：<input type="text" name="sex" value="${user.getSex() }"/>
        备注：<input type="text" name="note" value="${user.getNote() }"/>
        <input type="submit" value="提交"/>
    </form>

</div>
</body>
</html>
