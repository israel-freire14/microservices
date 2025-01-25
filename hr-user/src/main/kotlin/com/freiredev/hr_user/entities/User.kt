package com.freiredev.hr_user.entities

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "user_name")
    val name: String,

    @Column(name = "user_email")
    val email: String,

    @Column(name = "user_password")
    val password: String,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role_access",
               joinColumns = [JoinColumn(name = "user_id")],
               inverseJoinColumns = [JoinColumn(name = "role_access_id")]
    )
    val authorizationRole: Set<Role>
)
