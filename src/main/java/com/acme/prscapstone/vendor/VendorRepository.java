package com.acme.prscapstone.vendor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Integer>{
	Vendor findByCode(String code);
}