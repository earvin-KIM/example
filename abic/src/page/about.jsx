import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import './about.css';
import about1 from '../img/aboutus/ic_bulb.png';
import about2 from '../img/aboutus/ic_pin.png';
import about3 from '../img/aboutus/ic_vision.png';
import about4 from '../img/aboutus/ic_mission.png';
import about5 from '../img/aboutus/text_1.png';
import about6 from '../img/aboutus/text_2.png';
import about7 from '../img/aboutus/text_3.png';
import about8 from '../img/aboutus/text_4.png';
import about9 from '../img/aboutus/text_5.png';
import about10 from '../img/aboutus/image_1.png';
import about11 from '../img/aboutus/text_6.png';
import about12 from '../img/aboutus/text_7.png';
import about13 from '../img/aboutus/text_8.png';
import about14 from '../img/aboutus/text_9.png';
import about15 from '../img/aboutus/image_2.png';
import about16 from '../img/aboutus/image_3.png';
import about17 from '../img/aboutus/image_4.png';
import about18 from '../img/aboutus/image_5.png';
import about19 from '../img/aboutus/image_6.png';
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
            <img src={about1} alt="" style={{ position: 'absolute', width: '5%', top: '10%', left: '25%' }} />
            <img src={about2} alt="" style={{ position: 'absolute', width: '5%', top: '10%', right: '25%' }} />
            <img src={about3} alt="" style={{ position: 'absolute', width: '10%', top: '30%', right: '22%' }} />
            <img src={about4} alt="" style={{ position: 'absolute', width: '10%', top: '30%', left: '22%' }} />
            <img src={about5} alt="" style={{ position: 'absolute', width: '20%', top: '40%', left: '17%' }} />
            <img src={about6} alt="" style={{ position: 'absolute', width: '25%', top: '40%', right: '15%' }} />
            <img src={about7} alt="" style={{ position: 'absolute', width: '25%', top: '55%', left: '15%' }} />
            <img src={about8} alt="" style={{ position: 'absolute', width: '30%', top: '55%', right: '12%' }} />
          </div>

          <div className="about chapter" id="list-item-3">
            <img src={about9} alt="" style={{ position: 'absolute', width: '50%', top: '55%', right: '25%' }} />
          </div>
        </div>
        <div className="about cer chapter" id="list-item-4">
          <img
            src={about10}
            alt=""
            style={{ position: 'absolute', width: 'auto', height: '90%', top: '5%', right: '15%' }}
          />
          <img src={about11} alt="" style={{ position: 'absolute', width: '10%', top: '5%', left: '10%' }} />
          <img src={about12} alt="" style={{ position: 'absolute', width: '25%', top: '20%', left: '10%' }} />
          <img src={about13} alt="" style={{ position: 'absolute', width: '10%', top: '90%', left: '10%' }} />
        </div>

        <div className="about chapter" id="list-item-5">
          <img src={about14} alt="" style={{ position: 'absolute', width: '5%', top: '10%', left: '10%' }} />
          <img src={about15} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '10%' }} />
          <img src={about16} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '25%' }} />
          <img src={about17} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '40%' }} />
          <img src={about18} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '55%' }} />
          <img src={about19} alt="" style={{ position: 'absolute', width: '15%', top: '30%', left: '70%' }} />
        </div>
      </div>
    </>
  );
}

export default AboutUs;
