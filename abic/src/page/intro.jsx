import React from 'react';
import intro4 from '../img/intro/intro_02_circle1.png';
import intro41 from '../img/intro/intro_02_circle2.png';
import intro42 from '../img/intro/intro_03_circle2.png';
import intro43 from '../img/intro/intro_03_circle3.png';
import intro44 from '../img/intro/intro_03_circle1.png';
import intro5 from '../img/intro/intro_04_bar.png';
import intro_03_info1 from '../img/intro/intro_03_letter2.png';
import intro_03_info2 from '../img/intro/intro_03_letter3.png';
import intro_04_info from '../img/intro/intro_04_letter5.png';
import text1 from '../img/intro/intro_02_letter1.png';
import text2 from '../img/intro/intro_03_letter.png';
import text3 from '../img/intro/intro_04_letter1.png';
import text4 from '../img/intro/intro_04_letter2.png';
import text5 from '../img/intro/intro_04_barletter.png';
import text6 from '../img/intro/intro_04_letter3.png';
import text6_1 from '../img/intro/intro_04_letter4.png';
import text7 from '../img/intro/intro_05_letter1.png';
import text8 from '../img/intro/intro_05_letter2.png';
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
import text20 from '../img/intro/intro_06_letter1.png';
import text21 from '../img/intro/intro_06_letter2.png';
import text22 from '../img/intro/intro_06_letter3.png';
import side_line from '../img/intro/intro_01_sideline1.png';
import intro_b_logo from '../img/intro/intro_01_letter3.png';
import intro_button from '../img/intro/intro_01_service.png';
import intro_write1 from '../img/intro/intro_01_letter1.png';
import intro_bottom_button from '../img/intro/ic_chat.png';
import intro_write2 from '../img/intro/intro_01_letter2.png';
import scroll from '../img/intro/intro_01_mouse.png';
import side_active from '../img/intro/side-bar.png';
import side_none from '../img/intro/intro_01_sidecircle.png';

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
          Main <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-2">
          Pursuing
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-3">
          Situation
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          Cause
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          Idea
          <img className="side_nav" src={side_none} alt="" />
        </a>

        <a className="nav-link serlink" href="#list-item-7">
          Necessity
          <img className="side_nav" src={side_none} alt="" />
        </a>
        <img src={side_line} alt="" className="side_line" />
      </nav>
      <a href="/">
        <img id="fixed_goto" src={intro_bottom_button} alt="" />
      </a>
      <div>
        <div id="intro">
          <div id="list-item-1" className="chapter zero">
            <img id="intro_copy1" src={intro_write1} />
            <img id="intro_copy2" src={intro_write2} />
            <img id="intro_logo" src={intro_b_logo} />
            <a href="#">
              <img src={intro_button} alt="gotoservice" className="gotoservice" />
            </a>
            <img id="scroll_img" src={scroll} />
          </div>

          <div data-aos="fade-in" data-aos-duration="300" className="chapter one " id="list-item-2">
            <img src={intro4} alt="" style={{ position: 'absolute', width: '21%', bottom: '15%', left: '23%' }} />
            <img src={intro41} alt="" style={{ position: 'absolute', width: '21%', bottom: '15%', left: '57%' }} />
            <img src={text1} alt="" style={{ position: 'absolute', width: '49%', top: '15%', left: '25%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter two" id="list-item-3">
            <img src={intro44} alt="" style={{ position: 'absolute', width: '19%', bottom: '25%', left: '5%' }} />
            <img src={intro42} alt="" style={{ position: 'absolute', width: '19%', bottom: '25%', left: '26%' }} />
            <img src={intro43} alt="" style={{ position: 'absolute', width: '19%', bottom: '25%', left: '47%' }} />
            <img src={text2} alt="" style={{ position: 'absolute', width: '55%', top: '10%', left: '7%' }} />
            <img src={intro_03_info1} alt="" style={{ position: 'absolute', width: '20%', top: '80%', left: '47%' }} />
            <img src={intro_03_info2} alt="" style={{ position: 'absolute', width: '20%', top: '90%', left: '5%' }} />
          </div>
          <div
            data-aos="fade-in"
            data-aos-duration="300"
            className="chapter three"
            id="list-item-4"
            style={{ backgroundPosition: 'unset' }}
          >
            <h1 style={{ position: 'absolute', fontSize: '1.8rem', bottom: '60%', left: '43%', display: 'flex' }}>
              <div id="per_1">0</div>%
            </h1>
            <h1 style={{ position: 'absolute', fontSize: '1.8rem', bottom: '52%', left: '43%', display: 'flex' }}>
              <div id="per_2">0</div>%
            </h1>
            <h1 style={{ position: 'absolute', fontSize: '1.8rem', bottom: '44%', left: '43%', display: 'flex' }}>
              <div id="per_3">0</div>%
            </h1>
            <h1 style={{ position: 'absolute', fontSize: '1.8rem', bottom: '36%', left: '43%', display: 'flex' }}>
              <div id="per_4">0</div>%
            </h1>
            <h1 style={{ position: 'absolute', fontSize: '1.8rem', bottom: '28%', left: '43%', display: 'flex' }}>
              <div id="per_5">0</div>%
            </h1>
            <img
              src={intro5}
              id="intro_graph"
              alt=""
              style={{ position: 'absolute', width: '0%', height: '35%', bottom: '30%', left: '5%' }}
            />
            <img src={text3} alt="" style={{ position: 'absolute', width: '60%', top: '10%', left: '5%' }} />
            <img src={text4} alt="" style={{ position: 'absolute', width: '70%', top: '25%', left: '5%' }} />
            <img src={text5} alt="" style={{ position: 'absolute', height: '36%', top: '34%', left: '50%' }} />
            <img src={text6} alt="" style={{ position: 'absolute', width: '40%', top: '75%', left: '5%' }} />
            <img src={text6_1} alt="" style={{ position: 'absolute', width: '30%', top: '83%', left: '5%' }} />
            <img src={intro_04_info} alt="" style={{ position: 'absolute', width: '20%', bottom: '5%', left: '5%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter four" id="list-item-5">
            <img src={text7} alt="" style={{ position: 'absolute', width: '50%', top: '10%', left: '25%' }} />
            <img src={text8} alt="" style={{ position: 'absolute', width: '50%', top: '55%', left: '25%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter six" id="list-item-7">
            <img src={intro_b_logo} alt="" style={{ position: 'absolute', width: '20%', top: '45%', left: '5%' }} />
            <img src={text20} alt="" style={{ position: 'absolute', width: '40%', top: '10%', left: '5%' }} />
            <img src={text21} alt="" style={{ position: 'absolute', width: '30%', top: '65%', left: '5%' }} />
            <img src={text22} alt="" style={{ position: 'absolute', width: '35%', top: '80%', left: '5%' }} />
            <a href="#">{/* <img src={intro_button} alt="gotoservice" className="bottom-gotoservice" /> */}</a>
          </div>
        </div>
      </div>
    </>
  );
}

export default Intro;
