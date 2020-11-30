<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Art
  Date: 2020-11-22
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding new invoice</title>
</head>
<body>
<div>
    <a href= "http://localhost:8080" style="text-decoration:none">Back to main menu</a>
</div>
<br>
<div>
<b>Please enter your invoice:</b>
</div>
<br>
<div>
    <form:form method="post" modelAttribute="invoice">
<%--        <div>--%>
<%--            <label for="company">Select company name or add new one</label>--%>
<%--            <form:select path="company" items="${companies}" id="company" itemLabel="name" itemValue="id"/>--%>
<%--            <form:errors path="company"/>--%>
<%--        </div>--%>

        <div>
            <label for="invoiceNumber">Add number of invoice :</label>
            <form:input path="invoiceNumber"/>
            <form:errors path="invoiceNumber"/>
        </div>

        <div>
            <label for="date" datatype="dd/MM/yyyy">Enter date of invoice:</label>
            <form:input path="date" type="date"/>
            <form:errors path="date"/>
        </div>

        <div>
            <label for="amountNetto">Enter netto amount:</label>
            <form:input path="amountNetto"/>
            <form:errors path="amountNetto"/>
        </div>

        <div>
            <label for="vat">Choose the rate of tax</label>
            <form:select path="vat" items="${vates}" id="vat" itemLabel="percents" itemValue="id"/>
            <form:errors path="vat"/>
        </div>

        <label for="amountBrutto">This your brutto amount: </label>
        <form:input path="amountBrutto"/>
        <form:errors path="amountBrutto"/>




</div>

<script type="text/javascript" src="../../js/counting.js"></script>



<div>
    <input type="submit" value="Add invoice">
</div>
<link rel="stylesheet" href="../css/style.css">
    </form:form>



</body>
</html>
