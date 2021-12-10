<?php
$conn=mysqli_connect(
    'localhost',
    'root',
    'wyk1205!',
    'capston'
);
$sql="select*from topic";
$result=mysqli_query($conn, $sql);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <h1>HELLO</h1>
    <h3>당신의 학번 이름 체온을 입력하시오</h3>
    <form action="process_create.php" method="post">
        <p><input type="text" name="stnum" placehoder="student number"></p>
        <p><input type="text" name="name" placehoder="name"></p>
        <p><input type="text" name="temperature" placehoder="temperature"></p>
        <p><input type="submit"></p>
    </form>
</body>
</html>