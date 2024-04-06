
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "ex" uri = "com.vtn.tag"%>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
<h1>Hello JSP - I'm JSP with SpringBoot</h1>
<ex:Hello/>
<ex:Tag value="I want to say something here"/>
<c:url var="add_book_url" value="/book/addBook"/>
<ex:Compress type="CSS">
    /* Container holding the image and the text */
    .container {
    position: relative;
    }

    /* Bottom right text */
    .text-block {
    position: absolute;
    bottom: 20px;
    right: 20px;
    background-color: black;
    color: white;
    padding-left: 20px;
    padding-right: 20px;
    }
</ex:Compress>
<ex:Compress type="JS">
    let firstName, lastName, price, discount, fullPrice;

    // Use later
    firstName = "John";
    lastName = "Doe";

    price = 19.90;
    discount = 0.10;

    fullPrice = price - discount;
</ex:Compress>
<%--@elvariable id="book" type="com.vtn.HelloController.Book"--%>
<form:form action="${add_book_url}" method="post" modelAttribute="book" >
    <form:label path="isbn">ISBN: </form:label> <form:input type="text" path="isbn"/>
    <form:label path="name">Book Name: </form:label> <form:input type="text" path="name"/>
    <form:label path="author">Author Name: </form:label> <form:input path="author"/>
    <input type="submit" value="submit"/>
</form:form>
</body>
</html>
