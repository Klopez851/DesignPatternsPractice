package kl.practice.Behavioral.Visitor.Employees;

import kl.practice.Behavioral.Visitor.Visitors.EmployeeVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Manager implements Employee {
    private String name;
    private int teamSize;
    private final int salary = 140000;

    public Manager(String name, int teamSize){
        this.name= name;
        this.teamSize=teamSize;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
