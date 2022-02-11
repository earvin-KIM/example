import React from 'react';
import slide2 from '../slide6.JPG';
import './ourwork.css';
import overlapGroup1 from '../bg_sol_1.png';
import slide5 from '../business.png';
import slide6 from '../slide8.JPG';
import slide7 from '../slide9.JPG';
import '../../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { Tab, Tabs } from 'react-bootstrap';
function OurWork(props) {
  const { text_Label3 = '신사업 경영 컨설팅 솔루션' } = props;

  return (
    <>
      <div className="wrapper" style={{ width: '85vw', margin: '10vw auto' }}>
        <h1>신사업 기획 컨설팅 서비스</h1>
        <div>
          <Tabs defaultActiveKey="home" id="uncontrolled-tab-example" className="mb-3">
            <Tab eventKey="home" title="서비스 소개">
              <img src={slide5} className="abicimage_2" alt="" srcset="" />
              <h1>ABIC 서비스 프로세스</h1>
              <br />
              <h2>0. 사업모델 개요/유형 판단</h2>
              <h2>1. 1단계 : TAM/SAM 시장 정의 및 추정</h2>
              <h2>2. 2단계 : 초기거점시장(SOM)정의 및 추정</h2>
            </Tab>
            <Tab eventKey="profile" title="서비스 필요성"></Tab>
            <Tab eventKey="contact" title="고객층"></Tab>
          </Tabs>
        </div>
      </div>
    </>
  );
}

// const ourWorkData = {
//   group6: 'abic-group-6.png',
//   group9: 'group-9.png',
//   group12: 'porfolio-group-12.png',
//   group3: 'contact-us-group-3-1.png',
//   intro: 'Intro',
//   text_Label: '신사업 경영 컨설팅 솔루션',
//   text_Label2: '주요 솔루션',
//   aboutUs: 'About Us',
//   contactUs: 'Contact Us',
//   overlapGroup1: 'rectangle.png',
//   text_Label3: '신사업 경영 컨설팅 솔루션',
// };
export default OurWork;
