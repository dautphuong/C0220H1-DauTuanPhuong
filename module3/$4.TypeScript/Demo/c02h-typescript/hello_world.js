var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
console.log('Hello world');
// data type
function sum(num1, num2) {
    let result = 'Ket qua tra ve la: ';
    return result + (num1 + num2);
}
console.log(sum(4, 5));
let objStudent = { id: 1, name: 'Tien' };
console.log(objStudent.name);
class StudentCodeGym {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
}
let student = new StudentCodeGym(2, 'Khanh');
console.log(student);
// any
function sum2(num1, num2) {
    let result = 'Ket qua tra ve la: ';
    return result + (num1 + num2);
}
console.log(sum2('4', 5));
var Direction;
(function (Direction) {
    Direction["UP"] = "a";
    Direction["DOWN"] = "d";
    Direction["LEFT"] = "c";
    Direction["RIGHT"] = "g";
    Direction["NO"] = "3";
})(Direction || (Direction = {}));
;
console.log(typeof Direction);
let promise = new Promise(function (resolve, reject) {
    // read API
    let readAPI = false;
    if (readAPI) {
        resolve('Giu loi hua (success)');
    }
    else {
        reject('That hua (fail)');
    }
});
promise.then(function (success) {
    console.log('OK, nhan pham +1 ' + success);
}, function (error) {
    console.log('NG, nhan pham -1 ' + error);
    console.log('After 2');
});
console.log('After 1');
function sumAwait(num1, num2) {
    return __awaiter(this, void 0, void 0, function* () {
        let total = num1 + num2;
        yield console.log('Read API');
        return total;
    });
}
sumAwait(3, 5).then(function (resolve) {
    console.log('Finish');
}, function (reject) {
    console.log('Not yet');
});
