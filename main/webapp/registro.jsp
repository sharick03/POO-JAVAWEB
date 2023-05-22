<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="css/estilos.css">
    <title>Login</title>
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="bolsillo?sc=volver"><button>Volver</button></a>
    </header>

      <div class="login-container">
          <div class="login-info-container">
            <h1 class="title">Registrarse</h1>
            <form class="inputs-container">
                <input class="input" type="text" placeholder="Nombre Usuario">
                <input class="input" type="text" placeholder="Documento">
                <input class="input" type="text" placeholder="Numero celular">
                <input class="input" type="text" placeholder="Contraseña">
                <p><a class="botons" href="bolsillo?sc=dashboard" type="submit">Registrarme</a></p>
               
            </form>
          </div>
      </div>

</body>
</html>