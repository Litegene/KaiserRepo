CREATE TABLE if not exists channelTable (
    id INT,
    channelname VARCHAR,
    playlist VARCHAR,
    about VARCHAR CONSTRAINT charCount CHECK(length(about) <= 170),
--    about VARCHAR,
    PRIMARY KEY (id)
)