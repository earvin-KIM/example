import React, { Component } from 'react';
import contact_intro from './img/contact/contact_intro_banner.png';
import contact_call from '.img/contact/contact_call.png';
import contact_line from '.img/contact/contact_call.png';

class Contact_us extends Component {
  render() {
    return (
      <div className="content-wrapper">
        <section className="content">
          <div id="topimg">
            <img src={contact_intro} width={'100%'} />
            <img src={contact_call} width={'100%'} />
            <img src={} width={'100%'} />
          </div>
        </section>
      </div>
    );
  }
}
export default Contact_us;
