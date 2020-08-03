import {Component, Input, OnInit} from "@angular/core";
import {listDichVu} from '../../dichvu.model';

@Component({
  selector: 'app-list-dich-vu',
  templateUrl: './list-dich-vu.component.html',
  styleUrls: ['./list-dich-vu.component.css']
})
export class ListDichVuComponent implements OnInit {
  @Input() listDichVu = listDichVu;

  constructor() {
  }

  ngOnInit(): void {
  }

}
