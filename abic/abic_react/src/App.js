import { Route, Link, Routes } from 'react-router-dom';
import About from './component/About';
import Home from './component/Home';
// import Header from './component/Header';
import Footer from './component/Footer';
import New_sol from './component/New_sol';
import { BrowserRouter } from 'react-router-dom';

import './App.css';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <div>
          {/* <Header></Header> */}
          <div className="Header_bg">
            <span className="Intro">
              <Link to="/">Intro</Link>
            </span>
            <span className="\-">
              <Link to="/new_sol">신사업 경영 컨설팅 솔루션</Link>
            </span>
            <span className="\=">
              <Link to="/im_sol">주요 솔루션</Link>
            </span>
            <span className="About-Us">
              <Link to="/about">About Us</Link>
            </span>
            <span className="Contact-Us">
              <Link to="/contact">Contact Us</Link>
            </span>
          </div>
        </div>
        <div>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/new_sol" element={<New_sol />} />
          </Routes>
        </div>
        <div>
          <Footer></Footer>
        </div>{' '}
      </BrowserRouter>
    </div>
  );
}

export default App;
