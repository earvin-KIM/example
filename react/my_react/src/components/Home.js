import React, { Component } from 'react';
import { Carousel } from 'react-bootstrap';
import slideimg1 from './img/banner11.png';
import slideimg2 from './img/banner12.png';
import slideimg3 from './img/banner13.png';
import plan from './img/main1_plan.png';
import deliv from './img/main1_deliv.png';
import design from './img/main1_design.png';
import struct from './img/main1_struct.png';
import line from './img/about us/about_line.png';
import about from './img/main2_contents2.png';
import optimized from './img/main2_contents3.png';
import where from './img/main2_contents4.png';
import bottom from './img/footer.png';
var slide_cunt = 1;
class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      slideimg: [
        <img src={slideimg1} style={{ width: '100%' }} />,
        <img src={slideimg2} style={{ width: '100%' }} />,
        <img src={slideimg3} style={{ width: '100%' }} />,
      ],
      slideimgshow: <img src={slideimg1} style={{ width: '100%' }} />,
    };
  }

  render() {
    return (
      <div className="content-wrapper">
        <section className="content">
          <Carousel>
            <Carousel.Item interval={2000}>
              <img className="d-block w-100" src={slideimg1} alt="First slide" />
            </Carousel.Item>
            <Carousel.Item interval={2000}>
              <img className="d-block w-100" src={slideimg2} alt="Second slide" />
            </Carousel.Item>
            <Carousel.Item interval={2000}>
              <img className="d-block w-100" src={slideimg3} alt="Third slide" />
            </Carousel.Item>
          </Carousel>

          <div id="service">
            <img src={plan} style={{ width: '24%', margin: '0.5%' }} />
            <img src={deliv} style={{ width: '24%', margin: '0.5%' }} />
            <img src={struct} style={{ width: '24%', margin: '0.5%' }} />
            <img src={design} style={{ width: '24%', margin: '0.5%' }} />
          </div>
          <img src={line} style={{ width: '100%' }} />
          <div id="contents">
            <img src={about} style={{ width: '100%' }} />
            <img src={optimized} style={{ width: '100%' }} />
            <img src={where} style={{ width: '100%' }} />
          </div>
          <img src={bottom} style={{ width: '100%' }} />
        </section>
      </div>
    );
  }
}
export default Home;
