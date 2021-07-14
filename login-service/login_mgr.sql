create table if not exists login_user (
	userid integer,
	firstName varchar(255),
    lastName varchar(255),
    email varchar(500),
    pswd varchar(100),
    mobile varchar(15)
);