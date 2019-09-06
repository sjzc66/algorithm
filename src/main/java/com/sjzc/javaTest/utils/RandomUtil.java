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
        lst.add(new Range(1, 0.05));
        lst.add(new Range(2, 0.1));
        lst.add(new Range(3, 0.75));
        lst.add(new Range(5, 0.1));
        lst.add(new Range(10, 0.0));
        lst.add(new Range(20, 0.0));
        lst.add(new Range(88, 0.0));
    }

    private static Integer generate() throws Exception {
        Double total = lst.stream().collect(Collectors.summingDouble(Range::getWeight));
        lst.forEach(s -> s.setRatio(s.getWeight() / total));
        Double current = 0.0;
        for (int i = 0; i < lst.size(); i++) {
            current += lst.get(i).getRatio();
            lst.get(i).setRatio(current);
        }
        Random random = new Random();
        double v = random.nextDouble();
        List<Range> collect = lst.stream().filter(s -> s.getRatio() > v).collect(Collectors.toList());
        return collect.get(0).getValue();
    }


    public static void main(String[] args) throws Exception {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int count10 = 0;
        for (int i = 0; i < 1000000; i++) {
            if (1 == RandomUtil.generate()) {
                count1++;
            }
            if (2 == RandomUtil.generate()) {
                count2++;
            }
            if (3 == RandomUtil.generate()) {
                count3++;
            }
            if (5 == RandomUtil.generate()) {
                count5++;
            }
            if (10 == RandomUtil.generate()) {
                count10++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count5);
        System.out.println(count10);
    }
}

@Data
class Range {
    private int value;
    private double weight;
    private double ratio;

    public Range(int value, double weight) {
        this.value = value;
        this.weight = weight;
    }
}
