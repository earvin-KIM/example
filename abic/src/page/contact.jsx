/* global kakao */
import React, { useRef, useEffect } from 'react';
import './contact.css';
import emailjs from '@emailjs/browser';
import { Container, Row, Col } from 'react-bootstrap';

import contact_img from '../img/image_contact.png';

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
    <div className="contact_us">
      <Container>
        <form ref={form} onSubmit={sendEmail}>
          <div>
            <Row>
              <Col>
                <div>
                  <h1>Contact Us</h1>
                </div>
              </Col>
            </Row>
            <div>
              <div>
                <div>Contact Us</div>
                <Row>
                  <Col>
                    <Row>
                      <Col>
                        <div>
                          <div>Location</div>
                        </div>
                        <div>경기도 성남시 수정구 대왕판교로 815, 창업존 기업지원허브 722호</div>
                      </Col>
                      <Col>
                        <div>이름</div>
                      </Col>
                    </Row>
                    <Row>
                      <Col></Col>
                      <Col>
                        <div>
                          <input
                            className="form-control form-control1"
                            style={{}}
                            placeholder="(name)"
                            name="from_name"
                            required
                          ></input>
                        </div>
                      </Col>
                    </Row>
                    <Row>
                      <Col>
                        <div>
                          <div id="map" style={{ width: '500px', height: '400px' }}></div>
                        </div>
                      </Col>
                      <Col>
                        <div>이메일</div>
                        <input
                          className="form-control form-control1"
                          type="email"
                          style={{ height: '46px' }}
                          placeholder="email"
                          name="email"
                          required
                        ></input>
                        <div>내용</div>
                        <div>
                          <textarea
                            className="form-control form-control1"
                            style={{ outline: 'none' }}
                            name="message"
                            required
                          ></textarea>
                        </div>
                        <input className="btn btn-primary" type="submit" value="문의하기"></input>
                      </Col>
                    </Row>
                  </Col>
                </Row>
              </div>
            </div>
          </div>
        </form>
      </Container>
    </div>
  );
}
export default ContactUs;
