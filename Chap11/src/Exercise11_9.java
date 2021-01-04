import java.util.*;

class Student5 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank; // 전교등수
    int classRank; // 반등수

    Student5(String name, int ban, int no, int kor, int eng, int math) {
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
    public int compareTo(Object o) {
        if(o instanceof Student5) {
            Student5 tmp = (Student5)o;
            return tmp.total - this.total;
        } else {
            return -1;
        }
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
                +","+classRank
                ;
    }
}

class ClassTotalComparator implements Comparator<Student5> {
    @Override
    public int compare(Student5 o1, Student5 o2) {
        int compareBan = Integer.compare(o1.ban, o2.ban);
        if(compareBan == 0) {
            return Integer.compare(o1.classRank, o2.classRank);
        }
        return compareBan;
    }
}

class Exercise11_9 {
    public static void calculateClassRank(List list) {
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();
        for(int i=0; i<length; i++) {
            Student5 student = (Student5) list.get(i);
            if(student.ban != prevBan) {
                prevRank = -1;
                prevTotal = -1;
            }
            if(student.total == prevTotal) {
                student.classRank = prevRank;
            }else {

            }



        }

    }

    public static void calculateSchoolRank(List list) {


    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student5("이자바",2,1,70,90,70));
        list.add(new Student5("안자바",2,2,60,100,80));
        list.add(new Student5("홍길동",1,3,100,100,100));
        list.add(new Student5("남궁성",1,1,90,70,80));
        list.add(new Student5("김자바",1,2,80,80,90));
        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}