<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
?>

<?php if ($jb_login) {
  foreach ($_POST['dels'] as $path) {
    $sqld2 = mqd("SELECT * FROM board WHERE img_path='$path';");
    $board = $sqld2->fetch_array();
    unlink('../home/upload/' . $board['img_path']);
    $sqld = mqd("DELETE FROM board WHERE img_path='$path';");
  } ?>
<script type="text/javascript">
alert("삭제되었습니다.");
</script>
<meta http-equiv="refresh" content="0 url=admin_board.php" />
<?php
} else {
   ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php
} ?>