<?php
    include "inc_head.php";
    include $_SERVER['DOCUMENT_ROOT']."/adminpage/admin_db.php";
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php 
    if($jb_login){
        $ic1=$_FILES["s_1"]["name"];
        $ic2=$_FILES["s_2"]["name"];
        $ic3=$_FILES["s_3"]["name"];
        $folder1="../upload".$ic1;
        $folder2="../upload".$ic2;
        $folder3="../upload".$ic3;
        move_uploaded_file($_FILES[''])
    }
    else{?>
    <meta http-equiv="refresh" content="0 url=admin_login.php" />
    <?php } ?>
</body>

</html>