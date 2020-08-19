import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SinhVien} from './sinh-vien';

@Injectable({
  providedIn: 'root'
})
export class SinhVienService {
  API_URL = 'http://localhost:3000/students';

  constructor(private httpClient: HttpClient) {
  }

  findAll(): Observable<SinhVien[]> {
    return this.httpClient.get<SinhVien[]>(this.API_URL);
  }

  findById(id: number): Observable<SinhVien> {
    // return this.listKhachHang.find(khachHang => khachHang.idKhachHang === id);
    return this.httpClient.get<SinhVien>(this.API_URL + '/' + id);
  }


  update(sinhVien: SinhVien): Observable<void> {
    return this.httpClient.patch<void>(this.API_URL + '/' + sinhVien.id, sinhVien);
  }

  delete(id: number): Observable<{}> {
    return this.httpClient.delete(this.API_URL + '/' + id);
  }
}
