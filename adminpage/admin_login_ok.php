<?php include "inc_head.php"; ?>
<?php
    include $_SERVER['DOCUMENT_ROOT']."/adminpage/admin_db.php";
    $id=$_POST["admin_id"];
    $pw=$_POST["admin_pw"];
    $sql=mq("SELECT * FROM admin_info");
    while($info = $sql->fetch_array()){
        if($id==$info['_id'] and $pw==$info['_pw']){
           $_SESSION['id']=$id;
           ?>
<meta http-equiv="refresh" content="0 url=admin_main.php" />
<?php
        }
        else{
            ?>
<script type="text/javascript">
alert("비밀번호 혹은 아이디가 틀렸습니다.");
</script>
<meta http-equiv="refresh" content="0 url=admin_login.php" />
<?php
        }
    };
?>