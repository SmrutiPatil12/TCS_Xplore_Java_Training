package Encapsulation;

public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public static void main(String[] args) {
        EncapTest emp = new EncapTest();
        emp.setName("Smruti Patil");
        emp.setIdNum("EMP001");
        emp.setAge(30);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getIdNum());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
