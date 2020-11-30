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

<div>
    <a href="http://localhost:8080" style="text-decoration:none">Back to main menu</a>
</div>
<br>

<div>There are all invoiced for your company:</div>
<br>
<table border="5" color="blue">

    <thead>
    <th>Lp.</th>
    <th>Number</th>
    <th>Company name</th>
    <th>Date</th>
    <th>Netto</th>
    <th>Vat</th>
    <th>Brutto</th>
    <th>Action</th>

    </thead>

    <tbody>

    <c:forEach items="${invoices}" var="invoice">
        <tr>
            <td><c:out value="${invoice.id}"/></td>
            <td><c:out value="${invoice.invoiceNumber}"/></td>
            <td><c:out value="${invoice.company.id}"/></td>
            <td><c:out value="${invoice.date}"/></td>
            <td><c:out value="${invoice.amountNetto}"/></td>
            <td><c:out value="${invoice.vat}"/></td>
            <td><c:out value="${invoice.amountBrutto}"/></td>
            <td>
                <br><a href="http://localhost:8080/invoice/delete/${invoice.id}" style="text-decoration:none">Delete</a>
                <br><a href="http://localhost:8080/invoice/edit/${invoice.id}"
                       style="text-decoration: none">Edit</a>
            </td>
        </tr>

    <link rel="stylesheet" href="../css/style.css">
    </c:forEach>


    </tbody>
</table>
</body>
</html>
