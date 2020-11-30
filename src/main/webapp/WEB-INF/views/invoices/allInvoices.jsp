<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Art
  Date: 2020-11-21
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invoices Database</title>
</head>
<body>
Here you can see all invoices in database:
<div>
    <a href="http://localhost:8080" style="text-decoration:none">Back to main menu</a>
</div>
<br>
<div>There are all invoiced for your company:</div>
<br>
<table border="5" color="blue">

    <thead>
    <th>Lp.</th>
    <th>Name</th>
    <th>Address</th>
    <th>E-Mail</th>
    <th>Nip</th>
    <th>Bank Account</th>
    <th>Action</th>

    </thead>

    <tbody>

    <c:forEach items="${invoices}" var="invoice">
        <tr>
            <td><c:out value="${invoice.id}"/></td>
            <td><c:out value="${invoice.company.name}"/></td>
            <td><c:out value="${invoice.address}"/></td>
            <td><c:out value="${invoice.email}"/></td>
            <td><c:out value="${invoice.NIP}"/></td>
            <td><c:out value="${invoice.bankAccount}"/></td>
            <td>
                <br><a href="http://localhost:8080/admin/company/delete/${invoice.id}" style="text-decoration:none">Delete</a>

            </td>
        </tr>

    </c:forEach>


    </tbody>
</table>
</body>
</html>
