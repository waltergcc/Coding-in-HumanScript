const meuArray = [5, 2, 69, 54, 45, 88, 2, 3, 5, 78, 36];

function valoresUnicos(arr) {
    const mySet = new Set(arr);

    return [...mySet];
}

console.log(valoresUnicos(meuArray));