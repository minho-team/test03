package test03;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/product")
public class Controller {
	
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody ProductCreateRequest dto) {
		
	}
	@GetMapping("/{product_no}")
	public ResponseEntity<?> getOneProduct(@PathVariable Long product_no) {
		
	}
	@GetMapping
	public ResponseEntity<?> getAllProduct() {
		
	}
	@PatchMapping("/{product_no}")
	public ResponseEntity<?> updateProduct(@PathVariable Long product_no,@RequestBody ProductUpdateRequest dto) {
		
	}
	@DeleteMapping("/{product_no}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long product_no) {
		
	}
	
	
	
	
	
}
