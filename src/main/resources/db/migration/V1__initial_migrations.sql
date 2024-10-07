

CREATE TABLE if not exists
    public.event_publication (
                                 completion_date timestamp(6)
                                                     with
                                                         time zone NULL,
                                 publication_date timestamp(6)
                                                     with
                                                         time zone NULL,
                                 id uuid NOT NULL,
                                 event_type character varying(2550) NULL,
                                 listener_id character varying(2550) NULL,
                                 serialized_event character varying(2550) NULL
);

ALTER TABLE
    public.event_publication
    ADD
        CONSTRAINT event_publication_pkey PRIMARY KEY (id);


create table if not exists users(
    id serial primary key ,
    username varchar(255),
    password varchar(255),
    is_admin boolean);
