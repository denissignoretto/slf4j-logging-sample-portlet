create table IT_DSIGNO_Logger (
	loggerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	logMessage VARCHAR(75) null
);