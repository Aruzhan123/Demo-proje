CREATE TABLE public."Person"
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    firstname character varying COLLATE pg_catalog."default" NOT NULL,
    lastname character varying COLLATE pg_catalog."default" NOT NULL,
    city character varying COLLATE pg_catalog."default" NOT NULL,
    phone character varying COLLATE pg_catalog."default" NOT NULL,
    telegram character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Person_pkey" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public."Person"
    OWNER to postgres;
