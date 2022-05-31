<?php
    $zahl1 = $_REQUEST["zahl1"];
    $zahl2 = $_REQUEST["zahl2"];
    $operation = $_REQUEST["operation"];

    if ($operation == "+") {
        print $zahl1 + $zahl2;
    } elseif ($operation == "-") {
        print $zahl1 - $zahl2;
    } elseif ($operation == "*") {
        print $zahl1 * $zahl2;
    } elseif ($operation == "/") {
        print $zahl1 / $zahl2;
    }
    print "Fehler";
?>