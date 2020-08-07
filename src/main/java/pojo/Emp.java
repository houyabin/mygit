package pojo;


public class Emp {
    private String empName;
    private Integer empAge;

    public Emp() {
    }

    public Emp(String empName, Integer empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                '}';
    }
}
