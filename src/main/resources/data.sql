INSERT INTO EMPLOYEE
	(E_ID, E_FIRST_NAME, E_LAST_NAME)
VALUES
	(employee_generator.NEXTVAL, 'Alexander', 'Mellor'),
	(employee_generator.NEXTVAL, 'Christopher', 'Mellor'),
	(employee_generator.NEXTVAL, 'Dale', 'Mellor'),
	(employee_generator.NEXTVAL, 'Suzanne', 'Mellor');

INSERT INTO COMPANY
	(C_ID, C_NAME)
VALUES
	(0, 'Cognixia'),
	(1, 'Sayre Police Department'),
	(2, 'Elite Drug Consortium');