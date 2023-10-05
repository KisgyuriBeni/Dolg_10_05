package models;

public class Employees {
    private String name;
    private String city;
    private String address;
    private String born;
    private int salary;

    public Employees(String name, String city, String address, String born, int salary){
        this.name=name;
        this.city=city;
        this.address=address;
        this.born=born;
        this.salary=salary;
    }
    public Employees(){}
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBorn() {
        return born;
    }
    public void setBorn(String born) {
        this.born = born;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
