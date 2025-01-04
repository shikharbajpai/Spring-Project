package org.manyToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Projects {
    @Id
    private int project_id;
    private String project_name;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Projects(int project_id, String project_name, List<Employee> employees) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.employees = employees;
    }

    public Projects() {
    }

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
