import React from 'react';
import intro1 from '../img/intro/image_1.png';
import intro2 from '../img/intro/image_2.png';
import intro3 from '../img/intro/intro-b-logo.png';
import intro4 from '../img/intro/text_4.png';
import intro41 from '../img/intro/text_5.png';
import intro42 from '../img/intro/text_7.png';
import intro43 from '../img/intro/text_8.png';
import intro44 from '../img/intro/Oval_2.png';
import intro5 from '../img/intro/graph.png';
import text1 from '../img/intro/text_3.png';
import text2 from '../img/intro/text_6.png';
import text3 from '../img/intro/text_9.png';
import text4 from '../img/intro/text_10.png';
import text5 from '../img/intro/text_11.png';
import text6 from '../img/intro/text_12.png';
import text7 from '../img/intro/text_13.png';
import text8 from '../img/intro/text_14.png';
import text9 from '../img/intro/ic_1.png';
import text10 from '../img/intro/box_1.png';
import text11 from '../img/intro/box_2.png';
import text12 from '../img/intro/box_3.png';
import text13 from '../img/intro/box_4.png';
import text14 from '../img/intro/box_5.png';
import text15 from '../img/intro/text_15.png';
import text16 from '../img/intro/text_16.png';
import text17 from '../img/intro/text_17.png';
import text18 from '../img/intro/text_18.png';
import text19 from '../img/intro/text_19.png';
import text20 from '../img/intro/text_20.png';
import text21 from '../img/intro/text_21.png';
import text22 from '../img/intro/text_22.png';
import head from '../img/head.svg';
import why from '../img/why.png';
import intro_b_img from '../img/intro/intro-b-img.png';
import intro_b_logo from '../img/intro/intro-b-logo.png';
import intro_button from '../img/intro/intro-button.png';
import intro_write1 from '../img/intro/intro-write1.png';
import intro_bottom_button from '../img/intro/ic_chat.png';
import intro_write2 from '../img/intro/intro-write2.png';
import scroll from '../img/intro/scroll.png';
import side_active from '../img/intro/side-bar.png';
import side_none from '../img/intro/side-circle.png';

import './intro.css';
// import AOS from 'aos';
// import 'aos/dist/aos.css';
// import TypeAnimation from 'react-type-animation';

// AOS.init({ mirror: true, delay: 300 });
function Intro() {
  /// 이동할 페이지 목록

  return (
    <>
      <nav id="navbar-example3">
        <a className="nav-link serlink" href="#list-item-1">
          ABIC <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-2">
          업무
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-3">
          등장배경
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          등장배경
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          Why ABIC
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-6">
          감정곡선
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-7">
          ABIC의 목표
          <img className="side_nav" src={side_none} alt="" />
        </a>
      </nav>
      <a href="/">
        <img id="fixed_goto" src={intro_bottom_button} alt="" />
      </a>
      <div>
        <div id="intro">
          <div id="list-item-1" className="chapter zero">
            <img id="intro_b" src={intro_b_img} />
            <img id="intro_copy1" src={intro_write1} />
            <img id="intro_copy2" src={intro_write2} />
            <img id="intro_logo" src={intro_b_logo} />
            <a href="#">
              <img src={intro_button} alt="gotoservice" className="gotoservice" />
            </a>
            <img id="scroll_img" src={scroll} />
          </div>

          <div data-aos="fade-in" data-aos-duration="300" className="chapter one " id="list-item-2">
            <img src={intro1} alt="" style={{ position: 'absolute', width: '30%', bottom: '32%', left: '10%' }} />{' '}
            <img src={intro2} alt="" style={{ position: 'absolute', width: '40%', left: '0', bottom: '0' }} />
            <img src={intro3} alt="" style={{ position: 'absolute', width: '20%', bottom: '55%', left: '15%' }} />
            <img src={intro4} alt="" style={{ position: 'absolute', width: '22%', bottom: '20%', left: '45%' }} />
            <img src={intro41} alt="" style={{ position: 'absolute', width: '22%', bottom: '20%', left: '70%' }} />
            <img src={text1} alt="" style={{ position: 'absolute', width: '40%', top: '10%', left: '50%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter two" id="list-item-3">
            <img src={intro44} alt="" style={{ position: 'absolute', width: '19%', bottom: '20%', left: '5%' }} />
            <img src={intro42} alt="" style={{ position: 'absolute', width: '19%', bottom: '20%', left: '26%' }} />
            <img src={intro43} alt="" style={{ position: 'absolute', width: '19%', bottom: '20%', left: '47%' }} />
            <img src={text2} alt="" style={{ position: 'absolute', width: '50%', top: '15%', left: '10%' }} />
          </div>
          <div
            data-aos="fade-in"
            data-aos-duration="300"
            className="chapter three"
            id="list-item-4"
            style={{ backgroundPosition: 'unset' }}
          >
            <img src={intro5} alt="" style={{ position: 'absolute', width: '35%', bottom: '20%', left: '5%' }} />
            <img src={text3} alt="" style={{ position: 'absolute', width: '60%', top: '10%', left: '5%' }} />
            <img src={text4} alt="" style={{ position: 'absolute', width: '50%', top: '25%', left: '5%' }} />
            <img src={text5} alt="" style={{ position: 'absolute', width: '27%', top: '34%', left: '43%' }} />
            <img src={text6} alt="" style={{ position: 'absolute', width: '30%', top: '85%', left: '5%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter four" id="list-item-5">
            <img src={text7} alt="" style={{ position: 'absolute', width: '60%', top: '15%', left: '20%' }} />
            <img src={text8} alt="" style={{ position: 'absolute', width: '60%', top: '60%', left: '20%' }} />
            <img src={text9} alt="" style={{ position: 'absolute', width: '5%', top: '40%', left: '50%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter five" id="list-item-6"></div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter six" id="list-item-7">
            <img src={intro_b_logo} alt="" style={{ position: 'absolute', width: '20%', top: '35%', left: '5%' }} />
            <img src={text20} alt="" style={{ position: 'absolute', width: '60%', top: '15%', left: '5%' }} />
            <img src={text21} alt="" style={{ position: 'absolute', width: '30%', top: '55%', left: '5%' }} />
            <img src={text22} alt="" style={{ position: 'absolute', width: '50%', top: '73%', left: '5%' }} />
            <a href="#">
              <img src={intro_button} alt="gotoservice" className="bottom-gotoservice" />
            </a>
          </div>
        </div>
      </div>
    </>
  );
}

export default Intro;
