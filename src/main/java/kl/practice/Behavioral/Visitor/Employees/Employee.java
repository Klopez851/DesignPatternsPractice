package kl.practice.Behavioral.Visitor.Employees;

import kl.practice.Behavioral.Visitor.Visitors.EmployeeVisitor;

public interface Employee {
    void accept(EmployeeVisitor visitor);
}
