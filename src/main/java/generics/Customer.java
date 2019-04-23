package generics;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
@Getter
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private BigDecimal salary;
    private static Integer c = 1;

    {
        id = c++;
    }

    public Integer getId() {
        return id;
    }

    public Customer(String firstName, String lastName, Integer age, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = new BigDecimal(salary);
    }

    public Customer(String firstName, String lastName, Integer age, Integer salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = new BigDecimal(salary);
    }


}
