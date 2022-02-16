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
import $ from 'jquery';
import { State } from '@splidejs/splide';

function App() {
  $(function () {
    window.scrollTo(0, $('.chapter').offset().top);
    var link = $('.serlink');
    var chapter_id = $('.serlink').attr('href');
    $('.serlink').addClass('active');
    $(window).on('scroll', function () {
      findPosition();
    });

    function findPosition() {
      $('.chapter').each(function () {
        if ($(this).offset().top - $(window).scrollTop() < 20) {
          // console.log($(this).offset().top);
          // console.log($(window).scrollTop());
          link.removeClass('active');
          $('[href="#' + $(this).attr('id') + '"]').addClass('active');
        }
      });
    }
    findPosition();

    //----------------------------목차 activ----------------------
    var intro_text =
      '그래서 ABIC은 생각했습니다. 신사업 기획, 마케팅, 세일즈에 대한 비즈니스 컨설팅을 AI 기술을 통해 ‘신속’하고 ‘편리’하게 제공할 순 없을까?';
    var txt = document.getElementById('txt_here');
    let n = 0;
    var state = false;
    const typing = function () {
      if (document.querySelector('.four') != null) {
        if ($('.four').offset().top == window.scrollY) {
          if (state == false) {
            state = true;
            console.log('1');
            var type = setInterval(function () {
              txt.innerHTML += intro_text[n];
              n++;
              if (n > intro_text.length - 1) {
                clearInterval(type);
                n = 0;
              }
            }, 100);
            console.log('2');
          }
        }
      }
      //  else {
      //   txt.innerHTML = '';
      //   clearInterval(type);
      //   n = 0;
      // }
    };
    $(window).off().on('scroll', typing);
    $(window).on('scroll', function () {
      findPosition();
    });
    // ----------------페이지 스크롤링--------------------------
    let positionDivs = document.getElementsByClassName('chapter');
    /// 현재 페이지
    let pageIndex = 0;
    /// 최대 페이지
    let maxPageIndex = positionDivs.length - 1;
    /// 현재 페이지가 넘어가고 있는지 확인
    let isMoving = false;
    /// 페이징 끝난 후 페이지 못 넘기게 딜레이 추가
    let scrollEndDelay = 200;
    const animteScrollTo = function (_selector, _duration, _adjust) {
      const targetEle = document.querySelector('#' + _selector.id);
      if (!targetEle) return;
      // - Get current &amp; target positions
      const scrollEle = document.documentElement || document.scrollingElement,
        currentY = scrollEle.scrollTop,
        targetY = targetEle.offsetTop - (_adjust || 0);
      animateScrollTo(currentY, targetY, _duration);
      // - Animate and scroll to target position
      function animateScrollTo(_startY, _endY, _duration) {
        _duration = _duration ? _duration : 300;
        const unitY = (targetY - currentY) / _duration;
        const startTime = new Date().getTime();
        const endTime = new Date().getTime() + _duration;
        isMoving = true;
        const scrollTo = function () {
          let now = new Date().getTime();
          let passed = now - startTime;
          if (now <= endTime) {
            let dot = passed / (endTime - startTime);
            let animatePosition = 1 - Math.pow(1 - dot, 1 / Math.max(0.5)); //ease 애니메이션
            scrollEle.scrollTop = currentY + unitY * passed * animatePosition;
            requestAnimationFrame(scrollTo);
          } else {
            // 페이지 끝날 때
            scrollEle.scrollTop = targetY;
            setTimeout(function () {
              isMoving = false;
            }, scrollEndDelay);
            console.log('End off.');
          }
        };
        requestAnimationFrame(scrollTo);
      }
    };
    const paging_now = () => {
      let paging = 0,
        rem;
      $('.chapter').each(function () {
        if ($(this).offset().top - window.scrollY < 20) {
          rem = paging;
        }
        paging++;
      });
      console.log(rem);

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
      event.preventDefault();
      if (isMoving) return;

      let next;
      if (event.key == 40) {
        next = true;
      } else if (event.key == 38) {
        next = false;
      }
      scorlling(next);
    };
    const scorlling = function (next) {
      if (maxPageIndex <= 0) return;
      if (isMoving) return;

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
  });

  return (
    <div>
      <BrowserRouter>
        <div id="top"></div>
        <Header></Header>
        <a href="#top">
          <button className="btn btn-primary" style={{ position: 'fixed', bottom: 0, right: 0, zIndex: 10 }}>
            top
          </button>
        </a>
        <Routes>
          <Route path="/" exact element={<Intro />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/service" element={<Service />} />
          <Route path="/contact" element={<ContactUs />} />
          <Route path="/soultion" element={<Soultion />} />
        </Routes>

        <Footer></Footer>
      </BrowserRouter>
    </div>
  );
}

export default App;
