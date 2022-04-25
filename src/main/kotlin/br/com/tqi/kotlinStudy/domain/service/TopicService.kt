package br.com.tqi.kotlinStudy.domain.service

import br.com.tqi.kotlinStudy.domain.entity.Topic
import br.com.tqi.kotlinStudy.domain.exception.TopicNotFoundException
import br.com.tqi.kotlinStudy.domain.repository.TopicRepository
import org.springframework.stereotype.Service

@Service
class TopicService (private val repository: TopicRepository,
                    private val notFoundMessage: String = "Topic Not Found"){

    fun findById(id: Long): Topic {
        return repository.findById(id).orElseThrow{TopicNotFoundException(notFoundMessage)}
    }
}