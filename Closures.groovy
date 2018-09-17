def tratarClosure(Closure closure) {
    closure()
}

tratarClosure({
    println "Essa é minha closure"
})

List meses = ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"]

meses.each({
    println it
})

Map rubricasEValores = [100:12.5, 167:33.45, 168:-12.4]
println rubricasEValores.getClass()

rubricasEValores.each({
    chave, valor ->
       println "chave ${chave}: ${valor}"
})

def multiply = {int num1, int num2 -> num1*num2}
def timesTwo = multiply.curry(2)

println timesTwo(4)
println timesTwo(8)
println timesTwo(10)

println meses.find({it == "Março" || it == "Junho"})
meses.remove 2
println meses.find({it == "Março" || it == "Junho"})
meses << "Março"
println meses
println meses.find({it == "Março" || it == "Junho"})

println meses.findAll({it.startsWith('J')})

println meses.every({it instanceof String})

println meses.any({it.startsWith('A')})

println meses.groupBy({it.charAt(0)})