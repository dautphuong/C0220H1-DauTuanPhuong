import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {SinhVienService} from '../sinh-vien.service';

@Component({
  selector: 'app-delete-sinh-vien',
  templateUrl: './delete-sinh-vien.component.html',
  styleUrls: ['./delete-sinh-vien.component.css']
})
export class DeleteSinhVienComponent implements OnInit {

  constructor(private router: Router, private sinhVienService: SinhVienService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      this.sinhVienService.delete(id).subscribe();
      this.router.navigateByUrl('/');
    });
  }

}
