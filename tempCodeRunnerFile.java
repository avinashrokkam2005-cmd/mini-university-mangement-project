        f.display();
    }
    else if (n == 3){
      System.out.print("add a new subject : ");
      String a = sc.nextLine();
      sc.nextLine();
      System.out.print("Assign Faculty : ");
      String b = sc.nextLine();
      Course c = new Course();
      c.add(a,b);
      c.display();
    }
    else if (n == 4){
      
      System.out.print("Name : ");
      String a = sc.nextLine();
      sc.nextLine();