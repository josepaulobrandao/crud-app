CREATE TABLE IF NOT EXISTS public.person (
  id serial not null,
  first_name varchar(80) NOT NULL,
  last_name varchar(80) NOT NULL,
  address varchar(100) NOT NULL,
  gender varchar(6) NOT NULL,
  PRIMARY KEY (id)
);