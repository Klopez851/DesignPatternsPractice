package kl.practice.Behavioral.Visitor.Visitors;

import kl.practice.Behavioral.Visitor.Employees.Designer;
import kl.practice.Behavioral.Visitor.Employees.Developer;
import kl.practice.Behavioral.Visitor.Employees.Intern;
import kl.practice.Behavioral.Visitor.Employees.Manager;

public interface EmployeeVisitor {
    void visit(Developer developer);
    void visit(Manager manager);
    void visit(Designer designer);
    void visit(Intern intern);
}
