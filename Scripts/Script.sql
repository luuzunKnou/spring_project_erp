CREATE DATABASE project_erp;
USE project_erp;
CREATE TABLE project_info (
	project_no 			INT				NOT NULL PRIMARY KEY auto_increment,
	project_name		VARCHAR(100)	NOT NULL,
	project_content		TEXT			NOT NULL,
	project_begin_date	DATE			NOT NULL,
	project_end_date	DATE			NOT NULL,
	project_progress	VARCHAR(20) 	NOT NULL
);

/*project_no 
project_name
project_content
project_begin_date
project_end_date
project_progress*/

SELECT project_no, project_name, project_content, project_begin_date, project_end_date, project_progress
FROM project_info;

/*INSERT INTO project_info
(project_no, project_name, project_content, project_begin_date, project_end_date, project_progress)
VALUES(0, '', '', '', '', '');*/

INSERT INTO project_info
(project_name, project_content, project_begin_date, project_end_date, project_progress)
VALUES('', '', '', '', '');

/*UPDATE project_info
SET project_name='', project_content='', project_begin_date='', project_end_date='', project_progress=''
WHERE project_no=0;*/

UPDATE project_info
SET project_name='', project_content='', project_begin_date='', project_end_date='', project_progress=''
WHERE project_no=0;

DELETE FROM project_info
WHERE project_no=0;

INSERT INTO project_info
(project_name, project_content, project_begin_date, project_end_date, project_progress)
VALUES
	('ERP Project', 'Make ERP Program', '1998-01-31', '1998-12-31', '준비'),
	('Game Project', 'Make Game', '2198-01-31', '1998-12-31', '진행중'),
	('Study Project', 'Study Hard!', '2000-01-31', '1998-12-31', '준비'),
	('Book Project', 'Make Book Program', '1944-01-31', '1998-12-31', '준비');
	
use project_erp;
show tables;
select * from project_info;

