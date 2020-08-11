import {Component, Input, OnInit} from '@angular/core';
import {DichVuModel, listDichVu} from '../../../model/dichvu.model';
import {DichvuService} from '../../../Service/dichvu.service';

@Component({
  selector: 'app-list-dich-vu',
  templateUrl: './list-dich-vu.component.html',
  styleUrls: ['./list-dich-vu.component.css']
})
export class ListDichVuComponent implements OnInit {
  listDichVu: DichVuModel[];

  constructor(private DichVuService: DichvuService) {
    this.listDichVu = DichVuService.findAll();
  }

  ngOnInit(): void {
  }

}
