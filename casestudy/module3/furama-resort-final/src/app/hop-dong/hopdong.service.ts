import {Injectable} from '@angular/core';
import {HopDong, listHopDong} from './hop-dong';

@Injectable({
  providedIn: 'root'
})
export class HopdongService {

  listHopDong: HopDong[];

  constructor() {
    this.listHopDong = listHopDong;
  }

  findAll(): HopDong[] {
    return this.listHopDong;
  }

  findById(id: string): HopDong {
    return this.listHopDong.find(hopDong => hopDong.idHopDong === id);
  }

  save(hopdong: HopDong): void {
    listHopDong.push(hopdong);
  }
}
