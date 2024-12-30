package streamapi.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOddPartition = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even numbers: " + evenOddPartition.get(true));
        System.out.println("Odd numbers: " + evenOddPartition.get(false));

    }
}
