
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판</title>
    <link rel="stylesheet" href="style.css">
   
    
  
</head>
<body>
    
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
    $row_per_page=10;
    $head="SELECT _id, _head FROM board WHERE _id=$i";
    $heads="SELECT _id, _head FROM board";
    $sql="SELECT paragraph FROM board WHERE _id=$i";
    $h_result=mysqli_query($conn, $head);$h_results=mysqli_query($conn, $heads);
    $p_result=mysqli_query($conn,$sql);
    $total_rows=mysqli_num_rows($h_results);
    $total_page=$total_rows/$row_per_page;
    if($row_per_page>$total_rows)$total_page=1;

    echo'<div class=header><h1>게시판</h1></div>';
    // 게시판 글 목록
    echo'<div>';
    

        while($i<=$total_rows){
            if($i==$total_rows+1)break;
            echo"<table id=t_$page class=tb>";
            while($cntr<=$row_per_page){
                if($i==$total_rows+1)break;
                $head="SELECT _id, _head FROM board WHERE _id=$i";
                $h_result=mysqli_query($conn, $head);
                $row=mysqli_fetch_array($h_result);
                echo "<tr><td class=_id width=10px>", $row['_id'], '</ td><td   class=_head>',"<a href='./board_page.php?_id=$i'>", $row['_head'],"</a>", "</td></tr>"; 
                $cntr++;
                $i++;
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
        while($i<=$total_page+1){
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
</body>
</html>