package br.com.tqi.kotlinStudy.domain.repository

import br.com.tqi.kotlinStudy.domain.entity.Topic
import org.springframework.data.jpa.repository.JpaRepository

interface TopicRepository: JpaRepository<Topic,Long> {
}