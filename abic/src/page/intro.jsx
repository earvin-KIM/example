import React from 'react';
import intro1 from '../img/sli1.PNG';
import intro2 from '../img/sli2.PNG';
import intro3 from '../img/sli3.PNG';
import intro4 from '../img/sli4.PNG';
import intro5 from '../img/sli5.PNG';
import intro6 from '../img/sli6.png';
import './intro.css';
import AOS from 'aos';
import 'aos/dist/aos.css';
AOS.init({ mirror: true, delay: 300 });
function Intro() {
  return (
    <>
      <div id="intro">
        <div className="introimg ">
          <img src={intro1} alt="대표 이미지" />
          <a href="#">
            <button className="gotoservice btn btn-primary">서비스 받기</button>
          </a>
        </div>

        <div data-aos="fade-in" data-aos-duration="300" className="introimg one ">
          <img src={intro2} alt="업무내용" />
        </div>
        <div data-aos="fade-in" data-aos-duration="300" className="introimg two">
          <img src={intro3} alt="등장배경1" />
        </div>
        <div data-aos="fade-in" data-aos-duration="300" className="introimg three">
          <img src={intro4} alt="등장배경2" />
        </div>
        <div data-aos="fade-in" data-aos-duration="300" className="introimg four">
          <img src="{intro5}" alt="Why abic" />
        </div>
        <div data-aos="fade-in" data-aos-duration="300" className="introimg five">
          <img src={intro6} alt="감정곡선" />
        </div>
        <div data-aos="fade-in" data-aos-duration="300" className="introimg six">
          <img src={intro5} alt="에이빅목표" />
          <a href="#">
            <button className="gotoservice btn btn-primary">서비스 받기</button>
          </a>
        </div>
      </div>
    </>
  );
}

export default Intro;
