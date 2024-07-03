
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Productos</title>
</head>
<body>
    <div class="input-group">
        <label for="nombre">Nombre</label>
        <input type="text" id="nombre" name="nombre" required>
    </div>
    <div class="input-group">
        <label for="text">Categoría</label>
        <input type="text" id="categoria" name="categoria" required>
    </div>
    <div class="input-group">
        <label for="text">precio</label>
        <input type="text" id="precio" name="precio" required>
    </div>
    <div class="input-group">
        <button type="submit" value ="guardar onclick="guardar()">Guardar</button>
    </div>


    <br><br><br>

    <p>
        Categoria
        <input type="button" value="ver notas" onclick="mostrar()"><br><p id="notas"></p><br><br>
        <table border="1" solid black name = "productos">
            <tr>
                <th>Nombre</th>
                <th>Categoria</th>
                <th>Precio</th>
            </tr>
            <tr>
                <td>
                </td>
            </tr>


        </table>

    </p>
    <script type="text/javascript">
	    var productos=[{"nombre":"Pan", "categoria":"Alimentacion","precio":80},
                        {"nombre":"Vino", "categoria":"Bebida","precio":30}
                        ];
          
        function guardar(){
			let nombre=document.getElementById("nombre").value;
			let categoria=document.getElementById("categoria").value;
            let precio=document.getElementById("precio").value;
			if((nombre.trim().length==0 )|| (categoria.trim().length==0)){
				alert("Datos no válidos. El nombre no puede estar vacío");
				return false;
			}
			if(isNaN(edad)){
				alert("Datos no válidos. El campo edad debe ser numérico");
				return false;
			}
			alert("Datos válidos!!");
            var producto = new Object();
            producto.nombre=nombre;
            producto.categoria=categoria;
            producto.precio=precio;
			productos.push(producto);
		}
        function mostrar() {
            document.getElementById("productos").innerText.join("<tr><td></td></tr>")
        }

    </script>


</body>
</html>