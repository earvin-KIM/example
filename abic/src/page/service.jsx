import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import service_letter from '../img/service/service-b-letter.png';
import serv1 from '../img/service/bg_3.png';
import serv2 from '../img/service/Group_1.png';
import serv3 from '../img/service/Group_2.png';
import serv4 from '../img/service/Group_3.png';
import serv5 from '../img/service/text_1.png';
import serv6 from '../img/service/text_2.png';
import serv7 from '../img/service/text_3.png';
import serv8 from '../img/service/text_4.png';
import serv9 from '../img/service/docu_1.png';
import serv10 from '../img/service/docu_2.png';
import serv11 from '../img/service/text_5.png';
import serv12 from '../img/service/text_6.png';
import serv13 from '../img/service/Group_4.png';
import serv14 from '../img/service/text_7.png';
import serv15 from '../img/service/text_8.png';
import serv16 from '../img/service/Group_5.png';
import serv17 from '../img/service/text_9.png';
import serv18 from '../img/service/text_10.png';
import serv19 from '../img/service/Group_6.png';
import serv20 from '../img/service/text_11.png';
import serv21 from '../img/service/text_12.png';
import serv22 from '../img/service/text_13.png';
import serv23 from '../img/service/line_16.png';
import serv24 from '../img/service/bg_8.png';
import serv25 from '../img/service/Group_7.png';
import serv26 from '../img/service/text_14.png';
import serv27 from '../img/service/text_15.png';
import serv28 from '../img/service/text_16.png';
import serv29 from '../img/service/text_17.png';
import serv30 from '../img/service/bg_9.png';
import serv31 from '../img/service/Group_8.png';
import serv32 from '../img/service/text_18.png';
import serv33 from '../img/service/Group_9.png';
import serv34 from '../img/service/Group_10.png';
import serv35 from '../img/service/Group_11.png';
import serv36 from '../img/service/Group_12.png';
import serv37 from '../img/service/text_19.png';
import serv38 from '../img/service/_ (2).png';
import gtm from '../img/gtm.png';
import san1 from '../img/san1.png';
import san2 from '../img/san2.png';
import san3 from '../img/san3.png';
import service_circle from '../img/service/service-l-circle.png';
import service_circle1 from '../img/service/service-r-circle.png';
import scroll from '../img/service/service-scroll.png';
import service_bottom_button from '../img/intro/ic_chat.png';

import './service.css';
function Service() {
  return (
    <div className="se">
      <nav id="navbar-example3">
        <a className="nav-link serlink" href="#list-item-1">
          목차
          <img className="side_nav" src="" alt="" />
        </a>
        {/* <a className="nav-link serlink" href="#list-item-2">
            서비스
          </a> */}
        <a className="nav-link serlink" href="#list-item-3">
          비즈니스 솔루션
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          단계별 서비스
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          단계별 서비스
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-6">
          단계별 서비스
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-7">
          단계별 서비스
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-8">
          산출물 예시
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-9">
          서비스 필요성
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-10">
          서비스 필요성
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        {/* <a className="nav-link serlink" href="#list-item-11">
          정보격차
          <img className="side_nav" src="" alt="" />
        </a>{' '} */}
        <a className="nav-link serlink" href="#list-item-12">
          abic 필요성
          <img className="side_nav" src="" alt="" />
        </a>
      </nav>
      <div id="service_container">
        <div id="list-item-1" className="chapter service">
          <div>
            <div className="servh1">
              <img src={service_letter} alt="" />
            </div>
          </div>
          <div className="pic_nav">
            <div className="ser_img rounded">
              <a href="#service_info">
                <img className="ser_btn" src={service_circle} alt="서비스소개" />
              </a>
            </div>
            <div className="ser_img rounded">
              <a href="#service_need">
                <img className="ser_btn" src={service_circle1} alt="서비스필요성" />
              </a>
            </div>
          </div>
          <img id="scroll_img" src={scroll} />
          <a href="/">
            <img id="fixed_goto" src={service_bottom_button} alt="" />
          </a>
        </div>
        <div id="service_info">
          {/* <div className="chapter service" id="list-item-2">
            <h1>서비스 소개</h1>
          </div> */}
          <div className="chapter service" id="list-item-3">
            <img
              src={serv1}
              alt=""
              style={{ position: 'absolute', width: '70%', height: '80%', top: '15%', left: '15%' }}
            />
            <img src={serv2} alt="" style={{ position: 'absolute', width: '50%', top: '17%', left: '25%' }} />{' '}
            <img src={serv3} alt="" style={{ position: 'absolute', width: '40%', top: '50%', left: '32%' }} />
            <img src={serv4} alt="" style={{ position: 'absolute', width: '1.5%', top: '75%', left: '51%' }} />
            <img src={serv5} alt="" style={{ position: 'absolute', width: '30%', top: '5%', left: '37%' }} />
            <img src={serv6} alt="" style={{ position: 'absolute', width: '30%', top: '85%', left: '37%' }} />
          </div>
          <div className="chapter service" id="list-item-4">
            <img src={serv7} alt="" style={{ position: 'absolute', width: '30%', top: '5%', left: '37%' }} />
            <img src={serv8} alt="" style={{ position: 'absolute', width: '25%', top: '17%', left: '40%' }} />
            <img src={serv9} alt="" style={{ position: 'absolute', width: '25%', top: '30%', left: '25%' }} />
            <img src={serv10} alt="" style={{ position: 'absolute', width: '25%', top: '30%', left: '55%' }} />
            <img src={serv11} alt="" style={{ position: 'absolute', width: '5%', top: '70%', left: '35%' }} />
            <img src={serv12} alt="" style={{ position: 'absolute', width: '5%', top: '70%', left: '65%' }} />
          </div>
          <div className="outer">
            <div className="chapter service" id="list-item-5">
              <img src={serv13} alt="" style={{ position: 'absolute', width: '40%', top: '5%', left: '10%' }} />
              <img src={serv14} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '55%' }} />
              <img src={serv15} alt="" style={{ position: 'absolute', width: '30%', top: '35%', left: '55%' }} />
            </div>
            <div className="chapter service" id="list-item-6">
              <img src={serv16} alt="" style={{ position: 'absolute', width: '40%', top: '5%', left: '45%' }} />
              <img src={serv17} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '9%' }} />
              <img src={serv18} alt="" style={{ position: 'absolute', width: '30%', top: '35%', left: '9%' }} />
            </div>
            <div className="chapter service" id="list-item-7">
              <img src={serv19} alt="" style={{ position: 'absolute', width: '40%', top: '15%', left: '15%' }} />
              <img src={serv20} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '60%' }} />
              <img src={serv21} alt="" style={{ position: 'absolute', width: '30%', top: '45%', left: '60%' }} />
            </div>

            <div className="spliderdiv">
              <div className="chapter service" id="list-item-8">
                <Splide options={{ width: 800, arrows: true }}>
                  <SplideSlide>
                    <img className="san" src={san1} alt="Image 1" />
                  </SplideSlide>
                  <SplideSlide>
                    <img className="san" src={san2} alt="Image 2" />
                  </SplideSlide>
                  <SplideSlide>
                    <img className="san" src={san3} alt="Image 3" />
                  </SplideSlide>
                </Splide>
                <img src={serv22} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '9%' }} />
                <img
                  src={serv23}
                  alt=""
                  style={{ position: 'absolute', width: '8%', top: '40%', left: '42%', zIndex: '-1' }}
                />
              </div>
            </div>
          </div>
        </div>
        <div id="service_need">
          <div className="chapter service" id="list-item-9">
            <img
              src={serv24}
              alt=""
              style={{ position: 'absolute', width: '70%', height: '80%', top: '15%', left: '15%' }}
            />
            <img src={serv25} alt="" style={{ position: 'absolute', width: '50%', top: '30%', left: '25%' }} />
            <img src={serv26} alt="" style={{ position: 'absolute', width: '30%', top: '2%', left: '35%' }} />
            <img src={serv27} alt="" style={{ position: 'absolute', width: '10%', top: '10%', left: '45%' }} />
            <img src={serv28} alt="" style={{ position: 'absolute', width: '40%', top: '20%', left: '30%' }} />
          </div>

          <div className="chapter service" id="list-item-10">
            <img
              src={serv30}
              alt=""
              style={{ position: 'absolute', width: '70%', height: '80%', top: '10%', left: '15%' }}
            />{' '}
            <img src={serv31} alt="" style={{ position: 'absolute', width: '60%', top: '35%', left: '20%' }} />
            <img src={serv29} alt="" style={{ position: 'absolute', width: '10%', top: '5%', left: '45%' }} />
            <img src={serv32} alt="" style={{ position: 'absolute', width: '40%', top: '15%', left: '30%' }} />
          </div>
          {/* <div className="chapter service" id="list-item-11"> */}
          {/* <p>
              게다가 환경의 급변으로 의사결정해야 할 사항은 급속히 늘어 나는데, 스타트업, 중소/중견 기업들의 정보 확보
              역량은 그에 못 미치고 있어 경영층의 시의적절한 의사결정이 점점 어려워지고 있습니다.
            </p>
            <img src={serv7} alt="해결책 솔루션" /> */}
          {/* </div> */}
          <div className="chapter service" id="list-item-12">
            <img src={serv33} alt="" style={{ position: 'absolute', width: '20%', top: '15%', left: '15%' }} />
            <img src={serv34} alt="" style={{ position: 'absolute', width: '20%', top: '15%', left: '40%' }} />
            <img src={serv35} alt="" style={{ position: 'absolute', width: '20%', top: '15%', left: '65%' }} />
            <img src={serv36} alt="" style={{ position: 'absolute', width: '75%', top: '58%', left: '13%' }} />
            <img src={serv37} alt="" style={{ position: 'absolute', width: '10%', top: '5%', left: '45%' }} />
            <img src={serv38} alt="" style={{ position: 'absolute', width: 'auto', top: '37%', left: '37%' }} />
            <img src={serv38} alt="" style={{ position: 'absolute', width: 'auto', top: '37%', right: '37%' }} />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Service;
