import java.util.Scanner;
import java.util.ArrayList;

class Person {
  public String name ;
  private String id ;
  public String getid(){
    return id;
  }
  
    public String setid(String a){
        this.id = a;
        return id;
    }
  }

class Student extends Person {
    double cgp ;
   
   int year ;
   String dept ;
    void add(String name , String id ,double cg,int year,String dept){
     this.name = name;
     this.setid(id) ;
     this.cgp = cg;
     
     this.year = year;
     this.dept = dept;
    }
    
    public void display(){
        System.out.println();
        System.out.println("--Welcome to Student proflie--");
        System.out.println("Role : Student");
        System.out.println("Name : " + name.toUpperCase());
        System.out.println("ID : "+getid());
        System.out.println("cgp : "+cgp);

        System.out.println("Studying year "+year+" year");
        System.out.println("Department :"+dept.toUpperCase());
    }
}
    class Faculty extends Person {
     String subject ;
     int exp ;
     String marriage;
     void add(String name , String id ,String subject,int exp,String marriage){
     this.name = name;
     this.setid(id) ;
     this.subject = subject;
     this.exp = exp ;
     this.marriage = marriage;
     }
    
    public void display(){
    System.out.println("Welcome to Faculty proflie");
    System.out.println("Role : Faculty");
    System.out.println("Name : "+name.toUpperCase());
    System.out.println("ID : " + getid());
    System.out.println("Teaching subject : "+subject );
    System.out.println("Years of experences : " +exp);
    System.out.println("Marital status :"+ marriage.toUpperCase());
    }
    }

     class Course {
       String sub ;
       String fac ;
      void add(String sub, String fac){
        this.sub = sub;
        this.fac = fac;        
      }
      void display(){
        System.out.println("-- new course created --");
        System.out.println("New added suject : "+ sub);
        System.out.println("Assigned Mr/Miss "+ fac + " to the "+sub);
      }
    }
     class Enroll extends Person {
      // String nam ;
      String course ;
      void add(String name,String id , String course){
        this.name = name;
        this.setid(id);
        this.course = course ;
      }
      void display(){
        System.out.println("--Succesful enroll into new course --");
        System.out.println("This "+name+" Enroll into "+course);
      }

     }
    
    class Directory {
      ArrayList<Student> students = new ArrayList<>();
      ArrayList<Faculty> faculties = new ArrayList<>();
      ArrayList<Course> courses = new ArrayList<>();
      ArrayList<Enroll> enrolls = new ArrayList<>();
      
      // void addstudent(Student st){
      //   students.add(st);
      // }
    void addStudent(Student st){
        students.add(st);
    }
    void addFaculty(Faculty f){
        faculties.add(f);
    }
    void addCourses(Course c){
        courses.add(c);
    }
    
    void addEnrollment(Enroll e){
        enrolls.add(e);
    }      
    void display(){
      System.out.println("----University Directory---");
      if(students.isEmpty()){
        System.out.println(" No student is register ");
      }
      else{
        for(int i = 0; i < students.size(); i++){
          System.out.println("--Student proflies--");
          System.out.println("Student number : "+(i+1));
          System.out.println("Student Name : "+ students.get(i).name);
          System.out.println( "Student id : "+ students.get(i).getid());
          System.out.println( "Student Deparment : "+ students.get(i).dept);
          System.out.println( "Student cgp : "+students.get(i).cgp);          
        }        
      }
      System.out.println();

      if(faculties.isEmpty()){
        System.out.println(" N0 Faculty is register ");
      }
      else{
        for(int i = 0 ; i < faculties.size(); i++){
          System.out.println("--Faculty proflies--");
          System.out.println("Faculty number : "+(i+1));
          System.out.println("Faculty Name : "+faculties.get(i).name);
          System.out.println( "Student id : "+ faculties.get(i).getid());
          System.out.println("Teaching subject : "+faculties.get(i).subject);
          System.out.println(faculties.get(i).exp+" Experience of Mr/Miss "+ faculties.get(i).name);
        }
      }
      System.out.println();
     
    }
      

    }
   public class Main {
   public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);
    Directory di = new Directory();

    while(true){
    System.out.println("-------------------------------------");
    System.out.println("1. Add New Student"); 
    System.out.println("2. Add New Professor"); 
    System.out.println("3. Create Subject & Assign Faculty ");
    System.out.println("4. Enroll Student in new Course ");
    System.out.println("5. Display University Directory ");
    System.out.println("6. Exit");
    System.out.println("-------------------------------------");
    System.out.println();
    System.out.print("enter your choice: ");
    int n = sc.nextInt();
    sc.nextLine();

     
    if(n == 1){
        System.out.print("Name :");
        String a = sc.nextLine();
        System.out.print("ID :");
        String b = sc.nextLine();
        System.out.print("GPA :");
        double c = sc.nextDouble();
        System.out.print("Study of year : ");
        int e = sc.nextInt();
        sc.nextLine();
        System.out.print("Department : ");
        String f = sc.nextLine();
        System.out.println();
        Student st = new Student();
        st.add(a,b,c,e,f);
        di.addStudent(st);
        st.display();   
             
    } 
    else if(n==2){
        System.out.print("Name :");
        String a = sc.nextLine();
        
        System.out.print("ID :");
        String b = sc.nextLine();
        
        System.out.print("Teaching subject :");
        String c = sc.nextLine();
        System.out.print("Experence :");
        int d = sc.nextInt();
        sc.nextLine();
        System.out.print("Marital Status :");
        String e = sc.nextLine();
        System.out.println();
        Faculty f = new Faculty();
        f.add(a,b,c,d,e);
        di.addFaculty(f);
        f.display();
    }
    else if (n == 3){
      System.out.print("add a new subject : ");
      String a = sc.nextLine();
      System.out.print("Assign Faculty : ");
      String b = sc.nextLine();
      Course c = new Course();
      c.add(a,b);
      di.addCourses(c);
      c.display();
    }
    else if (n == 4){
      
      System.out.print("Name : ");
      String a = sc.nextLine();
      
      System.out.print("id : ");
      String b = sc.nextLine();
    
      System.out.print("New course : ");
      String c = sc.nextLine();
      Enroll e = new Enroll();
      e.add(a,b,c);
      di.addEnrollment(e);
      e.display();
    }
    else if(n == 5){
     di.display();
    }
    else if (n == 6){
      System.out.println("Thankyou For Visiting");
      break ;      
      }
      else  {
        System.out.println("Enter a vaild input "); 
    }
    }
   }
}
