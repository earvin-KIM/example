import React from 'react';
import './header.css';
import { Link } from 'react-router-dom';
import logo from '../logo.png';
function Header1(props) {
  const {
    group6 = '../logo.png',
    group9 = 'our-work-group-9.png',
    group12 = 'porfolio-group-12.png',
    group3 = 'contact-us-group-3-1.png',
    intro = 'Intro',
    text_Label = '신사업 경영 컨설팅 솔루션',
    text_Label2 = '주요 솔루션',
    aboutUs = 'About Us',
    contactUs = 'Contact Us',
  } = props;

  return (
    <div className="headercontainer-center-horizontal">
      <div className="headerheader1 headerscreen">
        <div className="headergroup-container" style={{ position: 'fixed' }}>
          <div className="headergroup-13">
            {/* <div style={{ backgroundImage: `url(../logo.png)` }}></div> */}
            <Link to="/">
              <img src={logo} alt="sorry" />
            </Link>
          </div>
          <div className="headergroup">
            <Link to="/">
              <h1 className="headertitle headersdcompsans-clt-normal-chicago-25px">{intro}</h1>
            </Link>
            <Link to="/ourwork">
              <div className="headertext_label headernotosanskr-normal-chicago-25px">{text_Label}</div>
            </Link>
            <Link to="/portfolio">
              <div className="headertext_label-1 headernotosanskr-normal-chicago-25px">{text_Label2}</div>
            </Link>
            <Link to="/about">
              <div className="headerabout-us headersdcompsans-clt-normal-chicago-25px">{aboutUs}</div>
            </Link>
            <Link to="/contact">
              <div className="headercontact-us headersdcompsans-clt-normal-chicago-25px">{contactUs}</div>
            </Link>
          </div>
        </div>
        <div className="headergroup-container" style={{ position: 'inherit', visibility: 'hidden' }}></div>
      </div>
    </div>
  );
}

// const header1Data = {
//   group6: 'abic-group-6.png',
//   group9: 'our-work-group-9.png',
//   group12: 'porfolio-group-12.png',
//   group3: 'contact-us-group-3-1.png',
//   intro: 'Intro',
//   text_Label: '신사업 경영 컨설팅 솔루션',
//   text_Label2: '주요 솔루션',
//   aboutUs: 'About Us',
//   contactUs: 'Contact Us',
// };
export default Header1;
