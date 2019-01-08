<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.*"%>
<div id="open-result">
<%
AccountBean acc = (AccountBean)request.getAttribute("acc");
String accNum = acc.getAccountNum();
String money = String.valueOf(acc.getMoney());
String createdDate = acc.getToday();
%>
	계좌 번호 :<%=accNum %>
	잔 액 : <%=money %>
	계좌 생성일 : <%=createdDate %>
</div>
		