import AboutUs from './page/about';
import ABIC from './page/abic';
import Header1 from './component/header';
import Footer from './component/footer';
import OurWork from './page/ourwork';
import ContactUs from './page/contact';
import Porfolio from './page/portfolio';
import { BrowserRouter } from 'react-router-dom';
import { Route, Routes } from 'react-router-dom';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';

function App() {
  return (
    <BrowserRouter>
      <Header1></Header1>

      <Routes>
        <Route path="/" exact element={<ABIC />} />
        <Route path="/about" element={<AboutUs />} />
        <Route path="/ourwork" element={<OurWork />} />
        <Route path="/contact" element={<ContactUs />} />
        <Route path="/portfolio" element={<Porfolio />} />
      </Routes>

      <Footer></Footer>
    </BrowserRouter>
  );
}

export default App;
