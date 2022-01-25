import React, { Component } from 'react';
import our_work2 from './img/ourwork/our_contents01.png';
import our_work3 from './img/ourwork/our_contents02.png';
import our_work4 from './img/ourwork/our_contents03.png';
import our_work5 from './img/ourwork/our_contents04.png';
import our_work7 from './img/ourwork/our_contents05.png';
import our_work8 from './img/ourwork/our_footer_upper.png';
import our_work1 from './img/ourwork/our_intro_banner.png';
import our_work6 from './img/ourwork/our_line.png';

class Our_work extends Component {
  render() {
    return (
      <div className="content-wrapper">
        <section className="content">
          <img src={our_work1} width={'100%'} />
          <img src={our_work2} width={'100%'} />
          <img src={our_work3} width={'100%'} />
          <img src={our_work4} width={'100%'} />
          <img src={our_work5} width={'100%'} />
          <img src={our_work6} width={'100%'} />
          <img src={our_work7} width={'100%'} />
          <img src={our_work8} width={'100%'} />
        </section>
      </div>
    );
  }
}
export default Our_work;
