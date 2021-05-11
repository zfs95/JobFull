package com.jobfull.jobFull.companyProfile.repository;

import com.jobfull.jobFull.companyProfile.model.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, UUID> {

}
