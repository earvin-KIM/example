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
import serv13 from '../img/service/text_4.png';
import serv14 from '../img/service/text_4.png';
import serv15 from '../img/service/text_4.png';
import serv16 from '../img/service/text_4.png';
import serv17 from '../img/service/text_4.png';
import gtm from '../img/gtm.png';
import san1 from '../img/san1.png';
import san2 from '../img/san2.png';
import san3 from '../img/san3.png';
import service_circle from '../img/service/service-l-circle.png';
import service_circle1 from '../img/service/service-r-circle.png';
import scroll from '../img/service/service-scroll.png';
import service_bottom_button from '../img/service/service-bottom-button.png';

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
              {/* <h1 className="servh1">1단계 : 전체시장 및 유효시장(TAM/SAM) 정의 및 추정</h1> */}
              <div className="servinner">
                {/* <p>
                구상 중인 신사업 아이디어의 TAM/SAM 시장을 정의하고 고객/경쟁 등에 대한 트랜드를 분석합니다. 이를
                바탕으로 TAM/SAM 시장규모와 성장잠재력을 논리적으로 추정하여 사업아이디어의 타당성을 점검할 수 있도록
                합니다.
              </p> */}
                {/* <img src={serv4} className="servimg" alt="1단계" /> */}
              </div>
            </div>
            <div className="chapter service" id="list-item-6">
              {/* <h1 className="servh1">2단계 : 초기거점시장(SOM)정의 및 추정</h1> */}
              {/* <div className="servinner">
              <p>
                신사업이 초기 1~2년 안에 반드시 공략해야 하는 거점시장(SOM)을 정의하고, 거점시장 목표고객의 특성/니즈,
                경쟁자들의 전략방향 등에 대해 구체적으로 분석합니다.
              </p>
              <img src={serv5} className="servimg" alt="2단계" />
            </div> */}
            </div>
            <div className="chapter service" id="list-item-7">
              {/* <h1 className="servh1"> 3단계 : 초기거점시장(SOM)의 GTM(Go To Market)전략방향 제시</h1>
            <div className="servinner">
              <p>
                초기거점시장(SOM)의 GTM(Go To Market)전략방향 제시 초기거점시장(SOM)을 공략하기 위한 GTM 전략방향을
                Who(목표고객)-What(고객가치)-How(유통/마케팅)의 관점에서 개발하여 제시합니다
              </p>
              <img src={gtm} className="servimg" alt="3단계" />
            </div> */}
            </div>

            <div className="spliderdiv">
              <div className="chapter service" id="list-item-8">
                <h1>산출물 예시</h1>
                <Splide options={{ width: 800 }}>
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
              </div>
            </div>
          </div>
        </div>
        <div id="service_need">
          <div className="chapter service" id="list-item-9">
            {/* <h1>서비스 필요성</h1> */}
          </div>

          <div className="chapter service" id="list-item-10">
            {/* <p>
              스타트업이 창업하여 중견기업으로 성장하는 과정에 곳곳에 도사린 성장 함정으로 인하여 지속적인 성장을
              견인하는 기업은 드뭅니다.
            </p>
            <img src={serv6} className="servimg" alt="문제점" /> */}
          </div>
          {/* <div className="chapter service" id="list-item-11"> */}
          {/* <p>
              게다가 환경의 급변으로 의사결정해야 할 사항은 급속히 늘어 나는데, 스타트업, 중소/중견 기업들의 정보 확보
              역량은 그에 못 미치고 있어 경영층의 시의적절한 의사결정이 점점 어려워지고 있습니다.
            </p>
            <img src={serv7} alt="해결책 솔루션" /> */}
          {/* </div> */}
          <div className="chapter service" id="list-item-12">
            {/* <img src={serv8} className="servimg" alt="필요성 어필" /> */}
          </div>
        </div>
      </div>
    </div>
  );
}

export default Service;
