import {Injectable} from '@angular/core';
import {NhanvienModel, listNhanVien} from '../model/nhanvien.model';

@Injectable({
  providedIn: 'root'
})
export class NhanvienService {

  listNhanVien: NhanvienModel[];

  constructor() {
    this.listNhanVien = listNhanVien;
  }

  findAll(): NhanvienModel[] {
    return this.listNhanVien;
  }

  findById(id: string): NhanvienModel {
    return this.listNhanVien.find(khachHang => khachHang.idNhanVien === id);
  }

  save(nhanvien: NhanvienModel): void {
    listNhanVien.push(nhanvien);
  }
}
