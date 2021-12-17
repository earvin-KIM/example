<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <?php include "inc_head.php"; ?>
    <?php 
   if($jb_login){
       echo "<h1>이미 로그인하셨습니다.</h1>";
       echo '<meta http-equiv="refresh" content="3 url=admin_main.php"/>';
   }
   else{
       ?>
</head>
<body>
   
    <form action="admin_login_ok.php" method="post">
        <input type="id" name="admin_id" placeholder="id">
        <input type="password" name="admin_pw" placeholder="pw">
        <button type="submit">로그인</button>
    </form>
   <?php } ?>
</body>
</html>