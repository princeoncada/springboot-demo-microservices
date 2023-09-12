package com.testapimicroservice.crud.controller

import com.testapimicroservice.crud.model.Company
import com.testapimicroservice.crud.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CompanyController {

    @Autowired
    lateinit var companyRepository: CompanyRepository

    @PostMapping("/saveCompany")
    fun save(@RequestBody company: Company): String {
        companyRepository.save(company)
        return "Company details saved!"
    }

    @GetMapping("/getAll")
    fun getAllCompany(): List<Company> {
        return companyRepository.findAll()
    }

    @GetMapping("/getCompany/{name}")
    fun getCompany(@PathVariable name: String): Company {
        return companyRepository.findByName(name)
    }

    @DeleteMapping("/delete/{id}")
    fun deleteCompany(@PathVariable id: Int): String {
        companyRepository.deleteById(id)
        return "Company details deleted!"
    }
}