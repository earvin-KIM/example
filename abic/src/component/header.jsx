import React from 'react';
import { Link } from 'react-router-dom';
import logo from '../img/aboutus/aboutus-logo.png';
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
      <Navbar id="navbar" collapseOnSelect expand="lg">
        <Container id="contain">
          <Navbar.Brand href="/" id="logo">
            <img id="logo1" src={logo} alt="logo" />
          </Navbar.Brand>

          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="d-flex">
              <Nav.Link href="/" id="intro_link">
                Intro
              </Nav.Link>
              <Nav.Link href="/service">Service</Nav.Link>
              <Nav.Link href="/solution">Solution</Nav.Link>
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
