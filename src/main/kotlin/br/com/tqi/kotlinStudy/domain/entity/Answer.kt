package br.com.tqi.kotlinStudy.domain.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Answer (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val message: String,
    val createonDate: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    val author: Users,
    @ManyToOne(fetch = FetchType.LAZY)
    val topic: Topic,
    val solution: Boolean
    )
