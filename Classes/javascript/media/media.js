
const alunos = [
    {
        nome: 'Walter',
        nota: 6,
        turma: 'A',
    },
    {
        nome: 'Paulo',
        nota: 96,
        turma: 'B',
    },
    {
        nome: 'Tiana',
        nota: 5,
        turma: 'D',
    },
    {
        nome: 'Amanda',
        nota: 3,
        turma: 'C',
    }]

function alunosAprovados (arr, media) {
    let aprovados = [];
    for (let i = 0; i < arr.length; i++) {

        const {nota, nome} = arr[i];
        if(nota >= media) {
            aprovados.push(nome);
        }

    }

    return aprovados;

}

console.log(alunosAprovados(alunos,5));