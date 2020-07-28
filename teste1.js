var mes = 12;

var dia = "segunda"

switch(mes){
    case  1: console.log("Janeiro"); break;
    case  2: console.log("Fevereiro"); break;
    case  3: console.log("Março"); break;
    case  4: console.log("Abril"); break;
    case  5: console.log("Maio"); break;
    case  6: console.log("Junho"); break;
    case  7: console.log("Julho"); break;
    case  8: console.log("Agosto"); break;
    case  9: console.log("Setembro"); break;
    case 10: console.log("Outubro"); break;
    case 11: console.log("Novembro"); break;
    case 12: console.log("Dezembro");
    default: console.log("Mês inválido");
}

dia == "domingo" ? console.log("final de semana") : console.log("dia da semana");

var objeto = {
    nome: "Guilherme",
    sobreNome: "Fernandes"
}
for(var o in objeto){
    console.log(o+": "+objeto[0]);
} 

var mat = [[21,42],[73,94]]

for(var i = 0; i<2; i++){
    for(var j = 0; j<2; j++){
        console.log(mat[i][j])
    }
}