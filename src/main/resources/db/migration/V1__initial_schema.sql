

create table clients
(
    id  BIGSERIAL PRIMARY KEY,
    name varchar(50),
     address_id bigserial not null
  );

create table phones
(
    id BIGSERIAL PRIMARY KEY,
    number varchar(255),
    clients_key BIGSERIAL,
    client_id BIGSERIAL

);

create table addresses
(
    id   BIGSERIAL PRIMARY KEY,
    street varchar(255),
    client BIGSERIAL

);



