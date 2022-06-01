CREATE TABLE if not exists playlistnameTable (
    id INT,
    playlistname VARCHAR,
    PRIMARY KEY (id)
);

create sequence if not exists playlistname_id_seq;

alter table playlistnameTable alter column id set default nextval('playlistname_id_seq');

CREATE TABLE if not exists playlistvideoTable (
    id INT,
    playlistnameid INT,
    videoid INT,
    PRIMARY KEY (id)
);

create sequence if not exists playlistvideo_id_seq;

alter table playlistvideoTable alter column id set default nextval('playlistvideo_id_seq');

alter table playlistvideoTable
    drop constraint if exists playlistvideo_fk,
    add constraint playlistvideo_fk
        foreign key (videoid) references videoTable;

alter table playlistvideoTable
    drop constraint if exists playlistnameid_fk,
    add constraint playlistname_fk
        foreign key (playlistnameid) references playlistnameTable;

INSERT INTO playlistnameTable(playlistname)
    VALUES
        ('Favourite Music'),
        ('Favourites'),
        ('A sort Data C'),
        ('A sort Data A'),
        ('A sort Data B');

INSERT INTO playlistvideoTable(playlistnameid, videoid)
    VALUES
        (1, 1),
        (2, 2),
        (2, 3),
        (1, 4),
        (2, 5),
        (2, 6);
