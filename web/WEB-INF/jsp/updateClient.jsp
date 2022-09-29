<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2022/5/31
  Time: 7:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改客户信息</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改客户信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/client/updateClient" method="post">

        <%--缺少ID，增加一个隐藏域--%>
        <input type="hidden" name="id" value="${client.id}"/>

        <div class="form-group">
            <label>客户密码：</label>
            <input type="text" name="password" class="form-control" id="password" value="${client.password}" required>
        </div>
        <div class="form-group">
            <label>客户姓名：</label>
            <input type="text" name="name" class="form-control" id="name" value="${client.name}" required>
        </div>
        <div class="form-group">
            <label>客户性别：</label>
            <input type="text" name="sex" class="form-control" id="sex" value="${client.sex}" required>
        </div>
        <div class="form-group">
            <label>客户电话：</label>
            <input type="text" name="phone" class="form-control" id="phone" value="${client.phone}" required>
        </div>
        <div class="form-group">
            <label>余额：</label>
            <input type="text" name="balance" class="form-control" id="balance" value="${client.balance}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>

</div>
</body>
</html>
