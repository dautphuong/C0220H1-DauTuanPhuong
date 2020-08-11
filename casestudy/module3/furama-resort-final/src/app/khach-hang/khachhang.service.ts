import {Injectable} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {Khachhang, listKhachHang} from './khach-hang';

@Injectable({
  providedIn: 'root'
})
export class KhachhangService {
  listKhachHang: Khachhang[];

  constructor() {
    this.listKhachHang = listKhachHang;
  }

  findAll(): Khachhang[] {
    return this.listKhachHang;
  }

  findById(id: string): Khachhang {
    return this.listKhachHang.find(khachHang => khachHang.idKhachHang === id);
  }

  save(khachhang: Khachhang): void {
    listKhachHang.push(khachhang);
  }
}
