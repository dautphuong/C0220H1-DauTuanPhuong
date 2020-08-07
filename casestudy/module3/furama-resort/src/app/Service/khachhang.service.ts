import {Injectable} from '@angular/core';
import {KhachhangModel, listKhachHang} from '../model/khachhang.model';
import {FormGroup} from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class KhachhangService {
  listKhachHang: KhachhangModel[];

  constructor() {
    this.listKhachHang = listKhachHang;
  }

  findAll(): KhachhangModel[] {
    return this.listKhachHang;
  }

  findById(id: string): KhachhangModel {
    return this.listKhachHang.find(khachHang => khachHang.idKhachHang === id);
  }

  save(khachhang: KhachhangModel): void {
    listKhachHang.push(khachhang);
  }
}
