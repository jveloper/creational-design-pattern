package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class UserLombokBuilder {

    String firstName;
    String lastName;
    Integer age;
    String address;
    String phone;


}
