package test03;

@Controller
@RequestMapping("/api/products")
public class ChaewonController {
	@PostMapping()
	public ResponseEntity<?> addProduct(@RequestBody ProductCreateRequest dto) {
	}
	@GetMapping("/{product_no}")
	public ResponseEntity<?> getOneProduct(@PathVariable Long product_no) {
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllProducts() {
	}
	
	@PatchMapping("/{product_no}")
	public ResponseEntity<?> updateProduct(@PathVariable Long product_no,@RequestBody ProductUpdateRequest dto) {
	}
	
	@DeleteMapping("/{product_no}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long product_no) {
	}
}