package br.com.tqi.kotlinStudy.domain.entity


import br.com.tqi.kotlinStudy.domain.enuns.TopicStatus
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
data class Topic(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val title: String,
    val message: String,
    val createonDate: LocalDateTime = LocalDateTime.now(),
    @ManyToOne(fetch = FetchType.LAZY)
    val course: Course,
    @ManyToOne(fetch = FetchType.LAZY)
    val author: Users,
    @Enumerated(value = EnumType.STRING)
    val status: TopicStatus = TopicStatus.UNRESOLVED,
    @OneToMany(mappedBy = "topic")
    val answer: List<Answer> = ArrayList()
)