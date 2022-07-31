<%--
  Created by IntelliJ IDEA.
  User: 76578
  Date: 2021/12/14
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>YK列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>YK列表</small>

                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/yk/to_add_yk">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/yk/allYks">显示所有用户</a>
        </div>
        <div class="col-md-8 column">
            <form  class="form-inline" action="${pageContext.request.contextPath}/user/queryuser" method="post" style="float: right">
                <span style="color: red;font-weight:bold">${error}</span>
                <input type="text" name="queryusername" class="form-control" placeholder="请输入要查询的数据名称">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-striped table-bordered table-hover dataTables-example">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>名字</th>
                    <th>性别</th>

                    <th>图片</th>

                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="yk" items="${requestScope.get('list')}">
                    <tr>
                        <td>${yk.getId()}</td>
                        <td>${yk.getName()}</td>

                        <c:choose>
                          <c:when test="${yk.getSex()=='0'}">
                              <td>女</td>
                          </c:when>
                          <c:when test="${yk.getSex()=='1'}">
                              <td>男</td>
                          </c:when>
                        </c:choose>

                        <td><img src="${pageContext.request.contextPath}/yk/get_base64_img?id=${yk.getId()}"></td>

                        <td>
                            <a href="${pageContext.request.contextPath}/user/toUpdateuser?id=${user.getStudent_id()}">更改</a>|
                            <a href="${pageContext.request.contextPath}/yk/del${yk.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

