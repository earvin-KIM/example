import React from 'react';
import AboutUs from './page/about';
import Intro from './page/intro';
import Header from './component/header';
import Footer from './component/footer';
import Service from './page/service';
import ContactUs from './page/contact';
import Soultion from './page/soultion';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import jQuery from 'jquery';
import side_active from './img/intro/intro_01_side_circle.png';
import side_active_about from './img/intro/intro_01_side_circle.png';
import side_none from './img/intro/intro_01_sidecircle.png';
import side_none_about from './img/intro/intro_01_sidecircle.png';
import $ from 'jquery';
import { State } from '@splidejs/splide';

function App() {
  if (window.location.pathname == '/') {
    document.title = 'ABIC';
  }
  if (window.location.pathname == '/about') {
    document.title = 'ABOUT US';
  }
  if (window.location.pathname == '/contact') {
    document.title = 'CONTACT US';
  }
  if (window.location.pathname == '/service') {
    document.title = 'SERVICE';
  }
  if (window.location.pathname == '/solution') {
    document.title = 'SOLUTION';
  }
  // ^-------------------title 바꾸기---------------

  $(function () {
    var link = $('.serlink');
    var chapter_id = $('.serlink').attr('href');
    $('.serlink').addClass('active');
    var pageIndex_next; //현재 페이지
    var side_ = side_active,
      side = side_none;

    function findPosition() {
      //사이드 바에 활성화 비활성화 주는 함수
      $('.chapter').each(function () {
        if (Math.abs($(this).offset().top - $(window).scrollTop()) < 10) {
          // console.log($(this).offset().top);
          // console.log($(window).scrollTop());
          console.log('find');
          pageIndex_next = $('.chapter').index(this); //현재 페이지가 몇번째인지 찾기
          header_visi(); //몇번째 페이지인지 알아내서 헤더 숨길지 말지, 사이드바 흰색인지 검정색인지 결정
          $('.side_nav').attr('src', side);
          link.removeClass('active');
          $('[href="#' + $(this).attr('id') + '"]').addClass('active');
          $('[href="#' + $(this).attr('id') + '"] img')
            // .css('opacity', '0')
            // .stop()
            .attr('src', side_);
          // .animate({ opacity: 1 }, 100);
        }
      });
    }

    //----------------------------목차 activ----------------------
    var intro_text =
      '그래서 ABIC은 생각했습니다. 신사업 기획, 마케팅, 세일즈에 대한 비즈니스 컨설팅을 AI 기술을 통해 ‘신속’하고 ‘편리’하게 제공할 순 없을까?'; //타이핑 효과를 위한 텍스트
    var txt = document.getElementById('txt_here');
    let n = 0;
    var state = false;
    const typing = function () {
      //숫자 올라가는 함수
      if (document.querySelector('.three') != null) {
        if ($('.three').offset().top == window.scrollY) {
          //three 클래스의 div와 스크롤 위치가 동일할때
          var per1 = 38, //올라갈 숫자
            per2 = 35,
            per3 = 20,
            per4 = 19,
            per5 = 18;
          document.getElementById('intro_graph').style.width = '35%';
          setInterval(function () {
            if (document.getElementById('per_1').innerHTML < per1) {
              document.getElementById('per_1').innerHTML++;
            }
            if (document.getElementById('per_2').innerHTML < per2) {
              document.getElementById('per_2').innerHTML++;
            }
            if (document.getElementById('per_3').innerHTML < per3) {
              document.getElementById('per_3').innerHTML++;
            }
            if (document.getElementById('per_4').innerHTML < per4) {
              document.getElementById('per_4').innerHTML++;
            }
            if (document.getElementById('per_5').innerHTML < per5) {
              document.getElementById('per_5').innerHTML++;
            }
          }, 30); //30ms에 1씩 올라감
        }
      }
    };
    // $(window).off().on('scroll', typing);
    $(window).on('scroll', function () {
      findPosition();
      typing(); //스크롤 할때 감지
    });
    // ----------------페이지 스크롤링--------------------------
    let positionDivs = document.getElementsByClassName('chapter');
    // 스크롤 목적지 리스트 chapter 클래스 없으면 거기서 안멈춤
    let pageIndex = 0; //스크롤 할 때의 div, pageIndex_next와 다름 주의
    $('#navbar').css('opacity', '1'); //상단 nav 투명하게

    function header_visi() {
      //nav 투명도 첫 페이지에서는 보이게 하는 함수
      if (pageIndex_next == 0) {
        $('#navbar').css('opacity', '1');
        $('#navbar').hover(
          function () {
            $('#navbar').css('opacity', '1');
          },
          function () {
            $('#navbar').css('opacity', '1');
          }
        );
      } else {
        $('#navbar').css('opacity', '0');
        $('#navbar').hover(
          function () {
            $('#navbar').css('opacity', '1');
          },
          function () {
            $('#navbar').css('opacity', '0');
          }
        );
      }
      switch_side(); //헤더부분 스크롤 내리면 hover로 활성화되는 알고리즘과 함께 호출됨
    }
    const switch_side = () => {
      //사이드 바 몇번째 페이지인지에 따라 색상 바뀌게하는 함수, active 주는 함수와 다름
      switch (window.location.pathname) {
        case '/':
          if (pageIndex_next == 2 || pageIndex_next == 5) {
            side = side_none_about;
            side_ = side_active_about;
            $('#navbar-example3 .nav-link').css('color', 'white');
          } else {
            side = side_none; //옆에 버튼의 소스 변수를 바꿔줌
            side_ = side_active;
            $('#navbar-example3 .nav-link').css('color', 'black');
          }
          break;
        case '/about':
          if (1 == 1) {
            side = side_none_about;
            side_ = side_active_about;
            $('#navbar-example3 .nav-link').css('color', 'white');
          } else {
            side = side_none;
            side_ = side_active;
            $('#navbar-example3 .nav-link').css('color', 'black');
          }
          break;
        case '/contact':
          break;
        case '/service':
          if (
            pageIndex_next == 0 ||
            pageIndex_next == 1 ||
            pageIndex_next == 2 ||
            pageIndex_next == 9 ||
            pageIndex_next == 10
          ) {
            side = side_none_about;
            side_ = side_active_about;
            $('#navbar-example3 .nav-link').css('color', 'white');
          } else {
            side = side_none;
            side_ = side_active;
            $('#navbar-example3 .nav-link').css('color', 'black');
          }
          break;
        case '/solution':
          break;
      }
    };
    findPosition();

    //^-----------------------sidenav색상 변경

    let maxPageIndex = positionDivs.length - 1; /// 최대 페이지

    let isMoving = false; /// 현재 페이지가 넘어가고 있는지 확인

    let scrollEndDelay = 200; /// 페이징 끝난 후 페이지 못 넘기게 딜레이 추가
    const animteScrollTo = function (_selector, _duration, _adjust) {
      //페이지 넘어가는 애니메이션
      const targetEle = document.querySelector('#' + _selector.id);
      if (!targetEle) return;
      // - Get current &amp; target positions
      const scrollEle = document.documentElement || document.scrollingElement,
        currentY = scrollEle.scrollTop,
        targetY = targetEle.offsetTop - (_adjust || 0);
      animateScrollTo(currentY, targetY, _duration);
      // - Animate and scroll to target position
      function animateScrollTo(_startY, _endY, _duration) {
        _duration = _duration ? _duration : 100;
        const unitY = (targetY - currentY) / _duration;
        const startTime = new Date().getTime();
        const endTime = new Date().getTime() + _duration;
        if (isMoving == true) {
          console.log('stop');
          return;
        }
        isMoving = true;
        console.log(isMoving);
        const scrollTo = function () {
          let now = new Date().getTime();
          let passed = now - startTime;
          if (now <= endTime) {
            // let dot = passed / (endTime - startTime);
            // let animatePosition = 1 - Math.pow(1 - dot, 1 / Math.max(0.5)); //ease 애니메이션
            // scrollEle.scrollTop = currentY + unitY;
            scrollEle.scrollTop = targetY / Math.pow(passed, 0.5);
            requestAnimationFrame(scrollTo);
          } else {
            // 페이지 끝날 때
            scrollEle.scrollTop = targetY;
            setTimeout(function () {
              isMoving = false;
            }, scrollEndDelay + 500); //페이지 다 넘어가기 전까지 isMoving==true
            console.log('End off.');
          }
        };
        requestAnimationFrame(scrollTo);
      }
    };
    const paging_now = () => {
      //pageIndex를 반환해주는 함수, 새로고침시 pageIndex==1이 되는 걸 방지
      let paging = 0,
        rem = -1;
      $('.chapter').each(function () {
        if ($(this).offset().top - window.scrollY < 20) {
          //페이지 찾기
          rem = paging;
        }
        paging++;
      });

      var footer_bottom = document.querySelector('#footer').offsetHeight + document.querySelector('#footer').offsetTop;
      if (footer_bottom - (window.scrollY + window.innerHeight) < 20) {
        //footer의 경우 top 기준이 아니라 bottom 기준으로 스크롤 되게 변경
        rem = paging - 1;
      }

      console.log(rem);
      console.log($('#footer').offsetHeight);
      console.log($('#footer').offsetTop);

      return rem;
    };
    const wheel = function (event) {
      if (maxPageIndex <= 0) return;
      // 스크롤 방지
      event.preventDefault();
      if (isMoving) return;

      let next = event.deltaY >= 0;
      scorlling(next);
    };
    const keypress = (event) => {
      if (maxPageIndex <= 0) return;
      // 스크롤 방지
      if (isMoving || (event.key != 'ArrowDown' && event.key != 'ArrowUp')) return; //화살표 스크롤 방지
      event.preventDefault();

      console.log(event.key);
      let next;
      if (event.key == 'ArrowDown') {
        next = true;
      } else if (event.key == 'ArrowUp') {
        next = false;
      }
      scorlling(next);
    };
    const scorlling = function (next) {
      //스크롤 애니메이션 함수 호출 함수
      if (maxPageIndex <= 0) return;

      if (isMoving || (document.querySelector('#map') != null && $('#map').is(':hover'))) return; //지도 줌 할 때 스크롤 넘어가는 것 방지

      let paging = 0;
      pageIndex = paging_now();
      console.log(pageIndex);
      if (next) {
        paging = pageIndex + 1 >= maxPageIndex ? maxPageIndex : pageIndex + 1;
        animteScrollTo(positionDivs[paging]);
      } else {
        paging = pageIndex - 1 <= 0 ? 0 : pageIndex - 1;
        animteScrollTo(positionDivs[paging]);
      }
      pageIndex = paging;
      // console.log(event.deltaY);
    };

    const main_scroll = document.querySelector('html');
    window.addEventListener('wheel', wheel, { passive: false });
    window.addEventListener('keydown', keypress, { passive: false });
    // $(input).addEventListener('focus',(event)=>{keypress.preventDefault()})
  });

  return (
    <div>
      <BrowserRouter>
        <div id="top"></div>
        <Header></Header>

        <Routes>
          <Route path="/" exact element={<Intro />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/service" element={<Service />} />
          <Route path="/contact" element={<ContactUs />} />
          <Route path="/solution" element={<Soultion />} />
        </Routes>

        <Footer></Footer>
      </BrowserRouter>
    </div>
  );
}

export default App;
