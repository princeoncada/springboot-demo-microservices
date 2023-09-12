package com.testapimicroservice.crud.repository

import com.testapimicroservice.crud.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<Company, Int> {
    fun findByName(name: String): Company
}