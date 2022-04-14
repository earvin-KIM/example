import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api';

class Service {
  get(Table) {
    return axios.get(API_BASE_URL + '/' + Table);
  }

  create(Table, Message) {
    return axios.post(API_BASE_URL + '/' + Table, Message);
  }

  getById(Table, Id) {
    return axios.get(API_BASE_URL + '/' + Table + '/' + Id);
  }

  update(Table, Id) {
    return axios.put(API_BASE_URL + '/' + Table + '/' + Id);
  }

  delete(Table, Id) {
    return axios.delete(API_BASE_URL + '/' + Table + '/' + Id);
  }
}

export default new Service();
