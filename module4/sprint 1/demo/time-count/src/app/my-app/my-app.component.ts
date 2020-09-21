import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-my-app',
  templateUrl: './my-app.component.html',
  styleUrls: ['./my-app.component.css']
})
export class MyAppComponent implements OnInit {

  time =  10;
  display;
  interval;

  // tslint:disable-next-line:typedef
  startTimer() {
    this.interval = setInterval(() => {
      if (this.time === 0) {
        this.display = 'final';
      } else {
        this.time--;
      }
      this.display = this.transform(this.time);
    }, 1000);


    // this.interval = setInterval(() => {
    //   if (this.time === 0) {
    //     this.time++;
    //   } else {
    //     this.time++;
    //   }
    //   this.display = this.transform(this.time);
    // }, 1000);
  }

  transform(value: number): string {
    const minutes: number = Math.floor(value / 60);
    return minutes + ':' + (value - minutes * 60);
  }

  // tslint:disable-next-line:typedef
  pauseTimer() {
    clearInterval(this.interval);
  }

  ngOnInit(): void {
    this.startTimer();
  }
}
