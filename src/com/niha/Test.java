package com.niha;

public class Test {
    create database Address_Book_Service;
    use Address_Book_Service;
    show databases;

    create table address_book(first_name varchar(50),
    last_name varchar(50),
    address varchar(60),
    city varchar(20),
    state varchar(20),
    zip int,
    phone_number long,
    email varchar(50));


    insert into address_book values("Niha","Rika","Colony Address","Hyd","TS",78364,9494291232,"NihaMS@gmail.com");

    SET SQL_SAFE_UPDATES = 0;
    update address_book set city ="kukatpally" where first_name = "Niha";

    delete from address_book  where first_name = "Niha";

    select * from address_book;
}
