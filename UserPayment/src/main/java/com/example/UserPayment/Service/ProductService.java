package com.example.UserPayment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserPayment.Entity.Product;
import com.example.UserPayment.Repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        double sellingPrice = calculateSellingPrice(product.getCostPrice(), product.getTax(), product.getDiscount());
        product.setSellingPrice(sellingPrice);
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product existingProduct = getProductById(id);
        if (existingProduct != null) {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setCostPrice(updatedProduct.getCostPrice());
            existingProduct.setTax(updatedProduct.getTax());
            existingProduct.setDiscount(updatedProduct.getDiscount());
            double sellingPrice = calculateSellingPrice(existingProduct.getCostPrice(), existingProduct.getTax(), existingProduct.getDiscount());
            existingProduct.setSellingPrice(sellingPrice);
            return productRepository.save(existingProduct);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    
   
    private double calculateSellingPrice(double costPrice, double tax, double discount) {
    	double sellingPrice=costPrice+(discount-tax);
    	return sellingPrice;
       
    }
}