INSERT INTO EMPLOYEE
	(ID, FIRST_NAME, LAST_NAME)
VALUES
	(NEXTVAL('employee_seq'), 'Alexander', 'Mellor'),
	(NEXTVAL('employee_seq'), 'Christopher', 'Mellor'),
	(NEXTVAL('employee_seq'), 'Dale', 'Mellor'),
	(NEXTVAL('employee_seq'), 'Suzanne', 'Mellor');

INSERT INTO COMPANY
	(ID, NAME)
VALUES
	(NEXTVAL('company_seq'), 'Cognixia'),
	(NEXTVAL('company_seq'), 'Sayre Police Department'),
	(NEXTVAL('company_seq'), 'Elite Drug Consortium');