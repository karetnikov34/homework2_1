val amount = 24_100
val day = 112_000
val month = 300_000

fun main() {
     if(day + amount > 150_000 || month + amount > 600_000) {
            println("Лимиты суммы переводов превышены")
        } else println("Комиссия по операции составляет: ${commission()} руб.")
    }

fun commission () = if (amount * 0.0075f < 35) 35 else amount * 0.0075f

