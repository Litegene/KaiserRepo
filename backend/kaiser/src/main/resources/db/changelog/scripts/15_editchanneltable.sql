delete from channeltable;
delete from videotable;

create sequence if not exists channel_id_seq;
create sequence if not exists video_id_seq;

alter table channeltable alter column id set default nextval('channel_id_seq');
alter table videotable alter column id set default nextval('video_id_seq');

alter table videotable drop column if exists channel;

alter table videotable
    add column if not exists channelid INT,
    drop constraint if exists video_fk,
    add constraint video_fk
        foreign key (channelid) references channeltable;