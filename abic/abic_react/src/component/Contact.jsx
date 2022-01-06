import React, { Component } from 'react';
import './contact.css';
class Contact extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        <div class="bg">
          <span class="Contact-Us">Contact Us</span>
          <div class="Line"></div>

          <span class="Contact-Us">Contact Us</span>

          <span>구분</span>

          <div class="Rectangle"></div>

          <span>성명</span>

          <div class="Rectangle"></div>

          <span>이메일</span>

          <div class="Rectangle"></div>

          <span>내용</span>

          <div class="Rectangle"></div>

          <span>문의하기</span>
          <div class="Rectangle"></div>

          <div class="Line"></div>

          <span class="Location">Location</span>

          <span class="\-">본사: 경기도 성남시 수정구 대왕판교로 815, 창업존 기업지원허브 722호</span>

          {/* <!-- jpg -->  */}
          <img
            src="img/map.jpg"
            srcset="img/map@2x.jpg 2x, 
 img/map@3x.jpg 3x"
            class="map"
          />
          {/* <!-- png -->  */}
          <img
            src="img/map.png"
            srcset="img/map@2x.png 2x, 
 img/map@3x.png 3x"
            class="map"
          />
          {/* <!-- webp -->  */}
          <img
            src="img/map.webp"
            srcset="img/map@2x.webp 2x, 
 img/map@3x.webp 3x"
            class="map"
          />

          {/* <!-- png -->  */}
          <img
            src="img/ic-location.png"
            srcset="img/ic-location@2x.png 2x, 
 img/ic-location@3x.png 3x"
            class="ic_location"
          />
          {/* <!-- svg -->  */}
          <img src="img/ic-location.svg" class="ic_location" />
          {/* <!-- webp -->  */}
          <img
            src="img/ic-location.webp"
            srcset="img/ic-location@2x.webp 2x, 
 img/ic-location@3x.webp 3x"
            class="ic_location"
          />
        </div>
      </div>
    );
  }
}

export default Contact;
