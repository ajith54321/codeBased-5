package lulu02_CodeBased_Week5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lulu02_CodeBased_Week5.Entity.DamagedProducts;

public interface ReturnProductRepo extends JpaRepository<DamagedProducts, Integer>{

}
