CREATE ROLE "horo-app" LOGIN
  ENCRYPTED PASSWORD 'md50a94b666cb5b8e5b32b38dbde0ea492a'
  NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;

ALTER TABLE CAMEL_MESSAGEPROCESSED OWNER TO "horo-app";
ALTER TABLE feeds OWNER TO "horo-app";
ALTER TABLE signs OWNER TO "horo-app";
ALTER TABLE horoscopes OWNER TO "horo-app";