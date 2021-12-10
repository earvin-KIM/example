<?php
$conn = mysqli_connect(
  'localhost',
  'root',
  'wyk1205!',
  'capston');
  # title, description 이라는 사용자가 입력한 정보를 그대로 php에 입력하는 행위는 보안에 취약, 따라서 관리 필요

  $filtered = array(
    'stnum'=>mysqli_real_escape_string($conn, $_POST['stnum']),
    'name'=>mysqli_real_escape_string($conn, $_POST['name']),
    'temperature'=>mysqli_real_escape_string($conn, $_POST['temperature'])
  );

$sql = "
  INSERT INTO topic
    (stnum, name, temperature, created)
    VALUES(
      '{$filtered['stnum']}',
      '{$filtered['name']}',
      '{$filtered['temperature']}',
        NOW()
    )
";
$result = mysqli_query($conn, $sql);
if($result === false){
  echo '저장하는 과정에서 문제가 생겼습니다. 관리자에게 문의해주세요';
  error_log(mysqli_error($conn));
} else {
  echo '성공했습니다. <a href="create.php">돌아가기</a>';
}
?>