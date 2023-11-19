
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Registratsiya</h1>

<form action="/register" method="post">
    <label for="username">Foydalanuvchi nomi:</label>
    <input type="text" id="username" name="username" required>
    <br>

    <label for="email">E-pochta manzili:</label>
    <input type="email" id="email" name="email" required>
    <br>

    <label for="password">Parol:</label>
    <input type="password" id="password" name="password" required>
    <br>

    <button type="submit">Registratsiya</button>
</form>
</body>
</html>
