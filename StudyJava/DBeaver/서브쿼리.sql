-- 서브쿼리(SubQuery)
-- sql문 내부에서 사용하는 select문을 의미함
-- 장점 : 복잡한 데이터 추출 및 조작작업에 유용하며 유연성과 기능 확장에 도움이 된다.
-- 단점 : 지나치게 복잡한 서브쿼리를 사용하면 성능을 저하시킬 수 있다.
-- 위치 선정이 자유롭다.

-- 최고의 마일리지를 보유한 고객은 누구?
select
고객번호, 고객회사명, 담당자명, 마일리지
from 고객
where 마일리지 = (select max(마일리지) from 고객);


-- 주문번호 'H0250'을 주문한 고객의 고객회사명과 담당자명
-- 단일행 subquery 사용 예
select
고객회사명, 담당자명
from 고객
where 고객번호 = (select 고객번호 from 주문 where 주문번호 = 'H0250') ; -- 단일행 subquery
-- subquery 대신 inner join 사용 예
select
고객회사명, 담당자명
from 고객
inner join 주문 on 고객.고객번호 = 주문.고객번호 
where 주문번호 = 'H0250';
-- 복수(멀티)행 subquery
-- '부산광역시'고객이 주문한 주문건수
select
count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객 where 도시 = '부산광역시');

-- '부산광역시' 전체고객의 마일리지보다 마일리지가 큰 고객의 정보
-- subquery의 결과값 중 어느 하나보다만 커도 선택된다.
select
담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > any (select 마일리지 from 고객 where 도시 = '부산광역시');
-- 각 지역의 어느 평균 마일리지보다도 마일리지가 큰 고객의 정보
select
담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > all (select avg(마일리지) from 고객 group by 지역);
-- 한 번이라도 주문한 적이 있는 고객의 정보
select 고객번호,고객회사명
from 고객
where exists (select  * from 주문 where 고객.고객번호 = 주문.고객번호);













