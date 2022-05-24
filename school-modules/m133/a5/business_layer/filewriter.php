<?php 
    $file = fopen("file.txt", "a");
    fwrite($file, $_POST['textfield'] . "\n");
    fclose($file);
    header("Location: http://localhost:3000/presentation_layer/index.html");
?>
