public class User {
    private int id;
    private String name;
    private long salary;
    private int departmentId;
    private Address address;

    public User() {
    }

    public User(int id, String name, long salary, int departmentId, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return departmentId;
    }

    public void setDepartment(int departmentId) {
        this.departmentId = departmentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
