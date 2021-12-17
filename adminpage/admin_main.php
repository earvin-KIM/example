<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 페이지</title>
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
    include "inc_head.php";
    include $_SERVER['DOCUMENT_ROOT']."/adminpage/admin_db.php";
    ?>

</head>

<body>
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="index3.html" class="nav-link">Home</a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>
    </nav>
    <?php 
    if($jb_login==TRUE){
        ?>
    <section class="content">
        <div class="container-fluid">
            <div class="small-box bg-info">
                <div class="icon"><i class="ion ion-pie-graph"></i></div>
                <div class="inner" style="text-align:center;">
                    <h1>슬라이드 이미지 변경</h1>
                    <form action="admin_slideimgchange.php" method="post">
                        <p>1번 슬라이드 &nbsp <label for="f1">업로드</label><input id="f1" type="file" name="s_1"
                                style="display:none;">
                        </p>
                        <p>2번 슬라이드 &nbsp<label for="f2">업로드</label><input id="f2" type="file" name="s_2"
                                style="display:none;">
                        </p>
                        <p>3번 슬라이드 &nbsp<label for="f3">업로드</label><input id="f3" type="file" name="s_3"
                                style="display:none;">
                        </p>
                    </form>
                </div>
            </div>

            <div class="small-box bg-danger">
                <div class="inner">

                    <a href="boardadmin.php">
                        <h1>게시물 일괄관리</h1>
                    </a>
                </div>
            </div>
        </div>
    </section>
    <?php
    }
    else{?>
    <meta http-equiv="refresh" content="0 url=admin_login.php" />
    <?php } ?>
</body>

</html>