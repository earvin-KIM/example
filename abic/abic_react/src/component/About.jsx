import React, { Component } from 'react';

class About extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        <div className="bg">
          <span className="About-Us">About Us</span> <div className="Line"></div>
          <span className="Vision-Mission">Vision & Mission</span>
          <span className="Im-a-paragraph-Cli">
            I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double
            click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you
            like on your page. I’m a great place for you to tell a story and let your users know a little more about
            you.
          </span>
          <div className="Line"></div>
          <span className="CEO">CEO</span>
          <span className="\-">이 건호</span>
          {/* <!-- png -->  */}
          <img
            src="img/profile-ceo.png"
            srcset="img/profile-ceo@2x.png 2x, 
 img/profile-ceo@3x.png 3x"
            className="profile_ceo"
          />
          {/* <!-- jpg -->  */}
          <img
            src="img/profile-ceo.jpg"
            srcset="img/profile-ceo@2x.jpg 2x, 
 img/profile-ceo@3x.jpg 3x"
            className="profile_ceo"
          />
          {/* <!-- webp -->  */}
          <img
            src="img/profile-ceo.webp"
            srcset="img/profile-ceo@2x.webp 2x, 
 img/profile-ceo@3x.webp 3x"
            className="profile_ceo"
          />
          <span className="Im-a-paragraph-Cli">
            I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double
            click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you
            like on your page. I’m a great place for you to tell a story and let your users know a little more about
            you.
          </span>
          {/* <!-- png -->  */}
          <img
            src="img/bg-history.png"
            srcset="img/bg-history@2x.png 2x, 
 img/bg-history@3x.png 3x"
            className="bg_history"
          />
          {/* <!-- svg -->  */}
          <img src="img/bg-history.svg" className="bg_history" />
          {/* <!-- webp -->  */}
          <img
            src="img/bg-history.webp"
            srcset="img/bg-history@2x.webp 2x, 
 img/bg-history@3x.webp 3x"
            className="bg_history"
          />
          <span className="History">History</span>
          <span>2021</span>
          <span>2020</span>
          {/* <!-- png -->  */}
          <img
            src="img/line.png"
            srcset="img/line@2x.png 2x, 
 img/line@3x.png 3x"
            className="line"
          />
          {/* <!-- svg -->  */}
          <img src="img/line.svg" className="line" />
          {/* <!-- webp -->  */}
          <img
            src="img/line.webp"
            srcset="img/line@2x.webp 2x, 
 img/line@3x.webp 3x"
            className="line"
          />
          <span>2021.02</span>
          <span className="ABIC-">ABIC 설립</span>
          <span>2021.04</span>
          <span className="ABIC-">ABIC 설립</span>
          <span className="Authorized-certifica">Authorized certification</span>
          <span className="Im-a-paragraph-Cli">
            I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double
            click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you
            like on your page. I’m a great place for you to tell a story and let your users know a little more about
            you.
          </span>
          <div className="Rectangle"></div>
          <div className="Rectangle"></div>
          <div className="bg"></div>
          <div className="Line"></div>
          <span className="Partner">Partner</span>
          <span className="Im-a-paragraph-Cli">
            I'm a paragraph. Click here to add your own text and edit me. It’s easy. Just click “Edit Text” or double
            click me to add your own content and make changes to the font. Feel free to drag and drop me anywhere you
            like on your page. I’m a great place for you to tell a story and let your users know a little more about
            you.
          </span>
          <div className="Rectangle"></div>
          <div className="Rectangle"></div>
        </div>
      </div>
    );
  }
}

export default About;
