CREATE TABLE IF NOT EXISTS PERSON (PERSON_ID int NOT NULL,NAME varchar(255),SURNAME varchar(255),BIRTHDATE date,PRIMARY KEY(PERSON_ID));

CREATE SEQUENCE IF NOT EXISTS PERSON_SEQ START WITH 500 INCREMENT BY 500;