<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>페이지</title>
    <link rel="stylesheet" href="style_page.css">
</head>
<body>
    <div class=top><h1><a href="./board_home.php">홈화면</a></h1></div>
    <div class=para>
    <?php
    $conn=mysqli_connect(
        'localhost',
        'root',
        'wyk1205!',
        'board_data'
    );
    $sep=$_GET['_id'];
    $sql="SELECT paragraph FROM board WHERE _id=$sep";
    $p_result=mysqli_query($conn,$sql);
    ?>
    <h1><?php $pa=mysqli_fetch_array($p_result);
        echo ($pa["paragraph"]);
    ?></h1>
    </div>
</body>
</html>