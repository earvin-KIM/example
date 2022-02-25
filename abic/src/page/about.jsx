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
import scroll from '../img/service/service-scroll.png';

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
            <img src={about6} alt="" style={{ position: 'absolute', width: '50%', top: '73%', left: '5%' }} />
            <img src={about7} alt="" style={{ position: 'absolute', width: '50%', top: '73%', left: '5%' }} />
            <img src={about8} alt="" style={{ position: 'absolute', width: '50%', top: '73%', left: '5%' }} />
          </div>

          <div className="about chapter" id="list-item-3"></div>
        </div>
        <div className="about cer chapter" id="list-item-4">
          {/* <h1>
            Authorized Certification <br />
          </h1>
          <img src={about3} alt="인증서" />
          <img src={about4} alt="인증서" />
          <img src={about5} alt="인증서" />
          <img src={about6} alt="인증서" />
          <img src={about7} alt="인증서" /> */}
        </div>

        <div className="about chapter" id="list-item-5">
          {/* <h1>Partner</h1>
          <img src="" alt="파트너||팀" /> */}
        </div>
      </div>
    </>
  );
}

export default AboutUs;
