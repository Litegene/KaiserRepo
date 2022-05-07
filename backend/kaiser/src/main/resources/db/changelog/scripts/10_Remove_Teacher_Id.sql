ALTER TABLE students DROP COLUMN if exists teachers_id;

update public.students set grade_id = 1 where name = 'Andrew';
update public.students set grade_id = 2 where name = 'Charlie';
update public.students set grade_id = 3 where name = 'Kai';

update public.students set home_grade_teacher_id = 3 where name = 'Andrew';
update public.students set home_grade_teacher_id = 1 where name = 'Charlie';
update public.students set home_grade_teacher_id = 2 where name = 'Kai';