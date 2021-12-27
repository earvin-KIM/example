<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>contact us</title>
    <link rel="stylesheet" href="contact.css">
    <link rel="stylesheet" href="./css/bootstrap.css">
    <script src="./js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.js"
        integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
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
            <a href="http://localhost/home/portfolio.php">portfolio</a>
        </div>
        <div class="banner">
            <a href="contact us.php">contact us</a>
        </div>
        <div id="headertel"><img src="./img/header_tel.png" alt=""></div>
        <div id="headergb"><img src="./img/header_goodbox.png" alt=""></div>
        <div id="headerb"><img src="./img/header_blog.png" alt=""></div>

    </div>
    <div class="intro"><img src="./img/contact/contact_intro_banner.png" alt="" width="100%"></div>
    <div class="intro"><img src="./img/contact/contact_call.png" alt=""></div>
    <div class="intro"><img src="./img/contact/contact_line.png" alt="" width="100%"></div>
    <div class="intro" id="question"><img src="./img/contact/contact_questioning.png" alt="" width="30%"></div>
    <article id="contact">
        <div id="questioning" style="display: block;">

            <div>
                <p class="surplus"></p>
            </div>

            <hr>
            <form action="contact_ok.php" method="post">
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="80px">
                        <col width="1340px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 40px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">구 분</td>
                            <td style="border: 1pt solid lightgrey;">
                                <input name='gubun' type="text" id="gubun" style="width:80%; border: 0;">
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="400px">
                        <col width="1020px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 40px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">성 명</td>
                            <td style="border: 1pt solid lightgrey;">
                                <input type="text" name='name' id="name" style="width:96%; border: 0;">
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="80px">
                        <col width="12px">
                        <col width="80px">
                        <col width="12px">
                        <col width="80px">
                        <col width="1136px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 40px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">전화번호</td>
                            <td style="border: 1pt solid lightgrey;">
                                <input type="tel" name='tel1' id="tel_svr" minlength="2" maxlength="3"
                                    style="width:80%; border: 0;">
                            </td>
                            <td>
                                -
                            </td>
                            <td style="border: 1pt solid lightgrey;">
                                <input type="tel" name='tel2' id="tel_sta" minlength="3" maxlength="4"
                                    style="width:80%; border: 0;">
                            </td>
                            <td>
                                -
                            </td>
                            <td style="border: 1pt solid lightgrey;">
                                <input type="tel" name='tel3' id="tel_num" minlength="4" maxlength="4"
                                    style="width:80%; border: 0;">
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="800px">
                        <col width="620px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 40px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">이메일</td>
                            <td style="border: 1pt solid lightgrey;">
                                <input type="email" name='email' id="reply_to" style="width:98%; border: 0;">
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="800px">
                        <col width="620px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 240px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">설명</td>
                            <td style="border: 1pt solid lightgrey;">
                                <textarea id="notes" name="notes" rows="17" style="width:98%; border: 0;"></textarea>
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>
                <table>
                    <colgroup>
                        <col width="420px">
                        <col width="80px">
                        <col width="800px">
                        <!--col width="720px"></col-->
                        <col width="620px">
                    </colgroup>
                    <tbody>
                        <tr style="height: 40px;">
                            <td></td>
                            <td class="font_fit" style="text-align: center;">파일</td>
                            <td style="text-align: left;">
                                <input type="file" name='file' id="file_name">
                            </td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
                <hr>

                <div>
                    <p class="surplus"></p>
                </div>
                <a id="questioning_ques_button" type="button" onclick="ques2send()"
                    style="border: none; cursor: pointer;">

                </a>
        </div>
        <button> 제출 </button>
        </form>
    </article>
    <div id="bottom"><img width="100%" src="./img/ourwork/our_footer_upper.png" alt="">
        <img id="foot" width="100%" src="./img/footer.png" alt="">
    </div>

</body>

</html>