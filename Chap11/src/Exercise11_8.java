import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student4 implements Comparable<Student4> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;

    Student4(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    @Override
    public int compareTo(Student4 tmp) {
        return Integer.compare(tmp.getTotal(), this.getTotal());
    }

    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank
                ;
    }
}

class Exercise11_8 {
    public static void calculateSchoolRank(List<Student4> list) {
        Collections.sort(list);
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for(int i=0; i<length; i++) {
            Student4 student = list.get(i);
            if(student.getTotal() == prevTotal) {
                student.schoolRank = prevRank;
            }else {
                student.schoolRank = i + 1;
            }
            prevTotal = student.getTotal();
            prevRank = student.schoolRank;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList();
        list.add(new Student4("이자바",2,1,70,90,70));
        list.add(new Student4("안자바",2,2,60,100,80));
        list.add(new Student4("홍길동",1,3,100,100,100));
        list.add(new Student4("남궁성",1,1,90,70,80));
        list.add(new Student4("김자바",1,2,80,80,90));
        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
