// “One class should have one and only one responsibility”

// If a variable in one class is changed it doesn't have an affect in the variables in the other class

public class Person
{
    private Long personId;
    private String firstName;
    private String lastName;
    private String age;
    private List<Account> accounts;
}

public class Account
{
    private Long guid;
    private String accountNumber;
    private String accountName;
    private String status;
    private String type;
}
