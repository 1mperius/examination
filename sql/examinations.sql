CREATE TABLE `table_1` (
);
CREATE TABLE `t_Admin` (
`AdId` int(10) NOT NULL,
`AdAccount` varchar(40) NULL,
`AdPassword` varchar(40) NULL,
PRIMARY KEY (`AdId`) 
);
CREATE TABLE `t_StudentInfo` (
`StuId` int(20) NOT NULL,
`StuName` varchar(40) NULL,
`StuSex` varchar(10) NULL,
`StuProvince` varchar(40) NULL,
`StuMark` int(20) NULL,
PRIMARY KEY (`StuId`) 
);
CREATE TABLE `t_CollegeInfo` (
`ColId` int(20) NOT NULL,
`ColName` varchar(40) NULL,
`ColType` varchar(10) NULL,
`ColTel` varchar(20) NULL,
`ColUrl` varchar(100) NULL,
`ColAddress` varchar(100) NULL,
PRIMARY KEY (`ColId`) 
);
CREATE TABLE `t_CollegeMark` (
`ColId` int(20) NOT NULL,
`ColGenera` varchar(10) NULL,
`ColBatch` varchar(10) NULL,
`Year` int(10) NULL,
`ColMaxMark` int(20) NULL,
`ColMinMark` int(20) NULL,
`ColAveMark` int(20) NULL,
`ColNumber` int(1000) NULL,
`Province` varchar(40) NULL,
PRIMARY KEY (`ColId`) 
);
CREATE TABLE `t_MajorInfo` (
`ColId` int(20) NOT NULL,
`MajId` int(20) NOT NULL,
`MajName` varchar(40) NULL,
`MajYear` int(10) NULL,
PRIMARY KEY (`ColId`, `MajId`) 
);
CREATE TABLE `t_MajorMark` (
`MajId` int(20) NOT NULL,
`MajMaxMark` int(20) NULL,
`MajMinMark` int(20) NULL,
`MajAveMark` int(20) NULL,
`Year` int(20) NULL,
`Province` varchar(40) NULL,
PRIMARY KEY (`MajId`) 
);
CREATE TABLE `t_Test` (
`QNumber` int(60) NOT NULL,
`QStem` varchar(50) NULL,
`QType` varchar(0) NULL,
`QY` tinyint(1) NULL,
`QN` tinyint(1) NULL,
PRIMARY KEY (`QNumber`) 
);

ALTER TABLE `t_CollegeMark` ADD CONSTRAINT `ColId` FOREIGN KEY (`ColId`) REFERENCES `t_CollegeInfo` (`ColId`);

