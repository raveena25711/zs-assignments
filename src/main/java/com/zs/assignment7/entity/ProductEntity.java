package com.zs.assignment7.entity;

/**
 * created getter and setter methods of product properties
 */
    public class ProductEntity {
        private Integer id;
        private String product;
        private String ModelName;
        private String brand;
        private String Material;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getModelName() {
            return ModelName;
        }

        public void setModelName(String modelName) {
            ModelName = modelName;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial() {
            return Material;
        }

        public void setMaterial(String material) {
            Material = material;
        }


    }

