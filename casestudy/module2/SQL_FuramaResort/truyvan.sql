use furama_resort;

-- 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới (furama_resort.sql)

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự

select *
from nhanvien
where  HoTen like 'K%' or HoTen like'T%' or HoTen like'H%' and length(HoTen)<15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

SELECT *
from khachhang
WHERE (year(current_date())-year(NgaySinh)>=18 and year(current_date())-year(NgaySinh)<=50) and(DiaChi='Đà Nẵng'or DiaChi='Quảng Trị');

-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select khachhang.HoTen,count(hopdong.idKhachHang)as SoLanDatPhong
from hopdong
join khachhang on khachhang.IdKhachHang=hopdong.IdKhachHang
where khachhang.IdLoaiKhach=5
GROUP BY hopdong.idKhachHang
order by count(hopdong.idKhachHang);

-- 5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

update HopDong
join DichVu on DichVu.IdDichVu=HopDong.IdDichVu
join HopDongChiTiet on HopDongChiTiet.IdHopDong=HopDong.IdHopDong
join DichVuDiKem on DichVuDiKem.IdDichVuDiKem=HopDongChiTiet.IdDichVuDiKem
set TongTien=ChiPhiThue+DonVi*Gia;

select KhachHang.IdKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc,TongTien
from KhachHang
join loaikhach on KhachHang.IdLoaiKhach=loaikhach.IdLoaiKhach
join HopDong on HopDong.IdKhachHang=KhachHang.IdKhachHang
join dichvu on HopDong.idDichVu=dichvu.idDichVu;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

SELECT dichvu.IdDichVu,TenDichVu,DienTich,ChiPhiThue,TenLoaiDichVu
FROM dichvu
left JOIN loaidichvu ON dichvu.IdLoaiDichVu = loaidichvu.IdLoaiDichVu
left JOIN HopDong ON HopDong.idDichVu = dichvu.iddichvu
where dichvu.IdDichVu not in (SELECT dichvu.IdDichVu from dichvu join  HopDong ON HopDong.idDichVu = dichvu.iddichvu
    where month(ngayLamHopDong ) < 4 AND year(ngayLamHopDong) = 2019);
    
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
    
select dichvu.IdDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
from dichvu
left JOIN loaidichvu ON dichvu.IdLoaiDichVu = loaidichvu.IdLoaiDichVu
left JOIN HopDong ON HopDong.idDichVu = dichvu.iddichvu
where year(ngayLamHopDong)=2018 and dichvu.IdDichVu not in (SELECT dichvu.IdDichVu from dichvu join  HopDong ON HopDong.idDichVu = dichvu.iddichvu
    where year(ngayLamHopDong) = 2019);
    
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoTenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

SELECT DISTINCT HoTen
FROM KHACHHANG;

SELECT HoTen
FROM KHACHHANG
GROUP BY HoTen;

SELECT HoTen
FROM KHACHHANG
union
SELECT HoTen
FROM KHACHHANG;
-- 9.Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(NgayLamHopDong)as Thang,count(idKhachHang)as SoKhachDatPhong
from hopdong
WHERE year(NgayLamHopDong)=2019
group by month(NgayLamHopDong);

-- 10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select HopDong.idhopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, count(hopdongchitiet.idhopDong) as SoLuongDichVuDiKem
from HopDong
left join hopdongchitiet on hopdongchitiet.idhopDong=hopdong.idhopdong
GROUP BY hopdongchitiet.idhopDong;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng 
-- có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select dichvudikem.IdDichvudikem,TenDichVudiKem,Gia,Donvi
from dichvudikem
join hopdongchitiet on hopdongchitiet.iddichvudikem=dichvudikem.iddichvudikem
join hopdong on hopdongchitiet.idhopDong=hopdong.idhopdong
join khachhang on khachhang.idkhachhang=hopdong.idkhachhang
right join loaikhach on khachhang.IdLoaiKhach=loaikhach.IdLoaiKhach
where TenLoaiKhach='Diamond' and (Diachi='Vinh' or Diachi='Quảng Ngãi');

-- 12.Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang,
-- SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết),
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select hopdong.idHopDong,nhanvien.hoten as HoTenNhanVien,khachhang.hoten as TenKhachHang, khachhang.SDT as SoDienThoaiKhachHang, TenDichVu, count(hopdongchitiet.idhopDong) as SoLuongDichVuDiKem
from hopdong
join nhanvien on nhanvien.idnhanvien=hopdong.idnhanvien
join khachhang on khachhang.idkhachhang=hopdong.idkhachhang
join dichvu on dichvu.iddichvu=hopdong.iddichvu
left join hopdongchitiet on hopdongchitiet.idhopDong=hopdong.idhopdong
where khachhang.hoten not in(select hoten from khachhang join hopdong on khachhang.IdKhachHang = hopdong.IdKhachHang where month(ngaylamhopdong)<7) and year(ngaylamhopdong)=2019 and month(ngaylamhopdong)>9
GROUP BY hopdong.idhopDong;

-- 13.Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

SELECT dichvudikem.IdDichvudikem,TenDichVudiKem,Gia,Donvi,count(hopdongchitiet.iddichvudikem)as SoLanSuDung
from hopdongchitiet
right join dichvudikem on hopdongchitiet.iddichvudikem=dichvudikem.iddichvudikem
group by hopdongchitiet.iddichvudikem
having count(hopdongchitiet.iddichvudikem)=(select count(iddichvudikem) from hopdongchitiet group by iddichvudikem order by count(iddichvudikem)desc limit 1);

-- 14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hopdong.idHopDong,TenLoaiDichVu,TendichVudiKem,count(hopdongchitiet.iddichvudikem)as SoLanSuDung
from hopdong
join dichvu on dichvu.IdDichVu=hopdong.IdDichVu
join loaidichvu on dichvu.IdLoaiDichVu=loaidichvu.IdLoaiDichVu
join hopdongchitiet on hopdongchitiet.IdHopDong=hopdong.IdHopDong
join dichvudikem on hopdongchitiet.IdDichVuDiKem=dichvudikem.IdDichVuDiKem
group by hopdongchitiet.iddichvudikem
having SoLanSuDung=1;

-- 15.Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, 
-- TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

SELECT nhanvien.IDNhanVien, HoTen, TrinhDo, TenBoPhan, SDT, DiaChi 
from nhanvien
join trinhdo on trinhdo.IdTrinhDo=nhanvien.Idtrinhdo
join bophan on bophan.IdBoPhan=nhanvien.IdBoPhan
join hopdong on hopdong.IdNhanVien=nhanvien.IdNhanVien
where year(ngaylamhopdong) between 2018 and 2020
group by hopdong.IdNhanVien
having count(hopdong.IdNhanVien)<4 and count(hopdong.IdNhanVien)>0;

-- 16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

delete nhanvien from nhanvien
where not EXISTS(select idnhanvien from hopdong where year(ngaylamhopdong) BETWEEN 2017 and 2020 and nhanvien.idnhanvien = hopdong.idnhanvien);

-- 17.Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khachhang 
join hopdong on hopdong.idkhachhang=khachhang.idkhachhang
join loaikhach on loaikhach.IdLoaiKhach=khachhang.idloaikhach
set khachhang.IdLoaiKhach=5
where khachhang.IdLoaiKhach=4 and year(NgayLamHopDong)=2019 and tongtien>10000000;

-- 18.Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

alter table hopdongchitiet drop FOREIGN KEY `hopdongchitiet_ibfk_1`;
ALTER table hopdong drop FOREIGN KEY `hopdong_ibfk_2`;

delete khachhang,hopdong,hopdongchitiet from khachhang 
join hopdong on khachhang.IdKhachHang = hopdong.IdKhachHang
join hopdongchitiet on hopdong.IdHopDong = hopdongchitiet.IdHopDong 
where not exists
(select hopdong.IdHopDong where year(hopdong.ngayLamHopDong) > '2016' and khachhang.IdKhachHang = hopdong.IdKhachHang);

ALTER TABLE hopdong ADD CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`IdKhachHang`) REFERENCES `khachhang` (`IdKhachHang`) ;
ALTER TABLE hopdongchitiet ADD CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`IdHopDong`) REFERENCES `hopdong` (`IdHopDong`) ;

-- 19.Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

UPDATE dichvudikem
JOIN (SELECT iddichvudikem, COUNT(iddichvudikem), ngaylamhopdong
    FROM hopdongchitiet
    JOIN hopdong ON hopdong.idhopdong = hopdongchitiet.idhopdong
    GROUP BY (iddichvudikem)
    HAVING COUNT(hopdongchitiet.iddichvudikem) > 2 AND year(ngaylamhopdong) >=2019 ) dvdk ON dvdk.iddichvudikem = dichvudikem.iddichvudikem
SET Gia = (Gia * 2);

-- 20.Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select idnhanvien as id,HoTen,Email, SDT, NgaySinh, DiaChi
from nhanvien
UNION 
select idkhachhang as id,HoTen,Email, SDT, NgaySinh, DiaChi
from khachhang