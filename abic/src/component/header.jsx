import React from 'react';
import { Link } from 'react-router-dom';
import logo from '../img/logo.png';
import { Navbar, Container, Nav, NavDropdown } from 'react-bootstrap';
import './header.css';

function Header() {
  return (
    <>
      <Navbar id="navbar">
        <Container>
          <Navbar.Brand href="/" id="logo">
            <img id="logo" src={logo} alt="logo" />
          </Navbar.Brand>

          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="d-flex">
              <Nav.Link href="/">Intro</Nav.Link>
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
