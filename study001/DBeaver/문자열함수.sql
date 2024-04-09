-- char_length 문자의 갯
-- length 바이트 수 
select char_length('hello'),
length('hello'),
char_length('안녕'),
length('안녕');

-- concat
-- concat_ws
select concat('dreams', 'come', 'true'),
concat_ws('-','2023', '01','29');

-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 문자열의 몇번째부터 몇개
-- 데이터베이스는 1부터 읽는다
select left ('SQL 공부', 3),
right ('SQL 공부', 2),
substr('SQL 공부', 3 , 4),
substr('SQL 공부', 5);
-- substring_index 구분자를 만날때까지 문자열을 잘라냄
-- 인덱스는 몇번째 구분자를 만날때까지 자를지를 결정
-- 인덱스가 음수면 오른쪽부터
select substring_index('서울시 동작구 흑석동', ' ',1); -- 서울시
select substring_index('서울시 동작구 흑석동', ' ',2); -- 서울시 동작구
select substring_index('서울시 동작구 흑석동', ' ',-1); -- 흑석동
select substring_index(substring_index('서울시 동작구 흑석동', ' ',2), ' ',-1); -- 동작구
-- lpad 지정한 길이에서 문자열을 제외한 나머지를 특수문자로 왼쪽부터 채운다.
-- rpad // 오른쪽부터 채운다.
-- Ex) 주민번호 or 비밀번호 등에서 사용
select lpad('sql',10,'#'), rpad('sql',5,'*');
-- ltrim 왼쪽 공백 제거
-- rtrim 오른쪽 공백 제거
-- trim 양쪽 공백 제거
select ltrim('     sql'), rtrim('sql        '), trim(    'sql'    );
-- field 문자열의 위치를 찾는다.
-- field(찾는 문자열, 문자열1, 문자열2, 문자열3, ....)
-- find_in_set 문자열 리스트에서 지정한 문자열을 찾는다.
-- find_in_set(찾는 문자열, 문자열리스트)
select field('java','sql','java','javascript');     -- 2
select find_in_set ('java','sql,java,javascript');  -- 2
-- locate 기준문자열에서 부분문자열을 찾음
-- locate(부분문자열, 기준문자열)
select locate('world', 'hello world.'); 
-- elt 지정한 위치에 있는 문자열을 반환
select elt(2, 'sql', 'java', 'javascript');
-- repeat 문자열의 반복
select repeat('*', 5);
-- replace 문자열의 일부를 다른 문자열로 대체
-- replace(기준 문자열, 바꿀 문자열, 바뀔 문자열)
select replace('010_1234_5678', '_','-');
-- reverse 문자열을 거꾸로 바꾼다.
select reverse('hello')












