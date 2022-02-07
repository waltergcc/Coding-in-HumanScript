let lines = '1.00 1.00 11.00 11.00';

const [precoAlcool, precoGasolina, rendimentoAlcool, rendimentoGasolina] = 
  lines.split(' ').map(x => parseFloat(x));

const precoPorKmAlcool = precoAlcool / rendimentoAlcool;
const precoPorKmGasolina = precoGasolina / rendimentoGasolina;

const maisEconomico = precoPorKmGasolina <= precoPorKmAlcool ? 'G' : 'A';

console.log(maisEconomico);

