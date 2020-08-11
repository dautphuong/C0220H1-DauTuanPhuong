import {Component, OnInit} from '@angular/core';
import {DichvuService} from '../../dich-vu/dichvu.service';
import {DichVu} from '../../dich-vu/dich-vu';
import {FormGroup} from '@angular/forms';

@Component({
  selector: 'app-register-dich-vu',
  templateUrl: './register-dich-vu.component.html',
  styleUrls: ['./register-dich-vu.component.css']
})
export class RegisterDichVuComponent implements OnInit {

  listDichVu: DichVu[];
  constructor(private DichVuService: DichvuService) {
    this.listDichVu = DichVuService.findAll();
  }

  ngOnInit(): void {
  }

}
