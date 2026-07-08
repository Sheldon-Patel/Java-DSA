package Lec24_JavaCollectionFramework_2;

import java.util.Objects;

public class Student {
     public int rollNo;

     public String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNo, String name){
         this.name= name;
         this.rollNo = rollNo;

     }

     // name can be same but rolno are different;
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
