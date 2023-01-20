\c postgres


CREATE TABLE IF NOT EXISTS public.tutorial
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    content oid,
    title character varying(255) COLLATE pg_catalog."default",
    tutorial_type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT tutorial_pkey PRIMARY KEY (id)
);

INSERT INTO tutorial (content, title, tutorial_type) VALUES ('16403', 'What is spring boot', 'Beginner');