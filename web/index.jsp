<%--
  Created by IntelliJ IDEA.
  User: 86176
  Date: 2019/12/11
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="/testMvc/hi">hello</a>

  <a href="/testMvc/testGet/1">hello</a>


  <form action="/testMvc/testGet/1" method="post">
    <input type="submit" value="testPost">

  </form>

  <form action="/testMvc/testGet/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="testDelete">

  </form>

  <form action="/testMvc/testGet/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="testPut">

  </form>
  </body>
</html>
