<?php
    session_start();

    include("db.php");

    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $nombreCompleto = $_POST['nombre_completo'];
        $DNI = $_POST['dni'];
        $Celular = $_POST['celular'];
        $Email = $_POST['email'];
        $Password = $_POST['contraseña'];


    if(!empty($Email) && !empty($Password) && !is_numeric($Email)){


        $query = "insert into usuarios (nombre_completo, dni, celular, email, contraseña) values ('$nombreCompleto','$DNI','$Celular','$Email','$Password')";

        mysqli_query($con, $query);

        echo "<script type='text/javascript'> alert('Successfully Register')</script>";

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
        <div class="signup">
            <h1>Sign Up</h1>
            <h4>Solo tomará unos segundos</h4>
            <form method="POST">
                <label>Nombre Completo</label>
                <input type="text" name="nombre_completo" required>
                <label>DNI</label>
                <input type="text" name="dni" required>
                <label>Celular</label>
                <input type="tel" name="celular" required>
                <label>Email</label>
                <input type="email" name="email" required>
                <label>Contraseña</label>
                <input type="password" name="contraseña" required>
                <input type="submit" name="" value="Submit">
            </form>
            <p>
                <a href="#">Terminos y condiciones</a> - <a href="#">Politicas de Privacidad</a>
            </p>
            <p>Already have an account? <a href="login.php"> Login Here</a></p>
        </div>
    </body>
</html>