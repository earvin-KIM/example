/*!

=========================================================
* Paper Dashboard React - v1.3.0
=========================================================

* Product Page: https://www.creative-tim.com/product/paper-dashboard-react
* Copyright 2021 Creative Tim (https://www.creative-tim.com)

* Licensed under MIT (https://github.com/creativetimofficial/paper-dashboard-react/blob/main/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import Dashboard from 'views/Dashboard.js';
import Notifications from 'views/Notifications.js';
import Icons from 'views/Icons.js';
import Typography from 'views/Typography.js';
import TableList from 'views/Tables.js';
import Maps from 'views/Map.js';
import UserPage from 'views/User.js';
import UpgradeToPro from 'views/Upgrade.js';

var routes = [
  {
    path: '/dashboard',
    name: '수주관리',
    icon: 'nc-icon nc-bank',
    component: Dashboard,
    layout: '/admin',
  },
  {
    path: '/icons',
    name: '생산관리',
    icon: 'nc-icon nc-diamond',
    component: Icons,
    layout: '/admin',
  },
  {
    path: '/maps',
    name: '공정관리',
    icon: 'nc-icon nc-pin-3',
    component: Maps,
    layout: '/admin',
  },
  {
    path: '/notifications',
    name: '재고관리',
    icon: 'nc-icon nc-bell-55',
    component: Notifications,
    layout: '/admin',
  },
  {
    path: '/user-page',
    name: '품질관리',
    icon: 'nc-icon nc-single-02',
    component: UserPage,
    layout: '/admin',
  },
  {
    path: '/tables',
    name: '설비관리',
    icon: 'nc-icon nc-tile-56',
    component: TableList,
    layout: '/admin',
  },
  {
    path: '/typography',
    name: '모니터링',
    icon: 'nc-icon nc-caps-small',
    component: Typography,
    layout: '/admin',
  },
  {
    path: '/upgrade',
    name: '기준정보',
    icon: 'nc-icon nc-spaceship',
    component: UpgradeToPro,
    layout: '/admin',
  },
];
export default routes;
