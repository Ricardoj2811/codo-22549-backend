<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.domain.Articulo"%>
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
	 	<%
		 Articulo producto = (Articulo)request.getAttribute("producto");
		%>
		<div class="container p-4">
		    <div class="row justify-content-center">
		        <div class="col-md-4">
		            <div class="card">
		                <div class="card-body">
		                    <form action="<%=request.getContextPath()%>/UpdateArticuloController?id=<%=producto.getId()%>"
		                	method="POST">
		                		<h1>Editar Producto</h1>
		                        <div class="form-group my-4">
		                            <label for="tituloEditar">
		                            	Titulo
		                            </label>
		                            <input 
		                            type="text"
		                            name="titulo" 
		                            class="form-control"
		                            id="tituloEditar"
		                            value="<%=producto.getTitulo()%>"
		                            autofocus 
		                            required>
		                        </div>
		                        <div class="form-group my-4">
		                            <label for="precioEditar">
		                            	Precio
		                            </label>
		                            <input 
		                            type="text"
		                            name="precio" 
		                            class="form-control"
		                            id="precioEditar"
		                            value="<%=producto.getPrecio()%>"
		                            autofocus 
		                            required>
		                        </div>
		                        <div class="form-group my-4">
		                            <label for="autorEditar">
		                            	Autor
		                            </label>
		                            <input 
		                            type="text"
		                            name="autor" 
		                            class="form-control"
		                            value="<%=producto.getAutor()%>"
		                            autofocus 
		                            required>
		                        </div>
		                        <div class="form-group my-4">
		                            <label for="imagenEditar">
		                            	Imagen
		                            </label>
		                            <input 
		                            type="text"
		                            name="imagen" 
		                            class="form-control"
		                            id="imagenEditar"
		                            value="<%=producto.getImg()%>"
		                            autofocus 
		                            required>
		                        </div>
		                        
		                        <div class="form-group my-4 d-flex">
		                            <a href="<%=request.getContextPath()%>/FindAllArticulosController"
		                        	class="btn btn-secondary w-50 me-2">Cancelar</a>
		                        	<button class="btn btn-success w-50" type="submit">
		                                Guardar
		                            </button>
		                        </div>
		                    </form>
		                </div>
		            </div>
		        </div>
		    </div>
		</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
     integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
     crossorigin="anonymous"></script>
	</body>
</html>

