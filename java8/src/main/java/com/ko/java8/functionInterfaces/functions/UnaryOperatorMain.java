package com.ko.java8.functionInterfaces.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorMain {
    public static void main(String[] args) {
        UnaryOperator<User> operatorSetName = user -> {
                user.setName("NO_NAME");
                return user;
        };

        UnaryOperator<User> operatorSetAge = user -> {
            user.setAge(10);
            return user;
        };

        User u = new User();
        User u2 = new User();
        final User resultOnlyName = operatorSetName.apply(u);
        System.out.println(resultOnlyName);

        final Function<User, User> resultNameAndAge = operatorSetName.andThen(operatorSetAge);
        final User result = resultNameAndAge.apply(u2);
        System.out.println(result);


    }

      static class User {
        Long id;
        String name;
        Integer age;

          @Override
          public String toString() {
              return "User{" +
                      "id=" + id +
                      ", name='" + name + '\'' +
                      ", age=" + age +
                      '}';
          }

          public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public User setAge(Integer age) {
            this.age = age;
            return this;
        }

          public Long getId() {
              return id;
          }

          public void setId(Long id) {
              this.id = id;
          }
    }
}
