import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();

        employee.setName("Tom");
        employee.setPosition("UX/UI");
        employee.setEmpID("0001");

        Project project1 = new Project(" Web A ", "Developing a web application");
        Project project2 = new Project(" Mobile app A ", "Developing a mobile app");
        employee.addProject(project1);
        employee.addProject(project2);

        employee2.setName("Tim");
        employee2.setPosition("FrontEnd");
        employee2.setEmpID("0002");

        Project project3 = new Project(" Web A ", "Developing a web application");

        employee2.addProject(project3);
        
        employee.showDetails();
        employee2.showDetails();
    }
}

interface Person {
    String getName();
    void setName(String newName);
    int getAge();
    void setAge(int newAge);
}

interface Job {
    String getPosition();
    void setPosition(String newPosition);
    String getEmpID();
    void setEmpID(String newEmpID);
}

class Employee implements Person, Job {
    private String name;
    private int age;
    private String position;
    private String empID;
    private ArrayList<Project> myProjects;

    Employee() {
        this.myProjects = new ArrayList<>();
    }

    public void addProject(Project project) {
        this.myProjects.add(project);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public String getEmpID() {
        return this.empID;
    }

    public void setEmpID(String newEmpID) {
        this.empID = newEmpID;
    }

    public void showDetails() {
        System.out.println("*******************");
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("EmpID: " + getEmpID());

        System.out.println("Projects");
        for (Project project : myProjects) {
            System.out.println(project.getProject());
        }
    }
}

class Project extends Employee {
    private String projectName;
    private String descriptions;

    public Project(String projectName, String descriptions) {
        this.projectName = projectName;
        this.descriptions = descriptions;
    }

    public String getProject() {
        return projectName + ": " + descriptions;
    }
}
