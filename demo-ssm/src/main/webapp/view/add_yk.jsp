<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增Yk</title>
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
                        新增yk
                    </small>
                </h1>

            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/yk/add_yk" enctype="multipart/form-data" method="post">
        id：<input type="text" name="id"><br><br><br>
        name：<input type="text" name="name"><br><br><br>
        sex：<input type="text" name="sex"><br><br><br>

        img：<input type="file" name="img"><br><br><br>

        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
