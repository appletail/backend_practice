package com.group.libraryapp.domain.user;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false, length = 20, name = "name")  // name varchar(20), name = "name"은 같은 이름일 때 생략가능
    private String name;
    private Integer age;  // age int, null이 들어가도 되고 Integer와 int는 동일하므로 어노테이션을 안써도 된다.

    protected User() {};

    public User(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
