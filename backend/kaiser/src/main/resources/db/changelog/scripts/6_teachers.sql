create table if not exists grades
(
    id int primary key,
    gradeNumber int not null,
    description VARCHAR not null
);

INSERT INTO public.grades (id, gradeNumber, description) VALUES (1, 1, 'Kais class') on conflict do nothing;;
INSERT INTO public.grades (id, gradeNumber, description) VALUES (2, 2, 'Charlies class') on conflict do nothing;;
INSERT INTO public.grades (id, gradeNumber, description) VALUES (3, 3, 'Matthews Class') on conflict do nothing;;
INSERT INTO public.grades (id, gradeNumber, description) VALUES (4, 4, 'Andrews class') on conflict do nothing;;

create table if not exists teachers
(
    id int not null primary key,
    name VARCHAR not null,
    surname VARCHAR not null,
    gradesId int not null
        constraint teachers_grades_fk
            references grades
);

alter table students
    drop constraint if exists students_teachers_pk;

alter table students
    drop column if exists teacher_id;