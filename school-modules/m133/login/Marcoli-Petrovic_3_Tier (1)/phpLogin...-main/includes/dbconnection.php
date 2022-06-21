<?php
try {
   $dbh = new PDO('mysql:host=davidemarcoli.de;dbname=davidema_phplogin', 'davidema_phplogin', 'loginphppwd$');
   $GLOBALS['con'] = $dbh;
} catch (PDOException $e) {
   print "Error!: " . $e->getMessage() . "<br/>";
    die();
}
?>