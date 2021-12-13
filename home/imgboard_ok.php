<?php
    include $_SERVER['DOCUMENT_ROOT']."/과제/db.php";
     $filename=$_FILES['filepath']['name'];
    // $uploads = pathinfo($_POST['filepath'], PATHINFO_DIRNAME);
    $folder="./upload/".$filename;
    move_uploaded_file($_FILES['filepath']['tmp_name'],$folder);
//    echo $uploads;
   
    if($filename){
    $sql=mq("insert into board(img_path) values('".$filename."')");
    echo "<script>
    alert('글쓰기 완료되었습니다.');
    location.href='portfolio.php';</script>";
}else{
    echo "<script>
    alert('글쓰기에 실패했습니다.');
    history.back();</script>";
}
// $filename = $_FILES['file_path']['name'];
// $folder = "upload/".$filename;
// move_uploaded_file($_FILES['b_file']['tmp_name'],$folder);
// // Console_log($tmpfile); Console_log($o_name);Console_log($filename);Console_log($folder);
// // Console_log($resFile);  
// // \TH:i:sO
// if($username && $userpw && $title && $content && $date && $filename){
//     $sql = mq("insert into board(name,pw,title,content,date,file) values('".$username."','".$userpw."','".$title."','".$content."','".$date."','".$filename."')");
//     echo "<script>
//     alert('글쓰기 완료되었습니다.');
//     location.href='index.php';</script>";
//
 ?>