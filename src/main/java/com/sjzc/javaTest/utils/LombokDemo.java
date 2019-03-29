package com.sjzc.javaTest.utils;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 11:11 2019/3/28
 */
public class LombokDemo {
    private Integer id;
    private String name;

    LombokDemo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static LombokDemo.LombokDemoBuilder builder() {
        return new LombokDemo.LombokDemoBuilder();
    }

    public static class LombokDemoBuilder {
        private Integer id;
        private String name;

        LombokDemoBuilder() {
        }

        public LombokDemo.LombokDemoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public LombokDemo.LombokDemoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public LombokDemo build() {
            return new LombokDemo(this.id, this.name);
        }

        public String toString() {
            return "LombokDemo.LombokDemoBuilder(id=" + this.id + ", name=" + this.name + ")";
        }
    }
}