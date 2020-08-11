import {Injectable} from '@angular/core';
import {DichVu, listDichVu} from './dich-vu';

@Injectable({
  providedIn: 'root'
})
export class DichvuService {

  listDichVu: DichVu[];

  constructor() {
    this.listDichVu = listDichVu;
  }

  findAll(): DichVu[] {
    return this.listDichVu;
  }

  findById(id: string): DichVu {
    return this.listDichVu.find(dichVu => dichVu.idDichVu === id);
  }

  save(dichvu: DichVu): void {
    listDichVu.push(dichvu);
  }
}
