import React from 'react';
import service_bottom_button from '../img/intro/ic_chat.png';
import solution_circle from '../img/service/service-l-circle.png';
import solution_circle1 from '../img/solution/solution-r-circle.png';
import soultion_letter from '../img/solution/solution-b-letter.png';
import scroll from '../img/service/service-scroll.png';
import sol1 from '../img/solution/solution02/solution_02_img.png';
import sol2 from '../img/solution/solution02/solution_02_letter.png';
import sol02back from '../img/solution/solution02/solution_02_square.png';
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
      <div id="list-item-2" className="chapter solution">
        <img
          src={sol1}
          alt=""
          style={{
            position: 'absolute',
            height: '70%',
            top: '18%',
            left: '50%',
            transform: 'translateX(-50%)',
            zIndex: '1',
          }}
        />
        <img src={sol2} alt="" style={{ position: 'absolute', width: '30%', top: '5%', left: '35%' }} />
        <img
          src={sol02back}
          alt=""
          style={{
            position: 'absolute',
            height: '85%',
            top: '15%',
            left: '50%',
            transform: 'translateX(-50%)',
            zIndex: '0',
          }}
        />
      </div>
    </div>
  );
}

export default Soultion;
