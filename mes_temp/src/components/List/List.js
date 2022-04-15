import React, { Component } from 'react';
import Service from '../../service/service';

class ListErrorcodeComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {
      Data: [],
    };
    this.addErrorcode = this.add.bind(this);
    this.editErrorcode = this.edit.bind(this);
    this.deleteErrorcode = this.delete.bind(this);
  }

  delete(table, id) {
    Service.delete(table, id).then((res) => {
      this.setState({ Data: this.state.Data.filter((data) => data.table.id !== id) });
    });
  }
  view(table, id) {
    this.props.history.push(`/view/${table}/${id}`);
  }
  edit(table, id) {
    this.props.history.push(`/add/${table}/${id}`);
  }
  componentDidMount() {
    Service.get(table).then((res) => {
      this.setState({ Data: res.data });
    });
  }
  add(table) {
    this.props.history.push(`/add/${table}/_add`);
  }

  render() {
    return (
      <div>
        <h2 className="text-center"> List</h2>
        <div className="row">
          <button className="btn btn-primary" onClick={this.add}>
            {' '}
            Add
          </button>
        </div>
        <br></br>
        <div className="row">
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th> column 1</th>
                <th> column 2</th>
                <th> column 3</th>
                <th> Actions</th>
              </tr>
            </thead>
            <tbody>
              {this.state.Data.map((data) => (
                <tr key={data.id}>
                  <td> {Errorcode.discription} </td>
                  <td> {Errorcode.error_name}</td>
                  <td> {Errorcode.error_code}</td>
                  <td>
                    <button onClick={() => this.editErrorcode(Errorcode.id)} className="btn btn-info">
                      Update{' '}
                    </button>
                    <button
                      style={{ marginLeft: '10px' }}
                      onClick={() => this.deleteErrorcode(Errorcode.id)}
                      className="btn btn-danger"
                    >
                      Delete{' '}
                    </button>
                    View{' '}
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

export default ListErrorcodeComponent;
