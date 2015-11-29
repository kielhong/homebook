<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Tag:${tag.name} - Home Book</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
</head>

<body>
<div class="container">
  <div class="col-md-10">
    <h1>${tag.name} Tag를 가진 책 목록</h1>

    <table class="table table-hover">
      <thead>
      <tr>
        <th>제목</th>
        <th>저자</th>
        <th>장르</th>
        <th>평가</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="book" items="${books}">
      <tr>
        <td><a href="/books/${book.id}">${book.name}</a></td>
        <td>${book.author}</td>
        <td>${book.genre}</td>
        <td>${book.rate}</td>
      </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>