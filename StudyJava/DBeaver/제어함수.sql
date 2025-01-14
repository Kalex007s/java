-- cast 데이터 타입을 변경시킴
-- MySql/Maria의 데이터 타입 : char, signed, unsigned, data, datetime, time, binary
select cast('1' as unsigned),
cast('2' as char);
-- if (조건식, [참]인경우, [거짓]인 경우)
select if(12500 * 450 > 500000, '초과달성','미달성');

-- ifnull(A, B)
-- A가 null이면 B를 반환하고, A가 null이 아니면 A를 반환
select  ifnull(5, 'null'),
ifnull(null, '값이 없음'),
ifnull(1/0, null); 

-- nullif (A, B)
-- A와 B가 동일하면 null을 리턴, 다르면 A를 리턴
/*특정 컬럼을 업데이트 했을 경우, 각 데이터 별로 업데이트 되었는지 여부를 확인하는데 사용.
(기존 값과 동일하면 빈칸이고 업데이트 되었을 경우에는 업데이트된 값이 기록된다.)
 */
select nullif ('my sql','oracle'),
nullif ('oracle', 'oracle');
-- case
-- 'case when 조건 then 실행'의 형태로 조건에 따른 실행을 여러개 설정가능
-- 조건의 마지막에 나머지를 의미하는 else를 사용
-- case문의 마지막을 의미하는 end 반드시 사용
select case when 12500 * 450 > 500000 then '초과달성'
when 2500 * 450 > 400000 then '달성'
else '미달성'
end;