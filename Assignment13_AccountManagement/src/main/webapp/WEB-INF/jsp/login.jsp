<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
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
            width: 400px;
            height: 100%;

            display: flex;
            align-items: center;
        }
        .form{
            width: 100%;
            height: 500px;
            border: 1px solid #fff;
            background: white;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 5px;
        }
        .header{
            margin-top: 50px;
            width: 100%;
            height: 70px;
            font-weight: bold;
            font-size: 35px;
            text-align: center;
            color: #3a76c6;
        }
        .form input{
            width: 80%;
            font-size: 20px;
            padding: 10px;
            border-width: 0px;
            border-bottom: 1px solid #000;
        }
        .form input:focus{
            outline: none;
        }
        .form button{
            margin-top: 20px;
            width: 90%;
            font-size: 20px;
            height: 35px;
            border-width: 0px;
            border-radius: 35px;
            background: #3a76c6;
            color: white;
            transition: ease-in-out 0.3s;
            cursor: pointer;
        }
        .form button:hover{
            background: #8fbbf1;
        }
        .LinkContainer{
            display: flex;
            width: 100%;
            justify-content: center;
            margin-top: 10px;
            margin-bottom: 20px;
            gap: 10px;
        }
        .form a{
            text-decoration: none;
            color: #3a76c6;
        }
        .form a:hover{
            color: #1c467f;
            border-bottom: 1px solid #3a76c6;
        }

    </style>
</head>
<body>
<div class="MainContainer">
    <div class="formContainer">

        <form class="form" action="/login" modelAttribute="user">
            <div class="header">Login</div>
            <input type="text" placeholder="Username" name="username"  value="" onclick="this.value=''"/><br/>
            <input type="password" placeholder="Password" name="password"  value="" onclick="this.value=''"/><br/>
            <button type="submit" value="Login">Submit</button>

            <div class="LinkContainer">
                <a href="/register">Register</a>
            </div>
            <h3>${msg}</h3><br/>
        </form>
    </div>
</div>

</body>
</html>