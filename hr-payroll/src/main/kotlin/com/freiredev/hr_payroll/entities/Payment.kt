package com.freiredev.hr_payroll.entities

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Payment(
    val name: String,
    val dailyIncome: Double,
    val days: Int
) {
    fun getTotal(): Double {
        return days * dailyIncome
    }
}




