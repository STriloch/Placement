class College {
    public int aicteid = 720722104;

    public void display() {
        System.out.println("AICTE ID: " + aicteid);
    }
}

class Depts extends College {
    public int Deptid = 104;


    public void disp() {
        System.out.println("Department ID: " + Deptid);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Depts dept = new Depts();
        dept.display(); 
        dept.disp();
    }
}
