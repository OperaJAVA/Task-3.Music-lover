package ru.netology

fun main() {
    val purchaseAmount = 100
    val isRegularCustomer = true
    var discount = 0

    if (isRegularCustomer) {
        discount = (purchaseAmount * 0.05).toInt() // применяем первую скидку 5%
        discount += ((purchaseAmount + discount) * 0.01).toInt() // применяем вторую скидку 1% к сумме за вычетом первой скидки
    }

    val finalAmount = purchaseAmount - discount
    println("Сумма покупки: $purchaseAmount руб.")
    println("Размер скидки: $discount руб.")
    println("Итоговая сумма с учетом скидки: $finalAmount руб.")
}
