CREATE TABLE if not exists tagTable (
    id INT,
    tagName VARCHAR,
    PRIMARY KEY (id)
);

create sequence if not exists tag_id_seq;

alter table tagTable alter column id set default nextval('tag_id_seq');

INSERT INTO tagTable(tagName)
    VALUES
        ('Music'),
        ('FPS'),
        ('Video Game'),
        ('Anime'),
        ('RPG');

CREATE TABLE if not exists joinvideoandtagtable (
    id INT,
    tagId INT,
    videoId INT,
    PRIMARY KEY (id)
);

create sequence if not exists videotag_id_seq;

alter table joinvideoandtagtable alter column id set default nextval('videotag_id_seq');