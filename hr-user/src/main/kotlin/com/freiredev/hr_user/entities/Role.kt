package com.freiredev.hr_user.entities

import com.freiredev.hr_user.config.AuthorizationTypeEnum
import jakarta.persistence.*
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
    @Enumerated(EnumType.STRING)
    val roleAuthorization: AuthorizationTypeEnum
)
