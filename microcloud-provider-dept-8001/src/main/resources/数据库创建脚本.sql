CREATE TABLE DEPT
(
        DEPT_NO BIGINT NOT NULL AUTO_INCREMENT,
        DNAME VARCHAR(50),
        LOC VARCHAR(100),
        PRIMARY KEY (DEPT_NO)
)ENGINE=INNODB DEFAULT CHARSET=UTF8;

INSERT INTO DEPT (dept_No, dname, loc) VALUES (1, '开发部', database());
INSERT INTO DEPT (dept_No, dname, loc) VALUES (2, '测试部', database());
INSERT INTO DEPT (dept_No, dname, loc) VALUES (3, '财务部', database());
INSERT INTO DEPT (dept_No, dname, loc) VALUES (4, '后勤部', database());
INSERT INTO DEPT (dept_No, dname, loc) VALUES (5, '公关部', database());
