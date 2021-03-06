<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="/auth/css/style.css">
</head>
<body>

<div class="main">
    <!-- Sign in Form -->
    <section class="sign-in">
        <div class="container">
            <div class="signin-content">
                <div class="signin-form">
                    <h2 class="form-title">${loginTitle}</h2>
                    <form method="POST" class="register-form" id="login-form" action="/authenticateJsp">
                        <div class="form-group">
                            <label for="username"><i class="zmdi zmdi-account material-icons-name"></i></label>
                            <input type="text" name="username" id="username" placeholder="Username"/>
                        </div>
                        <div class="form-group">
                            <label for="password"><i class="zmdi zmdi-lock"></i></label>
                            <input type="password" name="password" id="password" placeholder="Password"/>
                        </div>
                        <br />
                        <div class="form-group form-button">
                            <input type="submit" name="login" id="login" class="form-submit" value="Log in"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="submit" name="loginLombok" id="loginLombok" class="form-submit" value="Log in Lombok"
                                   onclick="document.getElementById('login-form').action = '/authenticateJsp-by-lombok'; submit();"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

<!-- JS -->
<script src="/js/jquery.min.js"></script>
</body>

</html>
