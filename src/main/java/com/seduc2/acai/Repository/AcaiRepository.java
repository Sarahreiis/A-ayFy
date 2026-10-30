package com.seduc2.acai.Repository;

import com.seduc2.acai.entity.Acai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcaiRepository extends JpaRepository<Acai, Long >{

}
