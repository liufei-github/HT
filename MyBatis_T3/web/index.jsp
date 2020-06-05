<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="emp!list" method="post">
  姓名：<input type="text" name="emp.ename"/> 年龄：<input type="text" name="emp.age" value="${emp.age}"/><input type="submit" value="搜索"/>
  </form>
  <table bgcolor="blue" cellspacing="1" align="center" width="60%">
    <tr bgcolor="white">
      <th>编号</th>
      <th>姓名</th>
      <th>年龄</th>
      <th>部门编号</th>
    </tr>
    <s:iterator value="#attr.list" var="e">
      <tr bgcolor="white">
        <td>${e.id}</td>
        <td>${e.ename}</td>
        <td>${e.age}</td>
        <td>${e.did}</td>
      </tr>
    </s:iterator>
    <tr bgcolor="white"><td colspan="4"><a href="emp!list?page.currPage=1&emp.ename=${emp.ename}&emp.age=${emp.age}">首页</a><a>上一页</a><a href="emp!list?page.currPage=${page.currPage+1}&emp.ename=${emp.ename}&emp.age=${emp.age}">下一页</a><a>尾页</a></td></tr>
  </table>
  </body>
</html>
