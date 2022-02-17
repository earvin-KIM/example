import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import './about.css';
import about2 from '../img/ceo.jpg';
import about1 from '../img/mission.png';
import about3 from '../img/cer1.png';
import about4 from '../img/cer2.png';
import about5 from '../img/cer3.png';
import about6 from '../img/cer4.png';
import about7 from '../img/cer5.jpg';
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
          대표 소개
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          인증서
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          Partner&Team
          <img className="side_nav" src="" alt="" />
        </a>
      </nav>
      <div className="about_us">
        <img id="scroll_img" src={scroll} />
        <div className="about about_intro chapter" id="list-item-1">
          <img id="scroll_img" src={scroll} />
        </div>

        <div className="about chapter" id="list-item-2">
          <h1>Mission & Vision</h1>
          <img src={about1} alt="미션&비전" />
        </div>

        <div className="about chapter" id="list-item-3">
          <Container>
            <Row>
              <Col>
                <h1>대표 소개</h1>
                <h3>CEO</h3>
                <h3>이건호</h3>
              </Col>
              <Col></Col>
            </Row>
            <Row>
              <Col>
                <p>
                  저는 지난 30여년 간 국내 글로벌 컨설팅회사, 중국 디지털마케팅 회사 등지에서 고객을 위한 전략적
                  인싸이트를 제공하는 일에 종사하였습니다. 이제는 그 노하우를 AI로 구현하여, 4차 산업시대에 들어와
                  중요성이 커지고 있는 스타트업, 중소/중견기업들에게, 점차 복잡해지고 불확실해지는 시장에서 시시각각
                  요구되는 의사결정에 필요한 경영 인싸이트를 신속하고 편리하게 제공하고자 합니다. 이를 통해 신사업이
                  필요한 스타트업, 중소/중견기업들은 적절한 신사업을 찾아가는 지도와 독도법을 제공받게 될 것이며,
                  궁극적으로는 신사업 구상과 기획에 대한 쉽고 빠른 시도를 통해 성공의 가능성을 높이게 될 것입니다.
                  여러분의 많은 관심과 성원 부탁드립니다. 감사합니다.
                </p>
              </Col>

              <Col>
                <img src={about2} alt="대표님 사진" />
              </Col>
            </Row>
          </Container>
        </div>

        <div className="about cer chapter" id="list-item-4">
          <h1>
            Authorized Certification <br />
          </h1>
          <img src={about3} alt="인증서" />
          <img src={about4} alt="인증서" />
          <img src={about5} alt="인증서" />
          <img src={about6} alt="인증서" />
          <img src={about7} alt="인증서" />
        </div>

        <div className="about chapter" id="list-item-5">
          <h1>Partner</h1>
          <img src="" alt="파트너||팀" />
        </div>
      </div>
    </>
  );
}

export default AboutUs;
