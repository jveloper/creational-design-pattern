package builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserBuilder {

    String firstName;
    String lastName;
    Integer age;
    String address;
    String phone;

    public UserBuilder(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UserBuilder address(String address){
        this.address = address;
        return this;
    }

    public UserBuilder phone(String phone){
        this.phone = phone;
        return this;
    }

    public User build(){
        return new User(this);
   }

}
