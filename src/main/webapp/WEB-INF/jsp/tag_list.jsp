<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <div class="col-md-6">
    <h1>Tag 목록</h1>

    <table class="table table-hover">
      <thead>
      <tr>
        <th>Tag</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="tag" items="${tags}">
      <tr>
        <td><a href="/tags/${tag.name}">${tag.name}</a></td>
      </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>