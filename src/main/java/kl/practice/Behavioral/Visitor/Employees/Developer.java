package kl.practice.Behavioral.Visitor.Employees;

import kl.practice.Behavioral.Visitor.Visitors.EmployeeVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Developer implements Employee {
    private String name;
    private String programmingLanguage;
    private final int salary = 120000;

    public Developer(String name, String programmingLanguage){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
