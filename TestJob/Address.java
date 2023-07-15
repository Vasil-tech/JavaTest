public class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;
    private String other;

    public Address(String country, String city, String street, String house, String apartment, String other){
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
        this.other = other;
    }
}
