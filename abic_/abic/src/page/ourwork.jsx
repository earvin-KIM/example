import React from 'react';
import './ourwork.css';
import overlapGroup1 from '../bg_sol_1.png';
function OurWork(props) {
  const { text_Label3 = '신사업 경영 컨설팅 솔루션' } = props;

  return (
    <div className="ourworkoverlap-group1" style={{ backgroundImage: `url(${overlapGroup1})` }}>
      <h1 className="ourworktext_label-2 ourworknotosanskr-normal-white-80px">{text_Label3}</h1>
    </div>
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
