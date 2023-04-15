package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.ContactUs;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Integer>{

}
