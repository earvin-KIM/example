import './App.css';

function App() {
  /// 이동할 페이지 목록
  let positionDivs = ['.c1', '.c2', '.c3', '.c4', '.c5', '.c6'];
  /// 현재 페이지
  let pageIndex = 0;
  /// 최대 페이지
  let maxPageIndex = positionDivs.length - 1;
  /// 현재 페이지가 넘어가고 있는지 확인
  let isMoving = false;
  /// 페이징 끝난 후 페이지 못 넘기게 딜레이 추가
  let scrollEndDelay = 200;
  const animteScrollTo = function (_selector, _duration, _adjust) {
    const targetEle = document.querySelector(_selector);
    if (!targetEle) return;
    // - Get current &amp; target positions
    const scrollEle = document.documentElement || document.scrollingElement,
      currentY = scrollEle.scrollTop,
      targetY = targetEle.offsetTop - (_adjust || 0);
    animateScrollTo(currentY, targetY, _duration);
    // - Animate and scroll to target position
    function animateScrollTo(_startY, _endY, _duration) {
      _duration = _duration ? _duration : 600;
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

  const scorlling = function (event) {
    if (maxPageIndex <= 0) return;
    // 스크롤 방지
    event.preventDefault();
    if (isMoving) return;

    let next = event.deltaY >= 0;
    let paging = 0;
    if (next) {
      paging = pageIndex + 1 >= maxPageIndex ? maxPageIndex : pageIndex + 1;
      animteScrollTo(positionDivs[paging]);
    } else {
      paging = pageIndex - 1 <= 0 ? 0 : pageIndex - 1;
      animteScrollTo(positionDivs[paging]);
    }
    pageIndex = paging;
    console.log(event.deltaY);
  };
  const main_scroll = document.querySelector('html');
  window.addEventListener('wheel', scorlling, { passive: false });
  return (
    <>
      <div className="c-family c1"></div>
      <div className="c-family c2"></div>
      <div className="c-family c3"></div>
      <div className="c-family c4"></div>
      <div className="c-family c5"></div>
      <div className="c-family c6"></div>
    </>
  );
}

export default App;
