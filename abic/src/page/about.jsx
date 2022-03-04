import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import './about.css';
import about_02_bulb from '../img/aboutus/ic_bulb.png';
import about_02_pin from '../img/aboutus/ic_pin.png';
import text_02_vision_btn from '../img/aboutus/ic_vision.png';
import text_02_mission_btn from '../img/aboutus/ic_mission.png';
import text_02_mission from '../img/aboutus/text_1.png';
import text_02_vision from '../img/aboutus/text_2.png';
import text_02_mission_description from '../img/aboutus/text_3.png';
import text_02_vison_description from '../img/aboutus/text_4.png';
import text_03_below_arrow from '../img/aboutus/text_5.png';
import about_04_ceo_pic from '../img/aboutus/image_1.png';
import text_04_greet from '../img/aboutus/text_6.png';
import text_04_greeting from '../img/aboutus/text_7.png';
import text_04_ceo from '../img/aboutus/text_8.png';
import text_05_certifi from '../img/aboutus/text_9.png';
import about_05_pic1 from '../img/aboutus/image_2.png';
import about_05_pic2 from '../img/aboutus/image_3.png';
import about_05_pic3 from '../img/aboutus/image_4.png';
import about_05_pic4 from '../img/aboutus/image_5.png';
import about_05_pic5 from '../img/aboutus/image_6.png';
import scroll from '../img/service/service-scroll.png';
import side_line from '../img/intro/intro_01_sideline1.png';

import { Container, Row, Col } from 'react-bootstrap';
function AboutUs() {
  return (
    <>
      <nav id="navbar-example3">
        <a className="nav-link serlink" href="#list-item-1">
          About Us <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-2">
          Misson&Vision
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-3">
          Misson&Vision
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          대표 소개
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          인증서{/* Partner&Team */}
          <img className="side_nav" src="" alt="" />
        </a>
        <img src={side_line} alt="" className="side_line" />
      </nav>
      <div className="about_us">
        <img id="scroll_img" src={scroll} />
        <div className="about about_intro chapter" id="list-item-1">
          <img id="scroll_img" src={scroll} />
        </div>
        <div className="about_outer">
          <div className="about chapter" id="list-item-2">
            <img src={about_02_bulb} alt="" style={{ position: 'absolute', width: '5%', top: '10%', left: '25%' }} />
            <img src={about_02_pin} alt="" style={{ position: 'absolute', width: '5%', top: '10%', right: '25%' }} />
            <img
              src={text_02_vision_btn}
              alt=""
              style={{ position: 'absolute', width: '10%', top: '30%', right: '22%' }}
            />
            <img
              src={text_02_mission_btn}
              alt=""
              style={{ position: 'absolute', width: '10%', top: '30%', left: '22%' }}
            />
            <img src={text_02_mission} alt="" style={{ position: 'absolute', width: '20%', top: '40%', left: '17%' }} />
            <img src={text_02_vision} alt="" style={{ position: 'absolute', width: '25%', top: '40%', right: '15%' }} />
            <img
              src={text_02_mission_description}
              alt=""
              style={{ position: 'absolute', width: '25%', top: '55%', left: '15%' }}
            />
            <img
              src={text_02_vison_description}
              alt=""
              style={{ position: 'absolute', width: '30%', top: '55%', right: '12%' }}
            />
          </div>

          <div className="about chapter" id="list-item-3">
            <img
              src={text_03_below_arrow}
              alt=""
              style={{ position: 'absolute', width: '50%', top: '55%', right: '25%' }}
            />
          </div>
        </div>
        <div className="about cer chapter" id="list-item-4">
          <img
            src={about_04_ceo_pic}
            alt=""
            style={{ position: 'absolute', width: 'auto', height: '90%', top: '5%', right: '15%' }}
          />
          <img
            src={text_04_greet}
            alt=""
            style={{ position: 'absolute', height: '10%', width: 'auto', top: '5%', left: '10%' }}
          />
          <img
            src={text_04_greeting}
            alt=""
            style={{ position: 'absolute', height: '65%', width: 'auto', top: '20%', left: '10%' }}
          />
          <img
            src={text_04_ceo}
            alt=""
            style={{ position: 'absolute', height: '7%', width: 'auto', top: '90%', left: '10%' }}
          />
        </div>

        <div className="about chapter" id="list-item-5">
          <img src={text_05_certifi} alt="" style={{ position: 'absolute', width: '5%', top: '10%', left: '10%' }} />
          <img src={about_05_pic1} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '10%' }} />
          <img src={about_05_pic2} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '25%' }} />
          <img src={about_05_pic3} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '40%' }} />
          <img src={about_05_pic4} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '55%' }} />
          <img src={about_05_pic5} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '70%' }} />
        </div>
      </div>
    </>
  );
}

export default AboutUs;
