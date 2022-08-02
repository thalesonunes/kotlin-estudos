package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (val CustomerRepository: CustomerRepository) {

    fun getAll(name: String?): List<CustomerModel>{

        // Caso haja o parâmetro name
        name?.let { return CustomerRepository.findByNameContaining(it)}

        // Se não houver parâmetro
        return CustomerRepository.findAll().toList()
    }

    fun getCustomer(id: Int): CustomerModel {
        return CustomerRepository.findById(id).orElseThrow()
    }

    fun create(customer: CustomerModel){
        CustomerRepository.save(customer)
    }

    fun update(customer: CustomerModel) {
        if (!CustomerRepository.existsById(customer.id!!)){
            throw Exception()
        }
        CustomerRepository.save(customer)
    }

    fun delete(id: Int) {
        if (!CustomerRepository.existsById(id)){
            throw Exception()
        }
        CustomerRepository.deleteById(id)
    }
}