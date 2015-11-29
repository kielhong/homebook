<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<title>Home Book</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
</head>

<body>
<div class="container">
  <div class="col-md-8">
    <h1>${book.name} 정보</h1>

    <table class="table table-hover">
      <col width="50px">
      <col width="200px"
      <tbody>
      <tr>
        <td>저자</td>
        <td>${book.author}</td>
      </tr>
      <tr>
        <td>출판사</td>
        <td>${book.publisher}</td>
      </tr>
      <tr>
        <td>ISBN</td>
        <td>${book.isbn}</td>
      </tr>
      <tr>
        <td>장르</td>
        <td>${book.genre}</td>
      </tr>
      <tr>
        <td>평가</td>
        <td>${book.rate}</td>
      </tr>
      <tr>
        <td>Tag</td>
        <td>
          <c:forEach var="tag" items="${book.tags}" varStatus="status">
            <a href="/tags/${tag.name}">${tag.name}</a><c:if test="${not status.last}">, </c:if>
          </c:forEach>
        </td>
      </tr>
      </tbody>
    </table>

  </div>
</div>
</body>
</html>