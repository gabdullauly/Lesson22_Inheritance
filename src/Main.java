import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void getSortStudents (Student[] students){
        for (int i=0; i< students.length-1; i++){
            for (int j=0; j< students.length-i-1; j++){
                if(students[j].getAge()>students[j+1].getAge()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    public static void getSortWorkers (Worker[] workers){
        for (int i=0; i< workers.length-1; i++){
            for (int j=0; j< workers.length-i-1; j++){
                if(workers[j].getName().compareTo(workers[j+1].getName())>0){
                    Worker temp = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = temp;
                }
            }
        }
    }
    public static void main (String[] args){
        Worker worker = new Worker();
        worker.setId(0);
        worker.setAge(35);
        worker.setLogin("z.gabdullauly");
        worker.setPassword("Q123456_");
        worker.setName("Жандос");
        worker.setSurname("Габдуллаулы");
        worker.setSalary(800000);
        String[] subjects = {"docs", "exls", "txt", "png"};
        worker.setSubjects(subjects);


        String[] subjects1 = {"docs1", "exls1", "txt1", "png1"};

        Worker worker1 = new Worker(1, 26, "sam.gabdullauly",
                "Sam123456", "Самал", "Габдулла", 1000000, subjects1);

        Worker worker2 = new Worker(2, 37, "ais", "Ais123456", "Aisana", "Gabdulla", 1200000, subjects);
        Worker worker3 = new Worker(3, 28, "Aino", "Aino123456", "Ainazar", "Gabdulla", 1300000, subjects1);
        Worker worker4 = new Worker(4, 29, "Tume", "T123456", "Tumekul", "Tlepova", 500000, subjects1);

        Student student = new Student();
        student.setId(10);
        student.setAge(38);
        student.setLogin("Erbo");
        student.setPassword("Er123456");
        student.setName("Erbolat");
        student.setSurname("Tlepov");
        String[] courses = {"mers", "toyota", "lex"};
        student.setCourses(courses);

        Student student1 = new Student(11, 19, "Sabyr", "Sa123456", "Sabyrzhan", "Biltash", courses);
        Student student2 = new Student(12, 40, "Alex", "A123456", "Alexis", "Sanches", courses);
        Student student3 = new Student(13, 21, "Mss", "Mes123", "Messi", "Lionel", courses);
        Student student4 = new Student(14, 52, "Kil", "Kil123", "Killian", "Mbappe", courses);

        User[] users = {worker, student, student4, student1, worker2, student2, worker4, worker3, student3, worker1};

        Student[] students;
        Worker[] workers;
        int k = 0;
        int l = 0;
        for (int i=0; i< users.length; i++){
            if(users[i] instanceof Student){        //instanceof - означает является ли этот элемент объектом(экземпляром) класса Student
                k = k + 1;
            }
            if (users[i] instanceof Worker){
                l = l+1;
            }
        }

        students = new Student[k];
        workers = new Worker[l];
        int index = 0;
        int index1 = 0;
        for (int i=0; i<users.length; i++){
            if(users[i] instanceof Student){
                students[index] = (Student) users[i];
                index = index +1;
            }
            if (users[i] instanceof Worker){
                workers[index1] = (Worker) users[i];
                index1++;
            }
        }
        getSortStudents(students);
        System.out.println(Arrays.toString(students));
        getSortWorkers(workers);
        System.out.println(Arrays.toString(workers));







    }
}
