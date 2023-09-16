<?php
    session_start(); 

    include('db.php');

    $sql = "SELECT usuarios.nombre_completo, reservas.fechaingreso
        FROM usuarios
        INNER JOIN reservas ON usuarios.id = reservas.usuario_id";

    $result= mysqli_query($con, $sql);
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Hotel Fast</title>
        <link rel="Stylesheet" href="style.css">
    </head>
    <body>
        <h1>Reserva Lista</h1>
        <table>
            <tr>
                <th>Habitacion: </th>
                <th>Nombre Completo: </th>
                <th>Celular: </th>
                <th>DNI: </th>
            </tr>

            <?php
            while($row = mysqli_fetch_assoc($result)){
                echo "<tr>";
                echo "<td>" . $row['habitacion'] . "</td>";
                echo "<td>" . $row['nombre_completo'] . "</td>";
                echo "<td>" . $row['celular'] . "</td>";
                echo "<td>" . $row['dni'] . "</td>";
                echo "</tr>";
            }

            ?>

        </table>
        <p>You can back <a href="index.php"> Log Out</a></p>
    </body>
</html>