package ex39;

class Employee {
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;


    public Employee(String firstName, String lastName, String department,double separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setseparationDate(double separationDate) {
        this.separationDate = separationDate;
    }


    public double getseparationDate() {
        return separationDate;
    }

    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-9s |%-9s %s |%9.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }
}
