<!DOCTYPE html>
<html lang="en">
<?php
include 'inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '/adminpage/admin_changedb.php';
?>

<head><?php if ($jb_login) { ?>
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
</head>

<body>
    <form action="admin_imgboard_ok.php" enctype="multipart/form-data" method="post">
        <div id="in_img">
            <input name="filepath" id="filepath" type="file" />
            <button type="submit" class="btn btn-default">추가</button>
        </div>
    </form>

    <!-- jQuery -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/jquery/jquery.min.js"></script>
    <!-- Bootstrap 4 -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- SweetAlert2 -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/sweetalert2/sweetalert2.min.js"></script>
    <!-- Toastr -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/plugins/toastr/toastr.min.js"></script>
    <!-- AdminLTE App -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/js/adminlte.min.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="AdminLTE-3.2.0-rc/AdminLTE-3.2.0-rc/dist/js/demo.js"></script>
</body>

</html><?php } else { ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php } ?>