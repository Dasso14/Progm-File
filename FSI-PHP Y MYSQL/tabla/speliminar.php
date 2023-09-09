<?php
$ISBN = $_GET['ISBN'];

$cnx = mysqli_connect("localhost", "root", "", "dbprueba");
$sql = "DELETE FROM libros WHERE ISBN = '$ISBN'";
$rta = mysqli_query($cnx, $sql);
header("Location: index.php");
?>