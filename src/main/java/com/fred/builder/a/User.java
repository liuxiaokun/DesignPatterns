/**
 * @author Fred Liu <fredliu@augmentum.com.cn>
 * @version 1.6
 * @since Jan 26, 2015
 */
package com.fred.builder.a;

public class User {

    // necessary property.
    private String username;
    private String password;

    // optional.
    private Integer age;
    private String avatar;

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.age = builder.age;
        this.avatar = builder.avatar;
    }

    public static class Builder {

        private String username;
        private String password;

        private Integer age;
        private String avatar;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", age=" + age + ", avatar=" + avatar + "]";
    }

}
