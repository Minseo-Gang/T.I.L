-- SQL은 대/소문자를 구분하지 않는다

-- Select문(보고싶은 column만 선택하겠다)
-- select(o), SELECT(o), Select(o)
-- select 컬럼명1, 컬럼명2 ....
-- from 테이블명

-- DEPT 테이블에서 DEPTNO, DNAME, LOC(location) 컬럼의 데이터를 확인하고 싶다
SELECT deptno, dname, loc
FROM dept;

-- 부서테이블에서 부서번호, 부서명만 조회
select deptno, dname
from dept;

-- 사원테이블에서 사번, 이름, 직급, 부서 조회
select empno, ename, job, deptno
from emp;

-- 사원테이블에서 전체 컬럼 조회
select *
from emp;

-- 사원테이블에서 이름, 급여, 연봉 조회
select ename, sal, sal * 12
from emp;

-- Null : 미정, 미지정 (아직 정해지지 않았다는 의미)
-- null에 대해서 산술연산 -> 결과도 null
select ename, sal, sal * 12 + comm
from emp;

-- nvl 함수 : Null Value -> 값이 null인 경우 특정값으로 대체해주는 함수
select ename, sal, sal * 12 + nvl(comm, 0)
from emp;

-- 별칭 부여하기 : as 사용(생략 가능)
-- 별칭에 공백이 있다면 ""(쌍따옴표)로 감싸줌
   -- ex) 연 간 지 급 액 -> "연 간 지 급 액"
select ename as 이름, sal 급여, sal * 12 + nvl(comm,0) 연봉
from emp;

select ename 이름, sal 급여, sal * 12 + nvl(comm, 0) "연 간 지 급 액"
from emp;

-- 문자열 연결 : java or javaScript -> +로 연결
-- DB에서 문자열 연결 : ||
-- DB에서는 문자열을 ''(홑따옴표)로 기술함

-- 한예슬 대리의 급여는 250만원이다. 로 표시
select ename || ' ' || job || '의 급여는 ' || sal || '만원이다'
from emp;

--distinct : 중복행 제거
-- 사원테이블에서 직책(직급,job) 조회
select job
from emp;

select distinct job
from emp;

-- 행(row) 선택, 조건 -> where절
-- 급여가 500만원 이상인 사원 조회
   -- 급여: sal / 500만원 이상 : 500만원 포함 ( >= 500 )
select *
from emp
where sal >= 500;
-- 작성시 절의 순서 주의, 순서 틀리면 오류남

-- 비교연산자
-- 같다 : =
-- 같지 않다(다르다) : != , <>

-- 이름이 이문세인 사원의 정보 조회
select *
from emp
where ename = '이문세';  -- 문자데이터는 홑따옴표('')로 감싼다

-- 10번 부서에서 근무하는 사원 조회
select *
from emp
where deptno = 10;  --숫자데이터는 ''로 감싸지 않는다

-- 2005년 1월 1일 이전에 입사한 사원 조회
-- 컴퓨팅에서 날짜정보는 숫자정보임
select *
from emp
where hiredate < '2005/01/01';  --날짜데이터도 ''로 감싼다

-- 논리연산자 && -> and / || -> or / ! -> not

-- 급여가 400만원 이상, 500만원 이하인 사원 조회 
  -- (= 급여가 400만원에서 500만원 사이인 사원 조회)
-- ~사이(해당 부분이 포함)
-- sal >= 400 && sal <= 500
select *
from emp
where sal >= 400 and sal <= 500;

-- 급여가 400만원 미만, 500만원 초과인 사원 조회
select *
from emp
where sal < 400 or sal > 500;

-- 커미션이 80, 100, 200인 사원 조회
select *
from emp
where comm = 80 or comm = 100 or comm = 200;

-- ~사이 : between A and B (A와 B가 포함됨)
-- 급여가 400만원에서 500만원 사이인 사원 조회
select *
from emp
where sal between 400 and 500;

-- 급여가 400만원 미만, 500만원 초과인 사원 조회(sal < 400 or sal > 500)
  -- !(san >= 400 and sal <= 500)도 같은말
-- ( = 급여가 400만원에서 500만원 사이가 아닌 사원(not))
select *
from emp
where sal not between 400 and 500;

-- 2003년에 입사한 사원 조회
select *
from emp
where hiredate between '2003/01/01' and '2003/12/31';

-- in 연산자 : 반복되는 or 구문을 줄여서 사용
-- 커미션이 80, 100, 200인 사원 조회
select *
from emp
where comm in(80, 100, 200);

-- 커미션이 80, 100, 200이 아닌 사원 조회
select *
from emp
where comm not in(80, 100, 200);

-- like(~처럼, ~같은) : 주로 검색에서 사용됨
-- 언더스코어(_), 퍼센트(%)와 함께 쓰임
-- 언더스코어 : 해당 위치에 한글자(아무글자)를 의미
-- 퍼센트 : 해당 위치에 0개 이상(아무글자)을 의미

-- 성씨가 이씨인 사원 조회(모든 사원의 성씨가 1글자라고 가정)
select *
from emp
--where name = '이';  -- 이름이 '이'인 사람을 찾으므로 원하는 데이터가 아님
where ename like '이%';  -- '이'로 시작하고 뒤에 글자는 0개 이상

-- 이름이 '성'으로 끝나는 사원 조회
select *
from emp
where ename like '%성';

-- 이름에 '성'이 포함되어 있는 사원 조회
select *
from emp
where ename like '%성%';

-- 이름의 두번째 글자가 '성'인 사원 조회
select *
from emp
where ename like '_성%';

-- 이름에 '성'이 들어있지 않은 사원 조회
select *
from emp
where ename not like '%성%';

-- null값 비교하기
-- 커미션이 null인 사원 조회
select *
from emp
--where comm = null;
where comm is null;

-- 커미션이 정해진 사원 조회
select *
from emp
where comm is not null;

-- order : 순서
-- order by 컬럼명 : 해당 컬럼으로 순서를 정함 -> 정렬
-- ~순
-- 2차, 3차, n차..... -> order by 컬럼명1, 컬럼명2......
-- 기본 정렬은 오름차순(작은값 -> 큰값 순) : asc(ascending), 생략 가능
-- 내림차순(큰값 -> 작은값) 정렬 : desc(descending)명시함

-- 사원정보를 입사일 순으로 정렬해서 조회
select *
from emp
-- order by hiredate asc;
order by hiredate; -- asc는 기본값이며, 생략 가능함

-- 최근 입사한 순으로 사원 조회
select *
from emp
order by hiredate desc;

-- 급여 순으로 정렬, 급여가 같다면 이름순으로 정렬해서 조회
select *
from emp
order by sal, ename;

-- 급여가 많은 순으로 정렬, 급여가 같다면 이름순으로 정렬해서 조회
select *
from emp
order by sal desc, ename asc; --정렬 한 곳에서 명시할 경우 다른 쪽이 asc라도 같이 명시해주기

-- <---------------------------------------------------------------------->

-- 1. 사원의 이름과 급여와 입사일 조회
select ename, sal, hiredate
from emp;

-- 2. 부서번호와 부서명 조회(별칭 사용 - '부서번호', '부서명')
select deptno 부서번호, dname 부서명
from dept;

-- 3. 직급을 중복하지 않고 한 번씩 나열해서 조회
select distinct job
from emp;

-- 4. 급여가 300이하인 사원 번호, 이름, 급여 조회
select empno, ename, sal
from emp
where sal <= 300;

-- 5. 이름이 "오지호"인 사원의 사원번호, 이름, 급여 조회
select empno, ename, sal
from emp
where ename = '오지호';

-- 6. 급여가 250이거나 300이거나 500인 사원들의 사번, 이름, 급여 조회
select empno, ename, sal
from emp
where sal in(250, 300, 500);

-- 7. 급여가 250도 300도 500도 아닌 사원의 사번, 이름, 급여 조회
select empno, ename, sal
from emp
where sal not in(250, 300, 500);

-- 8. 성씨가 "김"씨이거나 이름에 "기"가 들어 있는 사원 조회
select *
from emp
where ename like '김%' or ename like '%기%';

-- 9. 상급자(mgr)가 없는 사원 조회
select *
from emp
where mgr is null;

-- 10. 사원테이블에서 최근 입사한 직원 순으로 사번, 이름, 직급, 입사일 조회
select empno, ename, job, hiredate
from emp
order by hiredate desc;

-- 11. 부서번호가 빠른 사원부터 출력하되, 같은 부서내의 사원인 경우 입사일이 오래된 사원부터 출력되도록 조회
select *
from emp
order by deptno, hiredate ;

--<---------------------------------------------------------------------------------->

-- 산술연산(+, -, *, /)
-- select절, from절은 필수절
-- where절, order by절은 필요에 따라서 사용
-- 24 * 60
select 24 * 60
from dept;

-- dual 테이블
-- 테이블 구조 보기
-- desc 테이블명(describe)

desc emp;

--테이블 구조를 보는 것
desc dual; 

select 24 * 60
from dual;

-- dual 테이블 조회(테이블 내용 조회하는 것)
select *
from dual;

-- 절대값(absolute; abs) 구하기
select -10, abs(-10)
from dual;

--버림(floor) 함수
select 24.5678, floor(24.5678)
from dual;

-- 반올림(round)
select 34.5678, round(34.5678)
from dual;

-- round(34.5678, 1(소숫점 1자리에서 반올림))
-- round(34.5678, -1(1의 자리에서 반올림))
select round(34.5678), round(34.5678, 1), round(34.5678, -1)
from dual;

-- 나머지 : mod
select mod(27, 2), mod(27, 5), mod(27,7)
from dual;

-- upper : 대문자로 변경 / lower : 소문자로 변경 / initcap(단어 첫글자만 대문자)
select 'Welcome to Oracle', 
upper('Welcome to Oracle'), 
lower('WELCOME TO ORACLE'),
initcap('welcome to oracle')
from dual;

-- 문자 길이 구하기(length, lengthb)
-- length : 글자 갯수, lengthb : 바이트수
-- utf-8 : 영문 1바이트, 한글 3바이트
select length('Oracle'), length('오라클'), 
lengthb('Oracle'), lengthb('오라클')
from dual;

-- 부분 문자열 : substr(sub string)
-- substr(대상, 시작위치, 갯수)
-- 인덱스는 1부터 시작함(자바는 0부터 시작함)
select substr('Welcome to Oracle', 4, 3)
from dual;

-- 인덱스에 음수값을 사용하는 경우 - 뒤에서부터 시작
select substr('Welcome to Oracle', -4, 3)
from dual;

-- instr(index string) : 위치(인덱스) 찾기
-- instr(대상, 찾을 글자)
-- instr(대상, 찾을 글자, 시작위치, 몇번째)
select instr('WELCOME TO ORACLE', 'O')
from dual;

-- 인덱스 6부터 시작해서 2번째 발견되는 'O의 위치 찾기
select instr('WELCOME TO ORACLE', 'O', 6, 2)
from dual;

-- lpad(left padding), rpad(right padding) :채우기
-- lpad(대상, 자릿수, 채울문자)
select lpad('Oracle', 20, '#'), rpad('Oracle', 20, '*')
from dual;

-- 오늘 날짜 구하는 sysdate
-- 숫자/날짜 데이터를 문자형으로 형변환(to_char)
select sysdate, to_char(sysdate, 'YYYY-MM-DD DY PM HH:MI:SS')
from dual;

select 12300000, to_char(12300000), to_char(12300000, 'L999,999,999')
from dual;

-- 날짜형으로 변경(to_date)
-- 2007년 4월 2일에 입사한 사원의 이름과 입사일 조회
select ename, hiredate
from emp
-- where hiredate = '2007/04/02';
where hiredate = to_date(20070402, 'YYYYMMDD');

-- 올해 며칠이 지났는가 : 오늘 날짜(sysdate) - 2021/01/01
select floor(sysdate - to_date('2021/01/01'))
from dual;

select to_date('2021/04/19') - to_date('2021/01/01')
from dual;

-- 숫자로 변환 (to_number)
select '20,000' - '10,000'
from dual;

select to_number('20,000', '99,999') - to_number('10,000', '99,999')
from dual;

-- 날짜도 내부적으로는 숫자데이터
select sysdate 오늘, sysdate + 1 내일, sysdate - 1 어제, sysdate + 12 다음달
from dual;

