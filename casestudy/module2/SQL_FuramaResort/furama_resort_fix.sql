CREATE database furama_resort;
use furama_resort;

create table LoaiDichVu(
	id_loai_dich_vu int PRIMARY key AUTO_INCREMENT,
    ten_loai_dich_vu varchar(45)
);

CREATE table KieuThue(
	id_kieu_thue int primary key AUTO_INCREMENT,
    ten_kieu_thue varchar(45),
    gia FLOAT
);

create table DichVu(
	id_dich_vu int primary key AUTO_INCREMENT,
    ten_dich_vu varchar(45),
    dien_tich FLOAT,
    so_tang int,
    so_nguoi_toi_da VARCHAR(45),
    chi_phi_thue float,	
    id_kieu_thue int,
    id_loai_dich_vu int,
    trang_thai varchar(45),
    FOREIGN KEY (id_kieu_thue) references KieuThue(id_kieu_thue),
    FOREIGN KEY (id_loai_dich_vu) references LoaiDichVu(id_loai_dich_vu)
);

CREATE table LoaiKhach(
	id_loai_khach int primary key AUTO_INCREMENT,
    ten_loai_khach varchar(45)
);

Create table KhachHang(
	id_khach_hang VARCHAR(15) primary key ,
    id_loai_khach int,
    ho_ten varchar(45),
    ngay_sinh date,
    socmnd varchar(45),
    sdt VARCHAR(45),
    email varchar(45),
    dia_chi varchar(45),
    foreign key (id_loai_khach) references LoaiKhach(id_loai_khach) ,check (email like '%_@__%.__%')
);

CREATE table DichVuDiKem(
	id_dich_vu_di_kem int primary key AUTO_INCREMENT,
    ten_dich_vu_di_kem varchar(45),
    gia FLOAT,
    don_vi int,
    trang_thai_kha_dung varchar(45)
);

Create table ViTri(
	id_vi_tri int primary key AUTO_INCREMENT,
    ten_vi_tri varchar(45)
);

create table trinh_do(
	id_trinh_do int primary key AUTO_INCREMENT,
    trinh_do varchar(45)
);

CREATE table BoPhan(
	id_bo_phan int primary key AUTO_INCREMENT,
    ten_bo_phan varchar(45)
);

Create table NhanVien(
	id_nhan_vien int primary key AUTO_INCREMENT,
    ho_ten VARCHAR(45),
    id_vi_tri int,
    id_trinh_do int,
    id_bo_phan int,
	ngay_sinh date,
    socmnd varchar(45),
    luong VARCHAR(45),
    sdt VARCHAR(45),
    email varchar(45),
    dia_chi varchar(45),
    FOREIGN KEY (id_vi_tri) REFERENCES ViTri(id_vi_tri),
    FOREIGN KEY (id_trinh_do) REFERENCES trinh_do(id_trinh_do),
    FOREIGN KEY (id_bo_phan) REFERENCES BoPhan(id_bo_phan)
);

CREATE table HopDong(
	id_hop_dong int primary key AUTO_INCREMENT,
    id_nhan_vien int,
    id_khach_hang VARCHAR(15),
    id_dich_vu int,
    ngay_lam_hop_dong date,
    ngay_ket_thuc date,
    tien_dat_coc FLOAT,
    tong_tien Float,
    FOREIGN KEY (id_nhan_vien) REFERENCES NhanVien(id_nhan_vien) ON DELETE CASCADE,
    FOREIGN KEY (id_khach_hang) REFERENCES KhachHang(id_khach_hang),
    FOREIGN KEY (id_dich_vu) REFERENCES DichVu(id_dich_vu)
);

Create TABLE HopDongChiTiet(
	id_hop_dong_chi_tiet int PRIMARY key AUTO_INCREMENT,
    id_hop_dong int,
    id_dich_vu_di_kem int,
    so_luong int,
	FOREIGN KEY (id_hop_dong) REFERENCES HopDong(id_hop_dong) ON DELETE CASCADE,
    FOREIGN KEY (id_dich_vu_di_kem) REFERENCES DichVuDiKem(id_dich_vu_di_kem)
);


INSERT INTO `furama_resort`.`bophan` (`ten_bo_phan`) VALUES ('Bộ phận 1');
INSERT INTO `furama_resort`.`bophan` (`ten_bo_phan`) VALUES ('Bộ Phận 2');
INSERT INTO `furama_resort`.`bophan` (`ten_bo_phan`) VALUES ('Bộ Phận 3');

INSERT INTO `furama_resort`.`trinh_do` (`trinh_do`) VALUES ('Phổ Thông');
INSERT INTO `furama_resort`.`trinh_do` (`trinh_do`) VALUES ('Cao Đẳng');
INSERT INTO `furama_resort`.`trinh_do` (`trinh_do`) VALUES ('Đại Học');

INSERT INTO `furama_resort`.`vitri` (`ten_vi_tri`) VALUES ('Tiếp Tân');
INSERT INTO `furama_resort`.`vitri` (`ten_vi_tri`) VALUES ('Dọn Phòng');
INSERT INTO `furama_resort`.`vitri` (`ten_vi_tri`) VALUES ('Bảo Vệ');
INSERT INTO `furama_resort`.`vitri` (`ten_vi_tri`) VALUES ('Đầu Bếp');

INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Hoàng', '1', '2', '1', '1990/11/11', '123456789', '1000000', '012345678', 'hoang@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Tiến ', '2', '3', '1', '1992/12/12', '456789654', '1200000', '4561230123', 'tien@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Liêm', '3', '3', '3', '1995/11/8', '123456789', '1000000', '9968886788', 'liem@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Kiên ', '3', '3', '1', '1992/12/5', '456789654', '1200000', '333635686', 'kien@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Doanh', '2', '1', '2', '1996/11/4', '123456789', '1000000', '543234234', 'doanh@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Trang', '1', '2', '1', '1998-11-04', '456755654', '1000000', '6962286788', 'trang@gmail.com', 'Huế');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Oanh', '1', '1', '3', '2000-11-04', '456754454', '1000000', '696228677', 'oanh@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`nhanvien` (`ho_ten`, `id_vi_tri`, `id_trinh_do`, `id_bo_phan`, `ngay_sinh`, `socmnd`, `luong`, `sdt`, `email`, `dia_chi`) VALUES ('Thắng', '2', '2', '1', '2000-10-14', '43734454', '1000000', '696228877', 'thang@gmail.com', 'Đà Nẵng');

INSERT INTO `furama_resort`.`loaikhach` (`ten_loai_khach`) VALUES ('Normal');
INSERT INTO `furama_resort`.`loaikhach` (`ten_loai_khach`) VALUES ('Silver');
INSERT INTO `furama_resort`.`loaikhach` (`ten_loai_khach`) VALUES ('Gold');
INSERT INTO `furama_resort`.`loaikhach` (`ten_loai_khach`) VALUES ('Platinium');
INSERT INTO `furama_resort`.`loaikhach` (`ten_loai_khach`) VALUES ('Diamond');

INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0001','5', 'Lê Vân A', '1990/12/6', '12341231', '0123456783', 'A@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0002','1', 'Trân Hoàng B', '2010/5/4', '12356231', '0123455583', 'B@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0003','5', 'Nguyễn Anh C', '1998/3/5', '12121231', '0123466782', 'C@gmail.com', 'Quảng Ngãi');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0004','2', 'Lê Thái D', '2006/4/4', '12365431', '0123759781', 'D@gmail.com', 'Vinh');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0005','3', 'Anh Hoàng E', '2004/6/6', '12399231', '0123488784', 'E@gmail.com', 'Quảng Trị');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0006','4', 'Trân Hoàng B', '2004-05-04', '12325431', '4443466783', 'BB@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0007','5', 'Thái Lê F', '1997-05-14', '14425431', '4244766782', 'F@gmail.com', 'Vinh');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0008','4', 'VĂn H', '1999-05-14', '14335431', '4244788781', 'H@gmail.com', 'Quảng Ngãi');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0009','1', 'Thái K', '1997-12-14', '14444431', '4244712381', 'K@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0010','1', 'Anh J', '1997-12-14', '1444442', '4244712383', 'J@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`khachhang` (`id_khach_hang`,`id_loai_khach`, `ho_ten`, `ngay_sinh`, `socmnd`, `sdt`, `email`, `dia_chi`) VALUES ('KH-0011','2', 'Đậu P', '1997-12-14', '14445551', '4244712380', 'P@gmail.com', 'Đà Nẵng');


INSERT INTO `furama_resort`.`loaidichvu` (`ten_loai_dich_vu`) VALUES ('massage');
INSERT INTO `furama_resort`.`loaidichvu` (`ten_loai_dich_vu`) VALUES ('karaoke');
INSERT INTO `furama_resort`.`loaidichvu` (`ten_loai_dich_vu`) VALUES ('sightseeing car');

INSERT INTO `furama_resort`.`kieuthue` (`ten_kieu_thue`, `gia`) VALUES ('Villa', '500');
INSERT INTO `furama_resort`.`kieuthue` (`ten_kieu_thue`, `gia`) VALUES ('House', '300');
INSERT INTO `furama_resort`.`kieuthue` (`ten_kieu_thue`, `gia`) VALUES ('Room', '100');

INSERT INTO `furama_resort`.`dichvu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `id_kieu_thue`) VALUES ('A', '100', '3', '12', '12000000', '1');
INSERT INTO `furama_resort`.`dichvu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `id_kieu_thue`) VALUES ('B', '80', '2', '7', '8000000', '2');
INSERT INTO `furama_resort`.`dichvu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `id_kieu_thue`, `id_loai_dich_vu`) VALUES ('C', '50', '2', '7', '7000000', '3', '1');
INSERT INTO `furama_resort`.`dichvu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `id_kieu_thue`) VALUES ('D', '100', '3', '12', '12000000', '1');
INSERT INTO `furama_resort`.`dichvu` (`ten_dich_vu`, `dien_tich`, `so_tang`, `so_nguoi_toi_da`, `chi_phi_thue`, `id_kieu_thue`, `id_loai_dich_vu`) VALUES ('E', '50', '1', '4', '4000000', '3', '2');

INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('2', 'KH-0001', '1', '2019/7/10', '2020/8/10');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('5', 'KH-0003', '3', '2019/4/12', '2019/5/15');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('3', 'KH-0002', '2', '2018/2/15', '2019/4/18');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('5', 'KH-0004', '4', '2019/3/22', '2020/5/5');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('1', 'KH-0005', '4', '2019/2/10', '2020/4/10');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('3', 'KH-0002', '3', '2019/03/13', '2020/05/05');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('1', 'KH-0006', '1', '2019-03-13', '2020-05-05');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('6', 'KH-0007', '2', '2020-02-10', '2020-04-10');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('2', 'KH-0003', '3', '2020-04-12', '2020-05-15');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('4', 'KH-0008', '2', '2015-04-12', '2015-06-12');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('5', 'KH-0001', '3', '2019-10-12', '2019-11-15');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('6', 'KH-0003', '1', '2019-12-25', '2020-1-15');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('6', 'KH-0009', '4', '2019-10-25', '2020-11-15');
INSERT INTO `furama_resort`.`hopdong` (`id_nhan_vien`, `id_khach_hang`, `id_dich_vu`, `ngay_lam_hop_dong`, `ngay_ket_thuc`) VALUES ('8', 'KH-0005', '4', '2014-10-25', '2015-11-15');

INSERT INTO `furama_resort`.`dichvudikem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`, `trang_thai_kha_dung`) VALUES ('massage', '500000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`, `trang_thai_kha_dung`) VALUES ('karaoke', '300000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`, `trang_thai_kha_dung`) VALUES ('sightseeing car', '800000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`ten_dich_vu_di_kem`, `gia`, `don_vi`, `trang_thai_kha_dung`) VALUES ('food', '100000', '1', 'ok');

INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('1', '4', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('2', '4', '3');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('3', '1', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('4', '2', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('5','1','2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('1', '3', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('3', '1', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('7', '2', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('8', '2', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('2', '3', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('10', '3', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('11', '4', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('3', '4', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`id_hop_dong`, `id_dich_vu_di_kem`, `so_luong`) VALUES ('5', '2', '1');

-- update tong tien
update HopDong
join DichVu on DichVu.id_dich_vu=HopDong.id_dich_vu
join HopDongChiTiet on HopDongChiTiet.id_hop_dong=HopDong.id_hop_dong
join DichVuDiKem on DichVuDiKem.id_dich_vu_di_kem=HopDongChiTiet.id_dich_vu_di_kem
set tong_tien=chi_phi_thue+don_vi*gia;

