import React from 'react';
import './footer.css';
import btn_Blog from '../btn_blog.png';
import btn_Facebook from '../btn_facebook.png';
import btn_Insta from '../btn_insta.png';
function Footer(props) {
  const {
    text_Label = (
      <div>
        경기도 성남시 수정구 <br />
        대왕판교로 815,
        <br />
        창업존 기업지원허브 722호
      </div>
    ),
    ub300ud45cuc774uac74ud638u3163uc0ac = '대표: 이건호ㅣ사업자 번호:',
    phone = '123-456-7890',
    fkfkflgAbptrsCom = 'fkfkflg@abptrs.com',
    wwwAbicptrsCopytri = (
      <div>
        www.abicptrs
        <br />
        COPYTRIGHT@2021 ABIC PARTNERS ALL RIGHTS RESERVED.
      </div>
    ),
    btnFacebookProps = { overlapGroup: 'group-3-2.png', group3: 'group-3-2.png' },
    btnInstaProps = {
      group4: 'oval-2.png',
      group8: 'group-3-1.png',
      fill4: 'fill-4-1.png',
      fill6: 'fill-6-1.png',
    },
    btnBlogProps = {
      group14: 'group-3.png',
      fillContainer: 'fill-4.png',
      fill6: 'fill-6.png',
      fill8: 'fill-8.png',
      fill10: 'fill-10.png',
      fill12: 'fill-12.png',
    },
  } = props;

  return (
    <div className="container-center-horizontal">
      <div className="footer screen">
        <div className="overlap-group2">
          <div className="btn_-container">
            <BtnFacebook
              btn_Facebook={btn_Facebook}
              overlapGroup={btnFacebookProps.overlapGroup}
              group3={btnFacebookProps.group3}
            />
            <BtnInsta
              group4={btn_Insta}
              group8={btnInstaProps.group8}
              fill4={btnInstaProps.fill4}
              fill6={btnInstaProps.fill6}
            />
            <BtnBlog
              btn_Blog={btn_Blog}
              group14={btnBlogProps.group14}
              fillContainer={btnBlogProps.fillContainer}
              fill6={btnBlogProps.fill6}
              fill8={btnBlogProps.fill8}
              fill10={btnBlogProps.fill10}
              fill12={btnBlogProps.fill12}
            />
          </div>
          <h1 className="text_label notosanskr-medium-mountain-mist-25px">{text_Label}</h1>
          <div className="x notosanskr-medium-mountain-mist-25px">{ub300ud45cuc774uac74ud638u3163uc0ac}</div>
          <div className="phone notosanskr-medium-mountain-mist-25px">{phone}</div>
          <div className="fkfkflgabptrscom notosanskr-medium-mountain-mist-25px">{fkfkflgAbptrsCom}</div>
          <div className="wwwabicptrs-copytri">{wwwAbicptrsCopytri}</div>
        </div>
      </div>
    </div>
  );
}

function BtnFacebook(props) {
  const { btn_Facebook = 'oval-2.png', overlapGroup = 'group-3-2.png', group3 = 'group-3-2.png' } = props;

  return (
    <div className="btn_facebook">
      <div className="btn_facebook-1" style={{ backgroundImage: `url(${btn_Facebook})` }}>
        <div className="overlap-group" style={{ backgroundImage: `url(${overlapGroup})` }}>
          <div className="group-3" style={{ backgroundImage: `url(${group3})` }}></div>
        </div>
      </div>
    </div>
  );
}

function BtnInsta(props) {
  const { group4, group8, fill4, fill6 } = props;

  return (
    <div className="btn_insta">
      <div className="group-4" style={{ backgroundImage: `url(${group4})` }}>
        <div className="group-8" style={{ backgroundImage: `url(${group8})` }}>
          <div className="fill-container">
            <img className="fill-4" src={fill4} />
            <img className="fill-6" src={fill6} />
          </div>
        </div>
      </div>
    </div>
  );
}

function BtnBlog(props) {
  const { btn_Blog, group14, fillContainer, fill6, fill8, fill10, fill12 } = props;

  return (
    <div className="btn_blog">
      <div className="btn_blog-1" style={{ backgroundImage: `url(${btn_Blog})` }}>
        <div className="group-14" style={{ backgroundImage: `url(${group14})` }}>
          <div className="fill-container-1" style={{ backgroundImage: `url(${fillContainer})` }}>
            <img className="fill-6-1" src={fill6} />
            <img className="fill-8" src={fill8} />
            <img className="fill-10" src={fill10} />
            <img className="fill-12" src={fill12} />
          </div>
        </div>
      </div>
    </div>
  );
}

// const btnFacebookData = {
//   btn_Facebook: 'oval-2.png',
//   overlapGroup: 'group-3-2.png',
//   group3: 'group-3-2.png',
// };

// const btnInstaData = {
//   group4: 'oval-2.png',
//   group8: 'group-3-1.png',
//   fill4: 'fill-4-1.png',
//   fill6: 'fill-6-1.png',
// };

// const btnBlogData = {
//   btn_Blog: 'oval-2.png',
//   group14: 'group-3.png',
//   fillContainer: 'fill-4.png',
//   fill6: 'fill-6.png',
//   fill8: 'fill-8.png',
//   fill10: 'fill-10.png',
//   fill12: 'fill-12.png',
// };

// const footerData = {
//   text_Label: (
//     <div>
//       경기도 성남시 수정구 <br />
//       대왕판교로 815,
//       <br />
//       창업존 기업지원허브 722호
//     </div>
//   ),
//   ub300ud45cuc774uac74ud638u3163uc0ac: '대표: 이건호ㅣ사업자 번호:',
//   phone: '123-456-7890',
//   fkfkflgAbptrsCom: 'fkfkflg@abptrs.com',
//   wwwAbicptrsCopytri: (
//     <div>
//       www.abicptrs
//       <br />
//       COPYTRIGHT@2021 ABIC PARTNERS ALL RIGHTS RESERVED.
//     </div>
//   ),
//   btnFacebookProps: btnFacebookData,
//   btnInstaProps: btnInstaData,
//   btnBlogProps: btnBlogData,
// };

export default Footer;
