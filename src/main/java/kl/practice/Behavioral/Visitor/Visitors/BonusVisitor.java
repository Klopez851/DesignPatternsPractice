package kl.practice.Behavioral.Visitor.Visitors;

import kl.practice.Behavioral.Visitor.Employees.Designer;
import kl.practice.Behavioral.Visitor.Employees.Developer;
import kl.practice.Behavioral.Visitor.Employees.Intern;
import kl.practice.Behavioral.Visitor.Employees.Manager;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BonusVisitor implements EmployeeVisitor {
    @Override
    public void visit(Developer developer) {
        System.out.println((int) (developer.getSalary() * .10));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println((int) (manager.getSalary() * .15));
    }

    @Override
    public void visit(Designer designer) {
        System.out.println((int) (designer.getSalary() * .08));
    }

    @Override
    public void visit(Intern intern) {
        System.out.println("Interns get no yearly bonus");
    }
}
