import React, { Component } from 'react';
import './App.css';
import Nav_top from './components/Nav_top';
import Home from './components/Home';
import About_us from './components/About_us';
import Our_work from './components/Our_work';
import Portfolio from './components/Portfolio';
import Contact_us from './components/Contact_us';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      mode: 'home',
    };
  }
  page() {
    var _article;
    if (this.state.mode === 'home') {
      _article = <Home></Home>;
    } else if (this.state.mode === 'about_us') {
      _article = <About_us></About_us>;
    } else if (this.state.mode === 'our_work') {
      _article = <Our_work></Our_work>;
    } else if (this.state.mode === 'portfolio') {
      _article = <Portfolio></Portfolio>;
    } else if (this.state.mode === 'contact_us') {
      _article = <Contact_us></Contact_us>;
    }
    return _article;
  }
  render() {
    return (
      <div className="wrapper">
        <Nav_top
          pagemode={function (_mode) {
            this.setState({ mode: _mode });
          }.bind(this)}
        ></Nav_top>
        {this.page()}
        <img src="http://www.qptrs.com/cnr/resources/footer/footer.png" width={'100%'} />
      </div>
    );
  }
}

export default App;
