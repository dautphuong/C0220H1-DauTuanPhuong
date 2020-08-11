import {Component, Input, OnInit} from '@angular/core';
import {HopdongModel, listHopDong} from '../../../model/hopdong.model';
import {HopdongService} from '../../../Service/hopdong.service';

@Component({
  selector: 'app-list-hop-dong',
  templateUrl: './list-hop-dong.component.html',
  styleUrls: ['./list-hop-dong.component.css']
})
export class ListHopDongComponent implements OnInit {
  listHopDong: HopdongModel[];

  constructor(private HopDongService: HopdongService) {
    this.listHopDong = HopDongService.findAll();
  }

  ngOnInit(): void {
  }

}
