-- empno: 사원 번호
-- ename: 사원 이름
-- job: 사원 직책
-- mgr: 사수 번호
-- hiredate: 입사 날짜
-- sal: 급여
-- comm: 보너스
-- deptno: 부서 번호
-- select : 조회할 떄 사용
-- select <컬럼이름> from <테이블 이름>
select ename from emp 
-- 사원이름, 번호 조회
-- 1개 이상 컬럼을 조회할 때는 ,(콤마) 사용
select ename, empno from emp
-- 사원번호, 사원이름, 직책조회
select empno, ename, job from emp
-- as (별칭)
select ename as '사원이름' , empno as '사원번호' from emp
-- 모든 컬럼조회 *(아스테리스크)
select * from emp
-- where (필터링)
-- 20번 부서 사원 모두 조회
-- 쿼리 순서 1. from 2. where 3. select
select * from emp where deptno = 20;
-- 문제1. job 이 manager인 사원이름, 번호, 직책, 입사날짜 조회 하시오.
select ename, empno, job, hiredate from emp where job = 'manager'
-- 문제2. job이 manager, salesman인 사원번호, 사원이름 조회
-- or(||), and(&&)
select empno, ename from emp
where job = 'manager' or job = 'saleman'
-- 문제3. 사원이름이 allen인 사원의 이름,직책,입사날짜 조회
select ename, job, hiredate from emp
where ename = 'allen'
-- 사원이름이 A로 시작하는 사원의 이름,사원번호 조회
-- like : 특정 단어를 검색할 수 있다.
select ename, empno from emp
-- 사원 이름에 L이 두번 들어간 사원 이름,사원번호 조회
select ename, empno from emp
where ename like '%L%L%'
-- 보너스를 받지 못한 사원의 급여와 사원번호를 조회
-- null 사원
select sal, empno from emp
where comm is null 
-- null 아닌 사원
select sal, empno from emp
where comm is not null 
-- 입사날짜가 1987-06-28 이상인 사원 이름,번호,직책 조회
-- >=, <=, >, < 
select ename, empno, job, hidredate from emp 
where hidredate >= '1987-06-28'
-- 문제4. 입사일이 1980-12-17 ~ 1982-01-23 사이에 입사한
-- 사원의 이름,번호,입사날짜,직책을 조회하시오.
select ename, empno, hidredate, job from emp 
where hidredate >= '1980-12-17' and hiredate <= '1982-01-23'
-- 문제5. 직업이 manager고, 급여가 1300이상 받는 사원번호,이름,급여,직업 조회
select enpno as '사원번호', ename, sal, job from emp 
where job = 'manager' and sal >= 1300
-- avg, count, max, min 함수(단일행 함수)
-- 직업이 manager인 사원들의 급여 평균 조회
select avg(sal) as "급여 평균", job from emp where job = 'manager'
-- 직업이 clerk인 사원 수 조회(count(*)을 써도되지만 성능상 문제가 있음)
select count(*) from emp where job = 'clerk'
-- min
select min(sal) from emp where job = 'clerk' 
-- max
select max(sal) from emp where job = 'clerk' 

-- 문제6. 입사날짜가 '1987-06-28' 이상인 사원들의 수와 급여 평균 조회
select count(empno) as '사원 수', avg(sal) as '급여 평균'
from emp
where hidredate >= '1987-06-28'
-- 문제7. 직책이 manager가 아닌 사원이름, 직책 조회
select ename, job from emp
where job != 'manager'
-- 문제8. 사원 이름이 'scott','jones'인 사원의 이름,번호,급여,입사날짜 조회
-- 방법1
select ename, empno, sal, hidredate from emp 
where ename = 'scott' or ename = 'jones'
-- 방법2
select ename, empno, sal, hidredate from emp
where ename in('scott','jones')

-- 08.30(화)
-- group by : 특정 컬럼을 그룹핑 하는 SQL 문법
-- job 별로 group by하기
-- group by할 컬럼을 select에도 써주자!
select job as '직책 그룹핑' from emp group by job
-- 입사날짜로 group by 
select hidredate from emp group by hidredate
-- 입사날짜를 년도 별로 group by
-- date_format() SQL 내장 함수, 날짜를 원하는대로 포맷팅 해줌.
-- %Y : year(년도), %M : month(월), %d : day(일)
select date_format(hiredate,'%Y')as '입사년도', count(empno) as '사원 수' 
from emp group by date_format(hiredate,'%Y')
-- 문제, 부서별로 그룹핑하고 부서인원 수도 출력하시오.
select deptno, count(empno) as '부서 인원 수 ' from emp group by deptno
-- 20번 부서를 제외한 나머지 부서 그룹핑!
select deptno from emp where deptno != 20 group by deptno
-- having : group by된 결과를 필터링할 떄 사용
-- where : 필터링
-- where조건 안쓰고 having으로 사용하기
-- having과 where 차이점
-- 1. SQL 실행 순서가 다르다.
-- 2. where 조건에 집계함수(count, max, min, avg .. )으로 비교 불가능
-- 3. having은 집계함수 비교 가능
select deptno as "부서 번호", count(empno) as "사원 수"
from emp group by deptno having count(empno) >= 4
-- group by된 결과를 필터링하고 싶을 떄 사용
-- 문제1. 부서별로 급여합계를 그룹핑 하시오. (hint : sum)
select deptno,sum(sal) as '부서별 급여합계' from emp group by deptno
-- 문제2. 문제1번에서 급여합계가 5000이상인 부서만 조회
select deptno,sum(sal) as '부서별 급여합계' from emp group by deptno
having sum(sal) >= 5000
-- 문제3. 문제2번에서 10번 30번 부서 제외
select deptno, sum(sal) as '부서별 급여합계' from emp
where deptno = 20
group by deptno
having sum(sal) >= 5000
-- 문제4. 입사날짜를 월별로 그룹핑하고 월별 입사자 수 를 출력하시오.
select date_format(hidredate,'%m') as '입사 월', count(empno) as '입사 사원 수'
from emp group by date_format(hidredate, '%m')
-- 문제5. 직책별로 그룹핑하고 직책별 평균 급여를 조회하고, 평균 급여가 1000이 넘는 
-- 	     직책만 출력하시오. 단,) 직책이 manager는 제외
select job, avg(sal) from emp
where job != 'manager' group by job having avg(sal) > 1000
-- 문제6. 1982년도에 입사한 모든 사원의 정보 조회
select * from emp where date_format(hidredate, '%Y') = '1982'
-- 문제7. 급여가 1500 ~ 2850 사이의 범위에 속하는 사원 이름, 급여, 직책 조회
select ename, sal, job from emp where sal >= 1500 and sal <= 2850

-- order by : 특정 컬럼을 정렬할 떄 사용(항상 마지막ㅇ 실행 됨)
-- 아래 쿼리는 오름차순(디폴트 값)
select ename, sal from emp order by sal
-- 아래 쿼리는 내림차순
select ename, sal from emp order by sal desc
-- 컬럼 위치로 정렬하기
-- order by는 항상 마지막에 실행되기 떄문에 select 컬럼 순서를 알고 있다.
select ename, sal from emp order by 2 desc

-- 총 정리
select deptno, count(empno), sum(sal), avg(sal)
from emp
where deptno != 10
group by deptno
having count(empno) >= 3
order by count(empno) desc

## delete, update, insert
-- delete (데이터 삭제)
-- 삭제할 때는 where 조건으로 삭제하자
delete from emp 
-- truncate 테이블안에 있는 데이터를 초기화 함
truncate table emp
-- commit(완전 저장),rollback(이전 상태로 돌아가기)
-- auto commit을 해제 하면 rollback(뒤 돌아가기)으로 돌아갈 수 있음
-- auto commit설정되어 있으면 rollback 명령이 불가능!

-- join***
-- 관계형 데이터베이스(MYSQL, Oracle, Tibero ...)
-- 를 사용하면 join은 무조건 사용한다.
-- depno : 부서번호, dname : 부서이름, loc : 부서위치
-- 조인은 컬럼 이름이 같다고 해서 되는 게 아니라, 데이터 타입이 서로 같아야 한다.
-- 컬럼이름이 같은 이유는 사용자(개발자) 편의성을 위해서 같게 해준다.

-- join 문법
-- 테이블 이름에도 as를 사용할 수 있다.
-- 방법1
select e.ename, e.deptno, d.dname from emp as e
inner join dept as d 
on e.deptno = d.deptno
-- 방법2.(추천 x)
-- where가 나온 목적은 연산자(비교)를 이용해서 필터링을 하는 게 목적이다.
-- 떄문에 아래 방법보다는 방법 1로 join을 사용하자.
select e.ename,e.deptno,d.dname from emp as e,
dept as d
where e.deptno = d.deptno

-- 사원번호가 7788인 사원의 이름,직책,부서번호,부서이름,근무지역을 조회하시오.
-- 조인 팁 : 두 테이블 교집합 컬럼을 찾자!
select e.ename, e.job, e.deptno, d.dname, d.loc 
from emp as e
inner join dept as d 
on e.deptno = d.deptno
where e.empno = 7788
-- 부서별로 그룹핑을 하고 부서번호와 (부서이름)을 조회하시오.
-- join 문법은 from과 where 사이에 온다.
select e.deptno, d.dname from emp as e 
inner join dept as d
on e.deptno = d.deptno
group by e.deptno

-- 직책이 manager인 사원들의 이름,부서이름,부서위치를 조회하시오.
select 
	e.ename as "사원 이름",
	d.dname as "부서 번호",
	d.loc as "부서 위치"
from emp as e 
inner join dept as d 
on e.deptno = d.deptno
where e.job = 'manager'
-- inner join(교집합)에서 순서는 상관없지만
-- right join과 left join은 상관 있다.
select * from dept as d
inner join emp as e 

-- left join(차집합), right join(차집합) : 아우터(outer) 조인
 
-- 40번 부서만 조회
select * from dept where deptno = 40;
-- emp테이블에 없는 부서번호 조회
select * from dept as d left join emp as e
on d.deptno = e.deptno
where e.empno is null

-- self join (inner join하고 같음)
-- 그러나 자기 자신을 조인함 즉, 1개 테이블을 사용
-- boss: 상사 ,underling: 부하
select 
	boss.empno as '상사 번호'
	boss.ename as '상사 이름'
	underling.empno as '부하직원 번호'
	underling.ename as '부하직원 이름'
from emp as e boss
inner join emp as underling 
on boss.empno = underling.mgr

-- emp에 insert 하기
insert from into emp (empno, ename, job, sal, hiredate)
values (8000, '손흥민', 'salesman', 7000, now());

-- 문제. 아우터 조인(left or right) 이용하기
-- 부서에 소속되어 있지 않는 사원,번호,이름,입사날짜 조회
select * from emp as e left join dept as d 
on e.deptno = d.deptno
where d.dname is null 
-- 사원번호가 8000인 사원의 급여를 8000으로 업데이트 하시오.
-- update는 from을 명시하지 않는다.
-- delete from을 써준다.
update emp
set sal = 8000
where empno = 8000

1. 사원이름, 사원직책, 사원급여 조회.
select ename, job, sal from emp
2. 사수번호가 7839인 사원 번호, 이름, 입사날짜 조회.
select mgr empno, ename, hiredate from emp 
where mgr = '7839'
3. 급여가 3000 이하인 사원의 모든 정보 조회.
select empno, ename from emp where sal <= 3000
4. 사원이름, 부서번호, 부서이름, 부서 근무지 조회.
select ename, deptno, dname, loc from emp
5. 부서별 급여합계, 부서이름 조회.
select deptno, sum(sal) as '부서별 급여합계', ename from emp group by deptno
6. 부서 근무지가 NEW YORK이고, 직책이 MANAGER인 
   사원의 이름, 급여를 조회. 
select loc as '근무지', ename, sal, from emp 
where job = 'manager' and loc = 'New YORK'
7. 1983년 이후 입사한 사원의 보너스가 null
   이면 100 주고, 사원의 이름, 부서이름, 직업을 조회. (ifnull 검색하기)

8.  부서명이 RESEARCH인 사원의 이름, 급여, 근무 지역 조회.

9. 보너스를 받은 사원 이름, 직책, 급여, 부서명 조회.

10. 이름 첫글 A자를 가진 사원 이름, 직책, 부서명, 부서 위치 조회.

11. 사원명, 사수번호, 사수 이름 조회.
   단, 사수가 없는 사원도 포함

12. 사원명, 사수번호, 사수 이름 조회.
   단, 사수가 없는 사원만

13. 상사번호가 7698인 사원의 이름, 사원번호, 상사번호, 상사이름 조회.

14. 상사보다 먼저 입사한 사원의 사원이름, 사원의 입사일, 상사 이름, 상사 입사일 조회.

15. 업무가 MANAGER이거나 CLERK고 입사날짜가 1982년에 입사한
 사원의 사원번호, 이름, 급여, 직업, 부서명 조회.

16. 부서별 급여 총합 조회. 
    단, 사원이 존재하지 않는 부서도 포함해서 급여 순으로 내림차순 하시오.

17.  사원 이름, 상사 이름, 사원 부서번호, 사원 부서명, 사원 근무지역 조회. 
    단, 사원이 존재하지 않는 부서번호와 부서명도 조회.

18. 부서 위치가 CHICAGO이고 사수 급여가 5000 미만인 
 사원 번호,사원 이름,사수 번호, 사수 이름, 사수 급여, 부서명을 조회.
 단, 사원의 입사날짜로 오름차순.

19. 입사날짜를 월별로 몇명이 입사했는지 카운트해서 조회.































