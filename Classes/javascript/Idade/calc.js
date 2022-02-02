const pessoa1 = {
    nome: 'Walter',
    idade: 29,
}

const pessoa2 = {
    nome: 'Thiago',
    idade: 34,
}

const pessoa3 = {
    nome: 'Danielo',
    idade: 21,
}

function calculadoraIdade (anos) {
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.`;
}

console.log(calculadoraIdade.call(pessoa2, 27));