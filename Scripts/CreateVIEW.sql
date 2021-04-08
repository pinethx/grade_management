create or replace view vw_full_score
as
select sc.no
     , s.stdno
     , s.stdname 
     , s.classR
     , max(if (sc.subcode = 01, sc.subscore , 0)) 국어
     , max(if (sc.subcode = 02, sc.subscore , 0)) 영어
     , max(if (sc.subcode = 03, sc.subscore , 0)) 수학
     , max(if (sc.subcode = 04, sc.subscore , 0)) 사회
     , max(if (sc.subcode = 05, sc.subscore , 0)) 과학
  from student s join score sc on s.stdno = sc.stdno
 group by s.stdno;
  
select sc.no
     , s.stdno
     , s.stdname 
     , s.classR
     , sc.subcode as 과목
     , sc.subcode as 점수
  from student s join score sc on s.stdno = sc.stdno
 group by s.stdno;
 
-- 특정 분반 조회 sql문
select *
  from vw_full_score
 where classr = 'A01';
 
-- insert sql문
