<?php

// phpinfo();

include_once '../includes/dbconnection.php';

if (isset($_POST)) {
    $username = $_POST['username'];
    $email = $_POST['email'];
    $password = $_POST['password'];
    // $password = password_hash($password, PASSWORD_BCRYPT);
    $stmt = $dbh->prepare("INSERT INTO app_user (username, email, password) VALUES (:username, :email, :password)");
    $stmt->bindParam(':username', $username);
    $stmt->bindParam(':email', $email);
    $stmt->bindParam(':password', $password);
    $stmt->execute();
    header('Location: ../index.html');
}
