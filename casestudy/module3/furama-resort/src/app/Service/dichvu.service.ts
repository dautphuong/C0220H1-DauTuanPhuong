import {Injectable} from '@angular/core';
import {DichVuModel, listDichVu} from '../model/dichvu.model';

@Injectable({
  providedIn: 'root'
})
export class DichvuService {

  listDichVu: DichVuModel[];

  constructor() {
    this.listDichVu = listDichVu;
  }

  findAll(): DichVuModel[] {
    return this.listDichVu;
  }

  findById(id: string): DichVuModel {
    return this.listDichVu.find(khachHang => khachHang.idDichVu === id);
  }

  save(dichvu: DichVuModel): void {
    listDichVu.push(dichvu);
  }
}
