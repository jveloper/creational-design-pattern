package builder;

public class ClientBuilder {

    public static void main(String[] args) {

        User user1 = new UserBuilder("John", "Pick", 10).build();
        User user2 = new UserBuilder("Peter", "Back", 12).address("4100 Thompson Drive").build();
        User user3 = new UserBuilder("William", "Norris", 20).phone("+334059403").address("2099 Freed Drive").build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

    }
}
