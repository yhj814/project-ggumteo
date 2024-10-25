create table tbl_member(
                           id bigint unsigned auto_increment primary key,
                           member_name varchar(255) not null,
                           member_email varchar(255) not null,
                           profile_img_url varchar(255),
                           member_status varchar(255) default 0, -- 0 가입 상태, 1 탈퇴 상태
                           created_date datetime default current_timestamp,
                           updated_date datetime default current_timestamp
);

select * from tbl_member;
insert into tbl_member (member_name, member_email, profile_img_url)
values ('John Doe', 'john.doe@example.com', 'profile.jpg');

use gb;