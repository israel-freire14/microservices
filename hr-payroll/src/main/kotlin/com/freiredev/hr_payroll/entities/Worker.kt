package com.freiredev.hr_payroll.entities

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import lombok.ToString


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonSerialize
class Worker(
    val id: Long,
    val name: String,
    val dailyIncome: Double
)
