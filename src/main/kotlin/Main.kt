fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank!")
    val titular = "Flávio"
    val numeroConta = 1354
    var saldo = 350268L
    saldo -= 142L
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: ${saldo/100},${saldo % 100}")
}