package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductSeviceImpl implements ProductService{
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Máy Tính","Điện Tử"));
        products.put(2,new Product(2,"Điện Thoại","Điện Tử"));
        products.put(3,new Product(3,"Gạo","Thực phẩm"));
        products.put(4,new Product(4,"Doraemon","Sách"));
        products.put(5,new Product(5,"Cá","Thực phẩm"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
