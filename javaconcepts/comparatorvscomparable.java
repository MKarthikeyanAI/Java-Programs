package javaconcepts;
import java.util.*;

class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return "Student [age="+age+", name="+name+"]";
    }
}

public class comparatorvscomparable {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Comparator<String> coms = new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                if(o1.length()>o2.length()){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Comparator<Student> comst = new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                if(o1.age>o2.age){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };


        List<Student> stu = new ArrayList<>();
        stu.add(new Student(21,"Namin"));
        stu.add(new Student(18,"ganin"));
        stu.add(new Student(20,"srfgh"));
        stu.add(new Student(19,"tredf"));

        Collections.sort(stu,comst);



        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums,com);

        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("cat");
        str.add("eg");

        Collections.sort(str,coms);


        System.out.println(nums);
        System.out.println(stu);
        System.out.println(str);

        for(Student s:stu){
            System.out.println(s);
        }
    }
}
