package br.com.tqi.kotlinStudy.api.controller

import br.com.tqi.kotlinStudy.domain.entity.Topic
import br.com.tqi.kotlinStudy.domain.service.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicService) {

    @GetMapping("/{topicId}")
    fun findById(@PathVariable topicId: Long): Topic{
        return service.findById(topicId);
    }


}