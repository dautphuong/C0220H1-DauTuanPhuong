import {Injectable} from '@angular/core';
import {Nhanvien} from './nhan-vien';
import {HttpClient} from '@angular/common/http';
import {Khachhang} from '../khach-hang/khach-hang';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NhanvienService {
  API_URL = 'http://localhost:3000/listNhanVien';
  listNhanVien: Nhanvien[];

  constructor(private httpClient: HttpClient) {
  }

  findAll(): Observable<Nhanvien[]> {
    return this.httpClient.get<Nhanvien[]>(this.API_URL);
  }

  findById(id: string): Observable<Nhanvien> {
    return this.httpClient.get<Nhanvien>(this.API_URL + '/' + id);
  }

  save(nhanvien: Nhanvien): void {
  }
}
