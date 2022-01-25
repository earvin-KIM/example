import React, { Component, useState, useEffect } from 'react';
import BoardData from '../service/BoardData';
import axios from 'axios';
import BootstrapTable from 'react-bootstrap-table-next';
import paginationFactory from 'react-bootstrap-table2-paginator';
import portfolio_intro from './img/portfolio/portfolio_intro_banner.png';

function Portfolio(props) {
  const [boards, setBoards] = useState([]);
  useEffect(() => {
    BoardData.getBoards().then((res) => {
      console.log(res.data);
      setBoards(res.data);
    });
  }, []);
  const columns = [
    {
      dataField: 'id',
      text: 'Product ID',
    },
    {
      dataField: 'id',
      text: 'Product Name',
    },
    {
      dataField: 'id',
      text: 'Product Price',
    },
  ];
  console.log(boards.length);
  var products = boards.map((board) => ({
    id: <img key={board.rownum} src={require(`../../../../home/upload/${board.img_path}`)} />,
  }));

  console.log(products);
  const del = function () {
    BoardData.add();
  };
  let i = 0;
  // while (i < boards.length) {
  //   if (i % 3 === 0) {
  //     products[i] = { id: 1 };
  //   } else if (i % 3 === 1) {
  //     products[i] = { id: 2 };
  //   } else if (i % 3 === 2) {
  //     products[i] = { id: 3 };
  //   }
  //   i++;
  // }
  // this.componentDidCatch;
  return (
    <div className="content-wrapper">
      <section className="content">
        <div id="topimg">
          <img src={portfolio_intro} width={'100%'} />
        </div>
        <p>
          <input type="file" />
        </p>

        <div id="port">
          {boards.map((board) => (
            <div key={board.rownum}>
              <div>
                <img
                  src={require(`../../../../home/upload/${board.img_path}`)}
                  width={'500px'}
                  height={'500px'}
                  style={{ display: 'flex' }}
                  className="currentPage"
                />
                <button>삭제</button>
              </div>
            </div>
          ))}
        </div>
      </section>
      {/* <BootstrapTable keyField="id" data={products} columns={columns} pagination={paginationFactory()} /> */}
    </div>
  );
}

export default Portfolio;
