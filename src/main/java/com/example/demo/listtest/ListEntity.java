package com.example.demo.listtest;

import java.util.Objects;

public class ListEntity {
    private String id;
    private int age;

    public ListEntity(String id) {
        this.id = id;
    }

    public ListEntity(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ListEntity{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListEntity that = (ListEntity) o;
        return id.equals(that.id);
    }


}
