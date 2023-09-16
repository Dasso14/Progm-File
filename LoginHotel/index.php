<?php
    session_start();

    include("db.php");

    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $Habitacion = $_POST['habitacion'];
        $Huespedes = $_POST['huespedes'];
        $FechaIngreso = $_POST['fechaingreso'];
        $Noches = $_POST['noches'];


        if(!empty($Habitacion) && !empty($Noches)){


            $query = "insert into reservas (habitacion, huespedes, fechaingreso, noches) 
            values ('$Habitacion','$Huespedes','$FechaIngreso','$Noches')";
    
            mysqli_query($con, $query);

            $sql = "SELECT usuarios.nombre_completo, reservas.fechaingreso
            FROM usuarios
            INNER JOIN reservas ON usuarios.id = reservas.usuario_id";

            $result = mysqli_query($con, $sql);

            header("location: mostrar.php");
            die;
            

            echo "<script type='text/javascript'> alert('Successfully Reserve')</script>";
    
        }
        else{
            echo "<script type='text/javascript'> alert('Please enter some Valid information')</script>";
        }
    
    }
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
        <h1>Bienvenido Usuari@</h1>

        <h4>Reserva y disfruta</h4>
        <form method= "POST">
            <label>Habitación</label>
            <input type="varchar" name="habitacion" required>
            <label>N° de huespedes</label>
            <input type="int" name="huespedes" required>
            <label>Fecha de Entrada</label>
            <input type="date" name="fechaingreso" required>
            <label>Noches</label>
            <input type="int" name="noches" required>
            <input type="submit" name="" value="Submit">
        </form> 
        <p>You can back <a href="login.php"> Log Out</a></p>
    </body>
</html>