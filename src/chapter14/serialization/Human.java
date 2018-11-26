package chapter14.serialization;

import java.io.Serializable;

public class Human implements Serializable {

    private int age = 0;

    private String name = "";

    /**
     * Transient property should not be serialized
     */
    private transient String nickname = "";

    public Human(int age, String name, String nickname) {
        this.age = age;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Human: age:" + this.age + ", name:" + this.name;
    }
}
