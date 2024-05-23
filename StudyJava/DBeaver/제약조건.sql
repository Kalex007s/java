-- 제약조건
/*
데이터베이스에는 무결점의 데이터가 필수.
테이블에 아무런 제약사항을 두지 않으면 적합하지 않은 데이터가 저장되고 그렇게 되면 무결성의 원칙에 위배된다.
그러므로 반드시 제약조건을 설정해야 한다.
*/

create  database project2
char set utf8mb4 collate utf8mb4_general_ci; -- 새로고침 해야 확인 가능
use project2;

/*
primary key : 기본키 -> 특성상 자동으로 not null 적용
not null : 반드시 값이 필수
unique : 반드시 유일한 값이 필수
check : 설정된 조건에 맞는 값만 저장 가능
default : 값을 넣지 않으면 자동으로 기본값 저장
foreign key : 외래키
*/

create table 학과
(학과번호 char(2) primary key,
학과명 varchar(20) not null,
학과장명 varchar(20));

create table 학생
(학번 char(5) primary key,
이름 varchar(20) not null,
생일 date not null,
연락처 varchar(20) unique,
성별 char(1) not null check (성별 in ('남','여')),
등록일 date default (curdate()));

create table 과목
(과목번호 char(5) primary key,
과목명 varchar(20) not null,
학점 int not null check(학점 between 2 and 4),
구분 varchar(20) not null check(구분 in ('전공','교양','일반')));






























