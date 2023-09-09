<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div>
        <form action="buscar.php" method="post">
            <input type="int" name="buscar" ISBN="">
            <input type="submit" value="Buscar">
            <a href="nuevo.php">Añadir Nuevo</a>
        </form>
    </div>
    <div>
        <table>
            <tr>
                <td>NOMBRE_DEL_LIBRO</td>
                <td>AUTOR</td>
                <td>ISBN</td>
                <td>DESCRIPCION</td>
            </tr>
            <?php
                $buscar = $_POST['buscar'];
                $cnx = mysqli_connect("localhost", "root", "", "dbprueba");
                $sql = "SELECT Nombre_del_Libro, Autor, ISBN, Descripcion FROM libros WHERE Nombre_del_Libro like '$buscar' '%' order by ISBN desc";
                $rta = mysqli_query($cnx, $sql);
                while ($mostrar = mysqli_fetch_row($rta)) {
                    ?>
                    <tr>
                        <td><?php echo $mostrar[0] ?></td>
                        <td><?php echo $mostrar[1] ?></td>
                        <td><?php echo $mostrar[2] ?></td>
                        <td><?php echo $mostrar[3] ?></td>
                        <td>
                            <a href="editar.php?
                            Nombre_del_libro=<?php echo $mostrar[0] ?> &
                            Autor=<?php echo $mostrar[1] ?> &
                            ISBN=<?php echo $mostrar[2] ?> &
                            Descricpion=<?php echo $mostrar[3] ?>
                            ">Editar</a>
                            <a href="speliminar.php? id=<?php echo $mostrar[0] ?>">Eliminar</a>
                        </td>
                    </tr>
                <?php
                }
                ?>
        </table>
    </div>
</body>
</html>