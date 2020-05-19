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
    foreign key (IdLoaiKhach) references LoaiKhach(IdLoaiKhach) ,check (Email like '%_@__%.__%')
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
    FOREIGN KEY (IdNhanVien) REFERENCES NhanVien(IdNhanVien) ON DELETE CASCADE,
    FOREIGN KEY (IdKhachHang) REFERENCES KhachHang(IdKhachHang),
    FOREIGN KEY (IdDichVu) REFERENCES DichVu(IdDichVu)
);

Create TABLE HopDongChiTiet(
	IdHopDongChiTiet int PRIMARY key AUTO_INCREMENT,
    IdHopDong int,
    IdDichVuDiKem int,
    SoLuong int,
	FOREIGN KEY (IdHopDong) REFERENCES HopDong(IdHopDong) ON DELETE CASCADE,
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
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Trang', '1', '2', '1', '1998-11-04', '456755654', '1000000', '6962286788', 'trang@gmail.com', 'Huế');
INSERT INTO `furama_resort`.`nhanvien` (`HoTen`, `IdViTri`, `IdTrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('Oanh', '1', '1', '3', '2000-11-04', '456754454', '1000000', '696228677', 'oanh@gmail.com', 'Quảng Trị');

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
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('4', 'Trân Hoàng B', '2004-05-04', '12325431', '444346678', 'BB@gmail.com', 'Hà Nội');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('5', 'Thái Lê F', '1997-05-14', '14425431', '424476678', 'F@gmail.com', 'Vinh');
INSERT INTO `furama_resort`.`khachhang` (`IdLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) VALUES ('4', 'VĂn H', '1999-05-14', '14335431', '424478878', 'H@gmail.com', 'Quảng Ngãi');

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

INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('2', '1', '1', '2019/6/10', '2020/5/10');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('5', '3', '3', '2019/4/12', '2019/5/15');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('3', '2', '2', '2018/2/15', '2019/4/18');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('5', '4', '4', '2019/3/22', '2020/5/5');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('1', '5', '4', '2019/2/10', '2020/4/10');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('3', '2', '3', '2019/03/13', '2020/05/05');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('1', '6', '1', '2019-03-13', '2020-05-05');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('6', '7', '2', '2020-02-10', '2020-04-10');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('2', '3', '3', '2020-04-12', '2010-05-15');
INSERT INTO `furama_resort`.`hopdong` (`IdNhanVien`, `IdKhachHang`, `IdDichVu`, `NgayLamHopDong`, `NgayKetThuc`) VALUES ('4', '8', '2', '2015-04-12', '2015-06-12');

INSERT INTO `furama_resort`.`dichvudikem` (`TenDichVuDIKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('massage', '500000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`TenDichVuDIKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('karaoke', '300000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`TenDichVuDIKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('sightseeing car', '800000', '1', 'ok');
INSERT INTO `furama_resort`.`dichvudikem` (`TenDichVuDIKem`, `Gia`, `DonVi`, `TrangThaiKhaDung`) VALUES ('food', '100000', '1', 'ok');

INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('1', '4', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('2', '4', '3');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('3', '1', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('4', '2', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('5','1','2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('1', '3', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('3', '1', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('7', '2', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('8', '2', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('2', '3', '1');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('10', '3', '2');
INSERT INTO `furama_resort`.`hopdongchitiet` (`IdHopDong`, `IdDichVuDiKem`, `SoLuong`) VALUES ('10', '4', '2');

-- update tong tien
update HopDong
join DichVu on DichVu.IdDichVu=HopDong.IdDichVu
join HopDongChiTiet on HopDongChiTiet.IdHopDong=HopDong.IdHopDong
join DichVuDiKem on DichVuDiKem.IdDichVuDiKem=HopDongChiTiet.IdDichVuDiKem
set TongTien=ChiPhiThue+DonVi*Gia;

