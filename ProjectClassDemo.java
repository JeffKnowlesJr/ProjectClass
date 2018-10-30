public class ProjectClassDemo {
  public static void main(String[] args) {
    ProjectClass projectOne = new ProjectClass();
    System.out.print(projectOne.GetName());
    System.out.print(projectOne.GetDescription());
    ProjectClass projectTwo = new ProjectClass("Project Two");
    System.out.print(projectTwo.GetName());
    System.out.print(projectTwo.GetDescription());
    ProjectClass projectThree = new ProjectClass("Project Three","The best project ever!");
    System.out.print(projectThree.GetName());
    System.out.print(projectThree.GetDescription());
  }
}
