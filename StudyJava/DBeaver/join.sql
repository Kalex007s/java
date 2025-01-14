-- join이란, 두개 이상의 테이블을 연결하여 데이터를 검색하는 방법
/*
<join의 종류>
cross join
inner join
outer join
self join
*/
-- cross join 한쪽 테이블의 각 행마다 다른쪽 테이블의 모든 행이 한번씩 매칭되는 조인을 의미
select
부서.부서번호, 부서명, 이름, 사원.부서번호
from 부서
cross join 사원
where 이름 = '배재용';
-- (내부 조인)inner join 각 테이블에서 조인조건에 맞는 데이터만 조인
-- '이소미' 사원의 사원번호, 직위, 부서번호, 부서명
-- ANSI(American National Standards Institute) sql 조인
select
사원번호, 직위, 부서.부서번호, 부서명
from 사원
inner join 부서
on 사원.부서번호 = 부서.부서번호
where 이름 = '이소미';

-- Non-ANSI sql 조인 (위 방법과 결과는 같으나 문법이 다름)
select
사원번호, 직위, 부서.부서번호, 부서명
from 사원
inner join 부서
on 사원.부서번호 = 부서.부서번호
and 이름 = '이소미';


-- 예제
-- 고객 회사들이 주문한 주문건수를 많은 순서대로 보이시오
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문건수
select
고객.고객번호, 담당자명, 고객회사명, count(*) as 주문건수
from 고객
inner join 주문
on 고객.고객번호  = 주문.고객번호
group by 고객.고객번호, 담당자명, 고객회사명 
order by 주문건수 desc;

-- 고객별로 주문금액 합을 보이되, 주문금액 합이 많은 순서대로
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문금액합
select
고객.고객번호, 담당자명, 고객회사명,  sum(주문수량 * 단가) as 주문금액합
-- 주문 세부 : 주문번호 / 제품 : 주문번호, 고객번호 / 고객 : 고객번호
from 고객
inner join 주문 -- 주문세부
on 고객.고객번호 = 주문.고객번호 -- and 주문.주문번호 = 주문세부.주문번호
inner join 주문세부
on 주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc;
-- non ANSI style
select
고객.고객번호, 담당자명, 고객회사명,  sum(주문수량 * 단가) as 주문금액합
from 고객, 주문, 주문세부 
where
고객.고객번호 = 주문.고객번호 and 주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호, 담당자명, 고객회사명
order by 4 desc;
-- 할인율을 반영하려면 아래 수식 사용
-- sum(truncate(주문수량*단가 - (주문수량*단가*할인율), 1)) as 주문금액합

-- 모든 사원의 사원번호, 이름, 부서명 표시
select 
사원번호, 이름, 부서명
from 사원
inner join 부서 
on 사원.부서번호 = 부서.부서번호;

-- 주문번호'H0225'의 제품명과 주문수량, 단가표시
select 
o.주문번호, p.제품명, o.주문수량, o.단가
from 주문세부 o
inner join 제품 p
on o.제품번호 = p.제품번호
where o.주문번호  = 'H0255';

select
주문번호, 제품명, 주문수량, 주문세부.단가
from 주문세부
inner join 제품 
on 제품.제품번호 = 주문세부.제품번호
where 주문세부.주문번호 = 'H0255';

-- Non-Equi join : =연산자가 아닌 부등호 비교 연산자를 이용한 join
-- 이은광이 담당자인 고객회사의 마일리지 등급을 표시
select
고객번호, 고객회사명, 담당자명, 마일리지, 등급명
from 고객
inner join 마일리지등급
on 마일리지 >= 하한마일리지 and 마일리지 <= 상한마일리지
where 담당자명 = '이은광';
-- 위 아래 코드를 비교하며 이해하기
select
고객번호, 고객회사명, 담당자명, 마일리지, 등급명
from 고객
inner join 마일리지등급
on 마일리지 >= 하한마일리지 and 마일리지 <= 상한마일리지;

-- outer join (외부 조인) 
-- outer 키워드는 생략 가능
-- left join or right join
-- inner join (교집합이기 때문에 10명임에도 9명만 출력되었다.)
select
사원번호, 이름, 부서명
from 사원
inner join 부서
on 사원.부서번호 = 부서.부서번호;
-- outer join 사용
-- left outer join => 사원중에 부서배치가 되지 않은 사원이 누군지 확인 가능
select
사원번호, 이름, 부서명
from 사원 left outer join 부서 -- 왼쪽 기준
on 사원.부서번호 = 부서.부서번호;
-- right outer join => 부서중에 사원이 소속되어있지 않은 부서를 확인 가능
select
사원번호, 이름, 부서명
from 사원 right outer join 부서 -- 오른쪽 기준
on 사원.부서번호 = 부서.부서번호;

-- self join : 동일한 테이블 안에서 한 컬럼이 다른 컬럼을 참조하는 경우에 사용
-- 마치 동일한 테이블을 다른 테이블인것처럼 조인시키는 방법 -> inner join과 outer join을 사용할 수 있다.
select
사원.사원번호, 사원.이름, 상사.사원번호 as '상사의 사원번호', 상사.이름 as '상사의 이름'
from 사원
inner join 사원 as 상사
on 사원.상사번호 = 상사.사원번호;
-- 위 코드는 inner join이기 때문에 null값은 빠져있다. 이를 해결하기 위해 outer join을 사용한다.
-- 상사가 없는 사원까지 포함된 데이터를 요구할 경우 사용
select
사원.사원번호, 사원.이름, 상사.사원번호 as '상사의 사원번호', 상사.이름 as '상사의 이름'
from 사원 left join 사원 as 상사
on 사원.상사번호 = 상사.사원번호;
-- 좌,우 관점에 따라 결과가 다르며 이는 활용도에 따라 선택하여 사용해야한다.
select
사원.사원번호, 사원.이름, 상사.사원번호 as '상사의 사원번호', 상사.이름 as '상사의 이름'
from 사원 right join 사원 as 상사
on 사원.상사번호 = 상사.사원번호;










