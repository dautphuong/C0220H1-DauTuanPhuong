import {Injectable} from '@angular/core';
import {HopdongModel, listHopDong} from '../model/hopdong.model';

@Injectable({
  providedIn: 'root'
})
export class HopdongService {

  listHopDong: HopdongModel[];

  constructor() {
    this.listHopDong = listHopDong;
  }

  findAll(): HopdongModel[] {
    return this.listHopDong;
  }

  findById(id: string): HopdongModel {
    return this.listHopDong.find(khachHang => khachHang.idHopDong === id);
  }

  save(hopdong: HopdongModel): void {
    listHopDong.push(hopdong);
  }
}
