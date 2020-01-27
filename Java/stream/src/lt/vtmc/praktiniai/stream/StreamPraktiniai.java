package lt.vtmc.praktiniai.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
        return numbers.stream()
                .map(num->(int)Math.sqrt(num))
                .collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        return users.stream()
                .map(User::getAge)
                .collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream()
                .map(User::getAge)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users){
        return (int)users.stream()
                .filter(user->user.getAge()>25)
                .count();
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream()
                .mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream()
                .filter(number-> number>(toSkip))
                .collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream()
                .map(name->{
                    String[] a =name.split(" ");
                    return a[0];
                })
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names){
        return names.stream()
                .map(name->name.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    public static Integer getMaxAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .max()
                .orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .min()
                .orElse(0);
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream()
                .anyMatch(user->user.getAge()==age);
    }

    public static boolean noneMatch(List<User> users, int age){
        return users.stream()
                .noneMatch(user -> user.getAge()==age);
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        return Stream.iterate(2,x->x+1)
                .filter(StreamPraktiniai::isPrime)
                .limit(10)
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        return Stream.generate(new Random()::nextInt)
                .limit(10)
                .collect(Collectors.toList());
    }

    public static User findOldest(List<User> users){
        return users.stream()
                .max(Comparator.comparing(User::getAge))
                .orElse(null);
    }

    public static int sumAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .sum();
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream 
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html
    
    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        return users.stream()
                .collect(partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        return users.stream()
                .collect(groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream()
                .collect(groupingBy(User::isMale,groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream()
                .collect(groupingBy(User::isMale,counting()));
    }
        
    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        return users.stream()
                .collect(Collectors.summarizingInt(User::getAge));
    }

}
