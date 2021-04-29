<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Authenticated</title>
    <link rel="stylesheet" href="/auth/css/style.css">
</head>
<body>

<div class="main">
    <section class="sign-in">
        <div class="container">
            <div class="signin-content">
                <div class="signin-form">
                    <h2 class="form-title">${authenticatedMessage} ${username}</h2>
                    <form method="POST" class="register-form" id="logout-form" action="/logoutJsp">
                        <div class="form-group form-button">
                            <input type="submit" name="logout" id="logout" class="form-submit" value="Logout"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

</body>

</html>
