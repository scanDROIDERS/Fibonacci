fun fibonacci(n:Int):Int {
    if(n == 1) return 0
    if(n == 2) return 1
    return fibonacci(n-1) + fibonacci(n-2)
}

fun main() {
    (0..50).forEach { print('-') }
    println()
    print("Digite até que número da sequência de fibonacci deseja calcular: ")
    val n = readln().toInt()
    print("Sequência de fibonacci até $n: ")
    repeat(n) {
        print("${fibonacci(it+1)} ")
    }
    println()
    (0..50).forEach { print('-') }
}
