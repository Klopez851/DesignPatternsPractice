package kl.practice.Behavioral.Visitor.Employees;

import kl.practice.Behavioral.Visitor.Visitors.EmployeeVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Designer implements Employee {
    private String name;
    private String designTool;
    private final int salary =90000 ;

    public Designer(String name, String designTool){
        this.name = name;
        this.designTool=designTool;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
