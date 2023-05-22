<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Dashboard</title>
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>
    <header class="header">
        <nav>
        <a class="btn" href="bolsillo?sc=volver"><button>Volver</button></a>
    </header>
	<div class="container-card">
	<div class="card">
		<figure>
			<img src="img/retirar.webp">
		</figure>
		<div class="contenido-card">
			<h3>Retirar Dinero</h3>
			<a input type="text" name="retirar" href="bolsillo?sc=retirar">Retirar</a>
		</div>
	</div>
	<div class="card">
		<figure>
			<img src="img/consultarsaldo.png">
		</figure>
		<div class="contenido-card">
			<h3>Consultar Saldo</h3>
			<a input type="text" name="consultar" href="bolsillo?sc=consultar">Consultar</a>
		</div>
	</div>
	<div class="card">
		<figure>
			<img src="img/recargar.jpg">
		</figure>
		<div class="contenido-card">
			<h3>Recargar Cuenta</h3>
			<a input type="text" name="recargar" href="bolsillo?sc=recargar">Recargar</a>
		</div>
	</div>
	</div>
</body>
</html>