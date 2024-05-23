/* sql (structured query langauge)
:구조화된 요청 언어
:database에서 필요한 기능을 실행시키기 휘한 명령어 모음
:형태는 간단한 프로그래밍 명령어와 유사함
*/
use testdb; -- use 명령어는 database를 선택한다는 뜻 -> 처음 한번 선언하면 됨.
select * from 고객; -- 고객테이블의 모든 데이터 요청 (*는 All이라는 뜻)

select 고객번호, 담당자명, 고객회사명, 마일리지
from 고객; -- 특정 컬럼명을 명시하여 요청 (반드시 파일에 불러오고자 하는 파일이 있어야 한다.)

select 고객번호, 담당자명, 고객회사명, 마일리지 as 포인트, 마일리지*1.1 as "10% 인상된 마일리지"
from 고객;
-- as는 별명. 인용부호""는 별명에 특수문자가 있을 경우 사용
-- 테이블 내의 컬럼 이외에 새로운 컬럼을 보여줄 수 있다.(실제 저장 X)

select 고객번호, 담당자명, 마일리지 from 고객
where 마일리지 >= 100000;
-- 원하는 데이터를 필터링하여 가져오고 싶을때, where를 사용함
-- 순서가 중요. select -> from -> where 순서대로 사용함

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지;
/* '=' 등호를 기준으로 왼쪽은 컬럼, 오른쪽에 컬럼이 아닌 것을 사용할 경우 인용부호를 사용해야 함 (데이터 베이스마다 ""와 ''의 혼용을 허용하지 않는 것도 있다.)
order by 의 디폴트는 오름차순 // order by ㅇㅇㅇ desc; = 내림차순
키워드 사용 순서가 중요함 - order by가 제일 뒤 */

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 10; -- limit은 읽어오는 데이터의 갯수를 제한

select 고객번호, 담당자명, 도시, 마일리지 from 고객
where 도시 = '서울특별시'
order by 마일리지 desc 
limit 2,10;
/*앞숫자가 붙으면 범위로 바뀐다 -> 2번째 다음번째부터 10번째 값까지
내림차순이므로 상위 2명을 제외하고 그 이후 10명의 데이터를 읽는 방법 */ 

-- 고객들이 위치한 도시정보만 보고 싶을 경우
select 도시 from 고객;
select distinct  도시 from 고객; -- distict는 중복제거








