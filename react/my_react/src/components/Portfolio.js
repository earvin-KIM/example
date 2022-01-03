import React, { Component } from 'react';
import portfolio_intro from './img/portfolio/portfolio_intro_banner.png';

class Portfolio extends Component {
  render() {
    return (
      <div className="content-wrapper">
        <section className="content">
          <div id="topimg">
            <img src={portfolio_intro} width={'100%'} />
          </div>
        </section>
      </div>
    );
  }
}
export default Portfolio;
