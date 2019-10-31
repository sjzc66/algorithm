package com.sjzc.javaTest.utils;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author zhaochong
 * @Description
 * @create: 2019-09-04 11:45
 **/
public class RandomUtil {

    private static List<Range> lst = new ArrayList<>();

    static {
        lst.add(new Range(1, 5,-1));
        lst.add(new Range(2, 10,-1));
        lst.add(new Range(3, 75,-1));
        lst.add(new Range(5, 10,-1));
        lst.add(new Range(10, 0,-1));
        lst.add(new Range(20, 0,-1));
        lst.add(new Range(88, 100, 10));
        refresh();
    }

    private static Double generate() {
        Random random = new Random();
        double v = random.nextDouble();
        List<Range> collect = lst.stream().filter(s -> s.getRatio() > v).collect(Collectors.toList());
        Range range = collect.get(0);
        if (range.getMax_count() > 0) {
            range.setMax_count(range.getMax_count() - 1);
            if (range.getMax_count() == 0) {
                range.setWeight(0);
                refresh();
            }
        }
        return range.getValue();
    }

    private static void refresh() {
        Double total = lst.stream().collect(Collectors.summingDouble(Range::getWeight));
        lst.forEach(s -> s.setRatio(s.getWeight() / total));
        Double current = 0.0;
        for (int i = 0; i < lst.size(); i++) {
            current += lst.get(i).getRatio();
            lst.get(i).setRatio(current);
        }
    }


    public static void main(String[] args) throws Exception {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int count10 = 0;
        int count88 = 0;
        for (int i = 0; i < 10000; i++) {
            Double value = RandomUtil.generate();
            if (1 == value) {
                count1++;
            }
            if (2 == value) {
                count2++;
            }
            if (3 == value) {
                count3++;
            }
            if (5 == value) {
                count5++;
            }
            if (10 == value) {
                count10++;
            }
            if (88 == value) {
                count88++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count5);
        System.out.println(count10);
        System.out.println(count88);
    }
}

@Data
class Range {
    private double value;
    private int weight;
    private int max_count;
    private double ratio;

    public Range(double value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public Range(double value, int weight, int max_count) {
        this.value = value;
        this.weight = weight;
        this.max_count = max_count;
    }
}
