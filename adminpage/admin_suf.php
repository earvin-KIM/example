<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/fontawesome-free/css/all.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Tempusdominus Bootstrap 4 -->
    <link rel="stylesheet"
        href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
    <!-- JQVMap -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jqvmap/jqvmap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/css/adminlte.min.css">
    <!-- overlayScrollbars -->
    <link rel="stylesheet"
        href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/daterangepicker/daterangepicker.css">
    <!-- summernote -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/summernote/summernote-bs4.min.css">
    <?php
    include 'inc_head.php';
    include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
    include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
    if ($jb_login) { ?>
</head>

<body>
    <?php
    $conn = mysqli_connect('localhost', 'root', 'wyk1205!', 'board_data');
    $mq2 = 'SELECT * FROM board ORDER BY rownum DESC';
    $sql3 = mysqli_query($conn, $mq2);
    $array = $_POST['chart'];
    $set = mqd('USE board_data;');
    $sql = mqd('select * from board');
    $row_num = mysqli_num_rows($sql);

    $i = 0;
    $change;
    while ($board = $sql3->fetch_array()) {
      if ($array[$i] != 'NULL') {
        $where = $row_num - $array[$i] + 1; //desc로 정렬되어 있음, array[i]: 원하는 순서 where : 순서대로 표기되기 위해 실제 입력될 rownum

        $tmp = $board['_id'];
        if ($where <= $board['rownum']) {
          //순서 올릴 때와 내릴 때를 구분한다.
          $mq = "UPDATE board SET rownum = rownum + 1 WHERE rownum>=$where;";
        } else {
          $mq = "UPDATE board SET rownum = rownum - 1 WHERE rownum<=$where;";
        }
        $mq_ = "DELETE  FROM board WHERE (_id = {$board['_id']});"; //원래 존재했던 행 지우고 그 데이터를 원하는 순서에 새로운 행으로 넣는다
        $mq__ = "INSERT INTO board (_id, _head, paragraph, img_path, rownum) 
                VALUES ($tmp,'{$board['_head']}','{$board['paragraph']}','{$board['img_path']}',$where);";

        $sql = mqd($mq);
        $sql_ = mqd($mq_);
        $sql__ = mqd($mq__);
        // echo $board['rownum'];
      } else {
      }
      $i++;
    }
    ?>
    <meta http-equiv="refresh" content="0 url=admin_board.php" />
</body>

</html>
<?php } else { ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php }


?>