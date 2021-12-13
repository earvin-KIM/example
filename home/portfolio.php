
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>contact us</title>
    <link rel="stylesheet" href="./portfolio.css">
    
    
    
</head>
<body>
        <div id="mg"></div>
    <div id="header">

        <a href="qptrs.html" id="logo"><img src="./img/header_logo-top.png" alt=""></a>
        <div class="banner">
            <a href="about.html">about us</a>
        </div>
        <div class="banner">
            <a href="ourwork.html">our work</a>
        </div>
        <div class="banner">
            <a href="portfolio.html">portfolio</a>
        </div>
        <div class="banner">
            <a href="contact us.html">contact us</a>
        </div>
        <div id="headertel"><img src="./img/header_tel.png" alt=""></div>
        <div id="headergb"><img src="./img/header_goodbox.png" alt=""></div>
        <div id="headerb"><img src="./img/header_blog.png" alt=""></div>

    </div>
    <div id="portbanner">
            <img src="./img/portfolio/portfolio_intro_banner.png" width="100%" alt="">
    </div>
<?php 
    $conn=mysqli_connect(
        'localhost',
        'root',
        'wyk1205!',
        'board_data'
    );
    // 변수들
    $cntr=1;
    $i=1;
    $page=1;
    $row_per_page=12;
    $head="SELECT _id, _head FROM board WHERE _id=$i";
    $heads="SELECT _id, _head FROM board";
    $sql="SELECT paragraph FROM board WHERE _id=$i";
    $h_result=mysqli_query($conn, $head);$h_results=mysqli_query($conn, $heads);
    $p_result=mysqli_query($conn,$sql);
    $total_rows=mysqli_num_rows($h_results);
    $total_page=ceil($total_rows/$row_per_page);
    if($row_per_page>$total_rows)$total_page=1;

    // 게시판 글 목록
    echo'<div>';
    
    
        while($i<=$total_rows){
            if($i==$total_rows+1)break;
            echo"<table id=t_$page class=tb>";
            while($cntr<=$row_per_page){
                if($i==$total_rows+1)break;
                $head="SELECT * FROM board WHERE _id=$i";
                $h_result=mysqli_query($conn, $head); //매 주기마다 새로 선언
                $row=mysqli_fetch_array($h_result);
                
                echo '<td   class=_head>',
                "<a href='./board_page.php?_id=$i'>", 
                '<img src="',
                './upload/',
                $row['img_path'],
                '" alt="사진">',"</a>",//사진형식 통일 시켜야함
                "</td>"; //한주기당 한 tr사용
                if($i%3==0)
                    echo "</tr>";
                $cntr++;
                $i++;
                // echo"$row[img_path]";
            }
            echo"</table>";
            $page++;
            $cntr=1;
        }

    echo'</div>';
    // 페이지 버튼
    echo "<div class=button>";
        
        //  <!-- 버튼이벤트 -->
        $i=1;
        while($i<=$total_page){
            echo "<button type='button' class=tb$i onclick='test$i()'>$i</button>"; 
            echo (
            "<script language=javascript> 
            function test$i() 
            {
                var matches = document.getElementsByClassName('tb');
                    for (var i=0; i<matches.length; i++){
                        matches[i].style.display='none';
                    }
                matches[$i-1].style.display='table';
            }
            </script>");
            $i++; 
        
        }
        //  <!-- 버튼이벤트 -->
        
        
        echo "</div>";
?>
<!-- 파일 업로드 버튼 -->
<button><a href="imgboard.php">이미지 추가</a></button>
 <div id=" bottom">
        <img width="100%" src="./img/ourwork/our_footer_upper.png" alt="">
        <img src="./img/footer.png" alt="" width="100%">

    </div>

</body>
</html>