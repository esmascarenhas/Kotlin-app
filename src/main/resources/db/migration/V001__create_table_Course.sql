create table course(
    id bigint not null GENERATED ALWAYS AS IDENTITY,
    name varchar(50) not null,
    category varchar(50) not null,
    primary key(id)
);

