import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student[] studentArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 100),
                new Student("차자바", 1, 150),
                new Student("정자바", 3, 200),
                new Student("최자바", 3, 300)
        };

        Stream<Student> stuStream = Stream.of(studentArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                            .thenComparing(Comparator.naturalOrder()))
                            .forEach(System.out::println);

        stuStream = Stream.of(studentArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count=" + stat.getCount());
        System.out.println("sum=" + stat.getSum());
        System.out.println("average=" + stat.getAverage());
        System.out.println("min=" + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}
