<%--
  Created by IntelliJ IDEA.
  User: 左岸咖啡
  Date: 2022/9/13
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>YK展示</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery.js"></script>
</head>
<body>
<script>
    //禁用功能
    $(function(){
        $("ul.pagination li.disabled a").click(function () {
            return false;
        })
    });
</script>
<h1 align="center">YK展示</h1>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1 align="center">
                    <small>YK列表 --------- 显示所有YK</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <%--跳转 to--%>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/yk/to_add_yk">新增</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/yk/allYkss">显示所有用户</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-8 column">
                <form  class="form-inline" action="${pageContext.request.contextPath}/user/queryuser" method="post" style="float: right">
                    <span style="color: red;font-weight:bold">${error}</span>
                    <input type="text" name="queryusername" class="form-control" placeholder="请输入要查询的数据名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-stripe">
                <caption class="text-center ">书籍列表 ------ 共&nbsp;<span>${page.total}</span>&nbsp;本书</caption>
                <thead>
                <tr>
                    <th>编号</th>
                    <th>名字</th>
                    <th>性别</th>

                    <th>图片</th>

                    <th>操作</th>
                </tr>
                </thead>
                <%--s书籍从数据库中查找出来，从这个list中遍历出来，foreach--%>
                <tbody>
                <c:forEach var="yk" items="${ykList}" varStatus="pages">
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
                            <a href="${pageContext.request.contextPath}/yk/to_update_yk?id=${yk.getId()}">更改</a>|
                            <a href="${pageContext.request.contextPath}/yk/del${yk.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <!-- 分页标签 -->
            <nav class="pageDIV text-center" >
                <ul class="pagination">
                    <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if> >
                        <a href="?page.startIndex=0">
                            <span> 首页 </span>
                        </a>
                    </li>
                    <%--跳到下一页 判断是否有下一页 则不可点击后跳 class="disabled" --%>
                    <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if> >
                        <a href="?page.startIndex=${page.startIndex-page.pageSize}">
                            <span> 上一页 </span>
                        </a>
                    </li>
                    <c:forEach begin="0" end="${page.totalPage-1}" varStatus="pages">
                        <c:if test="${pages.count*page.pageSize-page.startIndex<=15 && pages.count*page.pageSize-page.startIndex>=-5}">
                            <li <c:if test="${pages.index*page.pageSize==page.startIndex}">class="disabled" </c:if>>
                                <a href="?page.startIndex=${pages.index*page.pageSize}"
                                   <c:if test="${pages.index*page.pageSize==page.startIndex}">class="current"</c:if>
                                >${pages.count}</a>
                            </li>
                        </c:if>
                    </c:forEach>
                    <%--跳到下一页 判断是否有下一页 则不可点击后跳 class="disabled" --%>
                    <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                        <a href="?page.startIndex=${page.startIndex+page.pageSize}">
                            <span> 下一页 </span>
                        </a>
                    </li>
                    <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
                        <a href="?page.startIndex=${page.last}">
                            <span> 尾页 </span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>

