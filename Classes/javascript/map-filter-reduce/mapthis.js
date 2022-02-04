const maca = {
    value: 2,
}

const abacaxi = {
    value: 7,
}

function mapComthis(arr, thisArg){
    return arr.map(function(item){
       return item* this.value;
    }, thisArg);
}

const nums = [1,2];

console.log('this -> maça', mapComthis(nums, maca));
console.log('this -> abacaxi', mapComthis(nums, abacaxi));