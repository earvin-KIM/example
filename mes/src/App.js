import React, { Component } from 'react';
import Service from './service/service';

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      Errorcodes: [],
    };
    this.deleteErrorcode = this.deleteErrorcode.bind(this);
  }

  delete(table, id) {
    Service.delete(table, id).then((res) => {
      this.setState({ Errorcodes: this.state.Errorcodes.filter((Errorcode) => Errorcode.id !== id) });
    });
  }

  render() {
    return (
      <div>
        <h2 className="text-center">Errorcodes List</h2>
        <div className="row"></div>
        <br></br>
        <div className="row">
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th> Errorcode First Name</th>
                <th> Errorcode Last Name</th>
                <th> Errorcode Email Id</th>
                <th> Actions</th>
              </tr>
            </thead>
            <tbody>
              {this.state.Errorcodes.map((Errorcode) => (
                <tr key={Errorcode.id}>
                  <td> {Errorcode.discription} </td>
                  <td> {Errorcode.error_name}</td>
                  <td> {Errorcode.error_code}</td>
                  <td>
                    <button
                      style={{ marginLeft: '10px' }}
                      onClick={() => this.deleteErrorcode(Errorcode.id)}
                      className="btn btn-danger"
                    >
                      Delete{' '}
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default App;
