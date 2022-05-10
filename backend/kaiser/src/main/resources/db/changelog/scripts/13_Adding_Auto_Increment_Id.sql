create sequence if not exists student_id_seq;

alter table students alter column id set default nextval('student_id_seq');