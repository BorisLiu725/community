create table question(
  id int primary key AUTO_INCREMENT,
  title varchar (50),
  description text,
  gmt_create bigint,
  gmt_modified bigint,
  creator int,
  comment_count int default 0,
  view_count int  default 0,
  like_count int default 0,
  tag varchar (256)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;