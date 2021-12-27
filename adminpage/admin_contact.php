<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
?>
<?php if ($jb_login) { ?>
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
    <!-- SweetAlert2 -->
    <link rel="stylesheet"
        href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/sweetalert2-theme-bootstrap-4/bootstrap-4.min.css">
    <!-- Toastr -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/toastr/toastr.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/css/adminlte.min.css">
    <!-- jQuery -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jquery/jquery.min.js"></script>
</head>

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
<?php } else { ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php } ?>
