<?php

// phpinfo();

include_once '../includes/dbconnection.php';

if (isset($_POST)) {
    $hobbyname = $_POST['hobbyname'];
    $hobbybeschreibung = $_POST['hobbybeschreibung'];

    $stmt = $dbh->prepare("INSERT INTO Hobby (hobbyname, hobbybeschreibung) VALUES (:hobbyname, :hobbybeschreibung)");
    $stmt->bindParam(':hobbyname', $hobbyname);
    $stmt->bindParam(':hobbybeschreibung', $hobbybeschreibung);
    $stmt->execute();
    header('Location: ../success/hobby.html');
}