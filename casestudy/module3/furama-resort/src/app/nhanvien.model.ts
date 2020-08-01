export interface NhanvienModel {
  idNhanVien: string;
  hoTen: string;
  idViTri: number;
  idTrinhDo: number;
  idBoPhan: number;
  ngaySinh: string;
  socmnd: string;
  sdt: string;
  email: string;
  diaChi: string;
  luong: string;
}

export const listNhanVien = [
  {
    idNhanVien: 'NV-0001',
    hoTen: 'Hải',
    idViTri: 1,
    idTrinhDo: 1,
    idBoPhan: 1,
    ngaySinh: '20/8/1990',
    socmnd: '1000000001',
    sdt: '090000001',
    email: 'Hai@gmail.com',
    diaChi: 'Đà Nẵng',
    luong: '3000000'
  },
  {
    idNhanVien: 'NV-0002',
    hoTen: 'Quân',
    idViTri: 2,
    idTrinhDo: 2,
    idBoPhan: 2,
    ngaySinh: '22/1/1990',
    socmnd: '1000030001',
    sdt: '090000022',
    email: 'Quan@gmail.com',
    diaChi: 'Đà Nẵng',
    luong: '3000000'
  },
  {
    idNhanVien: 'NV-0003',
    hoTen: 'Châu',
    idViTri: 1,
    idTrinhDo: 3,
    idBoPhan: 2,
    ngaySinh: '13/9/1990',
    socmnd: '1000000007',
    sdt: '090000004',
    email: 'Chau@gmail.com',
    diaChi: 'Đà Nẵng',
    luong: '4000000'
  }
];
