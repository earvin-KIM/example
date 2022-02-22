import React from 'react';
import intro1 from '../img/sli1.PNG';
import intro2 from '../img/sli2.PNG';
import intro3 from '../img/sli3.PNG';
import intro4 from '../img/sli4.PNG';
import intro5 from '../img/sli5.PNG';
import intro6 from '../img/sli6.png';
import head from '../img/head.svg';
import why from '../img/why.png';
import intro_b_img from '../img/intro/intro-b-img.png';
import intro_b_logo from '../img/intro/intro-b-logo.png';
import intro_button from '../img/intro/intro-button.png';
import intro_write1 from '../img/intro/intro-write1.png';
import intro_bottom_button from '../img/intro/intro-bottom-button.png';
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

          <div data-aos="fade-in" data-aos-duration="300" className="chapter one " id="list-item-2"></div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter two" id="list-item-3"></div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter three" id="list-item-4"></div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter four" id="list-item-5">
            {/* <img src={head} alt="Why abic" style={{ width: '100px' }} />
            <h3>
              스타트업, 중소/중견기업은 필요한 정보를 확보하기 어렵고 신사업을 기획하는 스킬도 미흡하여 성장 동력이 될
              새로운 사업 아이템 모델 개발에 많은 어려움을 겪고 있습니다
            </h3>
            <div id="text_box">
              <span id="txt_here"></span>
              <span className="blink">|</span>
            </div> */}
            {/* <TypeAnimation
              data-aos="fade-in"
              cursor={true}
              sequence={[
                '그래서 ABIC은 생각했습니다 신사업 기획, 마케팅, 세일즈에 대한 비즈니스 컨설팅을 AI 기술을 통해 ‘신속’하고          ‘편리’하게 제공할 순 없을까?',
                1000,
              ]}
              wrapper="h2"
              repeat={1}
            /> */}
          </div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter five" id="list-item-6"></div>
          <div data-aos="fade-in" data-aos-duration="300" className="chapter six" id="list-item-7">
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
