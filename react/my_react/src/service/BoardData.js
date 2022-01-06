const { default: axios, Axios } = require('axios');
// axios 사용 정의
//import axios from ;
// 스프링부트 api 의 url 정의
const BOARD_API_BASE_URL = 'http://localhost:8080/api/board';
// 글목록 데이터를 가져오는 함수
class BoardData {
  //글 리스트 함수. axios 의 get 함수를 사용해서 통신한다.
  getBoards() {
    return axios.get(BOARD_API_BASE_URL);
  }
  //글 작성 함수 . axios의 post함수를 사용해서 통신한다.
  createBoard(board) {
    return axios.post(BOARD_API_BASE_URL, board);
  }
}
export default new BoardData();
