insert into addresses(id, street) values (1, 'street1');
insert into employees(id, name, age, address_id) values(1, 'employee1', 25, 1);

insert into equipments(name, serial_number, employee_id)
values ('phone1', '111111', 1),
       ('computer1', '222222', 1);
insert into projects(id, name) values (1, 'project1'), (2, 'project2');
insert into employee_project(employee_id, project_id) values (1, 1), (1, 2);