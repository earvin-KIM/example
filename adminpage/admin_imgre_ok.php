<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
$filename = $_FILES['file_re']['name'];
$randfile = rand() . $filename; //파일명 string에 난수 합침
$bno = $_GET['_id'];
$folder = '../home/upload/' . $randfile; //저장할 경로를 난수로 겹치지 않게 지정해줌
move_uploaded_file($_FILES['file_re']['tmp_name'], $folder); //폴더에 서버 임시 이미지 파일 저장
$sql2 = mqd("SELECT * FROM board WHERE _id=$bno");
$board = $sql2->fetch_array();

if ($randfile) {
  unlink('../home/upload/' . $board['img_path']);
  $sql = mq("update board set img_path='$randfile' where _id='$bno' ");
  echo "<script>
    	alert('글쓰기 완료되었습니다.');
    	location.href='admin_board.php';</script>";
} else {
  echo "<script>
    	alert('글쓰기에 실패했습니다.');
    	history.back();</script>";
}
?>