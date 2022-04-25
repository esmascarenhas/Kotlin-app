package br.com.tqi.kotlinStudy.domain.repository

import br.com.tqi.kotlinStudy.domain.entity.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository: JpaRepository<Course, Long> {
}