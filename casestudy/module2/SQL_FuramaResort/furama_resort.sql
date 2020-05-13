CREATE database furama_resort;
use furama_resort;

create table LoaiDichVu(
	IdLoaiDichVu int PRIMARY key AUTO_INCREMENT,
    TenLoaiDichVu varchar(45)
);

CREATE table KieuThue(
	IdKieuThue int primary key AUTO_INCREMENT,
    TenKieuThue varchar(45),
    Gia int
);

create table DichVu(
	IdDichVu int primary key AUTO_INCREMENT,
    TenDichVu varchar(45),
    DienTich DOUBLE,
    SoTang int,
    SoNguoiToiDa VARCHAR(45),
    ChiPhiThue varchar(45),
    IdKieuThue int,
    IdLoaiDichVu int,
    TrangThai varchar(45),
    FOREIGN KEY (IdKieuThue) references KieuThue(IdKieuThue),
    FOREIGN KEY (IdLoaiDichVu) references LoaiDichVu(IdLoaiDichVu)
);

CREATE table LoaiKhach(
	IdLoaiKhach int primary key AUTO_INCREMENT,
    TenLoaiKhach varchar(45)
);

Create table KhachHang(
	IdKhachHang int primary key AUTO_INCREMENT,
    IdLoaiKhach int,
    HoTen varchar(45),
    NgaySinh date,
    SoCMND varchar(45),
    SDT VARCHAR(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IdLoaiKhach) references LoaiKhach(IdKhachHang)
);

CREATE table DichVuDiKem(
	IdDichVuDiKem int primary key AUTO_INCREMENT,
    TenDichVuDIKem varchar(45),
    Gia double,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

Create table ViTri(
	IdViTri int primary key AUTO_INCREMENT,
    TenViTri varchar(45)
);

create table TrinhDo(
	IdTrinhDo int primary key AUTO_INCREMENT,
    TrinhDo varchar(45)
);

CREATE table BoPhan(
	IdBoPhan int primary key AUTO_INCREMENT,
    TenBoPhan varchar(45)
);

Create table NhanVien(
	IdNhanVien int primary key AUTO_INCREMENT,
    HoTen VARCHAR(45),
    IdViTri int,
    IdTrinhDo int,
    IdBoPhan int,
	NgaySinh date,
    SoCMND varchar(45),
    Luong VARCHAR(45),
    SDT VARCHAR(45),
    Email varchar(45),
    DiaChi varchar(45),
    FOREIGN KEY (IdViTri) REFERENCES ViTri(IdViTri),
    FOREIGN KEY (IdTrinhDo) REFERENCES TrinhDo(IdTrinhDo),
    FOREIGN KEY (IdBoPhan) REFERENCES BoPhan(IdBoPhan)
);

