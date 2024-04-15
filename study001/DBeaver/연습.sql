create table 영화
(영화번호 char(5) primary key,
타이틀 varchar(100) not null,
장르 varchar(20) not null check(장르 in('코미디','드라마','다큐','SF','액션','역사','기타')), 
배우 varchar(100) not null,
감독 varchar(50) not null,
제작사 varchar(50) not null,
개봉일 date,
등록일 date default(curdate())
);

/*
번호 : 숫자형 일련번호 자동입력(Auto_increment)
평가자닉네임 : 가변문자형 50자 필수입력
영화번호 : 고정문자형5자 필수입력, 영화테이블의 영화번호 참조
평점 : 숫자형 필수입력, 1~5사이
평가 : 가변문자형 2000자 필수입력
등록일 : 날짜형 오늘날짜자동입력
 */
create table 평점관리
(번호 int Auto_increment primary key,
평가자닉네임 varchar(50) not null,
영화번호 char(5) not null references 영화(영화번호),
평점 int not null check(평점 between 1 and 5),
평가 varchar(2000) not null,
등록일 date default(curdate()));



