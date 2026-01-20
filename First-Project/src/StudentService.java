public class StudentService {

    Student students [];
    int count;

    public StudentService(int size) {
        students = new Student[size];
        count=0;
    }

    public void addStudent(Student s) {
        if(count<students.length) {
            students[count] = s;
            count++;
            System.out.println("Student Added Successfully");
        } else {
            System.out.println("Student Array is full");
        }
    }

    public void viewAllStudents() {
        if(count==0) {
            System.out.println("No Students Available");
            return;
        }

        for(int i=0;i<count;i++) {
            System.out.println(students[i]);
        }
    }
    
    public void updateStudent(int id, String name, int age, String address) {
        for(int i=0;i<count;i++) {
            if(students[i].getUid() == id) {
                students[i].setName(name);
                students[i].setAge(age);
                students[i].setAddress(address);
                System.out.println("Student Update Successfully..");
                return;
            }
        }
        System.out.println("Student not found by the given id");
    }
    
    public void deleteStudent(int id) {
        for(int i=0;i<count;i++) {
            if(students[i].getUid()==id) {

                for(int j=i; j<count-1;j++){
                    students[j]=students[j+1];
                }
                students[count-1]=null;
                count--;

                System.out.println("Student Delete Successfully");
                return;
            }

            System.out.println("Student not foudn with given Id:");
        }
    }

}
