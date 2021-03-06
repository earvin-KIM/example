<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>portfolio</title>
    <link rel="stylesheet" href="./portfolio.css">
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
    <link rel="stylesheet" href="../bootstrap-3.3.2-dist\bootstrap-3.3.2-dist\css\bootstrap.css">




</head>

<body>
    <div id="mg"></div>
    <div id="header">

        <a href="qptrs.php" id="logo"><img src="./img/header_logo-top.png" alt=""></a>
        <div class="banner">
            <a href="about.php">about us</a>
        </div>
        <div class="banner">
            <a href="ourwork.php">our work</a>
        </div>
        <div class="banner">
            <a href="portfolio.php">portfolio</a>
        </div>
        <div class="banner">
            <a href="contact us.php">contact us</a>
        </div>
        <div id="headertel"><img src="./img/header_tel.png" alt=""></div>
        <div id="headergb"><img src="./img/header_goodbox.png" alt=""></div>
        <div id="headerb"><img src="./img/header_blog.png" alt=""></div>

    </div>
    <div id="portbanner">
        <img src="./img/portfolio/portfolio_intro_banner.png" width="100%" alt="">
    </div>
    <div class="wapper">
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
        $row_num = mysqli_num_rows($sql); //게시판 총 레코드 수
        $list = 9; //한 페이지에 보여줄 개수
        $block_ct = 5; //블록당 보여줄 페이지 개수
        $block_num = ceil($page / $block_ct); // 현재 페이지 블록 구하기
        $block_start = ($block_num - 1) * $block_ct + 1; // 블록의 시작번호
        $block_end = $block_start + $block_ct - 1; //블록 마지막 번호
        $total_page = ceil($row_num / $list); // 페이징한 페이지 수 구하기
        if ($block_end > $total_page) {
          $block_end = $total_page;
        } //만약 블록의 마지박 번호가 페이지수보다 많다면 마지박번호는 페이지 수
        $total_block = ceil($total_page / $block_ct); //블럭 총 개수
        $start_num = ($page - 1) * $list; //시작번호 (page-1)에서 $list를 곱한다.
        $mq = "SELECT * FROM board ORDER BY rownum DESC LIMIT $start_num, $list";
        $sql2 = mysqli_query($conn, $mq);
        $i = 1;
        // 게시판 글 목록
        echo '<div>';
        echo '<table>';
        while ($board = $sql2->fetch_array()) {
          if ($i % 3 == 1) {
            echo '<tr>';
          }
          if ($board['img_path'] == null) {
            $src2 = $board['_id'];
            $title = $board['_head'];
            echo "<td><a href='board_page.php?_id=$src2';><img src=img/noimg.png></a></td>";
          } else {
            $src = $board['img_path'];
            $src2 = $board['_id'];
            echo "<td><a href='board_page.php?_id=$src2';><img src=upload/$src></a></td>";
          }
          if ($i % 3 == 0) {
            echo '</tr>';
          }
          $i++;
        }
        echo '</table>';
        echo '<div class="btn-toolbar" role="toolbar" style="justify-content: center; text-align:center;">';
        if ($page <= 1) {
          //만약 page가 1보다 크거나 같다면
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'>처음</button></div>"; //처음이라는 글자에 빨간색 표시
        } else {
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'><a href='?page=1'>처음</a></button></div>";
          //알니라면 처음글자에 1번페이지로 갈 수있게 링크
        }
        if ($page <= 1) {
          //만약 page가 1보다 크거나 같다면 빈값
        } else {
          $pre = $page - 1; //pre변수에 page-1을 해준다 만약 현재 페이지가 3인데 이전버튼을 누르면 2번페이지로 갈 수 있게 함
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'><a href='?page=$pre'>이전</a></button></div>"; //이전글자에 pre변수를 링크한다. 이러면 이전버튼을 누를때마다 현재 페이지에서 -1하게 된다.
        }
        for ($i = $block_start; $i <= $block_end; $i++) {
          //for문 반복문을 사용하여, 초기값을 블록의 시작번호를 조건으로 블록시작번호가 마지박블록보다 작거나 같을 때까지 $i를 반복시킨다
          if ($page == $i) {
            //만약 page가 $i와 같다면
            echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'>$i</button></div>"; //현재 페이지에 해당하는 번호에 굵은 빨간색을 적용한다
          } else {
            echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'><a href='?page=$i'>$i</a></button></div>"; //아니라면 $i
          }
        }
        if ($block_num >= $total_block) {
          //만약 현재 블록이 블록 총개수보다 크거나 같다면 빈 값
        } else {
          $next = $page + 1;
          //next변수에 page + 1을 해준다.
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'><a href='?page=$next'>다음</a></button></div>"; //다음글자에 next변수를 링크한다. 현재 4페이지에 있다면 +1하여 5페이지로 이동하게 된다. // echo "<li><a href='?page=$next'></a></li>";
        }
        if ($page >= $total_page) {
          //만약 page가 페이지수보다 크거나 같다면
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'>마지막</button></div>";
          //마지막 글자에 긁은 빨간색을 적용한다.
        } else {
          echo "<div class='btn-group' role='group' style='float:none;'><button class='btn btn-default'><a href='?page=$total_page'>마지막</a></button></div>"; //아니라면 마지막글자에 total_page를 링크한다.
        }
        echo '</div>';
        echo '</div>';

// 페이지 버튼
?>
        <!-- 파일 업로드 버튼 -->
        <button><a href="imgboard.php">이미지 추가</a></button>
        <div id=" bottom">
            <img width="100%" src="./img/ourwork/our_footer_upper.png" alt="">
            <img src="./img/footer.png" alt="" width="100%">

        </div>
    </div>

</body>

</html>