<?php
$Nombre_del_Libro = $_POST['Nombre_del_Libro'];
$Autor = $_POST['Autor'];
$ISBN = $_POST['ISBN'];
$Descripcion = $_POST['Descripcion'];
$cnx = mysqli_connect("localhost", "root", "", "dbprueba");
$sql = "UPDATE libros set Nombre_del_Libro='$Nombre_del_Libro', Autor='$Autor', ISBN='$ISBN', Descripcion='$Descripcion' WHERE ISBN = '$ISBN'";
$rta = mysqli_query($cnx, $sql);
header("Location: index.php");
?>