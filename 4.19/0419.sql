-- SQL�� ��/�ҹ��ڸ� �������� �ʴ´�

-- Select��(������� column�� �����ϰڴ�)
-- select(o), SELECT(o), Select(o)
-- select �÷���1, �÷���2 ....
-- from ���̺��

-- DEPT ���̺��� DEPTNO, DNAME, LOC(location) �÷��� �����͸� Ȯ���ϰ� �ʹ�
SELECT deptno, dname, loc
FROM dept;

-- �μ����̺��� �μ���ȣ, �μ��� ��ȸ
select deptno, dname
from dept;

-- ������̺��� ���, �̸�, ����, �μ� ��ȸ
select empno, ename, job, deptno
from emp;

-- ������̺��� ��ü �÷� ��ȸ
select *
from emp;

-- ������̺��� �̸�, �޿�, ���� ��ȸ
select ename, sal, sal * 12
from emp;

-- Null : ����, ������ (���� �������� �ʾҴٴ� �ǹ�)
-- null�� ���ؼ� ������� -> ����� null
select ename, sal, sal * 12 + comm
from emp;

-- nvl �Լ� : Null Value -> ���� null�� ��� Ư�������� ��ü���ִ� �Լ�
select ename, sal, sal * 12 + nvl(comm, 0)
from emp;

-- ��Ī �ο��ϱ� : as ���(���� ����)
-- ��Ī�� ������ �ִٸ� ""(�ֵ���ǥ)�� ������
   -- ex) �� �� �� �� �� -> "�� �� �� �� ��"
select ename as �̸�, sal �޿�, sal * 12 + nvl(comm,0) ����
from emp;

select ename �̸�, sal �޿�, sal * 12 + nvl(comm, 0) "�� �� �� �� ��"
from emp;

-- ���ڿ� ���� : java or javaScript -> +�� ����
-- DB���� ���ڿ� ���� : ||
-- DB������ ���ڿ��� ''(Ȭ����ǥ)�� �����

-- �ѿ��� �븮�� �޿��� 250�����̴�. �� ǥ��
select ename || ' ' || job || '�� �޿��� ' || sal || '�����̴�'
from emp;

--distinct : �ߺ��� ����
-- ������̺��� ��å(����,job) ��ȸ
select job
from emp;

select distinct job
from emp;

-- ��(row) ����, ���� -> where��
-- �޿��� 500���� �̻��� ��� ��ȸ
   -- �޿�: sal / 500���� �̻� : 500���� ���� ( >= 500 )
select *
from emp
where sal >= 500;
-- �ۼ��� ���� ���� ����, ���� Ʋ���� ������

-- �񱳿�����
-- ���� : =
-- ���� �ʴ�(�ٸ���) : != , <>

-- �̸��� �̹����� ����� ���� ��ȸ
select *
from emp
where ename = '�̹���';  -- ���ڵ����ʹ� Ȭ����ǥ('')�� ���Ѵ�

-- 10�� �μ����� �ٹ��ϴ� ��� ��ȸ
select *
from emp
where deptno = 10;  --���ڵ����ʹ� ''�� ������ �ʴ´�

-- 2005�� 1�� 1�� ������ �Ի��� ��� ��ȸ
-- ��ǻ�ÿ��� ��¥������ ����������
select *
from emp
where hiredate < '2005/01/01';  --��¥�����͵� ''�� ���Ѵ�

-- �������� && -> and / || -> or / ! -> not

-- �޿��� 400���� �̻�, 500���� ������ ��� ��ȸ 
  -- (= �޿��� 400�������� 500���� ������ ��� ��ȸ)
-- ~����(�ش� �κ��� ����)
-- sal >= 400 && sal <= 500
select *
from emp
where sal >= 400 and sal <= 500;

-- �޿��� 400���� �̸�, 500���� �ʰ��� ��� ��ȸ
select *
from emp
where sal < 400 or sal > 500;

-- Ŀ�̼��� 80, 100, 200�� ��� ��ȸ
select *
from emp
where comm = 80 or comm = 100 or comm = 200;

-- ~���� : between A and B (A�� B�� ���Ե�)
-- �޿��� 400�������� 500���� ������ ��� ��ȸ
select *
from emp
where sal between 400 and 500;

-- �޿��� 400���� �̸�, 500���� �ʰ��� ��� ��ȸ(sal < 400 or sal > 500)
  -- !(san >= 400 and sal <= 500)�� ������
-- ( = �޿��� 400�������� 500���� ���̰� �ƴ� ���(not))
select *
from emp
where sal not between 400 and 500;

-- 2003�⿡ �Ի��� ��� ��ȸ
select *
from emp
where hiredate between '2003/01/01' and '2003/12/31';

-- in ������ : �ݺ��Ǵ� or ������ �ٿ��� ���
-- Ŀ�̼��� 80, 100, 200�� ��� ��ȸ
select *
from emp
where comm in(80, 100, 200);

-- Ŀ�̼��� 80, 100, 200�� �ƴ� ��� ��ȸ
select *
from emp
where comm not in(80, 100, 200);

-- like(~ó��, ~����) : �ַ� �˻����� ����
-- ������ھ�(_), �ۼ�Ʈ(%)�� �Բ� ����
-- ������ھ� : �ش� ��ġ�� �ѱ���(�ƹ�����)�� �ǹ�
-- �ۼ�Ʈ : �ش� ��ġ�� 0�� �̻�(�ƹ�����)�� �ǹ�

-- ������ �̾��� ��� ��ȸ(��� ����� ������ 1���ڶ�� ����)
select *
from emp
--where name = '��';  -- �̸��� '��'�� ����� ã���Ƿ� ���ϴ� �����Ͱ� �ƴ�
where ename like '��%';  -- '��'�� �����ϰ� �ڿ� ���ڴ� 0�� �̻�

-- �̸��� '��'���� ������ ��� ��ȸ
select *
from emp
where ename like '%��';

-- �̸��� '��'�� ���ԵǾ� �ִ� ��� ��ȸ
select *
from emp
where ename like '%��%';

-- �̸��� �ι�° ���ڰ� '��'�� ��� ��ȸ
select *
from emp
where ename like '_��%';

-- �̸��� '��'�� ������� ���� ��� ��ȸ
select *
from emp
where ename not like '%��%';

-- null�� ���ϱ�
-- Ŀ�̼��� null�� ��� ��ȸ
select *
from emp
--where comm = null;
where comm is null;

-- Ŀ�̼��� ������ ��� ��ȸ
select *
from emp
where comm is not null;

-- order : ����
-- order by �÷��� : �ش� �÷����� ������ ���� -> ����
-- ~��
-- 2��, 3��, n��..... -> order by �÷���1, �÷���2......
-- �⺻ ������ ��������(������ -> ū�� ��) : asc(ascending), ���� ����
-- ��������(ū�� -> ������) ���� : desc(descending)�����

-- ��������� �Ի��� ������ �����ؼ� ��ȸ
select *
from emp
-- order by hiredate asc;
order by hiredate; -- asc�� �⺻���̸�, ���� ������

-- �ֱ� �Ի��� ������ ��� ��ȸ
select *
from emp
order by hiredate desc;

-- �޿� ������ ����, �޿��� ���ٸ� �̸������� �����ؼ� ��ȸ
select *
from emp
order by sal, ename;

-- �޿��� ���� ������ ����, �޿��� ���ٸ� �̸������� �����ؼ� ��ȸ
select *
from emp
order by sal desc, ename asc; --���� �� ������ ����� ��� �ٸ� ���� asc�� ���� ������ֱ�

-- <---------------------------------------------------------------------->

-- 1. ����� �̸��� �޿��� �Ի��� ��ȸ
select ename, sal, hiredate
from emp;

-- 2. �μ���ȣ�� �μ��� ��ȸ(��Ī ��� - '�μ���ȣ', '�μ���')
select deptno �μ���ȣ, dname �μ���
from dept;

-- 3. ������ �ߺ����� �ʰ� �� ���� �����ؼ� ��ȸ
select distinct job
from emp;

-- 4. �޿��� 300������ ��� ��ȣ, �̸�, �޿� ��ȸ
select empno, ename, sal
from emp
where sal <= 300;

-- 5. �̸��� "����ȣ"�� ����� �����ȣ, �̸�, �޿� ��ȸ
select empno, ename, sal
from emp
where ename = '����ȣ';

-- 6. �޿��� 250�̰ų� 300�̰ų� 500�� ������� ���, �̸�, �޿� ��ȸ
select empno, ename, sal
from emp
where sal in(250, 300, 500);

-- 7. �޿��� 250�� 300�� 500�� �ƴ� ����� ���, �̸�, �޿� ��ȸ
select empno, ename, sal
from emp
where sal not in(250, 300, 500);

-- 8. ������ "��"���̰ų� �̸��� "��"�� ��� �ִ� ��� ��ȸ
select *
from emp
where ename like '��%' or ename like '%��%';

-- 9. �����(mgr)�� ���� ��� ��ȸ
select *
from emp
where mgr is null;

-- 10. ������̺��� �ֱ� �Ի��� ���� ������ ���, �̸�, ����, �Ի��� ��ȸ
select empno, ename, job, hiredate
from emp
order by hiredate desc;

-- 11. �μ���ȣ�� ���� ������� ����ϵ�, ���� �μ����� ����� ��� �Ի����� ������ ������� ��µǵ��� ��ȸ
select *
from emp
order by deptno, hiredate ;

--<---------------------------------------------------------------------------------->

-- �������(+, -, *, /)
-- select��, from���� �ʼ���
-- where��, order by���� �ʿ信 ���� ���
-- 24 * 60
select 24 * 60
from dept;

-- dual ���̺�
-- ���̺� ���� ����
-- desc ���̺��(describe)

desc emp;

--���̺� ������ ���� ��
desc dual; 

select 24 * 60
from dual;

-- dual ���̺� ��ȸ(���̺� ���� ��ȸ�ϴ� ��)
select *
from dual;

-- ���밪(absolute; abs) ���ϱ�
select -10, abs(-10)
from dual;

--����(floor) �Լ�
select 24.5678, floor(24.5678)
from dual;

-- �ݿø�(round)
select 34.5678, round(34.5678)
from dual;

-- round(34.5678, 1(�Ҽ��� 1�ڸ����� �ݿø�))
-- round(34.5678, -1(1�� �ڸ����� �ݿø�))
select round(34.5678), round(34.5678, 1), round(34.5678, -1)
from dual;

-- ������ : mod
select mod(27, 2), mod(27, 5), mod(27,7)
from dual;

-- upper : �빮�ڷ� ���� / lower : �ҹ��ڷ� ���� / initcap(�ܾ� ù���ڸ� �빮��)
select 'Welcome to Oracle', 
upper('Welcome to Oracle'), 
lower('WELCOME TO ORACLE'),
initcap('welcome to oracle')
from dual;

-- ���� ���� ���ϱ�(length, lengthb)
-- length : ���� ����, lengthb : ����Ʈ��
-- utf-8 : ���� 1����Ʈ, �ѱ� 3����Ʈ
select length('Oracle'), length('����Ŭ'), 
lengthb('Oracle'), lengthb('����Ŭ')
from dual;

-- �κ� ���ڿ� : substr(sub string)
-- substr(���, ������ġ, ����)
-- �ε����� 1���� ������(�ڹٴ� 0���� ������)
select substr('Welcome to Oracle', 4, 3)
from dual;

-- �ε����� �������� ����ϴ� ��� - �ڿ������� ����
select substr('Welcome to Oracle', -4, 3)
from dual;

-- instr(index string) : ��ġ(�ε���) ã��
-- instr(���, ã�� ����)
-- instr(���, ã�� ����, ������ġ, ���°)
select instr('WELCOME TO ORACLE', 'O')
from dual;

-- �ε��� 6���� �����ؼ� 2��° �߰ߵǴ� 'O�� ��ġ ã��
select instr('WELCOME TO ORACLE', 'O', 6, 2)
from dual;

-- lpad(left padding), rpad(right padding) :ä���
-- lpad(���, �ڸ���, ä�﹮��)
select lpad('Oracle', 20, '#'), rpad('Oracle', 20, '*')
from dual;

-- ���� ��¥ ���ϴ� sysdate
-- ����/��¥ �����͸� ���������� ����ȯ(to_char)
select sysdate, to_char(sysdate, 'YYYY-MM-DD DY PM HH:MI:SS')
from dual;

select 12300000, to_char(12300000), to_char(12300000, 'L999,999,999')
from dual;

-- ��¥������ ����(to_date)
-- 2007�� 4�� 2�Ͽ� �Ի��� ����� �̸��� �Ի��� ��ȸ
select ename, hiredate
from emp
-- where hiredate = '2007/04/02';
where hiredate = to_date(20070402, 'YYYYMMDD');

-- ���� ��ĥ�� �����°� : ���� ��¥(sysdate) - 2021/01/01
select floor(sysdate - to_date('2021/01/01'))
from dual;

select to_date('2021/04/19') - to_date('2021/01/01')
from dual;

-- ���ڷ� ��ȯ (to_number)
select '20,000' - '10,000'
from dual;

select to_number('20,000', '99,999') - to_number('10,000', '99,999')
from dual;

-- ��¥�� ���������δ� ���ڵ�����
select sysdate ����, sysdate + 1 ����, sysdate - 1 ����, sysdate + 12 ������
from dual;

