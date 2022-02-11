import React, { Component } from 'react';
import about_content1 from './img/about us/about_contents01.png';
import about_content2 from './img/about us/about_contents02.png';
import about_content6 from './img/about us/about_footer_upper.png';
import about_content4 from './img/about us/about_history01.png';
import about_content5 from './img/about us/about_history02.png';
import about_head from './img/about us/about_intro_banner.png';
import about_content3 from './img/about us/about_line.png';
import AOS from 'aos';
import 'aos/dist/aos.css';

class About_us extends Component {
  render() {
    return (
      <div className="content-wrapper">
        <section className="content">
          <img src={about_head} style={{ width: '100%' }} />
          <img data-aos="fade-up" src={about_content1} style={{ width: '100%' }} />
          <img src={about_content2} style={{ width: '100%' }} />
          <img src={about_content3} style={{ width: '100%' }} />
          <img src={about_content4} style={{ width: '100%' }} />
          <img src={about_content5} style={{ width: '100%' }} />
          <img src={about_content6} style={{ width: '100%' }} />
        </section>
      </div>
    );
  }
}
export default About_us;
