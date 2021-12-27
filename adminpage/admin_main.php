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
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/css/adminlte.css">
    <!-- overlayScrollbars -->
    <link rel="stylesheet"
        href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
    <!-- Daterange picker -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/daterangepicker/daterangepicker.css">
    <!-- summernote -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/summernote/summernote-bs4.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <?php
    include 'inc_head.php';
    include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
    include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
    ?>

</head>

<?php if ($jb_login == true) { ?>

<body class="hold-transition sidebar-mini sidebar-collapse">


    <div class="wrapper">
        <nav class="main-header navbar navbar-expand navbar-white navbar-light">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
                </li>
                <li class="nav-item d-none d-sm-inline-block">
                    <a href="admin_main.php" class="nav-link">Home</a>
                </li>


            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item"><a href="admin_logout.php" class="nav-link">로그아웃</a>
                </li>
            </ul>
        </nav>
        <aside class="main-sidebar sidebar-dark-primary elevation-4">
            <!-- Brand Logo -->
            <a href="#" class="brand-link">
                <img src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
                    class="brand-image img-circle elevation-3" style="opacity: .8">
                <span class="brand-text font-weight-light">AdminLTE 3</span>
            </a>

            <!-- Sidebar -->
            <div class="sidebar">
                <!-- Sidebar user (optional) -->
                <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                    <div class="image">
                        <img src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/img/user2-160x160.jpg"
                            class="img-circle elevation-2" alt="User Image">
                    </div>
                    <div class="info">
                        <a href="#" class="d-block">Alexander Pierce</a>
                    </div>
                </div>

                <!-- SidebarSearch Form -->
                <div class="form-inline">
                    <div class="input-group" data-widget="sidebar-search">
                        <input class="form-control form-control-sidebar" type="search" placeholder="Search"
                            aria-label="Search">
                        <div class="input-group-append">
                            <button class="btn btn-sidebar">
                                <i class="fas fa-search fa-fw"></i>
                            </button>
                        </div>
                    </div>
                </div>

                <!-- Sidebar Menu -->
                <nav class="mt-2">
                    <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                        data-accordion="false">
                        <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
                        <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="nav-icon fas fa-tachometer-alt"></i>
                                <p>
                                    관리
                                    <i class="right fas fa-angle-left"></i>
                                </p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="admin_board.php" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>게시물 관리</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="admin_main.php" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>슬라이드 이미지 관리</p>
                                    </a>
                                </li>
                                <li class="nav-item">
                                    <a href="admin_contact.php" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>문의사항 접수</p>
                                    </a>
                                </li>

                            </ul>
                        </li>

                    </ul>
                </nav>
                <!-- /.sidebar-menu -->
            </div>
            <!-- /.sidebar -->
        </aside>
        <div class="content-wrapper">
            <section class="content">
                <div class="container-fluid" style="padding : 10px;">
                    <div class="card" style="width : 50%;">
                        <div class="card-header">
                            <h3 class="card-title">슬라이드 이미지 변경</h3>
                            <form action="admin_slideimgchange.php" enctype="multipart/form-data" method="post">
                                <div class="card-tools" style="float:right;">
                                    <a href="#" class="btn btn-sm btn-tool">
                                        <button class="btn btn-default" Type="submit">변경</button></a>
                                </div>
                        </div>
                        <div class="card-body">
                            <?php
                            $front = mqd('select * from board_front');
                            $pic;
                            $num = 1;
                            while ($img = $front->fetch_array()) {
                              $pic[$num] = './bannerimg/' . $img['img_path'];
                              $num++;
                            }
                            ?>
                            <div class="d-flex justify-content-between align-items-center border-bottom mb-3">
                                <p class="text-success text-xl">

                                    <?php echo "<img style=\"width:80%;\"src='$pic[1]' >"; ?>
                                </p>
                                <p class="d-flex flex-column text-right">
                                    <span class="text-muted" style="width: max-content;">1번 슬라이드</span>
                                    <span class="font-weight-bold">
                                        <label for="f1">업로드</label>
                                        <input id="f1" type="file" name="s_1" style="display:none;">
                                    </span>
                                </p>
                            </div>
                            <!-- /.d-flex -->
                            <div class="d-flex justify-content-between align-items-center border-bottom mb-3">
                                <p class="text-warning text-xl">
                                    <?php echo "<img style=\"width:80%;\"src='$pic[2]' >"; ?>

                                </p>
                                <p class="d-flex flex-column text-right">
                                    <span class="text-muted" style="width: max-content;">2번 슬라이드</span>
                                    <span class="font-weight-bold">
                                        <label for="f2">업로드</label>
                                        <input id="f2" type="file" name="s_2" style="display:none;">
                                    </span>
                                </p>
                            </div>
                            <!-- /.d-flex -->
                            <div class="d-flex justify-content-between align-items-center mb-0">
                                <p class="text-danger text-xl">
                                    <?php echo "<img style=\"width:80%;\"src='$pic[3]' >"; ?>

                                </p>
                                <p class="d-flex flex-column text-right">
                                    <span class="text-muted" style="width: max-content;">3번 슬라이드</span>
                                    <span class="font-weight-bold">
                                        <label for="f3">업로드</label>
                                        <input id="f3" type="file" name="s_3" style="display:none;">
                                    </span>
                                </p>
                            </div>
                        </div>
                        </form>
                    </div>
                </div>


        </div>
        </section>
        <?php } else { ?>
        <meta http-equiv="refresh" content="0 url=admin_login.php" />
        <?php } ?>
    </div>
    <!-- jQuery -->
    <script src="plugins/jquery/jquery.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="plugins/jquery-ui/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
    $.widget.bridge('uibutton', $.ui.button)
    </script>
    <!-- Bootstrap 4 -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/pluginsplugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- ChartJS -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/chart.js/Chart.min.js"></script>
    <!-- Sparkline -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/sparklines/sparkline.js"></script>
    <!-- JQVMap -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jqvmap/jquery.vmap.min.js"></script>
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jquery-knob/jquery.knob.min.js"></script>
    <!-- daterangepicker -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/moment/moment.min.js"></script>
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/daterangepicker/daterangepicker.js"></script>
    <!-- Tempusdominus Bootstrap 4 -->
    <script src="AdminLTE-3.2.0-rc/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
    <!-- Summernote -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/summernote/summernote-bs4.min.js"></script>
    <!-- overlayScrollbars -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js">
    </script>
    <!-- AdminLTE App -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/js/adminlte.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/js/demo.js"></script>
    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/js/pages/dashboard.js"></script>
</body>

</html>