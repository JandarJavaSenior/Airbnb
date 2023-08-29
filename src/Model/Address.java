package Model;

import Enam.Province;

public class Address {
    private int id;
    private String firstName;
    private Province province;
    private String region;
    private String address;
    private static int idd = 1;

    public Address(String firstName, Province province, String region, String address) {
        this.id = idd++;
        this.firstName = firstName;
        this.province = province;
        this.region = region;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Model.Address\n" +
                "Id: " + id + "\n" +
                "FirstName: '" + firstName + "'\n" +
                "Enam.Province: " + province + "\n" +
                "Region: '" + region + "'\n" +
                "Model.Address: '" + address;
    }

}
