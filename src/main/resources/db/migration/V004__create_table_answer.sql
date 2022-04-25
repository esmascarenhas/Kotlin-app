create table answer(
    id bigint not null GENERATED ALWAYS AS IDENTITY,
    message varchar(300) not null,
    createon_date timestamp not null,
    topic_id bigint not null,
    author_id bigint not null,
    solution int not null,
    primary key(id),
    foreign key(topic_id) references topic(id),
    foreign key(author_id) references users(id)
);