alter table students
    add column if not exists grade_id int,
    add column if not exists home_grade_teacher_id int,
    drop constraint student_home_greade_teacher_fk,
    add constraint student_home_greade_teacher_fk
            foreign key (home_grade_teacher_id) references teachers;

    update students set grade_id = 1 where grade_id = null;

alter table students
    drop constraint student_grade_fk,
    add constraint student_grade_fk
                    foreign key (grade_id) references grades;