<?php
	include $_SERVER['DOCUMENT_ROOT']."/home/db.php";
	$bno = $_GET['_id'];
	$sql = mq("select * from board where _id='$bno';");
	$board = $sql->fetch_array();
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
     <form action="imgre_ok.php?_id=<?php echo $bno; ?>" enctype="multipart/form-data" method="post">
         <input type="file" name="file_re">
         <button type="submit">수정한 이미지 제출</button>
     </form>
 </body>
 </html>