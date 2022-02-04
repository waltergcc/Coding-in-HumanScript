const lista = [
    {
        name: 'chá gelado',
        preco: 5.50,
    },
    {
        name: 'pão',
        preco: 4.50,
    },
    {
        name: 'Chocolate',
        preco: 3.90,
    },
    {
        name: 'Carne',
        preco: 55.00,
    },
];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(prev,current, index){
        console.log('rodada ',index + 1);
        console.log({prev});
        console.log({current});
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));