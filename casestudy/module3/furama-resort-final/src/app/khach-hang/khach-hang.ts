export interface Khachhang {
  idKhachHang: string;
  hoTen: string;
  ngaySinh: string;
  socmnd: string;
  sdt: string;
  email: string;
  diaChi: string;
  idLoaiKhach: number;
}

export const listKhachHang = [
  {
    idKhachHang: 'KH-0001',
    hoTen: 'Hải',
    ngaySinh: '20/8/1990',
    socmnd: '1000000001',
    sdt: '090000001',
    email: 'Hai@gmail.com',
    diaChi: 'Đà Nẵng',
    idLoaiKhach: 1
  },
  {
    idKhachHang: 'KH-0002',
    hoTen: 'Tiến',
    ngaySinh: '15/4/1990',
    socmnd: '1000000002',
    sdt: '090000002',
    email: 'Tien@gmail.com',
    diaChi: 'Đà Nẵng',
    idLoaiKhach: 3
  },
  {
    idKhachHang: 'KH-0003',
    hoTen: 'Long',
    ngaySinh: '22/1/1990',
    socmnd: '1000000003',
    sdt: '90000003',
    email: 'Long@gmail.com',
    diaChi: 'Đà Nẵng',
    idLoaiKhach: 2
  }
];
