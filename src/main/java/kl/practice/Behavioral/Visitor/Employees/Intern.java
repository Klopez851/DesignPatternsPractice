package kl.practice.Behavioral.Visitor.Employees;

import kl.practice.Behavioral.Visitor.Visitors.EmployeeVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Intern implements Employee{
    private String name;
    private int trainingDuration;
    private int pay= 1000;

    public Intern(String name, int trainingDuration){
        this.name=name;
        this.trainingDuration=trainingDuration;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
