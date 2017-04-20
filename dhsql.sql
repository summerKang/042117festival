drop table mvcsnsboard;

create sequence fes1;

insert into MVCSNSBOARD
values (fes1.NEXTVAL,'snsjemok','writer','snsNaeyong',mvcsnsboard_sequence1.CURRVAL,0,0);

select * from MVCSNSBOARD;

delete * from MVCSNSBOARD;

insert into festival values (1,'snsjemok', 'seoul', '20170202', '20170205', 5, '010-1111-2222', 'snsNaeyong');
insert into festival values (2,'sns', 'seoul2', '20161212', '20161216', 5, '010-3333-4444', 'sns');
insert into festival values (3,'jemok', 'seoul3', '20170125', '20170126', 5, '010-5555-6666', 'Naeyong');

select * from festival;

create table festival (
	fnum	number(5),
	fname	varchar2(50),
	city	varchar2(50),
	sdate	date,
	edate	date,
	capa	number(5),
	ftel	varchar2(50),
	home	varchar2(50)
);

create table member (
	mnum	number(5),
	mname	varchar2(50),
	age		number(5),
	mtel	varchar2(50),
	email	varchar2(50)
);

create table reservation (
	rnum	number(5),
	fname	varchar2(50),
	ddate	date,
	mname	varchar2(50),
	pnum	number(5)
);


select * from tab;

drop table reservation;

insert into reservation values (1,'snsjemok','20170202','snsNaeyong',0);

select * from reservation;


