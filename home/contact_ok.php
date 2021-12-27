<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\SMTP;
use PHPMailer\PHPMailer\Exception;

require '../PHPMailer/PHPMailer/src/Exception.php';
require '../PHPMailer/PHPMailer/src/PHPMailer.php';
require '../PHPMailer/PHPMailer/src/SMTP.php';
include '../adminpage/inc_head.php';
include $_SERVER['DOCUMENT_ROOT'] . '../adminpage/admin_db.php';
include $_SERVER['DOCUMENT_ROOT'] . '../adminpage/admin_changedb.php';
const USER = 'ajtwoddldlsn@gmail.com'; //보내는 사람 이메일
const PASSWORD = 'dkapflzksh'; //비밀번호

$NAME = $_POST['name'];
$MAIL = $_POST['email'];
$PHONE = $_POST['tel1'] . $_POST['tel2'] . $_POST['tel3'];
$SUBJECT = $_POST['gubun'];
$MESSAGE = $_POST['notes'];

// $HELP_EMAIL = 'help@thermoeye.co.kr';

$mail = new PHPMailer(true);

//Enable SMTP debugging.
$mail->SMTPDebug = 2;
//Set PHPMailer to use SMTP.
$mail->isSMTP();
//Set SMTP host name
$mail->Host = 'smtp.gmail.com';
$mail->SMTPSecure = 'ssl';
$mail->Port = 465;

//smtp 설정이 중요합니다. 테스트결과, 다음은 위처럼, 네이버는 아래처럼 해야하더군요

// $mail->Host = "smtp.naver.com";
// $mail->SMTPSecure = "tls";
// $mail->Port = 587;

//Set this to true if SMTP host requires authentication to send email
$mail->SMTPAuth = true;
//Provide username and password
$mail->Username = USER;
$mail->Password = PASSWORD;
$mail->CharSet = 'utf-8'; //이거 설정해야 한글 안깨짐

//If SMTP requires TLS encryption then set it

$mail->From = USER;
$mail->FromName = "$NAME";

$mail->addAddress('xlfksh00@frwks.com', 'Recepient Name'); //받는 사람
// $mail->addAddress($HELP_EMAIL, '');
// 테스트 끝나면 받는 주소 바꿔놓기

$mail->isHTML(true);

$mail->Subject = "$NAME-$SUBJECT";
$mail->Body = "$MESSAGE";

$mail->AltBody = '';

try {
  $mail->send();
  echo "<script> alert('문의를 보냈습니다');
    location.href='contact us.php';</script>";
} catch (Exception $e) {
  echo 'Mailer Error: ' . $mail->ErrorInfo;
  echo "<script> alert('문의사항을 확인하세요');</script>";
}

?>