import React, { Component } from 'react';
import './Footer.css';
import btn_facebook from './img/btn_facebook.png';
import btn_insta from './img/btn_insta.png';
import btn_blog from './img/btn_blog.png';

class Footer extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        <div className="Footer_bg">
          <span className="\-">대표: 이건호ㅣ사업자 번호:</span>

          <span className="wwwabicptrs-COPYTRI">www.abicptrs COPYTRIGHT@2021 ABIC PARTNERS ALL RIGHTS RESERVED.</span>
          <span>123-456-7890</span>
          <span className="fkfkflgabptrscom">fkfkflg@abptrs.com</span>
          <span className="-\381">경기도 성남시 수정구 대왕판교로 815, 창업존 기업지원허브 722호</span>
          {/* <!-- png -->  */}
          <img
            src={btn_facebook}
            srcset="./img/btn-facebook@2x.png 2x, 
 img/btn-facebook@3x.png 3x"
            className="btn_facebook"
          />
          {/* <!-- svg --> 
          <img src="./img/btn-facebook.svg" className="btn_facebook" />
          {/* <!-- webp -->  */}
          {/* <img
            src="./img/btn-facebook.webp"
            srcset="./img/btn-facebook@2x.webp 2x, 
 img/btn-facebook@3x.webp 3x"
            className="btn_facebook"
          /> */}
          {/* <!-- svg -->  */}
          {/* <img src="./img/btn-insta.svg" className="btn_insta" /> */}
          {/* <!-- png -->  */}
          <img
            src={btn_insta}
            srcset="./img/btn-insta@2x.png 2x, 
 img/btn-insta@3x.png 3x"
            className="btn_insta"
          />
          {/* <!-- webp -->  */}
          {/* <img
            src="./img/btn-insta.webp"
            srcset="./img/btn-insta@2x.webp 2x, 
 img/btn-insta@3x.webp 3x"
            className="btn_insta"
          /> */}
          {/* <!-- svg -->  */}
          {/* <img src="./img/btn-blog.svg" className="btn_blog" /> */}
          {/* <!-- png -->  */}
          <img
            src={btn_blog}
            srcset="./img/btn-blog@2x.png 2x, 
 img/btn-blog@3x.png 3x"
            className="btn_blog"
          />
          {/* <!-- webp -->  */}
          {/* <img
            src="./img/btn-blog.webp"
            srcset="./img/btn-blog@2x.webp 2x, 
 img/btn-blog@3x.webp 3x"
            className="btn_blog"
          /> */}
        </div>
      </div>
    );
  }
}

export default Footer;
