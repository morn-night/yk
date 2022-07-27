<%--
  Created by IntelliJ IDEA.
  User: 76578
  Date: 2021/12/13
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
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
                    <small>
                        新增人物
                    </small>
                </h1>

        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/user/adduser"
      method="post">
    编号：<input type="text" name="student_id"><br><br><br>
    姓名：<input type="text" name="sname"><br><br><br>
    密码：<input type="text" name="password"><br><br><br>
    备注：<textarea name="note" cols="25" rows="4"></textarea><br><br><br>
    性别：<input type="text" name="sex" placeholder="输入1或者0，男为1,女为0"><br><br><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</div>
</body>
</html>
