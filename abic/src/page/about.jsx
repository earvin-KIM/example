import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import './about.css';
import about_01_Main from '../img/aboutus/aboutus01/abouus_01_letter.png';

import text_02_Maintext from '../img/aboutus/aboutus02/aboutus_02_letter.png';
import text_02_mission_description from '../img/aboutus/aboutus02/aboutus_02_letter2.png';
import text_02_vison_description from '../img/aboutus/aboutus02/aboutus_02_letter3.png';
import about_02_line from '../img/aboutus/aboutus02/aboutus_02_line.png';
import text_03_below_arrow from '../img/aboutus/text_5.png';
import about_04_ceo_pic from '../img/aboutus/aboutus03/abouus_03_img.png';
import text_04_greet from '../img/aboutus/aboutus03/abouus_03_letter.png';
import text_04_greeting from '../img/aboutus/aboutus03/abouus_03_letter2.png';
import text_04_ceo from '../img/aboutus/aboutus03/abouus_03_letter3.png';
import text_05_certifi from '../img/aboutus/aboutus04/abouus_04_letter.png';
import about_05_pic1 from '../img/aboutus/aboutus04/abouus_04_img.png';
import about_05_pic2 from '../img/aboutus/aboutus04/abouus_04_square.png';

import scroll from '../img/service/service-scroll.png';
import side_line from '../img/intro/intro_01_sideline1.png';

import { Container, Row, Col } from 'react-bootstrap';
function AboutUs() {
  return (
    <>
      <nav id="navbar-example3">
        <a className="nav-link serlink" href="#list-item-1">
          Main <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-2">
          Mission
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          Greetings
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          Certification{/* Partner&Team */}
          <img className="side_nav" src="" alt="" />
        </a>
        <img src={side_line} alt="" className="side_line" />
      </nav>
      <div className="about_us">
        <img id="scroll_img" src={scroll} />
        <div className="about about_intro chapter" id="list-item-1">
          <img id="scroll_img" src={scroll} />
          <img
            src={about_01_Main}
            alt=""
            style={{ position: 'absolute', width: '30%', top: '35%', left: '50%', transform: 'translateX(-50%)' }}
          />
        </div>
        <div className="about_outer">
          <div className="about chapter" id="list-item-2">
            <img
              src={text_02_Maintext}
              alt=""
              style={{ position: 'absolute', width: '40%', top: '15%', left: '50%', transform: 'translateX(-50%)' }}
            />{' '}
            <img
              src={about_02_line}
              alt=""
              style={{ position: 'absolute', height: '30%', top: '60%', left: '50%', transform: 'translateX(-50%)' }}
            />
            <img
              src={text_02_mission_description}
              alt=""
              style={{ position: 'absolute', width: '25%', top: '60%', left: '15%' }}
            />
            <img
              src={text_02_vison_description}
              alt=""
              style={{ position: 'absolute', width: '30%', top: '60%', right: '12%' }}
            />
          </div>
        </div>
        <div className="about cer chapter" id="list-item-4">
          <img
            src={about_04_ceo_pic}
            alt=""
            style={{ position: 'absolute', width: 'auto', height: '80%', top: '5%', right: '10%' }}
          />
          <img
            src={text_04_greet}
            alt=""
            style={{ position: 'absolute', height: '7%', width: 'auto', top: '5%', left: '10%' }}
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
          <img
            src={text_05_certifi}
            alt=""
            style={{ position: 'absolute', width: '5%', top: '7%', left: '50%', transform: 'translateX(-50%)' }}
          />
          <img
            src={about_05_pic1}
            alt=""
            style={{
              position: 'absolute',
              height: '70%',
              top: '20%',
              left: '50%',
              transform: 'translateX(-50%)',
              zIndex: '2',
            }}
          />
          <img
            src={about_05_pic2}
            alt=""
            style={{ position: 'absolute', height: '80%', top: '15%', left: '50%', transform: 'translateX(-50%)' }}
          />
        </div>
      </div>
    </>
  );
}

export default AboutUs;
