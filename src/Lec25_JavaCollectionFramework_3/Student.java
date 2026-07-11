package Lec25_JavaCollectionFramework_3;


public class Student implements Comparable<Student>{
    public int age;

    public String name;

    public int weight;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }

    Student(int age, String name, int weight){
        this.age = age;
        this.name = name ;
        this.weight = weight;
    }



    @Override
    public int compareTo(Student that) {
        // this method is called for the current object
        // we will define our sorting logic here

        // sort on basis of age
        return this.age -  that.age;

    }
}
