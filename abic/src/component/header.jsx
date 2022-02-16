import React from 'react';
import { Link } from 'react-router-dom';
import logo from '../img/logo.png';
import { Navbar, Container, Nav, NavDropdown } from 'react-bootstrap';
import './header.css';
import jQuery from 'jquery';
import $ from 'jquery';
function Header() {
  $(function () {
    var url = window.location.pathname,
      urlRegExp = new RegExp(url.replace(/\/$/, '') + '$');
    if (urlRegExp == '/$/') {
      $('#intro_link').addClass('active');
      console.log(urlRegExp);
      return;
    }
    console.log(urlRegExp);
    $('a').each(function () {
      if (urlRegExp.test(this.href.replace(/\/$/, ''))) {
        $(this).addClass('active');
      }
    });
  });

  return (
    <>
      <Navbar id="navbar" collapseOnSelect expand="lg" bg="light">
        <Container>
          <Navbar.Brand href="/" id="logo">
            <img id="logo" src={logo} alt="logo" />
          </Navbar.Brand>

          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="d-flex">
              <Nav.Link href="/" id="intro_link">
                Intro
              </Nav.Link>
              <Nav.Link href="/service">서비스</Nav.Link>
              <Nav.Link href="/soultion">솔루션</Nav.Link>
              <Nav.Link href="/about">About Us</Nav.Link>
              <Nav.Link href="/contact">Contact Us</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  );
}

export default Header;
