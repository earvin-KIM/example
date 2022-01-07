import React, { useRef } from 'react';
import './contact.css';
import emailjs from 'emailjs-com';
import overlapGroup from '../map.png';
import group32 from '../ic_location.png';
import miaBakerJjhvyxm34NyUnsplash from '../image_contact.png';

function ContactUs(props) {
  const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();
    // console.log('1');
    emailjs.sendForm('abic_test', 'template_vivy82z', form.current, 'user_sxVbzxln0UM3Drm3yxXEa').then(
      (result) => {
        console.log(result.text);
        alert('문의를 보냈습니다.');
      },
      (error) => {
        console.log(error.text);
      }
    );
  };
  const {
    contactUs2 = 'Contact Us',
    line = '../line.png',
    contactUs3 = 'Contact Us',
    text_Label3 = '구분',
    text_Label4 = '성명',
    text_Label5 = '이메일',
    text_Label6 = '내용',
    text_Label7 = '문의하기',
    line2 = 'line-1.png',
    location = 'Location',
    ubcf8uc0acuacbduae30ub3c4uc131ub0a8 = '본사= 경기도 성남시 수정구 대왕판교로 815, 창업존 기업지원허브 722호',
    // oval2 = 'oval-1.png',
    // group32 = 'group-3.png',
  } = props;

  return (
    <div className="contactcontainer-center-horizontal">
      <form ref={form} onSubmit={sendEmail}>
        <div className="contactcontactus contactscreen">
          <div className="contactflex-col">
            <h1 className="contacttitle contactsdcompsans-clt-normal-chicago-120px">{contactUs2}</h1>
            <img className="contactline" src={line} />
          </div>
          <div className="contactflex-row">
            <div className="contactflex-col-1">
              <div className="contactcontact-us-1 contactsdcompsans-emd-normal-chicago-60px">{contactUs3}</div>
              <div className="contacttext_label-container contactapplesdgothicneo-normal-chicago-30px">
                <div className="contacttext_label-3">{text_Label3}</div>
                <div className="contacttext_label-4">{text_Label4}</div>
              </div>
              <div className="contactflex-row-1">
                <div className="contactrectangle contactborder-1px-mountain-mist">
                  <input className="form-control form-control1" style={{}} placeholder="(구분)" name="division"></input>
                </div>
                <div className="contactrectangle-1 contactborder-1px-mountain-mist">
                  <input
                    className="form-control form-control1"
                    style={{}}
                    placeholder="(name)"
                    name="from_name"
                  ></input>
                </div>
              </div>
              <div className="contacttext_label contactapplesdgothicneo-normal-chicago-30px">{text_Label5}</div>
              <div className="contactrectangle-2 contactborder-1px-mountain-mist">
                <input
                  className="form-control form-control1"
                  type="email"
                  style={{ height: '46px' }}
                  placeholder="email"
                  name="email"
                ></input>
              </div>
              <div className="contacttext_label contactapplesdgothicneo-normal-chicago-30px">{text_Label6}</div>
              <div className="contactflex-col-2">
                <div className="contactrectangle-3 contactborder-1px-mountain-mist">
                  <textarea
                    className="form-control form-control1"
                    style={{ outline: 'none' }}
                    name="message"
                  ></textarea>
                </div>
                <input type="submit" value="문의하기" className="contactgroup-1 contactborder-1px-mountain-mist">
                  {/* <div className="contacttext_label-5 contactapplesdgothicneo-normal-chicago-30px">{text_Label7}</div> */}
                </input>
              </div>
            </div>
            <img className="contactmia-baker-jjhvyxm34n-y-unsplash" src={miaBakerJjhvyxm34NyUnsplash} />
          </div>
          <div className="contactflex-col-3">
            <img className="contactline-1" src={line2} />
            <div className="contactlocation contactsdcompsans-emd-normal-chicago-60px">{location}</div>
            <div className="contactx">{ubcf8uc0acuacbduae30ub3c4uc131ub0a8}</div>
            <div className="contactoverlap-group" style={{ backgroundImage: `url(${overlapGroup})` }}>
              <div className="contactgroup-3-1" style={{ backgroundImage: `url(${group32})` }}></div>
            </div>
          </div>
        </div>
      </form>
    </div>
  );
}

// const contactUsData = {
//   group6= 'abic-group-6.png',
//   group9= 'our-work-group-9.png',
//   group12= 'porfolio-group-12.png',
//   group3= 'group-3-1.png',
//   intro= 'Intro',
//   text_Label= '신사업 경영 컨설팅 솔루션',
//   text_Label2= '주요 솔루션',
//   aboutUs= 'About Us',
//   contactUs= 'Contact Us',
//   contactUs2= 'Contact Us',
//   line= 'line-1.png',
//   contactUs3= 'Contact Us',
//   text_Label3= '구분',
//   text_Label4= '성명',
//   text_Label5= '이메일',
//   text_Label6= '내용',
//   text_Label7= '문의하기',
//   miaBakerJjhvyxm34NyUnsplash= 'mia-baker-jjhvyxm34ny-unsplash.jpg',
//   line2= 'line-1.png',
//   location= 'Location',
//   ubcf8uc0acuacbduae30ub3c4uc131ub0a8= '본사= 경기도 성남시 수정구 대왕판교로 815, 창업존 기업지원허브 722호',
//   overlapGroup= 'u1109u1173u110fu1173u1105u1175u11abu1109u1163u11ba-2021-12-10-u110bu1169u1112u116e-33046.png',
//   oval2= 'oval-1.png',
//   group32= 'group-3.png',
// };
export default ContactUs;
