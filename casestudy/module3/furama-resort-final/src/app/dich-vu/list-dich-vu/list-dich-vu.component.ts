import {Component, Input, OnInit} from '@angular/core';
import {DichVu} from '../dich-vu';
import {DichvuService} from '../dichvu.service';


@Component({
  selector: 'app-list-dich-vu',
  templateUrl: './list-dich-vu.component.html',
  styleUrls: ['./list-dich-vu.component.css']
})
export class ListDichVuComponent implements OnInit {
  listDichVu: DichVu[];

  constructor(private DichVuService: DichvuService) {
    this.listDichVu = DichVuService.findAll();
  }

  ngOnInit(): void {
  }

}
