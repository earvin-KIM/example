import React, { useEffect } from 'react';
import AOS from 'aos';
import './abic.css';
import learnmore_btn from '../Learn More_btn.png';
import image_1 from '../ir____________________________gd.png';
import slide1 from '../slide2.JPG';
import slide2 from '../slide3.JPG';
import slide3 from '../slide4.JPG';
import slide4 from '../easy.png';
import slide5 from '../graph.png';
import slide0 from '../slide1.JPG';
import 'aos/dist/aos.css';

function ABIC(props) {
  useEffect(() => {
    AOS.init({
      duration: 1000,
      mirror: true,
      once: false,
    });
  });
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
        <img data-aos="fade-up" className="abicimage_1" src={image_1} />
        <img data-aos="fade-up" className="abicimage_2" src={slide1} data-aos="fade-up" />
        <img data-aos="fade-up" className="abicimage_2" src={slide2} />
        <img data-aos="fade-up" className="abicimage_2" src={slide3} />
        <img data-aos="fade-up" className="abicimage_2" src={slide5} />
        <img data-aos="fade-up" className="abicimage_2" src={slide4} />

        <img data-aos="fade-up" className="abicimage_2" src={slide0} />
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
