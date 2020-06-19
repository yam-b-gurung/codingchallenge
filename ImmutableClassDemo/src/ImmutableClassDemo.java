public class ImmutableClassDemo {
    public static void main(String[] args) {
        Person person = new Person("yam","gurung","yam@gmail.com","7656768789");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getEmail());
        System.out.println(person.getMobileNumber());


        //uncommenting below will give error
        //person.firstName="yam bdr";
        //person.lastName="tamu";
        //person.email="yam@yahoo.com";
        //person.mobileNumber="5186765678";
    }
}
