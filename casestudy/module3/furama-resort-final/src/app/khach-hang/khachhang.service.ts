import {Injectable} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {Khachhang} from './khach-hang';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KhachhangService {
  API_URL = '  http://localhost:3000/listKhachHang';
  listKhachHang: Khachhang[];

  constructor(private httpClient: HttpClient) {
    // this.listKhachHang = listKhachHang;
  }

  findAll(): Observable<Khachhang[]> {
    // return this.listKhachHang;
    return this.httpClient.get<Khachhang[]>(this.API_URL);
  }

  findById(id: number): Observable<Khachhang> {
    // return this.listKhachHang.find(khachHang => khachHang.idKhachHang === id);
    return this.httpClient.get<Khachhang>(this.API_URL + '/' + id);
  }

  save(khachhang: Khachhang): Observable<Khachhang> {
    // listKhachHang.push(khachhang);
    return this.httpClient.post<Khachhang>(this.API_URL, khachhang);
  }

  update(khachHang: Khachhang): Observable<void> {
    return this.httpClient.patch<void>(this.API_URL + '/' + khachHang.id, khachHang);
  }

  delete(id: number): Observable<{}> {
    return this.httpClient.delete(this.API_URL + '/' + id);
  }
}
