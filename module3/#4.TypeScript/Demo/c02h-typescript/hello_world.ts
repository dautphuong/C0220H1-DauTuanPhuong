console.log('Hello world');

// data type

function sum(num1: number, num2: number) {
    let result: string = 'Ket qua tra ve la: ';

    return result + (num1 + num2);
}

console.log(sum(4, 5));

interface IStudentCodeGym {
    id: number;
    name: string;
}

let objStudent: IStudentCodeGym = {id: 1, name: 'Tien'};
console.log(objStudent.name);

class StudentCodeGym {
    id: number;
    name: string;

    constructor(id: number, name: string) {
        this.id = id;
        this.name = name;
    }
}

let student = new StudentCodeGym(2, 'Khanh');
console.log(student);

// any
function sum2(num1: any, num2: any) {
    let result: string = 'Ket qua tra ve la: ';

    return result + (num1 + num2);
}

console.log(sum2('4', 5));

enum Direction {
    UP = 'a',
    DOWN = 'd',
    LEFT = 'c',
    RIGHT = 'g',
    NO = '3'
};

console.log(typeof Direction);

let promise = new Promise(function(resolve, reject) {
    // read API
    let readAPI = false;

    if (readAPI) {
        resolve('Giu loi hua (success)');
    } else {
        reject('That hua (fail)');
    }
});

promise.then(
    function(success) {
        console.log('OK, nhan pham +1 ' + success);
    },
    function(error) {
        console.log('NG, nhan pham -1 ' + error);
        console.log('After 2');
    }
);


console.log('After 1');

async function sumAwait(num1: number, num2: number) {
    let total: number = num1 + num2;
    await console.log('Read API');
    return total;
}

sumAwait(3, 5).then(
    function(resolve) {
        console.log('Finish');
    },
    function(reject) {
        console.log('Not yet');
    }
)
