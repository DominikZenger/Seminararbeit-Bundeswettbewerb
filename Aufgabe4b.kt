// Programmcode der für die Seminararbeit verwendet wurde und in dieser beschrieben wurde
// geschrieben von Dominik Zenger in der Programmiersprache Kotlin

// Funktion zum generieren von beliebig vielen s_n welche durch 27 teilbar sind
fun generateSnDivisibleBy27(i:Int = 1, sn: Int = 0) {
    if ((sn % 27) == 0) {
        println("$sn (${i-1})")
    }
    val a = getAk(i)
    generateSnDivisibleBy27(i+1, a + sn)
}

// Funktion zum generieren von a_k
fun getAk(k: Int) : Int {
    return if ((k % 3) != 0) k
    else getAk(k/3)
}

// Funktion zum generieren von s_n
fun getSn(n: Int): Int {
    return if (n == 0) 0
    else getAk(n) + getSn(n-1)

}
