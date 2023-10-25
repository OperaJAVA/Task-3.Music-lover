package ru.netology

fun main() {
    val purchaseAmount = 12000 // сумма покупки
    val isRegularCustomer = true // признак постоянного покупателя

    var discount = when {
        purchaseAmount <= 1000 -> 0 // если сумма покупки <= 1000, то скидка 0
        purchaseAmount <= 10000 -> 100 // если сумма покупки <= 10000, то скидка 100
        else -> (purchaseAmount * 0.05).toInt() // иначе скидка 5%
    }

    // Проверяем, является ли покупатель постоянным и добавляем 1% скидки
    if (isRegularCustomer) {
        discount += (purchaseAmount * 0.01).toInt()
    }

    val finalAmount = purchaseAmount - discount
    println("Сумма покупки: $purchaseAmount руб.")
    println("Размер скидки: $discount руб.")
    println("Итоговая сумма с учетом скидки: $finalAmount руб.")
}
