-- 기본 형식(시간 단위)
-- 정오(12:00)기준 round(반올림), trunc(버림)
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 
       to_char(round(sysdate), 'YYYY-MM-DD HH24:MI:SS'),
       to_char(round(to_date('2021-04-20 13:01:00', 'YYYY-MM-DD HH24:MI:SS')), 'YYYY-MM-DD HH24:MI:SS'),
       to_char(trunc(to_date('2021-04-20 13:01:00', 'YYYY-MM-DD HH24:MI:SS')), 'YYYY-MM-DD HH24:MI:SS')
from dual;

-- 입사한 달의 첫 1일
select ename, hiredate, trunc(hiredate, 'MONTH')
from emp;

-- 사원들의 근무 개월수
-- 날짜에 연산 : 날수 계산
-- months_between : 달수 계산
select ename 이름, sysdate 오늘, hiredate 입사일,
       trunc(sysdate - hiredate) 근무한날수,
       trunc(months_between(sysdate, hiredate)) 근무한달수
from emp;

-- 사원들의 입사일, 입사 후 6개월 날짜 구하기
select ename 이름, hiredate 입사일,
             hiredate + 6 "6일 후",
             add_months(hiredate, 6) "6개월 후",
             add_months(hiredate, -6) "6개월 전"
from emp;

-- 돌아오는 ~요일(next_day)
select sysdate 오늘, next_day(sysdate, '수요일') "돌아오는 수요일"
from dual;

-- 사원들의 입사후 첫 주말
select ename, hiredate 입사일, next_day(hiredate, '토요일') "입사후 첫 주말"
from emp;

-- 해당 날짜의 마지막 날짜 : last_day
select sysdate 오늘, last_day(sysdate) "이달의 마지막 날",
       last_day(to_date('2000/02/01', 'YYYY-MM-DD'))
from dual;

-- 사원들의 입사일의 마지막 날
select ename, hiredate 입사일, last_day(hiredate) "입사일 마지막 날"
from emp;

-- nvl(null값, 대체값)
-- nvl2(null값, null이 아닌 경우, null인 경우)
select ename 이름, sal 급여,
       nvl2(comm, sal * 12 + comm, sal * 12) 연봉
from emp;

-- nullif(값1, 값2) : 두 값이 같으면 null, 다르면 첫번째 값
select nullif('A', 'A'), nullif('A', 'B')
from dual;

-- coalesce(값1, 값2, ... 값n) : 여러 값들 중에서 null이 아닌 첫번째 값
select ename 이름, comm 커미션, sal 급여,
       coalesce(comm, sal)
from emp;

-- 부서테이블
select *
from dept;

-- 사원들이 근무하는 부서명
-- switch ~ case와 유사함
select ename 이름, deptno 부서번호,
       decode(deptno, 10, '경리부',  -- case 10:
                      20, '인사부',  -- case 20:
                      30, '영업부',  -- case 30:
                      40, '전산부',  -- case 40:
                      '부서없음') 부서명  -- default:
from emp;

-- 사원들이 근무하는 부서명
-- if ~ else if ~ else와 유사함
select ename 이름, deptno 부서번호,
        case
            when deptno = 10 then '경리부'
            when deptno = 20 then '인사부'
            when deptno = 30 then '영업부'
            when deptno = 40 then '전산부'
        end 부서명
from emp;

-- <--------------------------------------------------------------------------->
-- 1. substr 함수를 사용하여 9월에 입사한 사원 조회
select *
from emp
where substr(to_char(hiredate, 'YYYY/MM/DD'), 6, 2) = '09';

-- 2. substr 함수를 사용하여 2003년도에 입사한 사원 조회
select *
from emp
where substr(to_char(hiredate, 'YYYY/MM/DD'), 1, 4) = '2003';

-- 3. substr 함수를 사용하여 "기"로 끝나는 사원 조회
select *
from emp
-- where substr(ename, 3, 1) = '기'; 이름이 4글자나 2글자인 사람도 있으므로 적합x
where substr(ename, -1, 1) = '기';

-- 4. instr 함수를 사용하여 이름의 두번째 글자에 "동"이 있는 사원 조회
select *
from emp
where instr(ename, '동', 1, 1) = 2;

-- 5. 직급(job)에 따라 직급이 "부장"인 사원은 5%, "과장"인 사원은 10%, "대리"인 사원은 15%,
     -- "사원"인 사원은 20%가 인상된 급여 조회
select ename 이름, job 직급, sal 급여,
    decode(job, '부장', sal + (sal * 0.05),
                '과장', sal + (sal * 0.1),
                '대리', sal + (sal * 0.15),
                '사원', sal + (sal * 0.2),
                 sal) 인상급여
from emp;
     
-- 6. 입사일을 년도 2자리, 월 2자리, 일 2자리 요일은 약어("수")로 지정하여 출력
select ename 이름, to_char(hiredate, 'YY/MM/DD DY') 입사일
from emp;

-- <---------------------------------------------------------------------------------->

-- count : 갯수 세기 (row의 갯수)
-- 전체 사원수와 커미션이 정해진 사원수
select count(*) 사원수, count(comm) 커미션사원수
from emp;

-- 사원들의 급여 총액, 급여 평균, 최대 급여, 최소 급여 조회
select sum(sal) "급여 총액", round(avg(sal)) "급여 평균", 
       max(sal) "최대 급여", min(sal) "최소 급여"
from emp;

-- 입사한지 제일 오래된 날짜, 가장 최근 입사일
select min(hiredate) "오랜일자", max(hiredate) "최근일자"
from emp;

-- 일반적인 연산 : null과의 연산 -> null
-- 그룹함수들은 null을 제외하고 계산함
select count(comm), sum(comm), avg(comm), min(comm), max(comm)
from emp;

-- 가장 높은 급여를 받는 사원의 이름과 급여 조회
--select ename, max(sal) : 갯수가 각각 14, 1 이라서 에러남
--from emp;
-- 서브쿼리
select ename, sal
from emp
where sal = (select max(sal) from emp);

-- 직급(job)이 null이 아닌 raw의 수
select count(job) -- job column의 값이 null이 아닌 raw의 수
from emp;

-- 직급의 갯수
select count(distinct job)
from emp;

-- group by 컬럼명 : 해당 컬럼명으로 그루핑(~별)
-- 그룹함수와 같이 쓰인다.
-- 부서번호별로 그루핑
-- 부서별 평균 급여
select deptno, round(avg(sal)), sum(sal), min(sal), max(sal)
from emp
group by deptno;

-- 부서별 인원수, 커미션이 정해진 인원수 구하기
select deptno, count(*), count(comm)
from emp
group by deptno;

-- 평균 급여가 500이상인 부서의 부서번호, 평균 급여
select deptno, round(avg(sal))
from emp
group by deptno
having avg(sal) >= 500;

-- order by는 항상 제일 나중에 기재함
select deptno, round(avg(sal))
from emp
group by deptno
order by deptno;

-- 직급(job)이 "사원"인 직원을 제외하고, 직급별 급여 총액
-- 급여총액이 적은순으로 정렬
select job, sum(sal)
from emp
where job <> '사원'
group by job
order by sum(sal);

-- <---------------------------------------------------------------------------->
-- 평균급여가 가장 높은 부서의 부서번호, 평균급여
select max(round(avg(sal)))
from emp
group by deptno;

-- 1. 급여 최고액, 최저액, 총액 및 평균 급여 구하기
select max(sal), min(sal), sum(sal), round(avg(sal))
from emp;

-- 2. 직급별로 급여 최고액, 최저액, 총액, 평균 급여 구하기
select job 직급, max(sal) 최고액, min(sal) 최저액, sum(sal) 총액, round(avg(sal)) 평균급여
from emp
group by job;

-- 3. 직급별 사원수 구하기
select job 직급, count(*) 사원수
from emp
group by job;

-- 4. 과장의 수 구하기
select count(*)
from emp
where job = '과장';

-- 5. 급여 최고액과 급여 최저액의 차액 구하기
select max(sal) 최고액, min(sal) 최저액, max(sal) - min(sal) 차액
from emp;


-- 6. 부서별 사원수, 평균 급여 구하기(부서번호 순으로 정렬)
select deptno, count(*) 사원수, round(avg(sal)) 평균급여
from emp
group by deptno
order by deptno;

-- 7. 부서번호별 부서이름(dname), 지역명(loc), 사원수, 평균급여 구하기
select deptno 부서번호,
      decode(deptno, 10, '경리부',
                     20, '인사부',
                     30, '영업부',
                     40, '전산부') 부서명,
      decode(deptno, 10, '서울',
                     20, '인천',
                     30, '용인',
                     40, '수원') 지역명,
      count(*) 사원수, round(avg(sal)) 평균급여
from emp
group by deptno
order by deptno;

-- select -> DQL(Data Query Language)
-- DML(Data Manipulation Language) - 변경
-- insert - 데이터 추가.삽입 / update - 데이터 변경. 수정 / delete - 데이터 삭제
-- 트랜잭션(Transaction) - 일(업무)의 단위

-- 부서테이블의 구조, desc : describe
desc dept;
select*
from dept;

-- 부서테이블에 50, 홍보부, 울산 부서 추가하기
-- insert into 테이블명 (컬럼명1, 컬럼명2, ....)
-- values (값1, 값2, 값3.....)
-- 숫자는 따옴표 없고, 문자/날짜는 따옴표 필요
insert into dept(deptno, dname, loc)
values (50, '홍보부', '울산');

select * from dept;

desc emp;
-- 사원 테이블에 데이터 추가
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1015, '민윤기', '부장', 1009, sysdate, 2000, 500, 50);

select * from emp;

-- 데이터 수정/갱신 - update
-- where절은 필수절이 아님 but where절이 없으면 전체 데이터를 수정하는 것
-- set은 값을 변경하고자 하는 컬럼만 기재하면 됨
update emp
set ename = '김태형', sal = 2500
where empno = 1015;

select * from emp;

-- 데이터 삭제 - delete
-- 이름이 김태형인 직원 삭제
delete from emp
where ename = '김태형';

select * from emp;



insert into dept(deptno, dname, loc)
values (50, '홍보부', '울산');

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1015, '민윤기', '부장', 1009, sysdate, 2000, 500, 50);

-- 처음 DML을 시작한 순간부터 여기까지의 작업 취소
rollback;

select * from dept;
select * from emp;

-- 처음 DML을 시작한 순간부터 여기까지의 작업 처리
commit;

-- 커밋 이후에 다시 새로 트랜잭션이 설정됨 (커밋 후에 롤백 안먹힘)
rollback;

-- CRUD : 데이터 처리와 관련
-- insert('C'reate)
-- select('R'ead)
-- update('U'pdate)
-- delete('D'elete)

-- 예외(Exception) 처리(handling) : 처리할 수 있는 에러
