
function Hero(image, top, left, size,speed) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;
    this.orientation = [1,1];

    this.getHeroElement = function() {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    };

    this.changeOrientation = function(top,left) {
        this.orientation[0] = top;
        this.orientation[1] = left;
    };

    this.moving = function() {
        this.top += this.orientation[0]*this.speed;
        this.left += this.orientation[1]*this.speed;
    }
}

var hero = new Hero('pikachu.png', 50, 50, 200,40);
document.getElementById('game').innerHTML = hero.getHeroElement();

function start() {

    if (hero.left>window.innerWidth-hero.size||hero.left<0) {
        hero.changeOrientation(hero.orientation[0],(-1*hero.orientation[1]));
    }
    if (hero.top>window.innerHeight-hero.size||hero.top<0) {
        hero.changeOrientation((-1*hero.orientation[0]),hero.orientation[1]);
    }
    hero.moving();
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 500);
}
start();

