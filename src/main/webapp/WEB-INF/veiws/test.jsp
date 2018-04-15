<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
    <title>Test</title>
</head>
<body>

Test JSP!

<form:form modelAttribute="contactType" action="${contextPath}/test" method="POST">

    <div>
        <form:input path="name" class="form-control" placeholder="Название" autofocus="true"/>
        <form:errors path="name"/>
    </div>

    <button type="submit">Сохранить</button>
</form:form>

</body>
</html>
