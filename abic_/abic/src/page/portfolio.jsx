import React from 'react';
import './portfolio.css';
import overlapGroup1 from '../bg_sol_2.png';

function Porfolio(props) {
  const {
    group6 = 'abic-group-6.png',
    group9 = 'our-work-group-9.png',
    group12 = 'group-12.png',
    group3 = 'contact-us-group-3-1.png',
    intro = 'Intro',
    text_Label = '신사업 경영 컨설팅 솔루션',
    text_Label2 = '주요 솔루션',
    aboutUs = 'About Us',
    contactUs = 'Contact Us',
    text_Label3 = '주요 솔루션',
  } = props;

  return (
    <div className="portfoliocontainer-center-horizontal">
      <div className="portfolioporfolio portfolioscreen">
        <div className="portfoliooverlap-group1" style={{ backgroundImage: `url(${overlapGroup1})` }}>
          <h1 className="portfoliotext_label-2 portfolionotosanskr-normal-white-80px">주요 솔루션</h1>
        </div>
      </div>
    </div>
  );
}

// const porfolioData = {
//   group6= 'abic-group-6.png',
//   group9= 'our-work-group-9.png',
//   group12= 'group-12.png',
//   group3= 'contact-us-group-3-1.png',
//   intro= 'Intro',
//   text_Label= '신사업 경영 컨설팅 솔루션',
//   text_Label2= '주요 솔루션',
//   aboutUs= 'About Us',
//   contactUs= 'Contact Us',
//   overlapGroup1= 'rectangle.png',
//   text_Label3= '주요 솔루션',
// };
export default Porfolio;
