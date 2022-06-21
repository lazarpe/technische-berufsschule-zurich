<?php
include_once '../includes/dbconnection.php';

if (isset($_POST)) {
    $email = $_POST['email'];
    $password = $_POST['password'];
    // $password = password_hash($password, PASSWORD_BCRYPT);
    // $sql = "SELECT * FROM app_user WHERE email = '$email' AND password = '$password'";
    $stmt = $GLOBALS['con']->prepare("SELECT * FROM app_user WHERE email = ? AND password = ?");
    $stmt->execute([$email, $password]);
    $result = $stmt->fetch();
    if ($result) {
        header('Location: success.php');
    } else {
        header('Location: error.php');
    }
}
