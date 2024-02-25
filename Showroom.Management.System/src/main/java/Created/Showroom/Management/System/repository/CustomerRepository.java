package Created.Showroom.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Created.Showroom.Management.System.entity.CustomerEntity;



@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
