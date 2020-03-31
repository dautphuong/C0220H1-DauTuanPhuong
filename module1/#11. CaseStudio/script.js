const MOVE_LEFT = 0;
const MOVE_RIGHT = 1;
let score = 0;
let hightScore = 0;

class Bar {
    constructor() {
        this.x = 150;
        this.y = 400;
        this.width = 100;
        this.height = 20;
        this.direction = MOVE_RIGHT;

        this.update = function () {
            // Khong che toa do
            if (this.direction === MOVE_LEFT) {
                if (this.x > 1) {
                    this.x -= 5;
                }
            } else if (this.direction === MOVE_RIGHT) {
                if (this.x < 600) {
                    this.x += 5;
                }
            }
        }
    }
}

class Ball {
    constructor(x, y, r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.speed = 5;
        this.orientation = [1, 1];

        this.moving = function () {
            this.y += this.orientation[0] * this.speed;
            this.x += this.orientation[1] * this.speed;
        };
        this.changeOrientation = function (y, x) {
            this.orientation[0] = y;
            this.orientation[1] = x;
        };
        this.update = function (target) {
            if (this.x > 700 || this.x < 0) {
                this.changeOrientation(this.orientation[0], (-1 * this.orientation[1]));
            }
            if (this.y > 500 || this.y < 0) {
                this.changeOrientation((-1 * this.orientation[0]), this.orientation[1]);
            }
            if(this.x>=target.x&&this.y>=target.y&&this.x<=target.x+target.width&&this.y>target.y-target.height){
                score++;
                if (hightScore < score) {
                    hightScore = score;
                }
                this.changeOrientation((-1 * this.orientation[0]), this.orientation[1]);
            }
            this.moving();
        }
    }
}

const GAME_STATUS_PLAYING = 1;
const GAME_STATUS_OVER = 2;

class GameBoard {
    constructor() {
        this.bar = new Bar();
        this.ball = new Ball(500, 30, 10);
        this.status = GAME_STATUS_OVER;
        this.update = function () {
            if (this.status === GAME_STATUS_PLAYING) {
                this.bar.update();
                this.ball.update(this.bar);
            }
            this.check();
        };

        //check lose
        this.check=function () {
            if(this.ball.y+this.ball.r>500){
                this.status = GAME_STATUS_OVER;
            }
        };


        this.onLeftArrowPressed = function () {
            this.bar.direction = MOVE_LEFT;
        };

        this.onRightArrowPressed = function () {
            this.bar.direction = MOVE_RIGHT;
        };

        this.onEnterButtonPressed = function () {
            if (game.status === GAME_STATUS_OVER) {
                score = 0;
                game = new GameBoard();
                game.status = GAME_STATUS_PLAYING;
            }
        }
    }

}

let game = new GameBoard();