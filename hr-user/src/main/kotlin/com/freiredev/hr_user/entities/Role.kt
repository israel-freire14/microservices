package com.freiredev.hr_user.entities

import com.freiredev.hr_user.config.AuthorizationTypeEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter

@Entity
@Table(name = "tb_role_access")
@Getter
@Setter
@AllArgsConstructor
data class Role(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_role_authorization")
    val roleAuthorization: AuthorizationTypeEnum

)
