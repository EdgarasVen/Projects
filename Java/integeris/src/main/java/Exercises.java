import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises implements lt.itakademija.exam.Exercises {

    public Integer findSmallest(List<Integer> list) {
        return list.stream()
                .mapToInt(value -> value)
                .min()
                .orElse(0);
    }

    public Integer findLargest(List<Integer> list) {
        return list.stream()
                .mapToInt(value -> value)
                .max()
                .orElse(0);
    }

    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    public List<Integer> consume(Iterator<Integer> iterator) {
        return null;
    }

    public int computeSumOfNumbers(int i) {
        return IntStream.rangeClosed(1, i)
                .sum();
    }

    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        return IntStream.rangeClosed(1, i)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .mapToInt(e -> e)
                .filter(numberFilter::accept)
                .sum();
        // Ne veikia su computeNumbersUpTo nes ne skaicioja paskutini skaiciu
    }

    public List<Integer> computeNumbersUpTo(int i) {
        return IntStream.range(1, i)
                .boxed().collect(Collectors.toList());
    }

    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, map -> Math.toIntExact(map.getValue())));
        // Collectors.counting() returning Long , so need to recollect map and cast Long to Integer
    }

    public IntegerGenerator createIntegerGenerator(int numberStart, int numberFinish) {
        return new IntegerGenerator() {
            int start = numberStart;

            @Override
            public Integer getNext() {

                if (start > numberFinish) return null;
                return start++;
            }
        };
    }

    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return () -> {
            Integer num;
            while (true) {
                num = integerGenerator.getNext();
                if (num == null) return null;
                if (numberFilter.accept(num)) return num;
            }
        };

    // Second option with object create

    /*public IntegerGenerator createIntegerGenerator(int numberStart, int numberFinish) {
        return new Generator(numberStart,numberFinish);
    }

    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new Generator(integerGenerator,numberFilter);
    }*/
    }
}
