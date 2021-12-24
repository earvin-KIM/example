<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';

$bno = $_GET['_id'];
$sql = mqd("select * from board where _id='$bno';");
$board = $sql->fetch_array();
?>
<!DOCTYPE html>
<html lang="en">
<?php if ($jb_login) { ?>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <form action="admin_imgre_ok.php?_id=<?php echo $bno; ?>" enctype="multipart/form-data" method="post">
        <input type="file" name="file_re">
        <button type="submit">수정한 이미지 제출</button>
    </form>
</body>

</html>
<?php } else { ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php } ?>