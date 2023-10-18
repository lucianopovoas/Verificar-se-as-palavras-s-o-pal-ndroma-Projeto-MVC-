<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Verificar Palíndromos</title>
</head>
<body>
    <form action="VerificaPalindromosServlet" method="POST">
        <label for="palavra1">Palavra 1:</label>
        <input type="text" id="palavra1" name="palavra1"><br>
        
        <label for="palavra2">Palavra 2:</label>
        <input type="text" id="palavra2" name="palavra2"><br>
        
        <input type="submit" value="Verificar Palíndromos">
    </form>
</body>
</html>
