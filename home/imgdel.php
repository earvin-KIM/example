<?php
include $_SERVER['DOCUMENT_ROOT'] . '/home/db.php';
$_id = $_GET['_id'];
// $folder="./upload/".$filename;
// move_uploaded_file($_FILES['filepath']['tmp_name'],$folder);
$sql2 = mq("SELECT * FROM board WHERE _id=$_id");
$board = $sql2->fetch_array();
$mq = "UPDATE board SET rownum = rownum - 1 WHERE rownum>{$board['rownum']};";
unlink('./upload/' . $board['img_path']);
$sql = mq("DELETE FROM board WHERE _id='$_id';");
$sql3 = mq($mq);
?>
<script type="text/javascript">
alert("삭제되었습니다.");
</script>
<meta http-equiv="refresh" content="0 url=portfolio.php" />