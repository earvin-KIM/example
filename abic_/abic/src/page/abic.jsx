import React from 'react';
import './abic.css';
import learnmore_btn from '../Learn More_btn.png';
import image_1 from '../image_intro.png';

function ABIC(props) {
  const {
    text_Label3 = '내 손 안의 컨설턴트',
    spanText = 'A',
    spanText2 = (
      <>
        I Based Business
        <br />
        Insight Consulting
      </>
    ),
    text_Label4 = (
      <>
        데이터셋을 활용하여 <br />
        인사이트를 제공하는 <br />
        NEW BUSINESS BUILD 플랫폼
      </>
    ),
    text_Label5 = (
      <>
        데이터셋을 활용하여 <br />
        인사이트를 제공하는 <br />
        NEW BUSINESS BUILD 플랫폼
      </>
    ),
    learnMore = 'Learn More',
  } = props;

  return (
    <div className="abiccontainer-center-horizontal">
      <div className="abicabic abicscreen">
        {/* <div className="abicoverlap-group1">
          <div className="abicgroup-container">
            <div className="abicgroup-6" style={{ backgroundImage: `url(${group6})` }}></div>
            <div className="abicgroup-9" style={{ backgroundImage: `url(${group9})` }}></div>
            <div className="abicgroup-12" style={{ backgroundImage: `url(${group12})` }}></div>
            <div className="abicgroup-3" style={{ backgroundImage: `url(${group3})` }}></div>
          </div>
          <div className="abicabout-us sdcompsans-clt-normal-chicago-25px">{aboutUs}</div>
          <div className="abiccontact-us sdcompsans-clt-normal-chicago-25px">{contactUs}</div>
          <div className="abictext_label-1 notosanskr-normal-chicago-25px">{text_Label}</div>
          <div className="abictext_label-2 notosanskr-normal-chicago-25px">{text_Label2}</div>
          <div className="abicintro sdcompsans-clt-normal-chicago-25px">{intro}</div>
        </div> */}
        <div className="abictext_label-3 abicnotosanskr-medium-chicago-30px">{text_Label3}</div>
        <div className="abicflex-row">
          <h1 className="abicai-based-business-in">
            <span className="abicspan1">{spanText}</span>
            <span className="abicspan2">{spanText2}</span>
          </h1>
          <div className="abicflex-col">
            <div className="abictext_label-container abicnotosanskr-light-chicago-20px">
              <div className="abictext_label">{text_Label4}</div>
              <div className="abictext_label">{text_Label5}</div>
            </div>
            <img className="abiclearn-more_btn" src={learnmore_btn} />
          </div>
        </div>
        <img className="abicimage_1" src={image_1} />
      </div>
    </div>
  );
}

// const aBICData = {
//   group6= 'group-6.png',
//   group9= 'our-work-group-9.png',
//   group12= 'porfolio-group-12.png',
//   group3= 'contact-us-group-3-1.png',
//   aboutUs= 'About Us',
//   contactUs= 'Contact Us',
//   text_Label= '주요 솔루션',
//   text_Label2= '신사업 경영 컨설팅 솔루션',
//   intro= 'Intro',
//   text_Label3= '내 손 안의 컨설턴트',
//   spanText= 'A',
//   spanText2= (
//     <>
//       I Based Business
//       <br />
//       Insight Consulting
//     </>
//   ),
//   text_Label4= (
//     <>
//       데이터셋을 활용하여 <br />
//       인사이트를 제공하는 <br />
//       NEW BUSINESS BUILD 플랫폼
//     </>
//   ),
//   text_Label5= (
//     <>
//       데이터셋을 활용하여 <br />
//       인사이트를 제공하는 <br />
//       NEW BUSINESS BUILD 플랫폼
//     </>
//   ),
//   learnMore= 'Learn More',
//   image_1= 'image1.jpg',
// };
export default ABIC;
