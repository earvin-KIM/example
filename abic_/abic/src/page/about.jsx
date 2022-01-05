import React from 'react';
import './about.css';
import line22 from '../line.png';
import overlapGroup from '../bg_history.png';

import bitmap from '../profile_ceo.png';
function AboutUs(props) {
  const {
    title = 'About Us',
    line = 'contact-us-line-1.png',
    visionMission = 'Vision & Mission',
    iMAParagraphCli = "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
    line2 = 'contact-us-line-1.png',
    ceo = 'CEO',
    text_Label3 = '이 건호',
    iMAParagraphCli2 = "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",

    oval2 = 'oval-1.png',
    oval3 = 'oval-1.png',
    oval4 = 'oval-1.png',
    oval5 = 'oval-1.png',
    oval6 = 'oval-1.png',
    text_Label4 = '연혁',
    number = '2021',
    phone = '2021.02',
    abic = 'ABIC 설립',
    abic2 = 'ABIC 설립',
    phone2 = '2021.04',
    number2 = '2020',
    authorizedCertifica = 'Authorized certification',
    iMAParagraphCli3 = "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
    line3 = 'contact-us-line-1.png',
    partner = 'Partner',
    iMAParagraphCli4 = "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
  } = props;

  return (
    <div className="aboutcontainer-center-horizontal">
      <div className="aboutaboutus aboutscreen">
        <div className="aboutflex-col">
          <h1 className="abouttitle aboutsdcompsans-clt-normal-chicago-120px">{title}</h1>
          <img className="aboutline" src={line} />
          <div className="aboutflex-col-item aboutsdcompsans-emd-normal-chicago-60px">{visionMission}</div>
          <div className="aboutflex-col-1">
            <div className="aboutim-a-paragraph-cli aboutsdcompsans-emd-normal-chicago-30px">{iMAParagraphCli}</div>
            <img className="aboutline-1" src={line2} />
            <hr></hr>
          </div>
          <div className="aboutflex-col-item aboutsdcompsans-emd-normal-chicago-60px">{ceo}</div>
        </div>
        <div className="aboutflex-row">
          <div className="aboutflex-col-2">
            <div className="abouttext_label-2 aboutnotosanskr-medium-chicago-30px">{text_Label3}</div>
            <div className="aboutim-a-paragraph-cli-1 aboutsdcompsans-emd-normal-chicago-30px">{iMAParagraphCli2}</div>
          </div>
          <div className="aboutgroup-1">
            <img className="aboutbitmap" src={bitmap} />
          </div>
        </div>
        <div className="aboutoverlap-group2">
          <div className="aboutoverlap-group" style={{ backgroundImage: `url(${overlapGroup})` }}>
            <img className="aboutline-2" src={line22} />
            {/* <img className="aboutoval" src="oval.png" />
            <img className="aboutoval-1" src={oval2} />
            <img className="aboutoval-2" src={oval3} />
            <img className="aboutoval-3" src={oval4} />
            <img className="aboutoval-4" src={oval5} />
            <img className="aboutoval-5" src={oval6} /> */}
          </div>
          <div className="abouttext_label-3">{text_Label4}</div>
          <div className="aboutnumber aboutnotosanskr-bold-white-30px">{number}</div>
          <div className="aboutphone aboutnotosanskr-medium-celeste-30px">{phone}</div>
          <div className="aboutabic aboutnotosanskr-medium-white-30px">{abic}</div>
          <div className="aboutabic-1 aboutnotosanskr-medium-white-30px">{abic2}</div>
          <div className="aboutphone-1 aboutnotosanskr-medium-celeste-30px">{phone2}</div>
          <div className="aboutnumber-1 aboutnotosanskr-bold-white-30px">{number2}</div>
        </div>
        <div className="aboutauthorized-certifica aboutsdcompsans-emd-normal-chicago-60px">{authorizedCertifica}</div>
        <div className="aboutflex-col-3">
          <div className="aboutim-a-paragraph-cli aboutsdcompsans-emd-normal-chicago-30px">{iMAParagraphCli3}</div>
          <div className="aboutflex-row-1">
            <div className="aboutrectangle-1"></div>
            <div className="aboutrectangle"></div>
            <div className="aboutrectangle"></div>
          </div>
          <img className="aboutline-3" src={line3} />
        </div>
        <div className="aboutpartner aboutsdcompsans-emd-normal-chicago-60px">{partner}</div>
        <div className="aboutflex-col-4">
          <div className="aboutim-a-paragraph-cli-2 aboutsdcompsans-emd-normal-chicago-30px">{iMAParagraphCli4}</div>
          <div className="aboutflex-row-2">
            <div className="aboutrectangle-2"></div>
            <div className="aboutrectangle-3"></div>
            <div className="aboutrectangle-4"></div>
          </div>
        </div>
      </div>
    </div>
  );
}

// const aboutUsData = {
//   group6= 'abic-group-6.png',
//   group9= 'our-work-group-9.png',
//   group12= 'porfolio-group-12.png',
//   group3= 'contact-us-group-3-1.png',
//   intro= 'Intro',
//   text_Label= '신사업 경영 컨설팅 솔루션',
//   text_Label2= '주요 솔루션',
//   aboutUs= 'About Us',
//   contactUs= 'Contact Us',
//   title= 'About Us',
//   line= 'contact-us-line-1.png',
//   visionMission= 'Vision & Mission',
//   iMAParagraphCli=
//     "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
//   line2= 'contact-us-line-1.png',
//   ceo= 'CEO',
//   text_Label3= '이 건호',
//   iMAParagraphCli2=
//     "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
//   bitmap= 'bitmap.png',
//   overlapGroup= 'bg5.png',
//   line22= 'line-2-1.png',
//   oval2= 'oval-1.png',
//   oval3= 'oval-1.png',
//   oval4= 'oval-1.png',
//   oval5= 'oval-1.png',
//   oval6= 'oval-1.png',
//   text_Label4= '연혁',
//   number= '2021',
//   phone= '2021.02',
//   abic= 'ABIC 설립',
//   abic2= 'ABIC 설립',
//   phone2= '2021.04',
//   number2= '2020',
//   authorizedCertifica= 'Authorized certification',
//   iMAParagraphCli3=
//     "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
//   line3= 'contact-us-line-1.png',
//   partner= 'Partner',
//   iMAParagraphCli4=
//     "I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you like on your page. I’m a great place for you to tell a story and let your users know a little more about you.",
// };
export default AboutUs;
