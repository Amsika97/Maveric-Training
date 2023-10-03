package design_pattern_assessment;

import java.util.ArrayList;
import java.util.List;

public class NewProductServiceImpl implements INewProductService {
	@Override
	public ProductDetails getProductById(long id) {
		Product product = ProductDB.getStore().get(id);
		return new ProductDetails(product.getName(), product.getPrice());
	}

	@Override
	public List<ProductDetails> fetchAllProducts() {
		List<Product> list = new ArrayList<>(ProductDB.getStore().values());
		List<ProductDetails> productDetailsList = new ArrayList<>();
		for (Product p : list) {
			productDetailsList.add(new ProductDetails(p.getName(), p.getPrice()));
		}
		return productDetailsList;
	}
}
