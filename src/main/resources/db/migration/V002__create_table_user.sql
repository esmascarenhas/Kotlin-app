create table users(
    id bigint not null GENERATED ALWAYS AS IDENTITY,
    name varchar(50) not null,
    email varchar(50) not null,
    primary key(id)
);

