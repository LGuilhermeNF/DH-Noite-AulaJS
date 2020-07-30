let alunos = [
    {nome: "Guilherme", serie: 8},
    {nome: "Ana      ", serie: 9},
    {nome: "Bruna    ", serie: 8},
    {nome: "Alexandre", serie: 9},
    {nome: "Samuel   ", serie: 8},
    {nome: "Mariana  ", serie: 9}
] 

let turma = alunos.map((turma) => {
    return turma.serie == 8 ? turma.nome + ": "+turma.serie + "º ano- aula de História" : 
                              turma.nome + ": "+turma.serie + "º ano - aula de Física"
}
)

console.log(turma)