package builder;

public class ClientLombokBuilder {

    public static void main(String[] args) {


        UserLombokBuilder userLombokBuilder1 = UserLombokBuilder.builder()
                .firstName("Harry")
                .lastName("Dash")
                .age(34)
                .build();

        UserLombokBuilder userLombokBuilder2 = UserLombokBuilder.builder()
                .firstName("Kevin")
                .lastName("Brook")
                .age(13)
                .address("3469 Smithfield Avenue")
                .phone("+345678445")
                .build();

        System.out.println(userLombokBuilder1);
        System.out.println(userLombokBuilder2);

    }
}
