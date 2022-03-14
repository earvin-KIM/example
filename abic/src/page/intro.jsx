import React from 'react';
import intro_circle from '../img/intro/intro_02_circle1.png'; //주관식 원
import intro_circle1 from '../img/intro/intro_02_circle1.png'; //내손안 원
import intro_circle2 from '../img/intro/intro_03_circle1.png'; //150만 원
import intro_circle3 from '../img/intro/intro_03_circle2.png'; //90만 원
import intro_circle4 from '../img/intro/intro_03_circle3.png'; //260조 원
import intro_graph from '../img/intro/intro_04_bar.png'; //그래프
import intro_03_info1 from '../img/intro/intro_03_letter2.png'; //평균 창업비
import intro_03_info2 from '../img/intro/intro_03_letter3.png'; //3출처
import intro_04_info from '../img/intro/intro_04_letter5.png'; //4출처
import text_02_ABIC from '../img/intro/intro_02_letter1.png'; //ABIC은
import text_03_every_year from '../img/intro/intro_03_letter.png'; //매년창업자
import text_04_startup from '../img/intro/intro_04_letter1.png'; //스타트업의실패원인
import text_04_customer from '../img/intro/intro_04_letter2.png'; //고객,경쟁
import text_04_near_bar from '../img/intro/intro_04_barletter.png'; //바설명
import text_04_korea from '../img/intro/intro_04_letter3.png'; //한국은
import text_04_korea_vs_america from '../img/intro/intro_04_letter4.png'; //창업실패횟수
import text_05_cause from '../img/intro/intro_05_letter1.png'; //Cause
import text_05_result from '../img/intro/intro_05_letter2.png'; //Result
import text_06_so_now from '../img/intro/intro_06_letter1.png'; //그러므로이젠
import text_06_early_business from '../img/intro/intro_06_letter2.png'; //초기사업추친방향
import text_06_easy from '../img/intro/intro_06_letter3.png'; //쉽게실패쉽게
import side_line from '../img/intro/intro_01_sideline1.png';
import intro_b_logo from '../img/intro/intro_01_letter3.png';
import intro_button from '../img/intro/intro_01_service.png';
import text_01_hand from '../img/intro/intro_01_letter1.png'; //내손안에
import intro_bottom_button from '../img/intro/ic_chat.png';
import text_01_ai_based from '../img/intro/intro_01_letter2.png'; //ai based
import scroll from '../img/intro/intro_01_mouse.png';
import side_none from '../img/intro/intro_01_sidecircle.png';

import './intro.css';
// import AOS from 'aos'; 스크롤시 등장하는 애니메이션 라이브러리, 쓸거면 주석 풀면 됨
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
            <img id="intro_copy1" src={text_01_hand} />
            <img id="intro_copy2" src={text_01_ai_based} />
            <img id="intro_logo" src={intro_b_logo} />
            <a href="#">
              <img src={intro_button} alt="gotoservice" className="gotoservice" />
            </a>
            <img id="scroll_img" src={scroll} />
          </div>

          <div data-aos="fade-in" data-aos-duration="300" className="chapter one " id="list-item-2">
            <img
              src={intro_circle}
              alt=""
              style={{ position: 'absolute', height: '41%', bottom: '15%', left: '23%' }}
            />
            <img
              src={intro_circle1}
              alt=""
              style={{ position: 'absolute', height: '41%', bottom: '15%', left: '57%' }}
            />
            <img
              src={text_02_ABIC}
              alt=""
              style={{ position: 'absolute', height: '15%', top: '15%', left: '50%', transform: 'translateX(-50%)' }}
            />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter two" id="list-item-3">
            <img
              src={intro_circle2}
              alt=""
              style={{ position: 'absolute', height: '41%', bottom: '25%', left: '5%' }}
            />
            <img
              src={intro_circle3}
              alt=""
              style={{ position: 'absolute', height: '41%', bottom: '25%', left: '26%' }}
            />
            <img
              src={intro_circle4}
              alt=""
              style={{ position: 'absolute', height: '41%', bottom: '25%', left: '47%' }}
            />
            <img
              src={text_03_every_year}
              alt=""
              style={{ position: 'absolute', height: '15%', top: '10%', left: '7%' }}
            />
            <img
              src={intro_03_info1}
              alt=""
              style={{ position: 'absolute', height: '2.1%', top: '80%', left: '47%' }}
            />
            <img src={intro_03_info2} alt="" style={{ position: 'absolute', height: '2%', top: '90%', left: '5%' }} />
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
              src={intro_graph}
              id="intro_graph"
              alt=""
              style={{ position: 'absolute', width: '0%', height: '35%', bottom: '30%', left: '5%' }}
            />
            <img src={text_04_startup} alt="" style={{ position: 'absolute', height: '5%', top: '10%', left: '5%' }} />
            <img src={text_04_customer} alt="" style={{ position: 'absolute', height: '5%', top: '25%', left: '5%' }} />
            <img
              src={text_04_near_bar}
              alt=""
              style={{ position: 'absolute', height: '36%', top: '34%', left: '50%' }}
            />
            <img src={text_04_korea} alt="" style={{ position: 'absolute', height: '4%', top: '75%', left: '5%' }} />
            <img
              src={text_04_korea_vs_america}
              alt=""
              style={{ position: 'absolute', height: '3.5%', top: '83%', left: '5%' }}
            />
            <img src={intro_04_info} alt="" style={{ position: 'absolute', height: '2%', bottom: '5%', left: '5%' }} />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter four" id="list-item-5">
            <img
              src={text_05_cause}
              alt=""
              style={{ position: 'absolute', height: '35%', top: '10%', left: '50%', transform: 'translateX(-50%)' }}
            />
            <img
              src={text_05_result}
              alt=""
              style={{ position: 'absolute', height: '35%', top: '55%', left: '50%', transform: 'translateX(-50%)' }}
            />
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter six" id="list-item-7">
            <img src={intro_b_logo} alt="" style={{ position: 'absolute', height: '15%', top: '43%', left: '5%' }} />
            <img src={text_06_so_now} alt="" style={{ position: 'absolute', height: '20%', top: '10%', left: '5%' }} />
            <img
              src={text_06_early_business}
              alt=""
              style={{ position: 'absolute', height: '12%', top: '63%', left: '5%' }}
            />
            <img src={text_06_easy} alt="" style={{ position: 'absolute', height: '12%', top: '80%', left: '5%' }} />
            <a href="#">{/* <img src={intro_button} alt="gotoservice" className="bottom-gotoservice" /> */}</a>
          </div>
        </div>
      </div>
    </>
  );
}

export default Intro;
