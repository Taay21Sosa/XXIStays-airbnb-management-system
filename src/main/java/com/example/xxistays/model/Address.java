package com.example.xxistays.model;

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String postal;

    /**
     * Constructor to initialize a Address object with all attributes.
     * @param country Country where address is located.
     * @param province Province where address is located.
     * @param city City where address is located.
     * @param street Street name and number for address.
     * @param postal Postal code for address.
     */
    public Address(String country, String province, String city, String street, String postal) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.postal = postal;
    }

    /**
     * Getters and Setters (methods) for all attributes.
     * Gets & Sets: country, province, city, street, abd postal for the address.
     */
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getPostal() { return postal; }
    public void setPostal(String postal) { this.postal = postal; }

    /**
     * Returns a string representation for Property object.
     * @return A formatted string with all the properties attributes.
     */
    @Override
    public String toString() {
        return String.format("Country: %s, Province: %s, City: %s, Street: %s, Postal: %s",
                country, province, city, street, postal);
    }

    /**
     * Returns a string format suitable for file storage.
     * @return A comma-separated string with all the properties attributes.
     */
    public String toFileString() {
        return String.format("%s,%s,%s,%s,%s", country, province, city, street, postal);
    }
}
