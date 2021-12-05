package com.farmaTic.InventarioMS.exceptions;

public class ProductoNotFoundException extends RuntimeException{
    public ProductoNotFoundException(String message) {
        super(message);
    }
    
}

