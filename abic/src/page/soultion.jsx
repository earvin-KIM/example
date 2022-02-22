import React from 'react';
import service_bottom_button from '../img/service/service-bottom-button.png';
import solution_circle from '../img/service/service-l-circle.png';
import solution_circle1 from '../img/solution/solution-r-circle.png';
import soultion_letter from '../img/solution/solution-b-letter.png';
import scroll from '../img/service/service-scroll.png';
import './solution.css';
function Soultion() {
  return (
    <div className="sol">
      <div id="list-item-1" className="chapter solution">
        <div>
          <div className="solh1">
            <img src={soultion_letter} alt="" />
          </div>
        </div>
        <div className="pic_nav_sol">
          <div className="ser_img rounded">
            <a href="/">
              <img className="ser_btn" src={solution_circle} alt="서비스소개" />
            </a>
          </div>
          <div className="ser_img rounded">
            <a href="/">
              <img className="ser_btn" src={solution_circle1} alt="서비스필요성" />
            </a>
          </div>
        </div>
        <img id="scroll_img" src={scroll} />
        <a href="/">
          <img id="fixed_goto" src={service_bottom_button} alt="" />
        </a>
      </div>
      <div id="list-item-2" className="chapter solution"></div>
    </div>
  );
}

export default Soultion;
