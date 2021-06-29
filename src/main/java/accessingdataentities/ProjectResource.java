package accessingdataentities;

import javax.persistence.*;

@Entity
@Table(name="projectResource")
public class ProjectResource {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="projectResourceID")
    private int projectResourceID;

    @Column(name="projectResourceName")
    private String projectResourceName;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "projectID"),
            @JoinColumn(name = "resourceID")
    })





    private Project project;
    private Resource resource;

    protected ProjectResource() {

    }
    public ProjectResource(int projectResourceID, String projectResourcename){
        this.projectResourceName = this.projectResourceName;
        this.projectResourceID = projectResourceID;
    }

    public int getProjectResourceID() {
        return projectResourceID;
    }

    public String getProjectResourceName() {
        return projectResourceName;
    }

    public void setProjectResourceID(int projectResourceID) {
        this.projectResourceID = projectResourceID;
    }

    public void setProjectResourceName(String projectResourcename) {
        this.projectResourceName = projectResourcename;
    }
    //FK?
    public Project getProject(){
        return project;
    }
    public void setProject(Project project){
        this.project= project;
    }

    public Resource getResource(){
        return resource;
    }

    public void setResource(){
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "projectResourcename is " + projectResourceName;
    }


}