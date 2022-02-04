function filtraPares(arr){
    return arr.filter(callback);
}

function callback(item){
    return item % 2 === 0;
}

const meuArray = [1,5,6,9,8,45,2,89,80,65,32,16];

console.log(filtraPares(meuArray));