<%-- 
    Document   : index
    Created on : 18-nov-2014, 20:05:03
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Traductor</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
     <body>
    <center> <h2>Traductor</h2>
        <form action="esd" method="post">
            <select name="Palabras">
                <option value="1">PALABRAS</option>
                <option value="2">Falda</option>
                <option value="3">Queso</option>
                <option value="4">Gente</option>
                <option value="5">Respuesta</option>
                <option value="6">Diccionario</option>
                <option value="7">Vaso</option>
                <option value="8">Baile</option>
                <option value="9">Caballo</option>
                <option value="10">Raton</option>
                <option value="11">Beso</option>
            </select>
           
            <input type="submit" value="Traducir" class="btn"/>
        </form>
    </center>
</body>
</html
