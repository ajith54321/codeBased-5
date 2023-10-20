package lulu02_CodeBased_Week5.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import jakarta.persistence.EntityNotFoundException;
import lulu02_CodeBased_Week5.Entity.DamagedProducts;
import lulu02_CodeBased_Week5.Repository.ReturnProductRepo;

@RestController
public class ReturnProductsController {

	@Autowired
	ReturnProductRepo rr;
	
	@GetMapping("rr/viewProducts")
	public List<DamagedProducts> getValue(){
		return rr.findAll();
	}
	@PostMapping("rr/addProducts")
	public DamagedProducts createProducts(@RequestBody DamagedProducts prod) {
		return rr.save(prod);
	}
	@PutMapping("rr/updateProducts/{id}")
	public DamagedProducts updatePurchase(@PathVariable int id, @RequestBody DamagedProducts updatedProduct) {

        Optional<DamagedProducts> existingProduct = rr.findById(id);
        
	    if (existingProduct.isPresent()) {
	    	DamagedProducts productToUpdate = existingProduct.get();
	        if (updatedProduct.getProduct_name() != null) {
	            productToUpdate.setProduct_name(updatedProduct.getProduct_name());
	        }
	        if (updatedProduct.getRtor() != null) {
	            productToUpdate.setRtor(updatedProduct.getRtor());
	        }
	        if (updatedProduct.getCustomer_name() != null) {
	            productToUpdate.setCustomer_name(updatedProduct.getCustomer_name());
	        }
	        return rr.save(productToUpdate);
	    } else {

	        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");
	    }
	}

	@DeleteMapping("rr/deleteProduct/{id}")
	public void deleteProducts (@PathVariable ("id") Integer id) {
		rr.deleteById(id);
	}
}
