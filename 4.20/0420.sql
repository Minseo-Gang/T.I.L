-- �⺻ ����(�ð� ����)
-- ����(12:00)���� round(�ݿø�), trunc(����)
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS'), 
       to_char(round(sysdate), 'YYYY-MM-DD HH24:MI:SS'),
       to_char(round(to_date('2021-04-20 13:01:00', 'YYYY-MM-DD HH24:MI:SS')), 'YYYY-MM-DD HH24:MI:SS'),
       to_char(trunc(to_date('2021-04-20 13:01:00', 'YYYY-MM-DD HH24:MI:SS')), 'YYYY-MM-DD HH24:MI:SS')
from dual;

-- �Ի��� ���� ù 1��
select ename, hiredate, trunc(hiredate, 'MONTH')
from emp;

-- ������� �ٹ� ������
-- ��¥�� ���� : ���� ���
-- months_between : �޼� ���
select ename �̸�, sysdate ����, hiredate �Ի���,
       trunc(sysdate - hiredate) �ٹ��ѳ���,
       trunc(months_between(sysdate, hiredate)) �ٹ��Ѵ޼�
from emp;

-- ������� �Ի���, �Ի� �� 6���� ��¥ ���ϱ�
select ename �̸�, hiredate �Ի���,
             hiredate + 6 "6�� ��",
             add_months(hiredate, 6) "6���� ��",
             add_months(hiredate, -6) "6���� ��"
from emp;

-- ���ƿ��� ~����(next_day)
select sysdate ����, next_day(sysdate, '������') "���ƿ��� ������"
from dual;

-- ������� �Ի��� ù �ָ�
select ename, hiredate �Ի���, next_day(hiredate, '�����') "�Ի��� ù �ָ�"
from emp;

-- �ش� ��¥�� ������ ��¥ : last_day
select sysdate ����, last_day(sysdate) "�̴��� ������ ��",
       last_day(to_date('2000/02/01', 'YYYY-MM-DD'))
from dual;

-- ������� �Ի����� ������ ��
select ename, hiredate �Ի���, last_day(hiredate) "�Ի��� ������ ��"
from emp;

-- nvl(null��, ��ü��)
-- nvl2(null��, null�� �ƴ� ���, null�� ���)
select ename �̸�, sal �޿�,
       nvl2(comm, sal * 12 + comm, sal * 12) ����
from emp;

-- nullif(��1, ��2) : �� ���� ������ null, �ٸ��� ù��° ��
select nullif('A', 'A'), nullif('A', 'B')
from dual;

-- coalesce(��1, ��2, ... ��n) : ���� ���� �߿��� null�� �ƴ� ù��° ��
select ename �̸�, comm Ŀ�̼�, sal �޿�,
       coalesce(comm, sal)
from emp;

-- �μ����̺�
select *
from dept;

-- ������� �ٹ��ϴ� �μ���
-- switch ~ case�� ������
select ename �̸�, deptno �μ���ȣ,
       decode(deptno, 10, '�渮��',  -- case 10:
                      20, '�λ��',  -- case 20:
                      30, '������',  -- case 30:
                      40, '�����',  -- case 40:
                      '�μ�����') �μ���  -- default:
from emp;

-- ������� �ٹ��ϴ� �μ���
-- if ~ else if ~ else�� ������
select ename �̸�, deptno �μ���ȣ,
        case
            when deptno = 10 then '�渮��'
            when deptno = 20 then '�λ��'
            when deptno = 30 then '������'
            when deptno = 40 then '�����'
        end �μ���
from emp;

-- <--------------------------------------------------------------------------->
-- 1. substr �Լ��� ����Ͽ� 9���� �Ի��� ��� ��ȸ
select *
from emp
where substr(to_char(hiredate, 'YYYY/MM/DD'), 6, 2) = '09';

-- 2. substr �Լ��� ����Ͽ� 2003�⵵�� �Ի��� ��� ��ȸ
select *
from emp
where substr(to_char(hiredate, 'YYYY/MM/DD'), 1, 4) = '2003';

-- 3. substr �Լ��� ����Ͽ� "��"�� ������ ��� ��ȸ
select *
from emp
-- where substr(ename, 3, 1) = '��'; �̸��� 4���ڳ� 2������ ����� �����Ƿ� ����x
where substr(ename, -1, 1) = '��';

-- 4. instr �Լ��� ����Ͽ� �̸��� �ι�° ���ڿ� "��"�� �ִ� ��� ��ȸ
select *
from emp
where instr(ename, '��', 1, 1) = 2;

-- 5. ����(job)�� ���� ������ "����"�� ����� 5%, "����"�� ����� 10%, "�븮"�� ����� 15%,
     -- "���"�� ����� 20%�� �λ�� �޿� ��ȸ
select ename �̸�, job ����, sal �޿�,
    decode(job, '����', sal + (sal * 0.05),
                '����', sal + (sal * 0.1),
                '�븮', sal + (sal * 0.15),
                '���', sal + (sal * 0.2),
                 sal) �λ�޿�
from emp;
     
-- 6. �Ի����� �⵵ 2�ڸ�, �� 2�ڸ�, �� 2�ڸ� ������ ���("��")�� �����Ͽ� ���
select ename �̸�, to_char(hiredate, 'YY/MM/DD DY') �Ի���
from emp;

-- <---------------------------------------------------------------------------------->

-- count : ���� ���� (row�� ����)
-- ��ü ������� Ŀ�̼��� ������ �����
select count(*) �����, count(comm) Ŀ�̼ǻ����
from emp;

-- ������� �޿� �Ѿ�, �޿� ���, �ִ� �޿�, �ּ� �޿� ��ȸ
select sum(sal) "�޿� �Ѿ�", round(avg(sal)) "�޿� ���", 
       max(sal) "�ִ� �޿�", min(sal) "�ּ� �޿�"
from emp;

-- �Ի����� ���� ������ ��¥, ���� �ֱ� �Ի���
select min(hiredate) "��������", max(hiredate) "�ֱ�����"
from emp;

-- �Ϲ����� ���� : null���� ���� -> null
-- �׷��Լ����� null�� �����ϰ� �����
select count(comm), sum(comm), avg(comm), min(comm), max(comm)
from emp;

-- ���� ���� �޿��� �޴� ����� �̸��� �޿� ��ȸ
--select ename, max(sal) : ������ ���� 14, 1 �̶� ������
--from emp;
-- ��������
select ename, sal
from emp
where sal = (select max(sal) from emp);

-- ����(job)�� null�� �ƴ� raw�� ��
select count(job) -- job column�� ���� null�� �ƴ� raw�� ��
from emp;

-- ������ ����
select count(distinct job)
from emp;

-- group by �÷��� : �ش� �÷������� �׷���(~��)
-- �׷��Լ��� ���� ���δ�.
-- �μ���ȣ���� �׷���
-- �μ��� ��� �޿�
select deptno, round(avg(sal)), sum(sal), min(sal), max(sal)
from emp
group by deptno;

-- �μ��� �ο���, Ŀ�̼��� ������ �ο��� ���ϱ�
select deptno, count(*), count(comm)
from emp
group by deptno;

-- ��� �޿��� 500�̻��� �μ��� �μ���ȣ, ��� �޿�
select deptno, round(avg(sal))
from emp
group by deptno
having avg(sal) >= 500;

-- order by�� �׻� ���� ���߿� ������
select deptno, round(avg(sal))
from emp
group by deptno
order by deptno;

-- ����(job)�� "���"�� ������ �����ϰ�, ���޺� �޿� �Ѿ�
-- �޿��Ѿ��� ���������� ����
select job, sum(sal)
from emp
where job <> '���'
group by job
order by sum(sal);

-- <---------------------------------------------------------------------------->
-- ��ձ޿��� ���� ���� �μ��� �μ���ȣ, ��ձ޿�
select max(round(avg(sal)))
from emp
group by deptno;

-- 1. �޿� �ְ��, ������, �Ѿ� �� ��� �޿� ���ϱ�
select max(sal), min(sal), sum(sal), round(avg(sal))
from emp;

-- 2. ���޺��� �޿� �ְ��, ������, �Ѿ�, ��� �޿� ���ϱ�
select job ����, max(sal) �ְ��, min(sal) ������, sum(sal) �Ѿ�, round(avg(sal)) ��ձ޿�
from emp
group by job;

-- 3. ���޺� ����� ���ϱ�
select job ����, count(*) �����
from emp
group by job;

-- 4. ������ �� ���ϱ�
select count(*)
from emp
where job = '����';

-- 5. �޿� �ְ�װ� �޿� �������� ���� ���ϱ�
select max(sal) �ְ��, min(sal) ������, max(sal) - min(sal) ����
from emp;


-- 6. �μ��� �����, ��� �޿� ���ϱ�(�μ���ȣ ������ ����)
select deptno, count(*) �����, round(avg(sal)) ��ձ޿�
from emp
group by deptno
order by deptno;

-- 7. �μ���ȣ�� �μ��̸�(dname), ������(loc), �����, ��ձ޿� ���ϱ�
select deptno �μ���ȣ,
      decode(deptno, 10, '�渮��',
                     20, '�λ��',
                     30, '������',
                     40, '�����') �μ���,
      decode(deptno, 10, '����',
                     20, '��õ',
                     30, '����',
                     40, '����') ������,
      count(*) �����, round(avg(sal)) ��ձ޿�
from emp
group by deptno
order by deptno;

-- select -> DQL(Data Query Language)
-- DML(Data Manipulation Language) - ����
-- insert - ������ �߰�.���� / update - ������ ����. ���� / delete - ������ ����
-- Ʈ�����(Transaction) - ��(����)�� ����

-- �μ����̺��� ����, desc : describe
desc dept;
select*
from dept;

-- �μ����̺� 50, ȫ����, ��� �μ� �߰��ϱ�
-- insert into ���̺�� (�÷���1, �÷���2, ....)
-- values (��1, ��2, ��3.....)
-- ���ڴ� ����ǥ ����, ����/��¥�� ����ǥ �ʿ�
insert into dept(deptno, dname, loc)
values (50, 'ȫ����', '���');

select * from dept;

desc emp;
-- ��� ���̺� ������ �߰�
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1015, '������', '����', 1009, sysdate, 2000, 500, 50);

select * from emp;

-- ������ ����/���� - update
-- where���� �ʼ����� �ƴ� but where���� ������ ��ü �����͸� �����ϴ� ��
-- set�� ���� �����ϰ��� �ϴ� �÷��� �����ϸ� ��
update emp
set ename = '������', sal = 2500
where empno = 1015;

select * from emp;

-- ������ ���� - delete
-- �̸��� �������� ���� ����
delete from emp
where ename = '������';

select * from emp;



insert into dept(deptno, dname, loc)
values (50, 'ȫ����', '���');

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1015, '������', '����', 1009, sysdate, 2000, 500, 50);

-- ó�� DML�� ������ �������� ��������� �۾� ���
rollback;

select * from dept;
select * from emp;

-- ó�� DML�� ������ �������� ��������� �۾� ó��
commit;

-- Ŀ�� ���Ŀ� �ٽ� ���� Ʈ������� ������ (Ŀ�� �Ŀ� �ѹ� �ȸ���)
rollback;

-- CRUD : ������ ó���� ����
-- insert('C'reate)
-- select('R'ead)
-- update('U'pdate)
-- delete('D'elete)

-- ����(Exception) ó��(handling) : ó���� �� �ִ� ����
