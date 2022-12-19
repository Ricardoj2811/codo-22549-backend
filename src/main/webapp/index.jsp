<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CRUD JAVA</title>
    <link
        href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Dongle:wght@300;400;700&family=Montserrat:wght@400;600;800&family=Open+Sans:wght@300;500;600;700&family=Oswald:wght@200;300;400;600;700&family=Roboto:ital,wght@0,100;0,700;1,400&display=swap"
        rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./styles/styles.css">
</head>
	<body>
	<main class="index">
	    <div class="masthead d-flex">
	        <div class="container text-center my-auto">
	            <h1 class="mb-1">Listado de Productos</h1>
	            <h3 class="mb-5">
	                <em>Genera tu listado de prodcutos</em>
	            </h3>
	            <a href="<%=request.getContextPath()%>/FindAllArticulosController" class="btn btn-primary">
	            Comenzar
	            </a>
	        </div>
	    </div>
	</main>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
     integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
     crossorigin="anonymous"></script>
	</body>
</html>

