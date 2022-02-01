function comparaNumeros (n1,n2){
    if (!n1 || !n2) return 'Precisa definir números';
   const frase1 = criaFrase1 (n1,n2);
   const frase2 = criaFrase2(n1,n2);

   return `${frase1} ${frase2}`;
}

function criaFrase1 (n1,n2) {
    let saoIguais = '';
    if (n1 !== n2) {
        saoIguais = 'não';
    }

    return `Os números ${n1} e ${n2} ${saoIguais} são iguais.`;
}

function criaFrase2 (n1,n2) {
    const sum = n1 + n2;

    let resultado10 = 'menor';
    let resultado20 = 'menor';
    const compara10 = sum > 10;
    const compara20 = sum > 20;

    if (compara10) {
        resultado10 = 'maior';
    }

    if (compara20) {
        resultado20 = 'maior';
    }

    return `Sua soma é ${sum}, que é ${resultado10} que 10 e ${resultado20} que 20.`;
}

console.log(comparaNumeros());