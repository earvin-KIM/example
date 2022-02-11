import React from 'react';
import AboutUs from './page/about';
import Intro from './page/intro';
import Header from './component/header';
import Footer from './component/footer';
import Service from './page/service';
import ContactUs from './page/contact';
import Soultion from './page/soultion';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Header></Header>
      <div id="top"></div>
      <a href="#top">
        <button className="btn btn-primary" style={{ position: 'fixed', bottom: 0, right: 0, zIndex: 10 }}>
          top
        </button>
      </a>
      <Routes>
        <Route path="/" exact element={<Intro />} />
        <Route path="/about" element={<AboutUs />} />
        <Route path="/service" element={<Service />} />
        <Route path="/contact" element={<ContactUs />} />
        <Route path="/soultion" element={<Soultion />} />
      </Routes>

      <Footer></Footer>
    </BrowserRouter>
  );
}

export default App;
