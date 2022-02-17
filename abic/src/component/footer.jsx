import React from 'react';
import './footer.css';
import footer from '../img/footer/footer.png';
function Footer() {
  return (
    <>
      <div className="footer chapter" id="footer">
        <div className="footer_div">
          <img src={footer} alt="" />
        </div>
      </div>
    </>
  );
}

export default Footer;
