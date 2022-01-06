import React from 'react';
import './header.css';
import { Link } from 'react-router-dom';
import logo from '../logo.png';
import { Navbar, Container, Nav, NavDropdown } from 'react-bootstrap';
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
      {/* <div className="headerheader1 headerscreen">
        <div className="headergroup-container" style={{ position: 'fixed' }}>
          <div className="headergroup-13">
            <Link to="/">
              <img src={logo} alt="sorry" style={{ width: '20vw' }} />
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
      </div> */}
      <Navbar
        // bg="light"
        expand="lg"
        className="headergroup-container"
        style={{ position: 'fixed', background: 'white' }}
      >
        <Container>
          <Navbar.Brand href="/" id="logo">
            <img src={logo} alt="sorry" style={{ width: '10vw' }} />
          </Navbar.Brand>

          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="d-flex">
              <Nav.Link href="/" className="headertitle headersdcompsans-clt-normal-chicago-25px">
                {intro}
              </Nav.Link>
              <Nav.Link href="/ourwork" className="headertext_label headernotosanskr-normal-chicago-25px">
                {text_Label}
              </Nav.Link>
              <Nav.Link href="/portfolio" className="headertext_label-1 headernotosanskr-normal-chicago-25px">
                {text_Label2}
              </Nav.Link>
              <Nav.Link href="/about" className="headerabout-us headersdcompsans-clt-normal-chicago-25px">
                {aboutUs}
              </Nav.Link>
              <Nav.Link href="/contact" className="headercontact-us headersdcompsans-clt-normal-chicago-25px">
                {contactUs}
              </Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <div className="headergroup-container" style={{ position: 'inherit', visibility: 'hidden' }}></div>
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
