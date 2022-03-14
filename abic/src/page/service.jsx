import React from 'react';
import { Splide, SplideSlide } from '@splidejs/react-splide';
import '@splidejs/splide/dist/css/splide.min.css';
import service_01_letter from '../img/service/service-b-letter.png';
import service_02_back from '../img/service/service02/service_02_square.png';
import service_02_pic from '../img/service/service02/service_02_img.png';
import service_02_123 from '../img/service/Group_2.png';
import service_02_arrow from '../img/service/Group_3.png';
import text_02_solution from '../img/service/service02/service_02_letter.png';
import text_02_insight from '../img/service/text_2.png';
import text_03_abic_process from '../img/service/service03/service_03_letter.png';
import text_03_0 from '../img/service/service03/service_03_letter2.png';
import service_03_left from '../img/service/service03/service_03_01.png';
import service_03_right from '../img/service/service03/service_03_02.png';
import text_03_left from '../img/service/text_5.png';
import text_03_right from '../img/service/text_6.png';
import service_04_1st from '../img/service/service04/service_04_circle.png';
import text_04_1st from '../img/service/service04/service_04_letter.png';
import text_04_description from '../img/service/service04/service_04_letter2.png';
import service_05_2ed from '../img/service/service05/service_05_circle.png';
import text_05_2ed from '../img/service/service05/service_05_letter.png';
import text_05_description from '../img/service/service05/service_05_letter2.png';
import service_06_3rd from '../img/service/service06/sevice_06_square.png';
import text_06_3rd from '../img/service/service06/sevice_06_letter.png';
import text_06_description from '../img/service/service06/sevice_06_letter2.png';
import text_07_description from '../img/service/service07/service_07_letter.png';
import text_07_description2 from '../img/service/service07/service_07_letter2.png';
import service_07_line from '../img/service/line_16.png';
import service_08_back from '../img/service/service08/service_08_square.png';
import service_08_graph from '../img/service/service08/service_08_img.png';
import text_08_necessity from '../img/service/service08/service_08_letter.png';
import text_08_startup_problem from '../img/service/text_15.png';
import text_08_description from '../img/service/service08/service_08_letter2.png';
import text_09_startup_problem from '../img/service/service09/service_09_letter.png';
import service_09_back from '../img/service/service09/service_09_square.png';
import service_09_graph from '../img/service/service09/service_09_img.png';
import text_09_description from '../img/service/service09/service_09_letter2.png';
import service_10_idea from '../img/service/service10/service_10_img.png';
import service_10_back from '../img/service/service10/service_10_square.png';
import service_10_speed from '../img/service/Group_11.png';
import service_10_panel from '../img/service/Group_12.png';
import text_10_problem_solve from '../img/service/text_19.png';
import service_10_arrow from '../img/service/_ (2).png';
import sample1 from '../img/san1.png';
import sample2 from '../img/san2.png';
import sample3 from '../img/san3.png';
import service_circle from '../img/service/service01/service_01_clrcle1.png';
import service_circle1 from '../img/service/service01/service_01_clrcle2.png';
import scroll from '../img/service/service-scroll.png';
import service_bottom_button from '../img/intro/ic_chat.png';
import side_line from '../img/intro/intro_01_sideline1.png';

import './service.css';
function Service() {
  return (
    <div className="se">
      <nav id="navbar-example3">
        <a className="nav-link serlink" href="#list-item-1">
          Main
          <img className="side_nav" src="" alt="" />
        </a>
        {/* <a className="nav-link serlink" href="#list-item-2">
            서비스
          </a> */}
        <a className="nav-link serlink" href="#list-item-3">
          Concept
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-4">
          Process
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-5">
          TAM/SAM
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-6">
          SOM
          <img className="side_nav" src="" alt="" />
        </a>
        <a className="nav-link serlink" href="#list-item-7">
          GTM
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-8">
          Report
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-9">
          Necessity
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        <a className="nav-link serlink" href="#list-item-10">
          Problem
          <img className="side_nav" src="" alt="" />
        </a>{' '}
        {/* <a className="nav-link serlink" href="#list-item-11">
          정보격차
          <img className="side_nav" src="" alt="" />
        </a>{' '} */}
        <a className="nav-link serlink" href="#list-item-12">
          Solution
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
              style={{ position: 'absolute', width: '80%', height: '80%', top: '15%', left: '10%', opacity: '0.7' }}
            />
            <img src={service_02_pic} alt="" style={{ position: 'absolute', width: '55%', top: '17%', left: '23%' }} />{' '}
            <img src={text_02_solution} alt="" style={{ position: 'absolute', width: '25%', top: '5%', left: '37%' }} />
          </div>
          <div className="chapter service" id="list-item-4">
            <img
              src={service_02_back}
              alt=""
              style={{ position: 'absolute', width: '80%', height: '80%', top: '15%', left: '10%', opacity: '0.7' }}
            />
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
          </div>
          <div className="outer">
            <div className="chapter service" id="list-item-5">
              <img src={service_04_1st} alt="" style={{ position: 'absolute', width: '40%', top: '5%', left: '5%' }} />
              <img src={text_04_1st} alt="" style={{ position: 'absolute', width: '40%', top: '25%', left: '45%' }} />
              <img
                src={text_04_description}
                alt=""
                style={{ position: 'absolute', width: '40%', top: '35%', left: '45%' }}
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
                style={{ position: 'absolute', height: '80%', top: '10%', left: '5%' }}
              />
              <img src={text_06_3rd} alt="" style={{ position: 'absolute', width: '30%', top: '25%', left: '55%' }} />
              <img
                src={text_06_description}
                alt=""
                style={{ position: 'absolute', width: '30%', top: '45%', left: '55%' }}
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
                  src={text_07_description2}
                  alt=""
                  style={{ position: 'absolute', width: '30%', top: '35%', left: '9%' }}
                />
                <img
                  src={service_07_line}
                  alt=""
                  style={{ position: 'absolute', width: '8%', top: '40%', left: '41.2%', zIndex: '0' }}
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
              style={{ position: 'absolute', width: '30%', top: '5%', left: '35%' }}
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
                top: '15%',
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
              style={{ position: 'absolute', width: '20%', top: '5%', left: '40%' }}
            />
            <img
              src={text_09_description}
              alt=""
              style={{ position: 'absolute', width: '40%', top: '20%', left: '30%' }}
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
            <img
              src={service_10_back}
              alt=""
              style={{
                position: 'absolute',
                width: '80%',
                height: '90%',
                top: '5%',
                left: '50%',
                transform: 'translateX(-50%)',
              }}
            />
            <img src={service_10_idea} alt="" style={{ position: 'absolute', width: '70%', top: '10%', left: '15%' }} />{' '}
          </div>
        </div>
      </div>
    </div>
  );
}

export default Service;
