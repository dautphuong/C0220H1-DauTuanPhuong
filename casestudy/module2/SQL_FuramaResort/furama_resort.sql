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
    foreign key (IdLoaiKhach) references LoaiKhach(IdLoaiKhach)
);

CREATE table DichVuDiKem(
	IdDichVuDiKem int primary key AUTO_INCREMENT,
    TenDichVuDIKem varchar(45),
    Gia int,
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

CREATE table HopDong(
	IdHopDong int primary key AUTO_INCREMENT,
    IdNhanVien int,
    IdKhachHang int,
    IdDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    FOREIGN KEY (IdNhanVien) REFERENCES NhanVien(IdNhanVien),
    FOREIGN KEY (IdKhachHang) REFERENCES KhachHang(IdKhachHang),
    FOREIGN KEY (IdDichVu) REFERENCES DichVu(IdDichVu)
);

Create TABLE HopDongChiTiet(
	IdHopDongChiTiet int PRIMARY key AUTO_INCREMENT,
    IdHopDong int,
    IdDichVuDiKem int,
    SoLuong int,
	FOREIGN KEY (IdHopDong) REFERENCES HopDong(IdHopDong),
    FOREIGN KEY (IdDichVuDiKem) REFERENCES DichVuDiKem(IdDichVuDiKem)
);

INSERT INTO `furama_resort`.`bophan` (`TenBoPhan`) VALUES ('Bộ phận 1');
INSERT INTO `furama_resort`.`bophan` (`TenBoPhan`) VALUES ('Bộ Phận 2');
INSERT INTO `furama_resort`.`bophan` (`TenBoPhan`) VALUES ('Bộ Phận 3');

INSERT INTO `furama_resort`.`trinhdo` (`TrinhDo`) VALUES ('Phổ Thông');
INSERT INTO `furama_resort`.`trinhdo` (`TrinhDo`) VALUES ('Cao Đẳng');
INSERT INTO `furama_resort`.`trinhdo` (`TrinhDo`) VALUES ('Đại Học');

INSERT INTO `furama_resort`.`vitri` (`TenViTri`) VALUES ('Tiếp Tân');
INSERT INTO `furama_resort`.`vitri` (`TenViTri`) VALUES ('Dọn Phòng');
INSERT INTO `furama_resort`.`vitri` (`TenViTri`) VALUES ('Bảo Vệ');
INSERT INTO `furama_resort`.`vitri` (`TenViTri`) VALUES ('Đầu Bếp');

INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Hoàng', '1', '2', '1', '1990/11/11', '123456789', '1000000', '012345678', 'hoang@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Tiến ', '2', '3', '1', '1992/12/12', '456789654', '1200000', '4561230123', 'tien@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Liêm', '3', '3', '3', '1995/11/8', '123456789', '1000000', '9968886788', 'liem@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Kiên ', '3', '3', '1', '1992/12/5', '456789654', '1200000', '333635686', 'kien@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Doanh', '2', '1', '2', '1996/11/4', '123456789', '1000000', '543234234', 'doanh@gmail.com', 'Quảng Trị');

INSERT INTO `furama_resort`.`loaikhach` (`TenLoaiKhach`) VALUES ('Normal');
INSERT INTO `furama_resort`.`loaikhach` (`TenLoaiKhach`) VALUES ('Silver');
INSERT INTO `furama_resort`.`loaikhach` (`TenLoaiKhach`) VALUES ('Gold');
INSERT INTO `furama_resort`.`loaikhach` (`TenLoaiKhach`) VALUES ('Platinium');
INSERT INTO `furama_resort`.`loaikhach` (`TenLoaiKhach`) VALUES ('Diamond');

INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('5', 'Lê Vân A', '1990/12/6', '12341231', '012345678', 'A@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('1', 'Trân Hoàng B', '2010/5/4', '12356231', '012345558', 'B@gmail.com', 'Đà Nẵng');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('5', 'Nguyễn Anh C', '1998/3/5', '12121231', '012346678', 'C@gmail.com', 'Quảng Ngãi');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('2', 'Lê Thái D', '2006/4/4', '12365431', '012375978', 'D@gmail.com', 'Vinh');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('3', 'Anh Hoàng E', '2004/6/6', '12399231', '012348878', 'E@gmail.com', 'Quảng Trị');

INSERT INTO `furama_resort`.`loaidichvu` (`TenLoaiDichVu`) VALUES ('massage');
INSERT INTO `furama_resort`.`loaidichvu` (`TenLoaiDichVu`) VALUES ('karaoke');
INSERT INTO `furama_resort`.`loaidichvu` (`TenLoaiDichVu`) VALUES ('sightseeing car');

INSERT INTO `furama_resort`.`kieuthue` (`TenKieuThue`, `Gia`) VALUES ('Villa', '500');
INSERT INTO `furama_resort`.`kieuthue` (`TenKieuThue`, `Gia`) VALUES ('House', '300');
INSERT INTO `furama_resort`.`kieuthue` (`TenKieuThue`, `Gia`) VALUES ('Room', '100');

INSERT INTO `furama_resort`.`dichvu` (`TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IdKieuThue`) VALUES ('A', '100', '3', '12', '12000000', '1');
INSERT INTO `furama_resort`.`dichvu` (`TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IdKieuThue`) VALUES ('B', '80', '2', '7', '8000000', '2');
INSERT INTO `furama_resort`.`dichvu` (`TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IdKieuThue`, `IdLoaiDichVu`) VALUES ('C', '50', '2', '7', '7000000', '3', '1');
INSERT INTO `furama_resort`.`dichvu` (`TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IdKieuThue`) VALUES ('D', '100', '3', '12', '12000000', '1');
INSERT INTO `furama_resort`.`dichvu` (`TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IdKieuThue`, `IdLoaiDichVu`) VALUES ('E', '50', '1', '4', '4000000', '3', '2');




