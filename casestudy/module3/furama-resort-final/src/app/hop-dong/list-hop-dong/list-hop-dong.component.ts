import {Component, Input, OnInit} from '@angular/core';
import {HopDong} from '../hop-dong';
import {HopdongService} from '../hopdong.service';

@Component({
  selector: 'app-list-hop-dong',
  templateUrl: './list-hop-dong.component.html',
  styleUrls: ['./list-hop-dong.component.css']
})
export class ListHopDongComponent implements OnInit {
  listHopDong: HopDong[];

  constructor(private HopDongService: HopdongService) {
    this.listHopDong = HopDongService.findAll();
  }

  ngOnInit(): void {
  }

}
