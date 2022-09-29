<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2022/5/25
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户信息展示</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>客户列表——显示所有客户信息</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/client/toAddClient">新增客户</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/client/allClient">客户列表</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <%--查询客户信息--%>
            <form action="${pageContext.request.contextPath}/client/queryClient" method="post" style="float: right" class="form-inline">
                <span style="color: red;font-weight: bold">${error}</span>
                <input type="text" name="clientName" class="form-control" placeholder="请输入要查询的客户姓名">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>
</div>

<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th>客户编号</th>
                    <th>客户密码</th>
                    <th>客户姓名</th>
                    <th>客户性别</th>
                    <th>客户电话</th>
                    <th>余额</th>
                    <th>操作</th>
                </tr>
            </thead>

            <%--客户信息从数据库中查询出来，从这个list中遍历出来：foreach--%>
            <tbody>
                <c:forEach var="client" items="${list}">
                    <tr>
                        <td>${client.id}</td>
                        <td>${client.password}</td>
                        <td>${client.name}</td>
                        <td>${client.sex}</td>
                        <td>${client.phone}</td>
                        <td>${client.balance}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/client/toUpdateClient?id=${client.id}">修改</a>
                             &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/client/deleteClient?id=${client.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
