package com.example.barview;

public class Products {

    private int id;
    private String productname;

    public Products(String _productname) {
        this.productname = _productname;
    }

    public int getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
