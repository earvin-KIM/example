import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import serv1 from '../img/business.png';
import serv2 from '../img/serv2.png';
import serv3 from '../img/serv3.png';
import serv4 from '../img/serv4.jpg';
import serv5 from '../img/serv5.jpg';
import serv6 from '../img/serv6.png';
import serv7 from '../img/serv7.png';
import serv8 from '../img/serv8.png';
import gtm from '../img/gtm.png';
import san1 from '../img/san1.png';
import san2 from '../img/san2.png';
import san3 from '../img/san3.png';
import dummy from '../img/dummy.png';
import './service.css';
function Service() {
  return (
    <>
      <div id="serv_first" className="service">
        <div>
          <h1 id="servh1">신사업 기획 컨설팅 서비스</h1>
        </div>
        <div className="pic_nav">
          <div className="ser_img rounded">
            <a href="#service_info">
              <img className="ser_btn" src={dummy} alt="서비스소개" />
            </a>
          </div>
          <div className="ser_img rounded">
            <a href="#service_need">
              <img className="ser_btn" src={dummy} alt="서비스필요성" />
            </a>
          </div>
        </div>
      </div>
      <div id="service_info">
        <div className="service">
          <img src={serv1} className="servimg" alt="비지니스 인사이트" />
        </div>
        <div className="service">
          <h1 id="servh1">0단계 : 사업모델 개요/유형 판단</h1>
          <div className="servprogress">
            <img src={serv2} className="servimg_s" alt="0단계" />
            <img src={serv3} className="servimg_s" alt="0단계-1" />
          </div>
        </div>
        <div className="service">
          <h1 id="servh1">1단계 : 전체시장 및 유효시장(TAM/SAM) 정의 및 추정</h1>
          <div className="servprogress">
            <p>
              구상 중인 신사업 아이디어의 TAM/SAM 시장을 정의하고 고객/경쟁 등에 대한 트랜드를 분석합니다. 이를 바탕으로
              TAM/SAM 시장규모와 성장잠재력을 논리적으로 추정하여 사업아이디어의 타당성을 점검할 수 있도록 합니다.
            </p>
            <img src={serv4} className="servimg" alt="1단계" />
          </div>
        </div>
        <div className="service">
          <h1 id="servh1">2단계 : 초기거점시장(SOM)정의 및 추정</h1>
          <div className="servprogress">
            <p>
              신사업이 초기 1~2년 안에 반드시 공략해야 하는 거점시장(SOM)을 정의하고, 거점시장 목표고객의 특성/니즈,
              경쟁자들의 전략방향 등에 대해 구체적으로 분석합니다.
            </p>
            <img src={serv5} className="servimg" alt="2단계" />
          </div>
        </div>
        <div className="service">
          <h1 id="servh1"> 3단계 : 초기거점시장(SOM)의 GTM(Go To Market)전략방향 제시</h1>
          <div className="servprogress">
            <p>
              초기거점시장(SOM)의 GTM(Go To Market)전략방향 제시 초기거점시장(SOM)을 공략하기 위한 GTM 전략방향을
              Who(목표고객)-What(고객가치)-How(유통/마케팅)의 관점에서 개발하여 제시합니다
            </p>
            <img src={gtm} className="servimg" alt="3단계" />
          </div>
        </div>
        <div className="spliderdiv">
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
      <div id="service_need">
        <div className="service">
          <p>
            스타트업이 창업하여 중견기업으로 성장하는 과정에 곳곳에 도사린 성장 함정으로 인하여 지속적인 성장을 견인하는
            기업은 드뭅니다.
          </p>
          <img src={serv6} className="servimg" alt="문제점" />
        </div>
        <div className="service">
          <p>
            게다가 환경의 급변으로 의사결정해야 할 사항은 급속히 늘어 나는데, 스타트업, 중소/중견 기업들의 정보 확보
            역량은 그에 못 미치고 있어 경영층의 시의적절한 의사결정이 점점 어려워지고 있습니다.
          </p>
          <img src={serv7} alt="해결책 솔루션" />
        </div>
        <div className="service">
          <img src={serv8} className="servimg" alt="필요성 어필" />
        </div>
      </div>
    </>
  );
}

export default Service;
