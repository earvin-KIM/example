import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import service_01_letter from '../img/service/service-b-letter.png';
import service_02_back from '../img/service/bg_3.png';
import service_02_pic from '../img/service/Group_1.png';
import service_02_123 from '../img/service/Group_2.png';
import service_02_arrow from '../img/service/Group_3.png';
import text_02_solution from '../img/service/text_1.png';
import text_02_insight from '../img/service/text_2.png';
import text_03_abic_process from '../img/service/text_3.png';
import text_03_0 from '../img/service/text_4.png';
import service_03_left from '../img/service/docu_1.png';
import service_03_right from '../img/service/docu_2.png';
import text_03_left from '../img/service/text_5.png';
import text_03_right from '../img/service/text_6.png';
import service_04_1st from '../img/service/Group_4.png';
import text_04_1st from '../img/service/text_7.png';
import text_04_description from '../img/service/text_8.png';
import service_05_2ed from '../img/service/Group_5.png';
import text_05_2ed from '../img/service/text_9.png';
import text_05_description from '../img/service/text_10.png';
import service_06_3rd from '../img/service/Group_6.png';
import text_06_3rd from '../img/service/text_11.png';
import text_06_description from '../img/service/text_12.png';
import text_07_description from '../img/service/text_13.png';
import service_07_line from '../img/service/line_16.png';
import service_08_back from '../img/service/bg_8.png';
import service_08_graph from '../img/service/Group_7.png';
import text_08_necessity from '../img/service/text_14.png';
import text_08_startup_problem from '../img/service/text_15.png';
import text_08_description from '../img/service/text_16.png';
import text_09_startup_problem from '../img/service/text_17.png';
import service_09_back from '../img/service/bg_9.png';
import service_09_graph from '../img/service/Group_8.png';
import text_09_description from '../img/service/text_18.png';
import service_10_idea from '../img/service/Group_9.png';
import service_10_low_price from '../img/service/Group_10.png';
import service_10_speed from '../img/service/Group_11.png';
import service_10_panel from '../img/service/Group_12.png';
import text_10_problem_solve from '../img/service/text_19.png';
import service_10_arrow from '../img/service/_ (2).png';
import sample1 from '../img/san1.png';
import sample2 from '../img/san2.png';
import sample3 from '../img/san3.png';
import service_circle from '../img/service/service-l-circle.png';
import service_circle1 from '../img/service/service-r-circle.png';
import scroll from '../img/service/service-scroll.png';
import service_bottom_button from '../img/intro/ic_chat.png';
import side_line from '../img/intro/intro_01_sideline1.png';

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
        <img src={side_line} alt="" className="side_line" />
      </nav>
      <div id="service_container">
        <div id="list-item-1" className="chapter service">
          <div>
            <div className="servh1">
              <img src={service_01_letter} alt="" />
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
              src={service_02_back}
              alt=""
              style={{ position: 'absolute', width: '70%', height: '80%', top: '15%', left: '15%' }}
            />
            <img src={service_02_pic} alt="" style={{ position: 'absolute', width: '50%', top: '17%', left: '25%' }} />{' '}
            <img src={service_02_123} alt="" style={{ position: 'absolute', width: '40%', top: '50%', left: '32%' }} />
            <img
              src={service_02_arrow}
              alt=""
              style={{ position: 'absolute', width: '1.5%', top: '75%', left: '51%' }}
            />
            <img src={text_02_solution} alt="" style={{ position: 'absolute', width: '30%', top: '5%', left: '37%' }} />
            <img src={text_02_insight} alt="" style={{ position: 'absolute', width: '30%', top: '85%', left: '37%' }} />
          </div>
          <div className="chapter service" id="list-item-4">
            <img
              src={text_03_abic_process}
              alt=""
              style={{ position: 'absolute', width: '30%', top: '5%', left: '37%' }}
            />
            <img src={text_03_0} alt="" style={{ position: 'absolute', width: '25%', top: '17%', left: '40%' }} />
            <img src={service_03_left} alt="" style={{ position: 'absolute', width: '25%', top: '30%', left: '25%' }} />
            <img
              src={service_03_right}
              alt=""
              style={{ position: 'absolute', width: '25%', top: '30%', left: '55%' }}
            />
            <img src={text_03_left} alt="" style={{ position: 'absolute', width: '5%', top: '70%', left: '35%' }} />
            <img src={text_03_right} alt="" style={{ position: 'absolute', width: '5%', top: '70%', left: '65%' }} />
          </div>
          <div className="outer">
            <div className="chapter service" id="list-item-5">
              <img src={service_04_1st} alt="" style={{ position: 'absolute', width: '40%', top: '5%', left: '10%' }} />
              <img src={text_04_1st} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '55%' }} />
              <img
                src={text_04_description}
                alt=""
                style={{ position: 'absolute', width: '30%', top: '35%', left: '55%' }}
              />
            </div>
            <div className="chapter service" id="list-item-6">
              <img src={service_05_2ed} alt="" style={{ position: 'absolute', width: '40%', top: '5%', left: '45%' }} />
              <img src={text_05_2ed} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '9%' }} />
              <img
                src={text_05_description}
                alt=""
                style={{ position: 'absolute', width: '30%', top: '35%', left: '9%' }}
              />
            </div>
            <div className="chapter service" id="list-item-7">
              <img
                src={service_06_3rd}
                alt=""
                style={{ position: 'absolute', height: '80%', top: '15%', left: '15%' }}
              />
              <img src={text_06_3rd} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '60%' }} />
              <img
                src={text_06_description}
                alt=""
                style={{ position: 'absolute', width: '30%', top: '45%', left: '60%' }}
              />
            </div>

            <div className="spliderdiv">
              <div className="chapter service" id="list-item-8">
                <Splide options={{ width: 800, arrows: true }}>
                  <SplideSlide>
                    <img className="san" src={sample1} alt="Image 1" />
                  </SplideSlide>
                  <SplideSlide>
                    <img className="san" src={sample2} alt="Image 2" />
                  </SplideSlide>
                  <SplideSlide>
                    <img className="san" src={sample3} alt="Image 3" />
                  </SplideSlide>
                </Splide>
                <img
                  src={text_07_description}
                  alt=""
                  style={{ position: 'absolute', width: '30%', top: '25%', left: '9%' }}
                />
                <img
                  src={service_07_line}
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
              src={service_08_back}
              alt=""
              style={{ position: 'absolute', width: '70%', height: '80%', top: '15%', left: '15%' }}
            />
            <img
              src={service_08_graph}
              alt=""
              style={{ position: 'absolute', height: '60%', top: '30%', left: '50%', transform: 'translateX(-50%)' }}
            />
            <img
              src={text_08_necessity}
              alt=""
              style={{ position: 'absolute', width: '30%', top: '2%', left: '35%' }}
            />
            <img
              src={text_08_startup_problem}
              alt=""
              style={{ position: 'absolute', width: '10%', top: '10%', left: '45%' }}
            />
            <img
              src={text_08_description}
              alt=""
              style={{ position: 'absolute', width: '40%', top: '20%', left: '30%' }}
            />
          </div>

          <div className="chapter service" id="list-item-10">
            <img
              src={service_09_back}
              alt=""
              style={{
                position: 'absolute',
                width: '70%',
                height: '80%',
                top: '10%',
                left: '50%',
                transform: 'translateX(-50%)',
              }}
            />{' '}
            <img
              src={service_09_graph}
              alt=""
              style={{ position: 'absolute', height: '45%', top: '35%', left: '50%', transform: 'translateX(-50%)' }}
            />
            <img
              src={text_09_startup_problem}
              alt=""
              style={{ position: 'absolute', width: '10%', top: '5%', left: '45%' }}
            />
            <img
              src={text_09_description}
              alt=""
              style={{ position: 'absolute', width: '40%', top: '15%', left: '30%' }}
            />
          </div>
          {/* <div className="chapter service" id="list-item-11"> */}
          {/* <p>
              게다가 환경의 급변으로 의사결정해야 할 사항은 급속히 늘어 나는데, 스타트업, 중소/중견 기업들의 정보 확보
              역량은 그에 못 미치고 있어 경영층의 시의적절한 의사결정이 점점 어려워지고 있습니다.
            </p>
            <img src={serv7} alt="해결책 솔루션" /> */}
          {/* </div> */}
          <div className="chapter service" id="list-item-12">
            <img src={service_10_idea} alt="" style={{ position: 'absolute', width: '20%', top: '15%', left: '15%' }} />
            <img
              src={service_10_low_price}
              alt=""
              style={{ position: 'absolute', width: '20%', top: '15%', left: '40%' }}
            />
            <img
              src={service_10_speed}
              alt=""
              style={{ position: 'absolute', width: '20%', top: '15%', left: '65%' }}
            />
            <img
              src={service_10_panel}
              alt=""
              style={{ position: 'absolute', width: '75%', top: '58%', left: '13%' }}
            />
            <img
              src={text_10_problem_solve}
              alt=""
              style={{ position: 'absolute', width: '10%', top: '5%', left: '45%' }}
            />
            <img
              src={service_10_arrow}
              alt=""
              style={{ position: 'absolute', width: 'auto', top: '37%', left: '37%' }}
            />
            <img
              src={service_10_arrow}
              alt=""
              style={{ position: 'absolute', width: 'auto', top: '37%', right: '37%' }}
            />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Service;
