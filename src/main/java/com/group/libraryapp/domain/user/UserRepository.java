package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);  // 함수이름이 중요하다. 이름에 맞춰서 SQL이 만들어진다.
                                   // find라고 작성하면 1개의 데이터만 가져온다.
                                   // By 뒤에 붙는 필드이름으로 WHERE 문이 작성된다.

}
