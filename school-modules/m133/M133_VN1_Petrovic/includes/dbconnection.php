<?php
try {
   $dbh = new PDO('mysql:host=127.0.0.1;dbname=LB', 'lazar', 'nikolazar');
   $GLOBALS['con'] = $dbh;
} catch (PDOException $e) {
   print "Error!: " . $e->getMessage() . "<br/>";
    die();
}
?>