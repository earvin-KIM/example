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

    <title>게시물관리</title>
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

    <!-- <link rel="stylesheet" href="/bootstrap-3.3.2-dist/bootstrap-3.3.2-dist/css/bootstrap.css">
    <script src="/bootstrap-3.3.2-dist/bootstrap-3.3.2-dist/js/bootstrap.js"></script> //위로 3개가 원래 모달창 작동 시켰음-->

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
            <section class="content-header">
                <div class="container-fluid">
                    <button type="button" class="btn btn-default" data-toggle="modal" data-target="#modal-xl">
                        게시물 순서
                    </button>
                    <div class="modal fade" id="modal-xl">
                        <div class="modal-dialog modal-xl">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">게시물 순서</h4>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <?php
                                    $conn = mysqli_connect('localhost', 'root', 'wyk1205!', 'board_data');
                                    // 변수들
                                    $cntr = 1;
                                    $i = 1;
                                    if (isset($_GET['page'])) {
                                      $page = $_GET['page'];
                                    } else {
                                      $page = 1;
                                    }
                                    if (isset($_GET['page'])) {
                                      $page = $_GET['page'];
                                    } else {
                                      $page = 1;
                                    }
                                    $sql = mysqli_query($conn, 'select * from board');
                                    $row_num = mysqli_num_rows($sql);
                                    //게시판 총 레코드 수
                                    $list = 9;
                                    //한 페이지에 보여줄 개수
                                    $block_ct = 5;
                                    //블록당 보여줄 페이지 개수
                                    $block_num = ceil($page / $block_ct);
                                    // 현재 페이지 블록 구하기
                                    $block_start = ($block_num - 1) * $block_ct + 1;
                                    // 블록의 시작번호
                                    $block_end = $block_start + $block_ct - 1;
                                    //블록 마지막 번호
                                    $total_page = ceil($row_num / $list);
                                    // 페이징한 페이지 수 구하기
                                    if ($block_end > $total_page) {
                                      $block_end = $total_page;
                                    } //만약 블록의 마지박 번호가 페이지수보다 많다면 마지박번호는 페이지 수
                                    $total_block = ceil($total_page / $block_ct);
                                    //블럭 총 개수
                                    $start_num = ($page - 1) * $list;
                                    //시작번호 (page-1)에서 $list를 곱한다.
                                    $mq = "SELECT * FROM board ORDER BY rownum DESC LIMIT $start_num, $list";
                                    $mq2 = 'SELECT * FROM board ORDER BY rownum desc';
                                    $sql2 = mysqli_query($conn, $mq);
                                    $sql3 = mysqli_query($conn, $mq2);
                                    $i = 1;
                                    // 게시판 글 목록
                                    echo '<div>';
                                    echo '<table class="table table-hover">';
                                    ?>

                                    <form action="admin_suf.php" method="post">

                                        <?php
                                        $cunt = 1;
                                        while ($board = $sql3->fetch_array()) {
                                          $i = 1;
                                          if ($cunt % 4 == 1) {
                                            echo '<tr>';
                                          }
                                          if ($board['img_path'] == null) {
                                            $src2 = $board['_id'];
                                            $title = $board['_head'];
                                            echo "<td><a href='board_page.php?_id=$src2';><img src=img/noimg.png></a></td>";
                                          } else {
                                            $src = $board['img_path'];
                                            $src2 = $board['_id']; // echo "<input type='checkbox' name='_id$src2'";
                                            echo "<td><div class='btn-group' style=\"margin-right:10px;\"><select name='chart[]' class='form-control' style='margin-bottom:10px'><option value=NULL>==선택==</option>";
                                            while ($i <= $row_num) {
                                              echo "<option value=\"$i\"";
                                              echo ">$i</option>";
                                              $i++;
                                            }
                                            echo "</select>
                            </div><img style=\"width:100%;\"src=../home/upload/$src></a></td>";
                                          }
                                          if ($cunt % 4 == 0) {
                                            echo '</tr>';
                                          }
                                          $cunt++;
                                        }
                                        ?>
                                        <?php
                                        echo '</table>';
                                        echo '<div class="btn-toolbar" role="toolbar" style="justify-content: center; margin-bottom: 10px;">';
                                        echo '</div>';
                                        echo '</div>';
                                        ?>
                                </div>
                                <div class="modal-footer justify-content-between">
                                    <button type="button" class="btn btn-default" data-dismiss="modal"
                                        onclick="window.location.reload()">Close</button>
                                    <button type="submit" class="btn btn-primary">Save changes</button>
                                </div>
                                </form>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                    <!-- /.modal -->
                </div>
            </section>
            <section class="content">
                <div class="container-fluid">
                    <?php
                    $conn = mysqli_connect('localhost', 'root', 'wyk1205!', 'board_data'); // 변수들
                    $cntr = 1;
                    $i = 1;
                    if (isset($_GET['page'])) {
                      $page = $_GET['page'];
                    } else {
                      $page = 1;
                    }
                    if (isset($_GET['page'])) {
                      $page = $_GET['page'];
                    } else {
                      $page = 1;
                    }
                    $sql = mysqli_query($conn, 'select * from board');
                    $row_num = mysqli_num_rows($sql);
                    //게시판 총 레코드 수
                    $list = 9;
                    //한 페이지에 보여줄 개수
                    $block_ct = 5;
                    //블록당 보여줄 페이지 개수
                    $block_num = ceil($page / $block_ct);
                    // 현재 페이지 블록 구하기
                    $block_start = ($block_num - 1) * $block_ct + 1;
                    // 블록의 시작번호
                    $block_end = $block_start + $block_ct - 1;
                    //블록 마지막 번호
                    $total_page = ceil($row_num / $list);
                    // 페이징한 페이지 수 구하기
                    if ($block_end > $total_page) {
                      $block_end = $total_page;
                    } //만약 블록의 마지박 번호가 페이지수보다 많다면 마지박번호는 페이지 수
                    $total_block = ceil($total_page / $block_ct); //블럭 총 개수
                    $start_num = ($page - 1) * $list;
                    //시작번호 (page-1)에서 $list를 곱한다.
                    $mq = "SELECT * FROM board ORDER BY rownum DESC LIMIT $start_num, $list";
                    $sql2 = mysqli_query($conn, $mq);
                    $i = 1;
                    // 게시판 글 목록
                    echo '<div>';
                    echo '<table class="table table-sm">';
                    ?>
                    <form method="post" action="imgsdel.php">
                        <tr>
                            <td><button type="submit" class="btn btn-primary" style="margin-right:5%;">삭제</button><a
                                    href="admin_imgboard.php"><button type="button" class="btn btn-primary"
                                        width=50px>추가</button></a></td>
                            <script>
                            $(document).ready(function() {
                                $('.check-all').click(function() {
                                    $('.ab').prop('checked', this.checked);
                                });
                            });
                            </script>
                            <td style="vertical-align:revert"><input type="checkbox" value="selectall" name="every"
                                    class='check-all'><b>Select
                                    All</b></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>

                        </tr>
                        <?php while ($board = $sql2->fetch_array()) {
                          if ($i % 3 == 1) {
                            echo '<tr>';
                          }
                          if ($board['img_path'] == null) {
                            $src2 = $board['_id'];
                            $title = $board['_head'];
                            echo "<td><a href='board_page.php?_id=$src2';><img src=img/noimg.png></a></td>";
                          } else {
                            $src = $board['img_path'];
                            $src2 = $board['_id']; // echo "<input type='checkbox' name='_id$src2'";
                            echo "<td><input type='checkbox' name='dels[]' class='ab' value=\"$src2\"><br><a href=\"admin_imgre.php?_id=$src2\"><button type='button'
                class=\"btn btn-default\">
                수정</button></a></td>
            <td><a href='../home/board_page.php?_id=$src2' ;><img src=../home/upload/$src></a></td>";
                          }
                          if ($i % 3 == 0) {
                            echo '</tr>';
                          }
                          $i++;
                        } ?>
                    </form>
                    <?php
                    echo '</table>';
                    echo '<div class="btn-toolbar" role="toolbar" style="justify-content: center; margin-bottom: 10px;">';
                    if ($page <= 1) {
                      //만약 page가 1보다 크거나 같다면
                      echo "<div class='btn-group' role='group'><button class='btn btn-default'>처음</button></div>";
                      //처음이라는 글자에 빨간색 표시
                    } else {
                      echo "<div class='btn-group' role='group'><a href='?page=1'><button class='btn btn-default'>처음</button></a></div>";
                      //알니라면 처음글자에 1번페이지로 갈 수있게 링크
                    }
                    if ($page <= 1) {
                      //만약 page가 1보다 크거나 같다면 빈값
                    } else {
                      $pre = $page - 1; //pre변수에 page-1을 해준다 만약 현재 페이지가 3인데 이전버튼을 누르면 2번페이지로 갈 수 있게 함
                      echo "<div class='btn-group' role='group'><a href='?page=$pre'><button class='btn btn-default'>이전</button></a></div>"; //이전글자에 pre변수를 링크한다. 이러면 이전버튼을 누를때마다 현재 페이지에서 -1하게 된다.
                    }
                    for ($i = $block_start; $i <= $block_end; $i++) {
                      //for문 반복문을 사용하여, 초기값을 블록의 시작번호를 조건으로 블록시작번호가 마지박블록보다 작거나 같을 때까지 $i를 반복시킨다
                      if ($page == $i) {
                        //만약 page가 $i와 같다면
                        echo "<div class='btn-group' role='group'><button class='btn btn-primary'>$i</button></div>"; //현재 페이지에 해당하는 번호에 굵은 빨간색을 적용한다
                      } else {
                        echo "<div class='btn-group' role='group'><a href='?page=$i'><button class='btn btn-default'>$i</button></a></div>";
                        //아니라면 $i
                      }
                    }
                    if ($block_num >= $total_block) {
                      //만약 현재 블록이 블록 총개수보다 크거나 같다면 빈 값
                    } else {
                      $next = $page + 1;
                      //next변수에 page + 1을 해준다.
                      echo "<div class='btn-group' role='group'><a href='?page=$next'><button class='btn btn-default'>다음</button></a></div>"; //다음글자에 next변수를 링크한다. 현재 4페이지에 있다면 +1하여 5페이지로 이동하게 된다. // echo "<li><a href='?page=$next'></a></li>";
                    }
                    if ($page >= $total_page) {
                      //만약 page가 페이지수보다 크거나 같다면
                      echo "<div class='btn-group' role='group'><button class='btn btn-default'>마지막</button></div>";
                      //마지막 글자에 긁은 빨간색을 적용한다.
                    } else {
                      echo "<div class='btn-group' role='group'><a href='?page=$total_page'><button class='btn btn-default'>마지막</button></a></div>"; //아니라면 마지막글자에 total_page를 링크한다.
                    }
                    echo '</div>';
                    echo '</div>';
                    ?>
                </div>
            </section>
        </div>
    </div>

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
    <!-- Page specific script -->
    <script>
    $(function() {
        var Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 3000
        });

        $('.swalDefaultSuccess').click(function() {
            Toast.fire({
                icon: 'success',
                title: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.swalDefaultInfo').click(function() {
            Toast.fire({
                icon: 'info',
                title: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.swalDefaultError').click(function() {
            Toast.fire({
                icon: 'error',
                title: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.swalDefaultWarning').click(function() {
            Toast.fire({
                icon: 'warning',
                title: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.swalDefaultQuestion').click(function() {
            Toast.fire({
                icon: 'question',
                title: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });

        $('.toastrDefaultSuccess').click(function() {
            toastr.success('Lorem ipsum dolor sit amet, consetetur sadipscing elitr.')
        });
        $('.toastrDefaultInfo').click(function() {
            toastr.info('Lorem ipsum dolor sit amet, consetetur sadipscing elitr.')
        });
        $('.toastrDefaultError').click(function() {
            toastr.error('Lorem ipsum dolor sit amet, consetetur sadipscing elitr.')
        });
        $('.toastrDefaultWarning').click(function() {
            toastr.warning('Lorem ipsum dolor sit amet, consetetur sadipscing elitr.')
        });

        $('.toastsDefaultDefault').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultTopLeft').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                position: 'topLeft',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultBottomRight').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                position: 'bottomRight',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultBottomLeft').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                position: 'bottomLeft',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultAutohide').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                autohide: true,
                delay: 750,
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultNotFixed').click(function() {
            $(document).Toasts('create', {
                title: 'Toast Title',
                fixed: false,
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultFull').click(function() {
            $(document).Toasts('create', {
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                icon: 'fas fa-envelope fa-lg',
            })
        });
        $('.toastsDefaultFullImage').click(function() {
            $(document).Toasts('create', {
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                image: '../../dist/img/user3-128x128.jpg',
                imageAlt: 'User Picture',
            })
        });
        $('.toastsDefaultSuccess').click(function() {
            $(document).Toasts('create', {
                class: 'bg-success',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultInfo').click(function() {
            $(document).Toasts('create', {
                class: 'bg-info',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultWarning').click(function() {
            $(document).Toasts('create', {
                class: 'bg-warning',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultDanger').click(function() {
            $(document).Toasts('create', {
                class: 'bg-danger',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
        $('.toastsDefaultMaroon').click(function() {
            $(document).Toasts('create', {
                class: 'bg-maroon',
                title: 'Toast Title',
                subtitle: 'Subtitle',
                body: 'Lorem ipsum dolor sit amet, consetetur sadipscing elitr.'
            })
        });
    });
    </script>


</body>

</html>
<?php } else { ?>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php } ?>