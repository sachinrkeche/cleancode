package com.cleanArch.code.enums;

public enum CustomerType {
    /**
     * this enum for regular customer
     */
    REGULAR {
        @Override
        public double CalculateDiscount(double basePrice) {
            return basePrice;
        }
    },
    MEMBER {
        @Override
        public double CalculateDiscount(double basePrice) {
            return basePrice * 0.5;
        }
    },
    VIP {
        @Override
        public double CalculateDiscount(double basePrice) {
            return basePrice * 0.4;
        }
    },
    VVIP {
        @Override
        public double CalculateDiscount(double basePrice) {
            return basePrice * 0.2;
        }
    };


    public abstract double CalculateDiscount(double basePrice);
}

