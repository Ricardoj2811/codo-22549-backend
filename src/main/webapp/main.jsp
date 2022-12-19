<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.domain.Articulo"%>

<!DOCTYPE html>
<html lang="es">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>CRUD JAVA</title>
	    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
	    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
	    <link rel="stylesheet" type="text/css" href="./styles/styles.css">
	</head>
	<body>
		<div class="container">
		        <div class="table-wrapper">
		            <div class="table-title">
		                <div class="row">
		                    <div class="col-sm-6">
		                        <a href="<%=request.getContextPath()%>/FindAllArticulosController"
		                        class="linkListado">
		                        <h2>Listado de <b>Productos</b></h2>
		                        </a>
		                    </div>
		                    <div class="col-sm-4">
		                    	<form class="formSearch"
		                    		action="<%=request.getContextPath()%>/SearchArticulosController"
		                    		method="GET">
						        	<input 
						        		name="claveBusqueda"
						        		class="form-control col-sm-9" 
						        		type="search" 
						        		placeholder="Buscar" 
						        		aria-label="Search">
						        	<button class="btn btn-success col-sm-3" type="submit">
						        		Buscar
						        	</button>
						    	</form>
		                    </div>
		                    <div class="col-sm-2">
		                        <a href="#AgregarProductoModal" 
		                        	class="btn btn-success" 
		                        	data-toggle="modal"><i
		                        	class="material-icons">&#xE147;</i> 
		                        	<span>Agregar</span>
		                        </a>
		                    </div>
		                </div>
		            </div>
		            <table class="table table-striped table-hover">
		                <thead>
		                    <tr>
		                    	<th>ID</th>
		                        <th>Titulo</th>
		                        <th>Precio</th>
		                        <th>Autor</th>
		                        <th>Imagen</th>
		                        <th>Acciones</th>
		                    </tr>
		                </thead>
		             	<tbody>
		                	<%
		                		Float total = 0f;
		                		List<Articulo> articulos = (List<Articulo>)request.getAttribute("productos");
		                		for(Articulo articulo : articulos){
		                			total += articulo.getPrecio();
		                	%>	
		                			<tr>
			                            <td><%=articulo.getId() %></td>
			                            <td><%=articulo.getTitulo() %></td>
			                            <td><%=articulo.getPrecio() %></td>
			                            <td><%=articulo.getAutor() %></td>
			                            <td><%=articulo.getImg() %></td>
			                            <td>
			                                <a href="<%=request.getContextPath()%>/UpdateArticuloController?id=<%=articulo.getId()%>"
			                                	class="edit" 
			                                	data-toggle="modal"
			                                	id="setIdUpdate"
			                                	>
			                                	<i class="material-icons"
			                                        data-toggle="tooltip" 
			                                        title="Edit">&#xE254;
			                                    </i>
			                                </a>
			                                <a href="#borrarProductoModal" 
			                                	class="delete" 
			                                	data-toggle="modal"
			                                	onClick="setId(<%=articulo.getId()%>)"
			                                	>
			                                	<i class="material-icons"
			                                        data-toggle="tooltip" 
			                                        title="Delete">
			                                        &#xE872;
			                                    </i>
			                                </a>
			                            </td>
			                         </tr>
		                	<%
		                		}
		                	%>
		                </tbody>
		                <tfoot>
		                	<tr>
		                		<td colspan=2 align="right">
		                			<b>Total $</b>
		                		</td>
		                		<td colspan=4>
		                			<b><%=total %></b>
		                		</td>
		                	</tr>
		                </tfoot>
		            </table>
		        </div>
		    </div>
		    <!-- Agregar Modal HTML -->
		    <div id="AgregarProductoModal" class="modal fade">
		        <div class="modal-dialog">
		            <div class="modal-content">
		                <form 
		                	action="<%=request.getContextPath()%>/CreateArticuloController"
		                	method="POST">
		                    <div class="modal-header">
		                        <h4 class="modal-title">Agregar Producto</h4>
		                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                    </div>
		                    <div class="modal-body">
		                        <div class="form-group">
		                            <label for="titulo">
		                            	Titulo
		                            </label>
		                            <input 
		                            type="text"
		                            name="titulo" 
		                            class="form-control"
		                            id="titulo"
		                            value="" 
		                            required>
		                        </div>
		                        <div class="form-group">
		                            <label for="precio">
		                            	Precio
		                            </label>
		                            <input 
		                            type="number"
		                            name="precio" 
		                            class="form-control"
		                            id="precio"
		                            value="" 
		                            required>
		                        </div>
		                        <div class="form-group">
		                            <label for="autor">
		                            	Autor
		                            </label>
		                            <input 
		                            	class="form-control"
		                            	type="text"
		                            	name="autor"
		                            	id="autor"
		                            	value="" 
		                            	required>
		                            </input>
		                        </div>
		                        <div class="form-group">
		                            <label for="imagen">
		                            	Imagen
		                            </label>
		                            <input 
		                            	class="form-control"
		                            	type="text"
		                            	name="imagen"
		                            	id="imagen"
		                            	value="" 
		                            	required>
		                            </input>
		                        </div>
		                    </div>
		                    <div class="modal-footer">
		                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
		                        <input type="submit" class="btn btn-success" value="Agregar">
		                    </div>
		                </form>
		            </div>
		        </div>
		    </div>
		    <!-- Delete Modal HTML -->
		    <div id="borrarProductoModal" class="modal fade">
		        <div class="modal-dialog">
		            <div class="modal-content">
		                <form action="<%=request.getContextPath()%>/DeleteArticuloController">
		                	<input type="hidden" name="id" id="id">
		                    <div class="modal-header">
		                        <h4 class="modal-title">Borrar Producto</h4>
		                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                    </div>
		                    <div class="modal-body">
		                        <p>¿Estás seguro que quierer borrar este producto?</p>
		                        <p class="text-warning"><small>Esta acción no se puede deshacer</small></p>
		                    </div>
		                    <div class="modal-footer">
		                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
		                        <input type="submit" class="btn btn-danger" value="Borrar">
		                    </div>
		                </form>
		            </div>
		        </div>
		    </div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	    <script type="text/javascript">
	    	function setId(id){
	    		document.getElementById("id").value = id
	    	}
	    	function setId2(id){
	    		document.getElementById("setIdUpdate").value = id
	    	}
	    </script>
	</body>
</html>
		    