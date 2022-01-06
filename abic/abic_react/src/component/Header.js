import React, { Component } from 'react';
import './Header.css';
import { Link } from 'react-router-dom';
class Header extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        {/* <Router> */}
        <div className="Header_bg">
          <Link to="/">
            <span className="Intro">Intro</span>
          </Link>
          <Link to="/new_sol">
            <span className="\-">신사업 경영 컨설팅 솔루션</span>
          </Link>
          <Link to="/im_sol">
            <span className="\=">주요 솔루션</span>
          </Link>
          <Link to="/about">
            <span className="About-Us">About Us</span>
          </Link>
          <Link to="/contact">
            <span className="Contact-Us">Contact Us</span>
          </Link>
        </div>
        {/* </Router> */}
      </div>
    );
  }
}

export default Header;
