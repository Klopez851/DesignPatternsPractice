package kl.practice.Behavioral.Visitor.Visitors;

import kl.practice.Behavioral.Visitor.Employees.Designer;
import kl.practice.Behavioral.Visitor.Employees.Developer;
import kl.practice.Behavioral.Visitor.Employees.Intern;
import kl.practice.Behavioral.Visitor.Employees.Manager;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ReportVisitor implements EmployeeVisitor{
    @Override
    public void visit(Developer developer) {
        System.out.printf("Developer report:\n-name: %s\n-Salary: %d\n-Programming Language: %s\n",
                developer.getName(),developer.getSalary(),developer.getProgrammingLanguage());
    }

    @Override
    public void visit(Manager manager) {
        System.out.printf("Manager report:\n-name: %s\n-Salary: %d\n-Team size: %s\n",
                manager.getName(),manager.getSalary(),manager.getTeamSize());
    }

    @Override
    public void visit(Designer designer) {
        System.out.printf("Designer report:\n-name: %s\n-Salary: %d\n-Design Tool: %s\n",
                designer.getName(),designer.getSalary(),designer.getDesignTool());
    }

    @Override
    public void visit(Intern intern) {
        System.out.printf("Intern report:\n-name: %s\n-Pay (per month): %d\n-Training Duration (months): %s\n",
                intern.getName(),intern.getPay(),intern.getTrainingDuration());
    }
}
