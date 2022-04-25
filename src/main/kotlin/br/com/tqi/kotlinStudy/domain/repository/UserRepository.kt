package br.com.tqi.kotlinStudy.domain.repository

import br.com.tqi.kotlinStudy.domain.entity.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<Users,Long> {
}