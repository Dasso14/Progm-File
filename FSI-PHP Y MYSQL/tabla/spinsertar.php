<?php
$Nombre_del_Libro = $_POST['Nombre_del_Libro'];
$Autor= $_POST['Autor'];
$ISBN = $_POST['ISBN'];
$Descripcion = $_POST['Descripcion'];
$cnx = mysqli_connect("localhost", "root", "", "dbprueba");
$sql = "INSERT INTO libros(Nombre_del_libro, Autor, ISBN, Descripcion) VALUES('$Nombre_del_Libro', '$Autor', '$ISBN', '$Descripcion')";
$rta = mysqli_query($cnx, $sql);
header("Location: index.php");
?>