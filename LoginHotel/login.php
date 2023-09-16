<?php
    session_start();

    include("db.php");

    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $Email = $_POST['email'];
        $Password = $_POST['contraseña'];

        if(!empty($Email) && !empty($Password) && !is_numeric($Email)){
            $query ="select * from usuarios where email = '$Email' limit 1";
            $result = mysqli_query($con, $query);

            if($result){
                if($result && mysqli_num_rows($result) > 0){
                    $user_data = mysqli_fetch_assoc($result);

                    if($user_data['contraseña'] == $Password){
                        header("location: index.php");
                        die;
                    }
                }
            }
            echo "<script type='text/javascript'> alert('Wrong gmail or password')</script>";
        }
        else{
            echo "<script type='text/javascript'> alert('Wrong gmail orR password')</script>";
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
        <div class="login">
            <h1>Bienvenido</h1>
            <form method= "POST">
                <label>Email</label>
                <input type="email" name="email" required>
                <label>Contraseña</label>
                <input type="password" name="contraseña" required>
                <input type="submit" name="" value="Submit">
            </form> 
            <p>Not have an account? <a href="signup.php">Sign Up here</a></p>
        </div>
    </body>
</html>