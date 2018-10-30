public class ProjectClass {
  private String name;
  private String description;
  public ProjectClass() {
    this.name = "New Project";
    this.description = "Description of " + this.name;
  }
  public ProjectClass(String name) {
    this.name = name;
    this.description = "Description of " + this.name;
  }
  public ProjectClass(String name, String description) {
    this.name = "New Project";
    this.description = description;
  }
  public String GetName() {
    return this.name;
  }
  public String GetDescription() {
    return this.description;
  }
  public void SetName(String name) {
    this.name = name;
  }
  public void SetDescription(String description) {
    this.description = description;
  }
}
