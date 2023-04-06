<!doctype html>
<html>
<head>
    <title>BuySell</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Регистрация</h4>
<form action="/registration" method="post">
    Имя пользователя: <input type="text" value="name"><br><br>
    Эл. почта: <input type="email" value="email"><br><br>
    Номер телефона: <input type="text" value="phoneNumber"><br><br>
    Пароль: <input type="password" value="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" name="Зарегистрироваться">
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
</body>
</html>