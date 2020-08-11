import {Injectable} from '@angular/core';
import {Nhanvien ,listNhanVien} from './nhan-vien';

@Injectable({
  providedIn: 'root'
})
export class NhanvienService {

  listNhanVien: Nhanvien[];

  constructor() {
    this.listNhanVien = listNhanVien;
  }

  findAll(): Nhanvien[] {
    return this.listNhanVien;
  }

  findById(id: string): Nhanvien {
    return this.listNhanVien.find(khachHang => khachHang.idNhanVien === id);
  }

  save(nhanvien: Nhanvien): void {
    listNhanVien.push(nhanvien);
  }
}
