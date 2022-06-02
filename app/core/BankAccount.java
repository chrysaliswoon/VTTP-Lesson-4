package app.core;
import java.util.UUID;

public class BankAccount {
    private String accountId = UUID.randomUUID().toString().substring(0,8);
    private String name;

    //? What happens to the default constructor
    // When you create a class and you don't have a constructor, it is gone
    // In this case, the default constructor is gone. 
    // If we instantiate the class, we will need to at least provide a name ("You cannot create a bank account without providing a name")

    public BankAccount(String name) {
        this.name = name;
    }

    //? Getter & Setter
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 }
