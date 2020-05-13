create database thuvien;
use thuvien;

create table image_book(
	id int primary key auto_increment,
    url text
);
create table image_student(
	id int primary key AUTO_INCREMENT,
    url text
);
create table BorrowOrder(
	id int primary key AUTO_INCREMENT,
    student_name varchar(50),
    birthday DATE,
    address varchar(500),
    email varchar(50),
    number_phone varchar(10),
    id_image int,
   foreign key (id_image) references image_student(id)
);
create table category(
	id int primary key AUTO_INCREMENT,
    book_category varchar(50)
);
create table book(
	book_number int PRIMARY key AUTO_INCREMENT,
    book_name varchar(50),
    publishing varchar(50),
    author varchar(50),
    publishing_year DATE,
    number_of_editions int,
    price double,
    id_category int,
    id_image int,
    foreign key(id_category) references category(id),
    foreign key (id_image) references image_book(id)
);

create table status_b(
	id varchar(10) primary key,
    status_name varchar(30)
);

create table order_book(
	order_id int,
    book_id int,
    status_id varchar(10),
    borrow_date date,
    pay_day date,

    foreign key (order_id) references BorrowOrder(id),
    foreign key(book_id) references book(book_number),
    foreign key(status_id) references status_b(id)
);

insert into image_book (id, url) values (1, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJvSURBVDjLpZM5aFRRGIW/+2bmZYzJTEzMuCbRGIjRiAsYEIKNIoIiWGgluCCChZ3aCyJqK6hFxMLCpbKxERE3DIpFEgtjonGJYSYzMcYsb7nvvvtbTMC9yil/OB8/nHOUiDAXOcxRcwYkAQbube5JZ9asUepXnhBOvR+OzcQWIPzNpQCYad392iQBlDirGzqvp5RSIGUzSmGCsebRnjPDMnsFSLgZkTgqTucfngLuJAEwEmB1RVi4QqwT4GRQqpr00m0s7bjgIgJYvPwjvjy5SaJqXaM/tvB23+X2dBkQKUesJtYuYgXrfyaaGWW6+IhUeglIhJkZxPjLWbzuANmVG5n40Er//a6LZYCStDU+2gPRM0RTk1SvPki6rg1Q+IX7SFKRWb6R8fdvcJWmOrOYqrrG7OwHDsl5OWrajgIWRBAsVo/gDXdhojTZ5p2E+Vu4lYpPPf2Y0Bff89fPAkQkDrBeHxJ/R+IpxEzgjfUiUkW2ZRfByFUc15CqamK+/YhHKWo/0T1Qzi1ExBpsVMLqElaPUhh4RuBXkm3ZQzByBScVoSdXUHrSTW3nIRwT259F0iKKGDHjiPlK8d1LPL+O3Npd6EIXCVcIJ5soPe2mZm2eivoGML8USbT9ZryvldG0Wz3UN+gkKpZhVI7860ssyLkE4w18e/GK2g2rSKRbiYNARNvwJyAILw5d3duBsL3fydXvO36Nt7dOMvD0ORWN67GlflmYMrr4uCAIoJ5prNwoB/jHGs8ea49OHzmexInpeXCXTx8Gp7P1tZ07zvX2/msLfwH2b631NzUvSna0rURS4XO/WDq8+3zf0P/G9AOyUDsBCTaamwAAAABJRU5ErkJggg==');
insert into image_book (id, url) values (2, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAMvSURBVDjLXZNtSFNRGMcvgQQRfYsoCD/0waI3ikqzIoTojV6IgiwrtBejzGRlVGi1QaHZamZpaaalNnPWyjmNlrZ11dnyZc6luWauXNmWm267zvT68u+cSy3rwO/e5z7n+f/Puc+9hwHADFQwkwhigonwjjCZ5idCcjN+zxsIIX/yTL+SCSKkDTREfeVdWngb9jkNqq21iVW8juD+je6tagfrMx5zDbYnu0m9gTBbMHAWM0lew/5vw44K9NbH9DcqwrnUWhduNzhxv+W7AI1vsF1oUSz1e8wSP9dy+gfRNRGCGPsD5oLPlOx21MT064vCRzLqu1Fi6oGc/YwsZRsyStvwoLoLcuNX5L3R4oNqw9igvXTU8XyehWhDmE/ZzJqOnCmWutxF/jRtF4oN3VBqbei0e+Hycuj1DsDS7UWhphN5NTaUlElhkocNtedMaybaEKERiffLr519akZOrQ0KshodfR4PPn77jp8kpnDjwF11J7J0VlxUsDier78i9IBeorKbdGeemHH3hQXtZGX/yDg4vx+ZeflwEiPf0BCevnwN9qMHKYpW0FqqCRjsSmfdInkzrj4ywTnIo29oDMNk4rxYgiJlGc5ekkCjN8Ds4XEqywBaSzUBg20pL9yxuQaI843o5nhiMga7x4fL0uuCmDW2oncEaHTxiE+vB62lmoDBxotPdJEyLSSFTXhj9aCHvLTdx6NSV4cutxeOUaBEr4ToTjRib2zHnivrsSkp1hYwiDjzULxZ/BwJ9/RIVVjQSxrWxwO+MQKJS+seQ1IaA/X7TLT0aCB7dRy7ZQsRGjdTKhisis9aRmhbf6EcomwWVxUdMNr6wZF+cH4eMWmbUGZOR1l7hvCFpFVHIKs6Sg1+Bv71FUekR4+lFvrXnXuGA9JXEN1ikXizFiJZDbYkLUHl+1xMHKrWTGrw97Do9foIs9mMai07uiouF8tPyBGaoBRYeSIY1zQHkaKJFsQpL6P/3YFarZ5O4KxWK1Tl5e7Fe5MlCyKTdAQ3ZemhiC87pXNxXXNYWJne6XOgBwUFBVMJHYRhwvz/jzKFFKeGxc0aoNtefTJ4fG3CnFs0/wsC49wP713enQAAAABJRU5ErkJggg==');
insert into image_book (id, url) values (3, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJnSURBVDjLpZLvSxNxHMf9C3rqw6QHcVaIKHVEKQQuVtuaOrelbldTj5mrliQjYUtreqUrbYaObf6k9oOmTAIz8TbS6c7FdqPChBCLIq64hz0+Pn2/MaI6C6EHLziO7+f1eX8+328RABT9Dz8/+LCJ5CNUnI9YxHy0TeLDLVJ2xixujBvj6TEd+U8BHzHT+ahF4MMUn51pcmYmjMRG0EBsBPROLmDkOZ9RWPXW0rsKcGdcnHvczOQ/fitFNCDsiMsIDeJAylvLpLw6ITmgliUpyoWpeC5E8egggbiE6EY4EF2ITkQzomRlSMsnBtTxXRJcFLPTjU50qB5xo1B8vVCMU3QgahKMypkc0IgyQT7SImXGjbi77ZeuP0awPjOBZd4Ipmg9LN9SEslBrSQfIWSROL8eC6yFwqsFWfuFOQOENydAN6mC5zcVRIJRywWZqWaR8zXgEZSFwo7Wp41AxRrAsXgFJl+Ngm22FWo8VVDtxjv8Q5D2G9A96/ESSxAGBI0jT732QSA/Asy6Cx68vAuetBuOdpfLBamROnJtVC+sDGvxNe5HnMKRNWMKoCMUeLh+aArqoNJRBmX2Upi3n2yUPaQX987Rq8O1QnJQw7N9Z5xLPaeJRZeCwJFvr7qgousIfMr6YWftPrBuLcy2Hy+WPWW2/yyJiLOMWsTLYvtUEo5c3nkYDtkOwpfNR/B1KwTvlnsh1lYlRVuOFf8m+Bvz16rNK0Pn4f36MAhvpuED9xAyQQvcURLbexJg5jpOmNm+OthacMHbhR5IeQ0Qs5I7exZgntBkU8hU+XmpV4lGILdDVMU+/P87L+2y1u3sopMAAAAASUVORK5CYII=');
insert into image_book (id, url) values (4, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAHvSURBVDjLjZPfSxRRFMf3T9g/wRdRkfKmRbkq3gfpYSvUHiIVZHqRiH7MbogW2GD1KOxrIVuUoOiKI+2isMleJXPZ3Np2NegstHNpGJg7K8yfcLquUII7sz183+7ne875nnMDiBjwEmz0ECkKqRCFZHew3pv64GbvkJkbN+zSExTFp1LTaBciWE72xUC/HPQ1kBUVcTiDzo9ZCUWRbw8y8/OIIb5Po1Oawd/bwwVPAwk32cUpdA6e4a/0wFv4cOVvNVi7NGRl77iQ6NK8DZIh1TnQ0MyOGnVHW+kkdTOAVE+wkgnrVn7CPfo5h8ct88wNxreuM/7xmlSYVTYGdM8Qy5t9Mbs4idXDF1IvURQmUXx7LBVFkY+g2FcRlojmuwWZLrGPAQlD4iKVs1JY7qSwdEGKUK9VB06FROyvkVpVOauET0BY7CB+t3IKVrFa0rBa1Goti/2HKHIPEBbOq40NEl0KT4eZtTvmHpWeo/VpxOWpq6yy3q/7wWfXuNihiC9RtHZuu/D+3JnWYb5VhfkW4nuJ5tawUc1PoZW55ZYXSAzetFGItyl8jTJn7x7aO+MIr5ubvE/5XTsx04OGyN5HJydD3Z1AsXcXnewjtNI3XQkrDT9TzSjeqlSWQzpfpYyv9rNyvD0Gr/5Vbmjwv/oDiJrRGbut70sAAAAASUVORK5CYII=');
insert into image_book (id, url) values (5, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAGvSURBVDjLxZPbSgJRGIV9BB+h+yikuomIJigo6UBnKtJOUFSkSBIhMUZmBywUNDtQG6KMCrITXVnzCANSYUNNOoMzzEjuR/jbXWjQjN0UdLFuNnt9e/9r8RsAwPAbGf4c0BsSi8b2JOS5UN9cpwo7d6Kw82fqW19IRK0rqaIfAb1B0eS7zeC1mwzu9AtU7pwYKfe5iukzBZsXeJMuoCcoGH3EGI5loXPjy5yTeZGnCBhmj2Vc53oxagBdfsG+y2BwRhS20LzD2yK7eq0C5eTsGsD0gczs3GeBfJcuBKid5WjvpQrta0lGA5hAEhO+y0KThy8IqHZw9GJUJY/oALr8KRSOvUN3QIgWApjdr1FPVPkcAWkAjW6eWr7KwExExj9kgB2HEpSNPlK6NTYv8WjpQoGaGW7wu7li7GnQeSRDtf0Z6dbYHUgxxGhqcPNofD+NK6cS+arKR5+M/SEBV9kSqNT6YKp3cdoMnBEZquzPdOV0gupYT7JtvmS+zhYvz5Jw2RJLnCoeiNPWTRE0AMeRBLYDCaZQGiaJxvfS+Usj2yIMEVm3RLAQ84Ae4N+28QM8btMbbDzl6wAAAABJRU5ErkJggg==');

insert into image_student (id, url) values (1, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJPSURBVDjLpZPLS5RhFMYfv9QJlelTQZwRb2OKlKuINuHGLlBEBEOLxAu46oL0F0QQFdWizUCrWnjBaDHgThCMoiKkhUONTqmjmDp2GZ0UnWbmfc/ztrC+GbM2dXbv4ZzfeQ7vefKMMfifyP89IbevNNCYdkN2kawkCZKfSPZTOGTf6Y/m1uflKlC3LvsNTWArr9BT2LAf+W73dn5jHclIBFZyfYWU3or7T4K7AJmbl/yG7EtX1BQXNTVCYgtgbAEAYHlqYHlrsTEVQWr63RZFuqsfDAcdQPrGRR/JF5nKGm9xUxMyr0YBAEXXHgIANq/3ADQobD2J9fAkNiMTMSFb9z8ambMAQER3JC1XttkYGGZXoyZEGyTHRuBuPgBTUu7VSnUAgAUAWutOV2MjZGkehgYUA6O5A0AlkAyRnotiX3MLlFKduYCqAtuGXpyH0XQmOj+TIURt51OzURTYZdBKV2UBSsOIcRp/TVTT4ewK6idECAihtUKOArWcjq/B8tQ6UkUR31+OYXP4sTOdisivrkMyHodWejlXwcC38Fvs8dY5xaIId89VlJy7ACpCNCFCuOp8+BJ6A631gANQSg1mVmOxxGQYRW2nHMha4B5WA3chsv22T5/B13AIicWZmNZ6cMchTXUe81Okzz54pLi0uQWp+TmkZqMwxsBV74Or3od4OISPr0e3SHa3PX0f3HXKofNH/UIG9pZ5PeUth+CyS2EMkEqs4fPEOBJLsyske48/+xD8oxcAYPzs4QaS7RR2kbLTTOTQieczfzfTv8QPldGvTGoF6/8AAAAASUVORK5CYII=');
insert into image_student (id, url) values (2, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAQAAAC1+jfqAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAChSURBVCjPY/zPgB8wMVCqgAVEFP7/w/CH4TcY/gLh59ul9oLtdmZk+I8D7vn/4f+e//8hJqT/h+kGwqu/GA7oQIz/D7NiJiM22/8j3BD9/xdMPwQ+vyL1n+EfEEIVLGXEph9Jge9/JN1XfzPcAbrhH8NfhILNWEz4h2yCPZIJYP88fyf1D9mRB7G6AUmBAdQXYN1X/zB8AYfDebACRopjEwDsBmruXDxiUwAAAABJRU5ErkJggg==');
insert into image_student (id, url) values (3, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJISURBVDjLpZLLS5RxFIaf7/NCZqiZYYW1sEbTKWsTDUS0sFpF/0K7aBftulCbTIQWQi1r0aK/IKhFIBUodlNKKtBIy2qsKUPLacbvdy4tRmuhSdDZHDhw3nOelzdyd/6nypcbXnx25oWZplXNVfXOpUzvkb8JxEuXT9djpFvXtJKqSUWimlnpgyUC53f3fEskyQcP5JM8IjKykkDk7nQ9P+tmiqqhpe5ta7dHYsLzqZFZEVVVjUWE60dvrl3igZrSUp3C3DB3HIvUDHdoX99eq664G4/Hh5Y3UVVRN8yN7NwkM8UZxAVzJ47KMHO21qYQkeURzj085apKTUUtjdWNvJoeQV1LOF7Cqsy9ZT4pMB1vQkQRUW4fvxvFAJcyvVHPvitRbi6HmhIsEFQQE4IJwYVCmKepoY2Kwhsy6T2IytIciCjqiqhS+fktZglugoqwsb6Ftg17+VHMc2/wGlq27Y/Ayb7jLqLUrapDzQgeiC3hUPrYbwTDyc6+Z2fTPuaSAkOTD+joimvLFy+nG9tQnInv47TXd/Dywyjqxrvp1wQTxAJBA9/nf7B7837mwk8eTfRPlwMEEQTlWW6YHQ27GP80QVGKiAqNNVuQBTOnZiepX7OB4fcDDLzp/5IIh0sfBEHNSK/rQNTIfp3Cpeg3Bi+TWBIVJWFrQ5pM82GevOunb+zup0TozHb7qwUE4cnYU0QVEUFEi7dOjFcBHLx6QCtQhj88jKO4ivtjfR8TozPb7aO/c/Av1XwhyquVrS6YNue6fWJx/gvSRpXk80tR+AAAAABJRU5ErkJggg==');
insert into image_student (id, url) values (4, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAIHSURBVDjLpVNNaxNRFH0fgzNxRlNIm6QVsSRQ1IUiVCSCS8FF4kokO/9BF7oUstBll4IuunBpl61RNy4suhgF21WhJVU0WiHUksmQr2bex/TeMJEoxog+uMzjzT3nnXPmDg3DkPzPMsY1PHrpdaWUZFBCDJ6C3L91NjaWAAH5SwkLhaJaTfBJyOOnmwf4no0lkIJUqg2hAKUAqKMKQMFfEdy5PhN7X/Ge1L22QqACCUFPhCIIvv6UwdJaiyopi1KqAnjMRZ5dUDBzbta5fDxuc99vafuYw9SQgj7B0qsmBeDdTJKXUhMWi5mcaRKSVrt30uCcHrFMtrv7Xb5wq8+uzp/Ip1MJLoYJ4KZiZsoozU5bBqWM9r8slO0c5bjvdrr6uVt9B6CF1dcfrgm5JVHhDwJIuoA3QyS0tteUGzueEtBwIRvnyXTC6HR76PnLw9tX0HdsOCMWJZ0zLZANt63v1NV+ozO377Xn3M2a0hCabdsMPOdGDhL60dFASthjQHgmOOufK/Az8PzrYhGB22wdaGw+n5ngjkkrjsUqF88kOZ75dV9jz2gFgSh/+ubfOJ012VR60sinJg0UhGApgnDrYw0IZHkkAUheXt/ey/aCoHRqOs4cx+7n4TcaehvAbzY+34PUl39HQAd/48KDtxT8FyH9ghQyhyOMgwRVRvDK4s3wjwT/ug4BPyZOkZTlSM0AAAAASUVORK5CYII=');
insert into image_student (id, url) values (5, 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABGdBTUEAAK/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJLSURBVDjLpZNNiI1hFMd/773vjJlxR2iMKUyZSfItHxlJaQyxYCcbJYqlpR1R2Ck7ZTdWytfCQsnHpJCGkWTKR2QmZMS4d+573/s8z3nOsZhRFhZq/ptTp/P/9f8vTmJmTEcFpqlpA9LT177/s4OoEoLiRAgBcjFyJ7gg5N7IgpLnQgqwaUnzX1ZD1Ihxcko0ghhBlRCMIEqIihfl0v1vkwCASk2IypRJ8XHqWAwvipOID4YTxQdlbiklr04l2LWmxJ2XE2xfVaJci1x5PM6+njk0NybYZChefqoxMFzm0Lb5OFH6B8bQPFBwItScMqdURBVmNBTIfaS5MeH8ra8kwKmro1x/sYeRyl7aZxuL25vIg6KZUMic8OR9xsbuFm4OjtPUkHC0bx5pMaHqIgZkLlIXz8K2ZRzpX8fPLMOFiGWRtJobvctbefC6wo7Vs6g55eyNz9STAyiB41cjvhhY0LqEZR2bmKhnHL68lPb0Nuo8aTn3hGg8HK6wvmsmZlB1Ao2eHSsOEk2JGlGML+VRVi3cQtXnDI1uJtHLpL9qgYt3vlF1kRNXRnCiuGAUC55oyqcf7wgqiAZCDFTcBGsXbaUaaoz37SetTAi5j7Q2FfENCU0hIcwwxnwdicL8WZ2IRqIpX8sjzC11MDT6iKcfhhl/eIGk+9hzq+eCBUOdYl6woGzZfZi693j11MXT3bacnq6dPBt5zN1Xg2RPz2LVTpL//caVZwrZhs7eloG39z57ZfuXc/YG+H9A18kki1psyTV2jZ2zj3/2vwEmE35dgxn8EgAAAABJRU5ErkJggg==');

insert into BorrowOrder (id, student_name, birthday, address, email, number_phone,id_image) values (1, 'Bamity', '1997/09/17', '295 Memorial Terrace', 'mlingley0@blogger.com', '6559527503',1);
insert into BorrowOrder (id, student_name, birthday, address, email, number_phone,id_image) values (2, 'Latlux', '1994/05/14', '9 Golf View Center', 'dswanger1@hexun.com', '2827334059',2);
insert into BorrowOrder (id, student_name, birthday, address, email, number_phone,id_image) values (3, 'Rank', '2001/11/06', '886 Vidon Circle', 'bkilmurry2@themeforest.net', '9312938815',3);
insert into BorrowOrder (id, student_name, birthday, address, email, number_phone,id_image) values (4, 'Tampflex', '1995/06/22', '86 Calypso Alley', 'tmoxon3@opensource.org', '4556567177',4);
insert into BorrowOrder (id, student_name, birthday, address, email, number_phone,id_image) values (5, 'Alpha', '1991/09/05', '6 Basil Center', 'rrutgers4@domainmarket.com', '4569706050',5);

insert into category (id, book_category) values (1, 'comic');
insert into category (id, book_category) values (2, 'fantasy');
insert into category (id, book_category) values (3, 'lập trình');
insert into category (id, book_category) values (4, 'comedy');
insert into category (id, book_category) values (5, 'manga');

insert into book (book_number, book_name, publishing, author, publishing_year, number_of_editions, price, id_category, id_image) values (1, 'Bennie', 'Sitch', 'Overhold', '1944/09/05', 1, 87, 1, 1);
insert into book (book_number, book_name, publishing, author, publishing_year, number_of_editions, price, id_category, id_image) values (2, 'Marris', 'MacGuigan', 'Sub-Ex', '1907/12/11', 2, 82, 2, 2);
insert into book (book_number, book_name, publishing, author, publishing_year, number_of_editions, price, id_category, id_image) values (3, 'Homerus', 'North', 'Fixflex', '1908/08/03', 3, 81, 3, 3);
insert into book (book_number, book_name, publishing, author, publishing_year, number_of_editions, price, id_category, id_image) values (4, 'Marjory', 'Pesselt', 'Voyatouch', '1948/12/18', 4, 95, 4, 4);
insert into book (book_number, book_name, publishing, author, publishing_year, number_of_editions, price, id_category, id_image) values (5, 'Susanne', 'Sharpus', 'Redhold', '1917/11/05', 5, 89, 5, 5);

insert into status_b(id,status_name) values('ok','đã trả');
insert into status_b(id,status_name) values('t1','trễ 1 tháng');
insert into status_b(id,status_name) values('t2','trễ 2 tháng');
insert into status_b(id,status_name) values('t3','trễ 3 tháng');
insert into status_b(id,status_name) values('t4','trễ  tháng');

insert into order_book(order_id,book_id,status_id,borrow_date,pay_day)values(1,1,'ok','2020/05/10','2020/05/14');
insert into order_book(order_id,book_id,status_id,borrow_date)values(2,5,'t1','2020/04/15');
insert into order_book(order_id,book_id,status_id,borrow_date)values(3,3,'t2','2020/03/14');
insert into order_book(order_id,book_id,status_id,borrow_date)values(4,3,'t3','2020/02/20');
insert into order_book(order_id,book_id,status_id,borrow_date)values(5,3,'t4','2020/01/10');

select*
from book;

select*
from book
where id_category=3;

SELECT book_id,book_name
from order_book
join book on book.book_number=order_book.book_id;

SELECT book_id,book_name,status_id
from order_book
join book on book.book_number=order_book.book_id
where  status_id not in ('ok');