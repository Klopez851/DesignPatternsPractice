package kl.practice.Behavioral.Visitor;
/*
============================================================
VISITOR DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a system for a company that has different
types of employees.

There are:

    Developer
    Manager
    Designer

Each employee has different information.

For example:

    Developer
        -> programmingLanguage

    Manager
        -> teamSize

    Designer
        -> designTool


The company wants to perform different operations on these
employees.

For now, you need to calculate their yearly bonus.


The problem:

You don't want to put all bonus-calculation logic inside
the employee classes.

Instead, use the Visitor design pattern.


YOUR TASK:

Create:

    1. Employee interface

       It should have a method such as:

           accept(EmployeeVisitor visitor)


    2. Developer

    3. Manager

    4. Designer


    5. EmployeeVisitor interface

       It should have a visit method for each employee type:

           visit(Developer developer)
           visit(Manager manager)
           visit(Designer designer)


    6. BonusVisitor

       This visitor should calculate the bonus for each
       employee type.


The basic structure should look like:

                   EmployeeVisitor
                  /       |       \
                 /        |        \
                v         v         v
           Developer   Manager   Designer


And:

                  Employee
                     |
                  accept()
                     |
                     v
              EmployeeVisitor
                     |
                     v
                  visit()


EXPECTED USAGE:

    Employee developer = new Developer(...);

    EmployeeVisitor bonusVisitor = new BonusVisitor();

    developer.accept(bonusVisitor);


The correct visit method should ultimately be called:

    BonusVisitor
         |
         | visit(Developer)
         v
      Developer


IMPORTANT:

Notice that BonusVisitor has different visit methods:

    visit(Developer)
    visit(Manager)
    visit(Designer)


This allows the visitor to implement different behavior
for each concrete employee type.


YOUR GOAL:

Make the following work:

    Developer developer = new Developer(...);
    Manager manager = new Manager(...);
    Designer designer = new Designer(...);

    BonusVisitor visitor = new BonusVisitor();

    developer.accept(visitor);
    manager.accept(visitor);
    designer.accept(visitor);


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. What is the Visitor?

2. What are the Elements?

3. Which class is responsible for accepting the visitor?

4. Why does Employee need accept()?

5. Why doesn't EmployeeVisitor simply have:

       visit(Employee employee)

   instead of one method per concrete employee type?

6. What is the purpose of:

       developer.accept(visitor)

7. Why does accept() call:

       visitor.visit(this)

8. What type does "this" represent inside Developer?

9. Why is this pattern sometimes described as involving
   "double dispatch"?

10. Where does the bonus calculation logic live?

11. What happens if you add another operation, such as:

       GenerateReportVisitor

   Does Developer need to change?


============================================================
FOLLOW-UP EXERCISE 2 — ADD A NEW OPERATION
============================================================

Now the company wants another operation.

In addition to calculating bonuses, they want to generate
an employee report.


Create:

    ReportVisitor


It should implement:

    EmployeeVisitor


It should produce different information depending on the
employee type.

For example:

    Developer:
        Name
        Salary
        Programming Language

    Manager:
        Name
        Salary
        Team Size

    Designer:
        Name
        Salary
        Design Tool


The important requirement:

DO NOT modify:

    Developer
    Manager
    Designer


You should only need to create the new Visitor.


You should now have:

    BonusVisitor

and:

    ReportVisitor


Both can operate on the same employee objects.


Conceptually:

                    Employee
                       |
             +---------+---------+
             |                   |
             v                   v
        BonusVisitor       ReportVisitor
             |                   |
             v                   v
        Calculate bonus     Generate report


EXPECTED USAGE:

    Employee developer = new Developer(...);

    EmployeeVisitor bonusVisitor = new BonusVisitor();
    EmployeeVisitor reportVisitor = new ReportVisitor();

    developer.accept(bonusVisitor);
    developer.accept(reportVisitor);


The same Developer object can now support multiple
operations without having those operations built directly
into Developer.


CONSTRAINTS:

1. Do NOT add bonus-related methods to Developer.

2. Do NOT add report-related methods to Developer.

3. Do NOT add a large switch statement based on employee
   type.

4. BonusVisitor should contain bonus logic.

5. ReportVisitor should contain report logic.

6. Employee classes should contain employee-related state
   and behavior, not every possible operation the company
   might perform on them.


BONUS:

Add another visitor:

    TaxVisitor


It should calculate the amount of tax for each employee.

Now you have:

    BonusVisitor
    ReportVisitor
    TaxVisitor


All operating on:

    Developer
    Manager
    Designer


Think about how easy it is to add a NEW OPERATION.


EXTRA BONUS:

Now reverse the problem.

Imagine the company adds a completely new employee type:

    Intern


What happens?

You'll probably discover an important tradeoff of the
Visitor pattern.

You will need to think about:

    Developer
    Manager
    Designer
    Intern

and how each Visitor handles the new type.


Ask yourself:

    "Is Visitor good when I frequently add new operations?"

and:

    "Is Visitor good when I frequently add new element types?"


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Visitor pattern solve?

2. What is the Visitor?

3. What is the Element?

4. Why does the Element have an accept() method?

5. Why does EmployeeVisitor have one visit method per
   concrete employee type?

6. What is double dispatch?

7. Why is Visitor useful when adding new operations?

8. What happens when you add a new Visitor?

9. Do the existing Employee classes need to change when
   adding a new Visitor?

10. What happens when you add a new Employee type?

11. Why can adding a new Employee type be more difficult?

12. What is the main tradeoff of the Visitor pattern?

13. How is Visitor different from Strategy?

14. How is Visitor different from Iterator?

15. Where might you see Visitor in real software?

    Think about:

        - Compilers
        - Abstract syntax trees
        - File systems
        - Document processing
        - Object structures
        - Code analysis
        - Serialization

16. Give one situation where Visitor makes sense.

17. Give one situation where Visitor would probably be
    unnecessary complexity.


============================================================
*/
public class main {
}
