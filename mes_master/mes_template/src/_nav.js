import React from 'react'
import CIcon from '@coreui/icons-react'
import {
  cilBell,
  cilCalculator,
  cilChartPie,
  cilCursor,
  cilDrop,
  cilNotes,
  cilPencil,
  cilPuzzle,
  cilSpeedometer,
  cilStar,
} from '@coreui/icons'
import { CNavGroup, CNavItem, CNavTitle } from '@coreui/react'

const _nav = [
  {
    component: CNavTitle,
    name: 'Theme',
  },
  {
    component: CNavGroup,
    name: '수주관리',
    to: '/dashboard',
    icon: <CIcon icon={cilSpeedometer} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '수주등록',
        to: '/base/accordione',
      },
      {
        component: CNavItem,
        name: '발주등록',
        to: '/base/breadcrumbs',
      },
      {
        component: CNavItem,
        name: '수주/발주 현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '생산계획',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '출하지시',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '출하실적',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '재품재고 현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '주문서 관리',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '생산관리',
    to: '/theme/colors',
    icon: <CIcon icon={cilDrop} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '작업지시현황',
        to: '/base/accordion',
      },
      {
        component: CNavItem,
        name: '작업진척현황',
        to: '/base/breadcrumbs',
      },
      {
        component: CNavItem,
        name: '제품별 생산실적',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '기간별 생산실적',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '제조이력 정추적 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '제조이력 역추적 관리',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '공정관리',
    to: '/theme/typography',
    icon: <CIcon icon={cilPencil} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '공정등록',
        to: '/base/accordion',
      },
      {
        component: CNavItem,
        name: '원재료 입고공정 관리',
        to: '/base/breadcrumbs',
      },
      {
        component: CNavItem,
        name: '출하공정 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공정도 등록',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '작업지시 등록',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '작업자 등록',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '품목별 검사기준',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '비가동 등록',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '작업표준 관리',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '재고관리',
    to: '/base',
    icon: <CIcon icon={cilPuzzle} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '원자재 입고현황',
        to: '/base/accordion',
      },
      {
        component: CNavItem,
        name: 'TAG 관리',
        to: '/base/breadcrumbs',
      },
      {
        component: CNavItem,
        name: '재공재고 입출고 현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '자재재고 현황',
        to: '/base/carousels',
      },
      {
        component: CNavItem,
        name: '자재재고 조정 및 이동',
        to: '/base/collapses',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '품질관리',
    to: '/buttons',
    icon: <CIcon icon={cilCursor} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '수입검사',
        to: '/buttons/buttons',
      },
      {
        component: CNavItem,
        name: '원재료 인수검사',
        to: '/buttons/button-groups',
      },
      {
        component: CNavItem,
        name: '출하검사 성적표',
        to: '/buttons/dropdowns',
      },
      {
        component: CNavItem,
        name: '부적합 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '반품 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공정 모니터링',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '온도 점검표',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '설비관리',
    icon: <CIcon icon={cilNotes} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '설비 일상점검 현황',
        to: '/forms/form-control',
      },
      {
        component: CNavItem,
        name: '설비 예방점검 현황',
        to: '/forms/select',
      },
      {
        component: CNavItem,
        name: '설비부품 및 자재관리',
        to: '/forms/checks-radios',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '모니터링',
    to: '/charts',
    icon: <CIcon icon={cilChartPie} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '생산진척현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '작업지시 및 진척현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '제품불량현황',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '안내문 Display',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '시간당 생산량',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '반품율',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '재고 절감율',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '납기 준수율',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '기준정보',
    icon: <CIcon icon={cilStar} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '공통코드관리',
        to: '/icons/coreui-icons',
      },
      {
        component: CNavItem,
        name: '제품 마스터 관리',
        to: '/icons/flags',
      },
      {
        component: CNavItem,
        name: '원자재 마스터 관리',
        to: '/icons/brands',
      },
      {
        component: CNavItem,
        name: 'BOM',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공정별 작업자 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공정코드 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '불량코드 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '부서 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '고객 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공급사 관리',
        to: '/base/cards',
      },
    ],
  },
  {
    component: CNavGroup,
    name: '시스템관리',
    icon: <CIcon icon={cilBell} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: '사용자 설정',
        to: '/notifications/alerts',
      },
      {
        component: CNavItem,
        name: '사용자 화면설정',
        to: '/notifications/badges',
      },
      {
        component: CNavItem,
        name: '시스템 설정 관리',
        to: '/notifications/modals',
      },
      {
        component: CNavItem,
        name: '암호 변경',
        to: '/notifications/toasts',
      },
      {
        component: CNavItem,
        name: '자료실 관리',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: '공지사항 관리',
        to: '/base/cards',
      },
    ],
  },
]

export default _nav
