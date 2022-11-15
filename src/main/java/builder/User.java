package builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {

    String firstName;
    String lastName;
    Integer age;
    String address;
    String phone;

    public User(UserBuilder userBuilder) {

        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;

    }

}
