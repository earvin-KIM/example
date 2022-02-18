/* global kakao */
import React, { useRef, useEffect } from 'react';
import './contact.css';
import emailjs from '@emailjs/browser';
import { Container, Row, Col } from 'react-bootstrap';
import service_bottom_button from '../img/service/service-bottom-button.png';

import contactus_local from '../img/contactus/contactus-local.png';
import contactus_letter from '../img/contactus/contactus-letter.png';
import contactus_agree from '../img/contactus/contactus-agree.png';
import contactus_mail from '../img/contactus/contactus-mail.png';
import contactus_send from '../img/contactus/contactus-send.png';

function ContactUs(props) {
  const form = useRef();
  useEffect(() => {
    var container = document.getElementById('map');
    var options = {
      center: new kakao.maps.LatLng(37.412975212138974, 127.09952656434282),
      level: 3,
    };
    var map = new kakao.maps.Map(container, options);
    var markerPosition = new kakao.maps.LatLng(37.412975212138974, 127.09952656434282);
    var marker = new kakao.maps.Marker({
      position: markerPosition,
    });
    marker.setMap(map);
  }, []);
  const sendEmail = (e) => {
    e.preventDefault();
    // console.log('1');
    emailjs.sendForm('abic_test', 'template_vivy82z', form.current, 'user_sxVbzxln0UM3Drm3yxXEa').then(
      (result) => {
        console.log(result.text);
        alert('문의를 보냈습니다.');
        // location.replace(location.href);
        window.location.reload();
      },
      (error) => {
        console.log(error.text);
      }
    );
  };

  return (
    <div className="contact_us chapter" id="contact">
      <Container style={{ position: 'relative', top: '7%' }}>
        <form ref={form} onSubmit={sendEmail}>
          <Row>
            <Col>
              <div style={{ margin: '3% 0' }}>
                <img id="con1" src={contactus_letter} alt="" />
              </div>
            </Col>
          </Row>

          <Row>
            <Col>
              <Row>
                <Col>
                  <div style={{ display: 'flex', justifyContent: 'space-around' }}>
                    <img id="con2" src={contactus_local} alt="" />
                    <img id="con3" src={contactus_mail} alt="" />
                  </div>
                </Col>
                <Col></Col>
              </Row>
              <Row>
                <Col></Col>
                <Col></Col>
              </Row>
              <Row>
                <Col>
                  <div>
                    <div id="map" style={{ width: '100%', height: '300px' }}></div>
                  </div>
                </Col>
                <Col
                  style={{ display: 'flex', flexWrap: 'wrap', alignContent: 'space-around', justifyContent: 'center' }}
                >
                  <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%' }}>
                    <input
                      className="form-control form-control1"
                      style={{}}
                      name="from_name"
                      placeholder="성함"
                      required
                    ></input>
                    <input
                      className="form-control form-control1"
                      type="tel"
                      placeholder="연락처"
                      name="from_tel"
                      required
                    ></input>
                  </div>
                  <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%' }}>
                    <input
                      className="form-control form-control1"
                      type="email"
                      placeholder="이메일"
                      style={{ height: '46px' }}
                      name="email"
                      required
                    ></input>
                    <input
                      className="form-control form-control1"
                      placeholder="회사명"
                      style={{ height: '46px' }}
                      name="company"
                      required
                    ></input>
                  </div>
                  <div style={{ width: '100%', height: '40%' }}>
                    <textarea
                      className="form-control form-control1"
                      style={{ outline: 'none' }}
                      name="message"
                      required
                    ></textarea>
                  </div>
                  <div style={{ display: 'flex', alignItems: 'center', width: '100%' }}>
                    <input id="checkbox" required type="checkbox" />
                    <img id="con7" src={contactus_agree} alt="" />

                    <input id="con8" type="image" required src={contactus_send} />
                  </div>
                  <a href="/">
                    <img id="fixed_goto" src={service_bottom_button} alt="" />
                  </a>
                </Col>
              </Row>
            </Col>
          </Row>
        </form>
      </Container>
    </div>
  );
}
export default ContactUs;
