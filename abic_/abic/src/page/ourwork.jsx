import React from 'react';
import { Table } from 'react-bootstrap';
import './ourwork.css';
import overlapGroup1 from '../bg_sol_1.png';
function OurWork(props) {
  const { text_Label3 = '신사업 경영 컨설팅 솔루션' } = props;

  return (
    <>
      <div className="ourworkoverlap-group1" style={{ backgroundImage: `url(${overlapGroup1})` }}>
        <h1 className="ourworktext_label-2 ourworknotosanskr-normal-white-80px">{text_Label3}</h1>
      </div>
      <br />
      <div className="wrapper" style={{ width: '85vw', margin: 'auto' }}>
        <Table bordered>
          <thead>
            <tr>
              <th>단계</th>
              <th>1.Pre-stage</th>
              <th>2.초벌</th>
              <th>3.두벌</th>
              <th>4.세벌</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>질의/응답</td>
              <td>가치사슬형</td>
              <td>Rough한 질문</td>
              <td>Specific 질문</td>
              <td>의사결정에 대한 질문</td>
            </tr>
            <tr>
              <td>산출물</td>
              <td>기본적BM 유형 파악</td>
              <td>TAM/SAM 규모/성장성/경쟁자 현황 검색/추정</td>
              <td>
                <ul>
                  <li>SOM시장 규모/성장성 검색/추정</li> <li> SOM시장 경쟁현황 분석</li>
                </ul>
              </td>
              <td>
                <ul>
                  <li>SOM시장 전략방향 옵션</li> <li> who/what/how 2~3개 제시</li>
                </ul>
              </td>
            </tr>
          </tbody>
        </Table>
        <br />
        <ol>
          <b>
            <li>에이빅v1.0은 4단계로 구성된다.</li>
          </b>
          -1단계 pre-stage에서는 고객사가 구상 중인 신사업모델에 대한 기본적인 정보를 얻고, 이를 통해 사업모델 유형을
          결정한다. <br /> - 2단계 초벌추정에서는 보다 상세한 정보를 질의하고 여기서 나오는 정보를 바탕으로 TAM/SAM
          시장에 대해, 시장규모, 성장잠재력 및 경쟁자 현황에 대해 검색/추정 결과를 무료로 제공한다. <br /> - 3단계에서는
          보다 구체적인 질문을 통해 상세한 정보를 확보 하고 이를 바탕으로 SOM 시장에 대한 규모/잠재력 뿐만 아니라 경쟁사
          현황에 대한 정보를 제공한다. (3단계 역시 무료이나 여기서 부터는 회원가입을 요구한다) <br />- 4단계에서는
          전략적 의사결정에 대해 질문하고 이를 바탕으로 SOM시장에서 추진 가능한 who-what-how에 대한 가설적 방향을
          제시한다.
          <b>
            <li>에이빅v1.0은 하이브리드 모델(기술+서비스)로 개발한다.</li>
          </b>
          <b>
            <li>세벌단계부터는 딥리서치 등 다양한 온라인리서치 기관의 솔루션을 붙여 쓸 수도 있다.</li>
          </b>
        </ol>
        <br />
        <h1>에이빅v1.0 Pre-stage : 사업모델 개요 서술</h1>
        <Table bordered>
          <thead>
            <tr>
              <th colSpan={2}>창업자는 다음과 같은 양식에 맞춰 자신이 구상하고 있는 사업모델을 간략하게 서술함</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>누구에게</td>
              <td>오디오기기를 사랑하는 음악애호가를 위해</td>
            </tr>
            <tr>
              <td>무엇을</td>
              <td>손실없이 모든 파일을 재생하는 휴대용 음악 플레이어를</td>
            </tr>
            <tr>
              <td>어떻게 (판매)제공할 것인가?</td>
              <td>온라인 쇼핑몰을 통해 판매 한다</td>
            </tr>
            <tr>
              <td>기존 경쟁사와 비교할 때 뭐가 더 좋은가?</td>
              <td>아이팟과 같은 압축 파일 플레이오와는 월등히 다른 보다 향상된 음원 품질을 제공한다</td>
            </tr>
            <tr>
              <td>수익은 어떻게 창출하는가?</td>
              <td>제품을 팔아서 수익 창출한다.</td>
            </tr>
          </tbody>
        </Table>
        <p>창업자에게 구상중인 사업모델을 간략하게 서술하게 하여 개략적인 이해를 한다</p>
        <br />
        <h1>에이빅v1.0 Pre-stage : 사업모델 유형분석 질문</h1>
        <Table bordered>
          <thead>
            <tr>
              <th rowSpan={2} colSpan={2}>
                다음 10가지 질문을 통해 사업모델을 유형 구분
              </th>
              <th colSpan={2}>Answer</th>
            </tr>
            <tr>
              <th>Y</th>
              <th>N</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>사업 초기 단계부터 목표고객이 명확하고, 이들을 대상으로 수익을 창출하는 것이 중요합니다. </td>
              <td>가치사슬</td>
              <td></td>
            </tr>
            <tr>
              <td>2</td>
              <td>사업 초기 단계에서 회원 가입수를 늘이는 것이 수익창출보다 더 중요합니다.</td>
              <td>플랫폼</td>
              <td>가치사슬</td>
            </tr>
            <tr>
              <td>3</td>
              <td>판매자로서 고객(수요자)에게 제품/서비스의 ‘판매’를 통해 고객가치를 제공합니다.</td>
              <td>가치사슬</td>
              <td>플랫폼</td>
            </tr>
            <tr>
              <td>4</td>
              <td>
                수요측 참여자와 공급측 참여자를 연결시키는 역할을 통해 수요측과 공급측 모두에게 가치를 제공합니다.
              </td>
              <td>플랫폼</td>
              <td>가치사슬</td>
            </tr>
            <tr>
              <td>5</td>
              <td>
                사업 성공을 위해 일반적인 마케팅 뿐만 아니라 온/오프라인 유통망(도/소매점, 이커머스 채널 등)개척이
                중요합니다.
              </td>
              <td>가치사슬</td>
              <td>플랫폼</td>
            </tr>
            <tr>
              <td>6</td>
              <td>
                사업 성공을 위해 초기에 바이럴 등 다양한 인지도 마케팅을 통해 회원을 확보하는 것이 매우 중요합니다.
              </td>
              <td>플랫폼</td>
              <td>가치사슬</td>
            </tr>
            <tr>
              <td>7</td>
              <td>
                수요측과 공급측 회원(참여자)들이 상호간 정보나 제품/서비스 등을 주고 받는 활발한 ‘상호작용’이 일어나고
                이를 통해 네트워크효과를 발생시키는 것이 성공의 중요 요소입니다.
              </td>
              <td>플랫폼</td>
              <td>가치사슬</td>
            </tr>
            <tr>
              <td>8</td>
              <td>차별적 기술, 유통망 확보, 고객 서비스 등이 성공의 중요 요소입니다.</td>
              <td>가치사슬</td>
              <td>플랫폼</td>
            </tr>
            <tr>
              <td>9</td>
              <td>수요자에게 제품/서비스 등을 제공하고 대금 혹은 수수료 등을 통해 수익을 창출합니다.</td>
              <td>가치사슬</td>
              <td>플랫폼</td>
            </tr>
            <tr>
              <td>10</td>
              <td>공급자에게 광고 혹은 매출에 대한 일정 커미션을 받는 등 다양한 형태로 수익을 창출합니다.</td>
              <td>플랫폼</td>
              <td>가치사슬</td>
            </tr>
          </tbody>
        </Table>
        <br />
        <h1>에이빅v1.0 Pre-stage : 사업모델 유형 판단</h1>
        <div style={{ display: 'flex' }}>
          <Table bordered>
            <thead>
              <tr>
                <th colSpan={2}>다음 10가지 질문을 통해 사업모델 유형 구분</th>
                <th colSpan={2}>Answer</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>사업 초기 단계부터 목표고객이 명확하고, 이들을 대상으로 수익을 창출하는 것이 중요합니다.</td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>2</td>
                <td>사업 초기 단계에서 회원 가입수를 늘이는 것이 수익창출보다 더 중요합니다.</td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>3</td>
                <td>판매자로서 고객(수요자)에게 제품/서비스의 ‘판매’를 통해 고객가치를 제공합니다</td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>4</td>
                <td>
                  수요측 참여자와 공급측 참여자를 연결시키는 역할을 통해 수요측과 공급측 모두에게 가치를 제공합니다.
                </td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>5</td>
                <td>
                  사업 성공을 위해 일반적인 마케팅 뿐만 아니라 온/오프라인 유통망(도/소매점, 이커머스 채널 등)개척이
                  중요합니다.
                </td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>6</td>
                <td>
                  사업 성공을 위해 초기에 바이럴 등 다양한 인지도 마케팅을 통해 회원을 확보하는 것이 매우 중요합니다.
                </td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>7</td>
                <td>
                  수요측과 공급측 회원(참여자)들이 상호간 정보나 제품/서비스 등을 주고 받는 활발한 ‘상호작용’이 일어나고
                  이를 통해 네트워크효과를 발생시키는 것이 성공의 중요 요소입니다.
                </td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>8</td>
                <td>차별적 기술, 유통망 확보, 고객 서비스 등이 성공의 중요 요소입니다.</td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>9</td>
                <td>수요자에게 제품/서비스 등을 제공하고 대금 혹은 수수료 등을 통해 수익을 창출합니다.</td>
                <td>Y</td>
                <td>N</td>
              </tr>
              <tr>
                <td>10</td>
                <td>공급자에게 광고 혹은 매출에 대한 일정 커미션을 받는 등 다양한 형태로 수익을 창출합니다.</td>
                <td>Y</td>
                <td>N</td>
              </tr>
            </tbody>
          </Table>
          <Table bordered>
            <thead>
              <tr>
                <th colSpan={2}>사업모델 유형 구분</th>
                <th>판단근거</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>가치사슬형</td>
                <td>
                  전통적인 구매-제조-물류-마케팅-영업 등과 같은 수직적 가치사슬을 혁신하여 새롭게 경쟁력을 창조하는
                  사업모델(일반 제조/유통업 등)
                </td>
                <td>1, 3, 5, 8, 9 중 4개 이상 Y이면 가치사슬형</td>
              </tr>
              <tr>
                <td>플랫폼형</td>
                <td>
                  수요측 참여자와 공급측 참여자의 자발적인 상호작용 속에서 제품/서비스/정보/기술 등의 제공가치가
                  교환되게 하는 사업모델
                </td>
                <td>2, 4, 6, 7, 10 중 4개 이상 Y이면 플랫폼형</td>
              </tr>
              <tr>
                <td>기타</td>
                <td>가치사슬형과 플랫폼형에 속하지 않는다고 판단되는 경우</td>
                <td>위의 경우에 해당하지 않을 시 전문가 직접 검토하여 판정</td>
              </tr>
            </tbody>
          </Table>
        </div>
        <br />
        <h1>
          초벌/두벌 단계 <br />
          TAM/SAM/SOM의 정의
        </h1>
        <Table bordered>
          <thead>
            <tr>
              <th>단계</th>
              <th>개념정의</th>
              <th>사례</th>
              <th>추정방식</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>전체시장 TAM(Total Available Market)</td>
              <td>전체 시장은 자사의 제품/서비스가 포함 제품 카테고리 전체의 시장 규모를 의미한다.</td>
              <td>
                내가 헬스케어 관련 모발일 앱을 개발한다고 할 때, TAM은 국내 스마트폰 사용자 전체인 약 4000만명으로 볼 수
                있다. 헬스케어 관련 모바일 앱 뿐만 아니라 모든 모바일 앱 시장을 본 것이다.
              </td>
              <td>
                TAM의 경우는 상대적으로 시장규모나 성장성 추정이 어렵지 않다. 공공DB 검색이나 관련 기사 크롤링으로
                가능하다.
              </td>
            </tr>
            <tr>
              <td>유효시장 SAM(Serviceable Available Market)</td>
              <td>
                전체시장(TAM) 영역 중에 스타트업이 추구하는 비즈니스 모델(혹은 제품/서비스의 특징)과 부합하는 시장
              </td>
              <td>4000만명 중 모바일 헬스케어 앱을 활용하는 비중(약 25%)이 SAM시장 규모이다</td>
              <td>
                SAM부터는 시장규모 ‘추정‘이 필요하다. 스타트업 비즈니스모델은 그 유형이 가치사슬형이던, 플랫폼형이던
                대부분 혁신적이어서 비교대상이 불분명하여 기존 시장점유율을 그대로 적용하기 어렵다
              </td>
            </tr>
            <tr>
              <td>거점시장 SOM(Serviceable Obtainable Market)</td>
              <td>
                SAM 시장에서 스타트업이 초기에 확보가능한 시장 규모이다. 스타트업이 제품/서비스를 출시할 경우 출시 후
                1~2년 내에 자사가 확보 가능한 시장 규모나 점유율(SAM시장 내)이다. <br />
                그러므로 SOM은 개념상 성장율 추정이 필요 없다.
              </td>
              <td>앱 출시 후 헬스케어 앱 중 달리기 중심의 앱 (SAM시장의 10%) 시장을 SOM시장으로 설정한다.</td>
              <td>
                SOM시장은 계산해서 나오는 값이 아니라 추정을 통해 발견하는 것이다. 원래는 스타트업의 역량을 반영하여
                추정하는 것이나 에이빅에서는 적당한 SOM시장을 추정하고 이 시장을 확보하기 위해 필요한 역량을 전략으로
                제시하는 방향으로 한다.
              </td>
            </tr>
          </tbody>
        </Table>
        <br />
        <h1>
          세벌 단계 <br />
          사업추진방향(Who/What/How)의 정의
        </h1>
        <Table bordered>
          <thead>
            <tr>
              <th>단계</th>
              <th>개념정의</th>
              <th>사례</th>
              <th>추정방식</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>WHO (목표고객/참여자)</td>
              <td>
                SOM 시장에서의 가치사슬형 사업모델에서는 ‘목표고객’ 또는 플랫폼형 사업모델에서는 ‘목표
                참여자(수요/공급측)’를 의미함 사업 런칭 후 1~2년 내에 확보해야 할 목표고객(참여자)이므로 대략적인
                인구통계적 조건이 아닌 보다 구체적인 조건으로 한정 지어야 함
              </td>
              <td>
                헬스케어 앱 사례 : 스마트폰에서 헬스케어 앱을 쓰는 사람 중, 달리기를 통해 체중조절을 원하는 30-40 대
                여성 사용자 배달 플랫폼 : 강남 3구에서 전단지를 통해 영업하는 치킨/짜장면 점포를 공급측 참여자로 영입
                보급형 공기청정기: 수도권에 거주하는 1인, 아이 없는 부부, 미취학 아동 가구 대상
              </td>
              <td>
                SOM시장을 공략하기 위한 목표고객(참여자)으로 제시하기 위해서는, 고객(참여자)의 인구통계적 특성뿐만
                아니라 페인포인트와 니즈 등 페르소나 중 일부까지 추정해야 함 이를 위해서는 특정 주제어 중심의 기사
                크롤링이 필요함
              </td>
            </tr>
            <tr>
              <td>WHAT (제품/서비스와 제공가치)</td>
              <td>
                가치사슬형의 경우에는 제품/서비스, 플랫폼형 경우에는 가치단위(value unit) 그리고 제품/서비스와
                가치단위를 통해 고객과 참여자들에게 제공하고자 하는 고객가치
              </td>
              <td>
                헬스케어 앱 사례 : 달리기에 대한 다양한 정보, 혼자서 운동량 등을 전문적으로 관리할 수 있는 편리성 등
                배달 플랫폼 : 수요측은 치킨/짜장면에 대한 정보, 공급측은 고객에 대한 고객 정보, 신속하고 정확한 배달
                서비스르 통한 편리성/신뢰성 등 보급형 공기청정기: 좁은 공간에 대한 가성비 높은 공기청정 효과
              </td>
              <td>
                SOM의 목표고객(참여자)를 대상으로 어필하기 위해서는 SOM 시장 내 경쟁사 대비 차별적 우위를 제시해야 함
                <br />- 가격 우위
                <br />- 고객 관리 상 우위
                <br />- 제품 우위 등 <br />
                그러므로 경쟁사 비교분석이 필수적
              </td>
            </tr>
            <tr>
              <td>HOW (유통/마케팅 방안)</td>
              <td>
                가치사슬형에서는 SOM 시장에 대한 유통채널과 마케팅 방안을 의미하며, 플랫폼형에서는 초기 참여자들의 유입
                및 네트워크 효과를 유발시킬 트리거포인트 등을 의미함
              </td>
              <td>
                헬스케어 앱 사례 : 달리기 동호회 등에 컨텐츠 마케팅하고 달리기 매니아들을 유입하기 위한 하프마라톤 대회
                등 트리거포인트 제안 배달 플랫폼 : 공급측 참여자(치킨/짜장면 집)를 유인하기 위해 플랫폼에 가입하면
                배달료 1년 면제 등 유인책(트리거포인트) 제공 보급형 공기청정기: 보급형이므로 유통비용을 줄이기 위해
                이커머스 플랫폼을 통해 판매, 디지털 광고
              </td>
              <td>
                SOM시장에서 경쟁자들이 하고 있는 유통/마케팅 방안을 비교 분석하여, 차별적인 유통/마케팅 방안 제시
                여기서도 경쟁사와 비교분석이 필수적임
              </td>
            </tr>
          </tbody>
        </Table>
        <br />
        <h1>에이빅v1.0 플랫폼형 사업모델 질문</h1>
        <Table bordered>
          <thead>
            <tr>
              <th>BM 유형</th>
              <th>프레임</th>
              <th>초벌 질문</th>
              <th>두벌 질문</th>
              <th colSpan={2}>세벌 질문(네트워킹 효과)</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td rowSpan={4}>
                플랫폼형 (수요측 참여자와 공급측 참여자의 자발적인 상호작용 속에서 제품/서비스/정보/기술 등의 제공가치가
                교환되게 하는 사업모델)
              </td>
              <td>Who</td>
              <td>플랫폼이 제공하는 가치의 수요자(고객)는 누구인가요? 플랫폼이 제공하는 가치의 공급자는 누구인가요?</td>
              <td>
                수요측은 어떤 이익을 얻으며 그것을 위해 해야 할 역할은 무엇인가요? 공급측은 어떤 이익을 얻으며 그것을
                위해 해야 할 역할은 무엇인가요? 이외 다른 참여자는 있습니까? 있다면 그들이 취하는 이익과 역할은?
              </td>
              <td>가치증대</td>
              <td>
                트리거포인트(Trigger Point/참여자를 유입하기 위해 스타트업이 의도적으로 수행하는 유인작업)를 무엇으로 할
                것인가요? 이를 통해 어떻게 ‘가치‘의 매력도를 높일 것인가요?
              </td>
            </tr>
            <tr>
              <td>What</td>
              <td>
                본 플랫폼을 통해 참여자(수요측 뿐만 아니라 공급측)에게 창출할 수 있는 ‘가치제안(value proposition)‘는
                무엇인가요?-
                새로움/성능/맞춤/편리/디자인/브랜드/가성비/비용절감/리스크절감/접근성-가격/품질/가용성/구색력/기능성/서비스/브랜드/파트너십
                - 카플란
              </td>
              <td>
                가치제안을 구현하기 위한 구체적인 가치단위(Value unit)은 무엇인가요?- ‘정보/지식’ 형태인가요?-
                ‘제품/서비스’ 형태인가요?- 그 외 다른 형태인가요?
              </td>
              <td>수요자극</td>
              <td>
                향후 어떤 새로운 가치를 증가시킬 것인가요? 새롭게 추가된 가치를 활용하여 어떻게 비이용자들의 관심을 끌
                것인가요? 새로 유입된 수요측 참여자(비이용자)들을 어떻게 활성화(conversion)시킬 것인가요?
              </td>
            </tr>
            <tr>
              <td>How</td>
              <td>어떤 방식으로 참여자들의 상호작용을 활성화시킬 것인가요? - 큐레이션, 필터링, 매칭, 기타</td>
              <td>
                참여자 중 어느 쪽을 먼저, 어떻게 플랫폼으로 유인할 것인가요? 어떤 도구와 규칙을 통해 참여자간 상호작용이
                지속적으로 일어나도록 할 것인가요?
              </td>
              <td>공급자극</td>
              <td>
                확대된 수요측 참여자를 활용하여 어떻게 공급자들의 관심을 끌 것인가요? 가치를 증대할 수 있는 신규
                공급자들을 어떻게 유입 시킬 것인가요?
              </td>
            </tr>
            <tr>
              <td>Profit</td>
              <td></td>
              <td>수익은 언제쯤, 어떻게 창출할 것인가요?</td>
              <td colSpan={2}>수익창출 다변화는 어떻게 추진할 것인가요?</td>
            </tr>
            <tr>
              <td rowSpan={2}>분석 및 산출물</td>
              <td>분석방안</td>
              <td>초벌질문에 대한 응답을 정리하여, TAM/SAM 시장규모와 성장성 검색/추정/분석함</td>
              <td>
                SOM시장은 보다 구체적으로 제시해야 하므로 목표고객의 조건을 명확히 하여, 시장규모를 추정하고 경쟁현황은
                실재로 상대하게 될 구체적인 경쟁자를 제시해야 함
              </td>
              <td colSpan={2}>
                세벌에서는 SOM시장에서 추구할 수 있는 수요측 참여자, 초기 참여자들을 유인할 수 있는 트리거포인트,
                네트워크효과를 유발할 수 있는 마케팅추진 방안 등에 대한 2가지 이상의 옵션을 제시해야 한다.
              </td>
            </tr>
            <tr>
              <td>리포트 목차</td>
              <td>TAM/SAM 시장 정의 및 특징 TAM/SAM시장 규모 및 성장잠재력</td>
              <td>SOM 시장 정의 및 특징 SOM시장 규모 및 경쟁현황</td>
              <td colSpan={2}>SOM 시장에서의 전략옵션 - 옵션 1 (Trigger/Demand/Supply) - 옵션 2 (T/D/S)</td>
            </tr>
          </tbody>
        </Table>{' '}
        <br />
        <h1>에이빅v1.0 가치사슬형 사업모델 질문</h1>
        <Table bordered>
          <thead>
            <tr>
              <th>BM 유형</th>
              <th>프레임</th>
              <th>초벌 질문</th>
              <th>두벌 질문</th>
              <th>세벌 질문(네트워킹 효과)</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td rowSpan={4}>
                가치사슬형 (구매-제조-물류-마케팅-영업 등과 같은 수직적 가치사슬을 혁신하여 새롭게 경쟁력을 창조하는
                사업모델)
              </td>
              <td>What</td>
              <td>
                창업자께서는 어떤 제품/서비스, 혹은 솔루션으로 사업을 하실 생각이신 가요?- 사업화 하기위한 제품/서비스,
                혹은 솔루션을 간략하게 설명해주세요
              </td>
              <td>
                이러한 제품/서비스, 혹은 솔루션은 어떤 문제를 해결할 수 있을까요? (혹은 어떤 새로운 가치를 창출할 수
                있을까요?)
              </td>
              <td>
                기존에 나와있는 경쟁 제품/서비스, 혹은 솔루션과 비교하였을 때, 창업자가 구상 중인 제품/서비스, 혹은
                솔루션의 차별화 포인트는 무엇인가요?
              </td>
            </tr>
            <tr>
              <td>Who</td>
              <td>
                서술한 제품/서비스, 혹은 솔루션을 어떤 고객들을 대상으로 사업하실 생각이신 가요?- 제품/서비스, 솔루션을
                판매할 목표고객에 대해 설명해주세요
              </td>
              <td>
                목표고객은 해당 제품/서비스, 혹은 솔루션을 통하여 어떤 니즈나 painpoint를 해결하거나 혹은 어떤 원츠를
                충족시킬 수 있다고 생각하시나요?
              </td>
              <td>
                기존에 나와있는 경쟁 제품/서비스, 혹은 솔루션과 비교하였을 때, 창업자가 구상 중인 제품/서비스, 혹은
                솔루션이 목표고객에게 제공하는 차별적 가치는 무엇인가요?
              </td>
            </tr>
            <tr>
              <td>How</td>
              <td>어떤 유통채널을 통해 제품/서비스, 혹은 솔루션을 목표고객에게 판매하실 생각이신 가요?.</td>
              <td>어떤 마케팅 방안을 통해 제품/서비스, 혹은 솔루션의 기능과 가치를 목표고객에게 알릴 생각이신 가요?</td>
              <td>
                기존에 나와있는 경쟁 제품/서비스, 혹은 솔루션과 비교하였을 때, 창업자가 구상 중인 제품/서비스, 혹은
                솔루션을 목표고객에게 전달하는 유통/마케팅 방안은 어떻게 차별화 되어 있는 가요?
              </td>
            </tr>
            <tr>
              <td>Profit</td>
              <td>수익을 창출하는 방식은 무엇인가요?</td>
              <td>언제부터 수익 창출이 가능할까요?</td>
              <td>SOM시장에서는 어느 정도 수익을 목표로 하시나요?</td>
            </tr>
            <tr>
              <td rowSpan={2}>분석 및 산출물</td>
              <td>분석방안</td>
              <td>
                초벌질문에 대한 응답을 정리하여, TAM/SAM 시장규모와 성장성 검색/추정/분석함
                <br />
                <b>
                  초벌단계는 TAM/SAM시장 추정(TAM은 큰 의미 없으나 SAM시장을 도출하기 위해 필요) SAM시장에서는 경쟁현황
                  분석 필요 없음
                </b>
              </td>
              <td>
                SOM시장은 보다 구체적으로 제시해야 하므로 목표고객의 조건을 명확히 하여, 시장규모를 추정하고 경쟁현황은
                실재로 상대하게 될 구체적인 경쟁자를 제시해야 함<br />
                <b>두벌단계는 SOM시장에서는 성장잠재력은 초벌단계 추정을 준용하고, 대신 경쟁현황 분석 상세히 해야 함</b>
              </td>
              <td>
                세벌에서는 SOM시장에서 추구할 수 있는 목표고객, 제품/서비스경쟁력, 유통/마케팅추진 방안 등에 대한 2가지
                이상의 옵션을 제시해야 한다.
              </td>
            </tr>
            <tr>
              <td>리포트 목차</td>
              <td>TAM/SAM 시장 정의 및 특징 TAM/SAM시장 규모 및 성장잠재력</td>
              <td>SOM 시장 정의 및 특징 SOM시장 규모 및 경쟁현황</td>
              <td>SOM 시장에서의 전략옵션 - 옵션 1 (who/what/how)- 옵션 2 (who/what/how)</td>
            </tr>
          </tbody>
        </Table>
      </div>
    </>
  );
}

// const ourWorkData = {
//   group6: 'abic-group-6.png',
//   group9: 'group-9.png',
//   group12: 'porfolio-group-12.png',
//   group3: 'contact-us-group-3-1.png',
//   intro: 'Intro',
//   text_Label: '신사업 경영 컨설팅 솔루션',
//   text_Label2: '주요 솔루션',
//   aboutUs: 'About Us',
//   contactUs: 'Contact Us',
//   overlapGroup1: 'rectangle.png',
//   text_Label3: '신사업 경영 컨설팅 솔루션',
// };
export default OurWork;
