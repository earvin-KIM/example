<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
?>
<?php if ($jb_login) {
  for ($i = 1; $i <= 3; $i++) {
    $filename = $_FILES["s_$i"]['name'];
    $randfile = rand() . $filename; //파일명 string에 난수 합침
    $folder = './bannerimg/' . $randfile;
    //저장할 경로를 난수로 겹치지 않게 지정해줌
    if ($filename != null) {
      move_uploaded_file($_FILES["s_$i"]['tmp_name'], $folder); //폴더에 서버 임시 이미지 파일 저장
      $sqld = mqd("update board_front set img_path='$randfile' where id='$i' ");
    }
    echo "<script>  	
    alert('글쓰기 완료되었습니다.'); 
    location.href='admin_main.php';</script>";
  }
} else {
   ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php
} ?>