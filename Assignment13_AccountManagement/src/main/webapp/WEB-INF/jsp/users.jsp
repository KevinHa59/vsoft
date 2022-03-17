<%@ page import="java.util.*" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .header{
            font-weight: bold
        }
        .width100{
            width: 100px;
        }
        .width200{
            width: 200px;
        }
        .flex{
            display: flex;
            width: 100%;
        }
        *{
            margin: 0;
            padding: 0;

        }
        .MainContainer{
            width: 100%;
            height: 100vh;
            background: #102034;
            display: flex;
            justify-content: center;
        }
        .formContainer{
            width: 600px;
            height: 100%;

            display: flex;
            align-items: center;
            flex-direction: column;


        }

        .ListContainer{

            margin-top: 50px;

            background: white;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        .headerContainer{
            height: 30px;
            width: 90%;
            border-bottom: 1px solid #1c467f;
            display: flex;
            align-items: center;
        }
        .contentContainer{
            width: 90%;
        }
        .LinkContainer{
            display: flex;
            width: 100%;
            justify-content: center;
            margin-top: 10px;
            margin-bottom: 20px;
            gap: 10px;
        }
        .LinkContainer a{
            text-decoration: none;
            color: #3a76c6;
        }
        .LinkContainer a:hover{
            color: #1c467f;
            border-bottom: 1px solid #3a76c6;
        }
    </style>
</head>
<body>
<div class="MainContainer">
    <div class="formContainer">
        <div class="ListContainer">
            <div class="headerContainer flex">
                <div class="header width100" >ID</div>
                <div class="header width200" >Name</div>
                <div class="header width200">Username</div>
                <div class="header width200">Password</div>
            </div>

            <c:forEach items="${users}" var="users">
                <div class="contentContainer flex">
                    <div class="width100"><c:out value="${users.id}"/></div>
                    <div class="width200"><c:out value="${users.name}"/></div>
                    <div class="width200"><c:out value="${users.username}"/></div>
                    <div class="width200"><c:out value="${users.password}"/></div>
                </div>
            </c:forEach>
            <div class="LinkContainer">
                <a href="/register">Register</a> |
                <a href="/">Login</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>