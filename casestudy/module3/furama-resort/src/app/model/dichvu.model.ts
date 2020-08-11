export interface DichVuModel {
  idDichVu: string;
  tenDichVu: string;
  dienTich: number;
  soTang: number;
  soNguoiToiDa: number;
  chiPhiThue: number;
  idKieuThue: number;
  idLoaiDichVu: number;
  trangThai: string;
}

export const listDichVu = [
  {
    idDichVu: 'DV-0001',
    tenDichVu: 'A',
    dienTich: 100,
    soTang: 2,
    soNguoiToiDa: 4,
    chiPhiThue: 7000000,
    idKieuThue: 2,
    idLoaiDichVu: 1,
    trangThai: 'Đã thuê'
  },
  {
    idDichVu: 'DV-0002',
    tenDichVu: 'B',
    dienTich: 100,
    soTang: 2,
    soNguoiToiDa: 4,
    chiPhiThue: 7000000,
    idKieuThue: 2,
    idLoaiDichVu: 1,
    trangThai: 'Đã thuê'
  },
  {
    idDichVu: 'DV-0003',
    tenDichVu: 'C',
    dienTich: 100,
    soTang: 2,
    soNguoiToiDa: 4,
    chiPhiThue: 7000000,
    idKieuThue: 2,
    idLoaiDichVu: 1,
    trangThai: 'Đã thuê'
  }
];
