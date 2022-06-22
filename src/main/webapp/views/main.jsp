<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<head>
    <meta charset="ISO-8859-1">
    <title>Main</title>
    <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>
<body>
<div class="container">
    <h2>Archivio</h2>


 <tr>
        <td><spring:url value="/Docente/listaDocenti" var="ElencoDocentiURL"/><a href="${ElencoDocentiURL}" role="button" class="btn btn-primary">Archivio Docenti</a></td>
</tr>

    </br>
    </br>

<tr>

    <td><spring:url value="/Aule/listaAule" var="ElencoAuleURL"/><a href="${ElencoAuleURLURL}" role="button" class="btn btn-primary">Archivio Aule</a></td>
</tr>


    </br>
    </br>


    <tr>

        <td><spring:url value="/Discenti/listaDiscenti" var="ElencoDiscentiURL"/><a href="${ElencoDiscentiURL}" role="button" class="btn btn-primary">Archivio Discenti</a></td>

    </tr>

     </br>
    </br>

<tr>
    <td><spring:url value="/Corso/listaCorsi" var="ElencoCorsiURL"/><a href="${ElencoCorsiURL}" role="button" class="btn btn-primary">Archivio Corsi</a></td>

</tr>


</div>
</body>
</html>