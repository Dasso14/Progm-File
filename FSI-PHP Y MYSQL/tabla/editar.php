<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
$Nombre_del_Libro = $_GET['Nombre_del_Libro'];
$Autor = $_GET['Autor'];
$ISBN = $_GET['ISBN'];
$Descripcion = $_GET['Descripcion'];
?>
    <div>
    <form action="speditar.php" method="post">
        <table>
            <tr>
                <td>Ingresar Datos:</td>
                <td><input type="varchar" name="Nombre_del_Libro" style="visibility: hidden;"  value="<?=$Nombre_del_Libro?>" ISBN=""></td>
            </tr>
            <tr>
                <td>AUTOR:</td>
                <td><input type="varchar" name="Autor" value="<?=$Autor?>" ISBN="" ></td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td><input type="int" name="ISBN" value="<?=$ISBN?>" ISBN=""></td>
            </tr>
            <tr>
                <td>DESCRIPCION:</td>
                <td><input type="text" name="Descripcion" value="<?=$Descripcion?>" ISBN=""></td>
            </tr>
            <tr>
                <td><input type="submit" value="Actualizar"></td>
            </tr>
        </table>

    </form>

    </div>
</body>
</html>