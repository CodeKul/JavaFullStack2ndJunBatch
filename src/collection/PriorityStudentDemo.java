package collection;

import java.util.PriorityQueue;

public class PriorityStudentDemo {
    public static void main(String[] args) {
        PriorityQueue<Stud> queue = new PriorityQueue<>();
        queue.add(new Stud("Amit",9.7));
        queue.add(new Stud("Purva",6.8));
        queue.add(new Stud("Gaurav",8.8));
        queue.add(new Stud("Gauri",6.8));
        for (Stud s: queue){
            System.out.println(s.toString());
        }
       // queue.remove();
        System.out.println(queue.peek().toString());
        System.out.println(queue);


    }
}

class Stud implements Comparable<Stud>{
    private String name;
    private Double cgpa;

    public Stud(String name, Double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Stud s) {
        if (cgpa > s.cgpa)
        return 1;
        return 0;
    }
}
