import java.time.LocalDate;

public class Employee {

    private String name;
    private Long id;
    private Double money;
    private Double monthlySalary;
    private boolean fullHours;
    private LocalDate birthday;
    private Integer age;

    public Employee(String name, Double money, Double monthlySalaray, boolean fullHours, LocalDate birthday, Long id) {
        this.name = name;
        this.money = money;
        this.monthlySalary = monthlySalaray;
        this.fullHours = fullHours;
        this.birthday = birthday;
        this.age = birthday.compareTo(LocalDate.now());
        this.id = id;
    }

    public Employee(Long id, Double money, Double monthlySalaray, boolean fullHours, LocalDate birthday) {
        this.id = id;
        this.money = money;
        this.monthlySalary = monthlySalaray;
        this.fullHours = fullHours;
        this.birthday = birthday;

    }

    public void getOneMonthPay(){
        this.money += this.monthlySalary;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public boolean isFullHours() {
        return fullHours;
    }

    public void setFullHours(boolean fullHours) {
        this.fullHours = fullHours;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
