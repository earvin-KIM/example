import React from 'react';
import './footer.css';
import con1 from '../img/footer/text_1.png';
import con2 from '../img/footer/btn_view_1.png';
import con3 from '../img/footer/text_2.png';
import con4 from '../img/footer/btn_view_2.png';
function Footer() {
  return (
    <>
      <div className="footer chapter" id="footer">
        <div className="footer_div">
          {/* <img src={con1} alt="" style={{ position: 'absolute', width: '5%', top: '5%', left: '23%' }} />
          <a href="/">
            <img src={con2} alt="" style={{ position: 'absolute', width: '15%', top: '15%', left: '18%' }} />
          </a>
          <img src={con3} alt="" style={{ position: 'absolute', width: '5%', top: '5%', right: '23%' }} />
          <a href="/">
            <img src={con4} alt="" style={{ position: 'absolute', width: '15%', top: '15%', right: '18%' }} />
          </a> */}
        </div>
      </div>
    </>
  );
}

export default Footer;
