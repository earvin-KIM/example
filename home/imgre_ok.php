<?php
	include $_SERVER['DOCUMENT_ROOT']."/home/db.php";
    $filename = $_FILES['file_re']['name'];
	$randfile=rand().$filename;//파일명 string에 난수 합침
    $bno=$_GET['_id'];
	$folder="./upload/".$randfile;//저장할 경로를 난수로 겹치지 않게 지정해줌
	move_uploaded_file($_FILES['file_re']['tmp_name'],$folder);//폴더에 서버 임시 이미지 파일 저장
	$sql2=mq("SELECT * FROM board WHERE _id=$bno");
	$board = $sql2->fetch_array();

    if($randfile){
		unlink("./upload/".$board['img_path']);
    	$sql = mq("update board set img_path='$randfile' where _id='$bno' ");
    	echo "<script>
    	alert('글쓰기 완료되었습니다.');
    	location.href='portfolio.php';</script>";
	}else{
    	echo "<script>
    	alert('글쓰기에 실패했습니다.');
    	history.back();</script>";
	}
 ?>
 
