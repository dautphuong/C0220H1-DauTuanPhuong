import {Component, Input, OnInit} from '@angular/core';
import {listHopDong} from '../../hopdong.model';

@Component({
  selector: 'app-list-hop-dong',
  templateUrl: './list-hop-dong.component.html',
  styleUrls: ['./list-hop-dong.component.css']
})
export class ListHopDongComponent implements OnInit {
  @Input() listHopDong = listHopDong;

  constructor() { }

  ngOnInit(): void {
  }

}
