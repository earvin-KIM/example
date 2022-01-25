import React, { Component } from 'react';
import logo from './img/header_logo-top.png';
import headertel from './img/header_tel.png';
import headergb from './img/header_goodbox.png';
import headerb from './img/header_blog.png';

class Nav_top extends Component {
  render() {
    return (
      <div>
        <nav
          className="navbar nav-default"
          style={{
            position: 'fixed',
            background: 'white',
            width: '100%',
          }}
        >
          <div className="container-fluid">
            <a
              href="#"
              onClick={function (e) {
                e.preventDefault();
                this.props.pagemode('home');
              }.bind(this)}
            >
              <img src={logo} />
            </a>
            <ul className="nav">
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('about_us');
                  }.bind(this)}
                >
                  ABOUT US
                </a>
              </li>
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('our_work');
                  }.bind(this)}
                >
                  OUR WORK
                </a>
              </li>
              <li className="nav-item">
                <a
                  href="#"
                  className="nav-link"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('portfolio');
                  }.bind(this)}
                >
                  PORTFOLIO
                </a>
              </li>
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('contact_us');
                  }.bind(this)}
                >
                  CONTACT US
                </a>
              </li>
            </ul>
            <ul className="nav navbar_nav navbar-right">
              <li style={{ margin: '5px' }}>
                <img src={headertel} />
              </li>

              <li style={{ margin: '5px' }}>
                <img src={headergb} />
              </li>
              <li style={{ margin: '5px' }}>
                <img src={headerb} />
              </li>
            </ul>
          </div>
        </nav>
        <nav className="navbar nav-default">
          {' '}
          <div className="container-fluid">
            <a
              href="#"
              onClick={function (e) {
                e.preventDefault();
                this.props.pagemode('home');
              }.bind(this)}
            >
              <img src={logo} />
            </a>
            <ul className="nav">
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('about_us');
                  }.bind(this)}
                >
                  ABOUT US
                </a>
              </li>
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('our_work');
                  }.bind(this)}
                >
                  OUR WORK
                </a>
              </li>
              <li className="nav-item">
                <a
                  href="#"
                  className="nav-link"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('portfolio');
                  }.bind(this)}
                >
                  PORTFOLIO
                </a>
              </li>
              <li className="nav-item">
                <a
                  className="nav-link"
                  href="#"
                  onClick={function (e) {
                    e.preventDefault();
                    this.props.pagemode('contact_us');
                  }.bind(this)}
                >
                  CONTACT US
                </a>
              </li>
            </ul>
            <ul className="nav navbar_nav navbar-right">
              <li style={{ margin: '5px' }}>
                <img src={headertel} />
              </li>

              <li style={{ margin: '5px' }}>
                <img src={headergb} />
              </li>
              <li style={{ margin: '5px' }}>
                <img src={headerb} />
              </li>
            </ul>
          </div>
        </nav>
      </div>
    );
  }
}
export default Nav_top;
