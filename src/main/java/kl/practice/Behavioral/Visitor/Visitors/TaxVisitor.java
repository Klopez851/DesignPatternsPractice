package kl.practice.Behavioral.Visitor.Visitors;

import kl.practice.Behavioral.Visitor.Employees.Designer;
import kl.practice.Behavioral.Visitor.Employees.Developer;
import kl.practice.Behavioral.Visitor.Employees.Intern;
import kl.practice.Behavioral.Visitor.Employees.Manager;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TaxVisitor implements EmployeeVisitor{
    @Override
    public void visit(Developer developer) {
        System.out.printf("developer %s yearly tax: %d\n", developer.getName(),(int) (developer.getSalary()*.37));
    }

    @Override
    public void visit(Manager manager) {
        System.out.printf("manager %s yearly tax: %d\n", manager.getName(),(int) (manager.getSalary()*.37));
    }

    @Override
    public void visit(Designer designer) {
        System.out.printf("designer %s yearly tax: %d\n", designer.getName(),(int) (designer.getSalary()*.37));
    }

    @Override
    public void visit(Intern intern) {
        System.out.printf("intern %s yearly tax: %d\n", intern.getName(),(int) (intern.getPay()*.37));

    }
}
