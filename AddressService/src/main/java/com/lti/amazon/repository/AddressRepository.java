package com.lti.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.lti.amazon.entity.Address;

@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long>{

	@Query(value="SELECT * FROM Address sd WHERE sd.address_id=?1",nativeQuery=true)
	Address findByAddressId(long addressid);
	
	/*@Modifying
	@Transactional
	@Query("UPDATE Address d SET d.employee_id=:employee_id, 
	d.addressType=:addressType, 
	d.country=:country, 
	d.state=:state, 
	d.city=:city, 
	d.address1=:address1, 
	d.address2=:address2, 
	d.address3=:address3,	
	d.address4=:address4, 
	d.postalCode=:postalCode, 
	d.county=:county, 
	d.effectiveDate=:effectiveDate
	WHERE d.address_id=:address_id")
	
	public int updateById(@Param("employee_id") long employee_id, 
	@Param("addressType") String addressType, 
	@Param("country") String country, 
	@Param("state") String state,
	@Param("city") String city, 
	@Param("address1") String address1,
	@Param("address2") String address2,
	@Param("address3") String address3,
	@Param("address4") String address4,
	@Param("postalCode") String postalCode,
	@Param("county") String county,
*/
}
