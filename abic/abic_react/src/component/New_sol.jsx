import React, { Component } from 'react';
import './New_sol.css';
import bg_sol_1 from './img/bg_sol_1.png';
// import from '';
// import from '';
// import from '';
// import from '';
// import from '';
// import from '';
// import from '';
// import from '';
class New_sol extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        <div className="bg">
          {/* <!-- png -->  */}
          <img
            src={bg_sol_1}
            srcset="img/bg-sol-1@2x.png 2x, 
 img/bg-sol-1@3x.png 3x"
            className="bg_sol_1"
          />
          {/* <!-- svg -->  */}
          {/* <img src="img/bg-sol-1.svg" className="bg_sol_1" /> */}
          {/* <!-- webp -->  */}
          {/* <img
            src="img/bg-sol-1.webp"
            srcset="img/bg-sol-1@2x.webp 2x, 
 img/bg-sol-1@3x.webp 3x"
            className="bg_sol_1"
          /> */}
          <span className="\-">신사업 경영 컨설팅 솔루션</span>
          <span className="\-">주요 솔루션</span>
        </div>
      </div>
    );
  }
}

export default New_sol;
