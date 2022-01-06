import { Component } from 'react';
import './Home.css';

class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }
  render() {
    return (
      <div>
        <div className="bg">
          <span className="\-">내 손 안의 컨설턴트</span>
          <span className="AI-Based-Business-In">AI Based Business Insight Consulting</span>
          <span className="\-">데이터셋을 활용하여 인사이트를 제공하는 NEW BUSINESS BUILD 플랫폼</span>
          {/* <!-- png -->  */}
          <img
            src="img/learn-more-btn.png"
            srcset="img/learn-more-btn@2x.png 2x, 
 img/learn-more-btn@3x.png 3x"
            className="Learn-More_btn"
          />
          {/* <!-- svg -->  */}
          <img src="img/learn-more-btn.svg" className="Learn-More_btn" />
          {/* <!-- webp -->  */}
          <img
            src="img/learn-more-btn.webp"
            srcset="img/learn-more-btn@2x.webp 2x, 
 img/learn-more-btn@3x.webp 3x"
            className="Learn-More_btn"
          />
          {/* <!-- jpg -->  */}
          <img
            src="img/image-intro.jpg"
            srcset="img/image-intro@2x.jpg 2x, 
 img/image-intro@3x.jpg 3x"
            className="image_intro"
          />
          {/* <!-- png -->  */}
          <img
            src="img/image-intro.png"
            srcset="img/image-intro@2x.png 2x, 
 img/image-intro@3x.png 3x"
            className="image_intro"
          />
          {/* <!-- webp -->  */}
          <img
            src="img/image-intro.webp"
            srcset="img/image-intro@2x.webp 2x, 
 img/image-intro@3x.webp 3x"
            className="image_intro"
          />
        </div>
      </div>
    );
  }
}

export default Home;
