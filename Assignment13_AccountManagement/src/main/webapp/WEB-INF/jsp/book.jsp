<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <style>
        *{
            margin: 0;
            padding: 0;

        }
        body{
            background: #102034;
        }
        .MainContainer{
            width: 100%;
            height: 100vh;

            display: flex;
            justify-content: center;
        }
        .formContainer{
            width: 70%;
            height: 80%;

            display: flex;
            flex-direction: column;
            gap: 20px;
        }
        .form{
            margin-top: 20px;
            padding-top: 20px;
            width: 100%;
            height: max-content;
            border: 1px solid #fff;
            background: white;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 2px;
        }
        .navBar{
            width: 90%;
            display: flex;
            justify-content: space-between;
        }
        .headerContainer{
            margin-top: 50px;
            display: flex;
            width: 90%;
            gap: 8px;
        }
        .headerContainer .header{
            font-size: 20px;
            font-weight: bold;
        }
        .inputContainer, .updateContainer{
            width: 90%;

        }
        .bodyContainer{
            display: flex;
            margin-top: 20px;
            flex-direction: column;
            width: 90%;
            gap: 5px;
            margin-bottom: 50px;
        }
        .bodyItem{
            width: 100%;
            display: flex;
            gap: 20px;

        }
        .widthC50{
            width: calc(50%);
        }
        .widthC20{
            width: calc(20%);
        }
        .widthC10{
            width: calc(10%);
        }
        .hide{
            display: none;
        }
    </style>
    <script>

    </script>

</head>
<body>
<div class="MainContainer">
   <div class="formContainer">
<%--User Book--%>
       <div class="form">
           <div class="navBar">Welcome ${user.firstName}<a href="/logout">Logout</a></div>
           <div class="headerContainer">
               <div class="header widthC50">Name</div>
               <div class="header widthC20">Author</div>
               <div class="header widthC10">Price</div>
           </div>
           <div class="inputContainer">

           <form:form action="/book/add" modelAttribute="book">
                   <input  class="widthC50" name="name" type="text" placeholder="Book Name"/>
                   <input  class="widthC20" name="author" type="text" placeholder="Author"/>
                   <input   class="widthC10" name="price" type="text" placeholder="Price"/>
                   <button  type="submit" class="widthC10">Add</button>
           </form:form>
           </div>
           <div class="updateContainer">
               <form:form action="/book/update/${bookData.id}" modelAttribute="bookData">
                   <input value="${bookData.name}" class="widthC50" name="name" type="text" placeholder=""/>
                   <input value="${bookData.author}" class="widthC20" name="author" type="text" placeholder=""/>
                   <input value="${bookData.price}" class="widthC10" name="price" type="text" placeholder=""/>
                   <button  type="submit" class="widthC10" >Update</button>
               </form:form>
           </div>

           <div class="bodyContainer">
               <c:forEach var="books" items="${books}">
                   <div class="bodyItem">
                       <div class="widthC50">${books.name}</div>
                       <div class="widthC20">${books.author}</div>
                       <div class="widthC10">$${books.price}</div>
                       <div class="widthC20">
                           <a href="/book/${books.id}" class="edit">Update</a>
                           <a href="/book/delete/${books.id}" class="delete">Delete</a>
                       </div>

                   </div>

               </c:forEach>
           </div>
       </div>
<%--        All Book--%>
       <div class="form">
           <div class="navBar">All Books</div>
           <div class="headerContainer">
               <div class="header widthC50">Name</div>
               <div class="header widthC20">Author</div>
               <div class="header widthC10">Price</div>
               <div class="header widthC10">Posted By</div>
           </div>


           <div class="bodyContainer">
               <c:forEach var="allBooks" items="${allBooks}">
                   <div class="bodyItem">
                       <div class="widthC50">${allBooks.name}</div>
                       <div class="widthC20">${allBooks.author}</div>
                       <div class="widthC10">$${allBooks.price}</div>
                       <div class="widthC20">${allBooks.user.firstName} ${allBooks.user.lastName}</div>
                   </div>

               </c:forEach>
           </div>
       </div>
   </div>
</div>
</body>
</html>