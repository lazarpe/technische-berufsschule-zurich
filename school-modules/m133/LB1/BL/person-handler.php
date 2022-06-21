<?php

// phpinfo();

include_once '../includes/dbconnection.php';

if (isset($_POST)) {
    $nachname = $_POST['nachname'];
    $vorname = $_POST['vorname'];
    $email = $_POST['email'];
    $ahv = $_POST['ahv'];
    $hobbyname = $_POST['hobbyname'];

    // find solution how to join zwischentabelle hobby und person and assign hobby to a person

    $stmt = $dbh->prepare(
        "INSERT INTO person (nachname, vorname, email, ahv, hobbyname
        ) VALUES (
            :nachname, :vorname, :email, :ahv, :hobbyname)"
        );
    $stmt->bindParam(':nachname', $nachname);
    $stmt->bindParam(':vorname', $vorname);
    $stmt->bindParam(':email', $email);
    $stmt->bindParam(':ahv', $ahv);
    $stmt->bindParam(':hobbyname', $hobbyname);
    $stmt->execute();
    //header('Location: ../index.html');
}