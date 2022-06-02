package app.core;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class MapMain {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");
        
        Map<String, BankAccount> accts = new HashMap<>();

        //? Loop through the names in the list
        for (String n: names) {
            
            //? Instantiate (Create) accounts
            BankAccount acct = new BankAccount(n);

            //? put() method of HashMap is used to insert a mapping into a map.
            accts.put(acct.getAccountId(),acct);
        }
        
        // // ? Instantiate (Create) accounts
        // BankAccount fred = new BankAccount("fred");
        // BankAccount barney = new BankAccount("barney");
        // BankAccount wilma = new BankAccount("wilma");
        // BankAccount betty = new BankAccount("betty");

        // // ? Create a simple map where the key is the bank id. Value is the bank account
        // accts.put(fred.getAccountId(), fred);
        // accts.put(barney.getAccountId(), barney);
        // accts.put(wilma.getAccountId(), wilma);
        // accts.put(betty.getAccountId(), betty);

        // System.out.printf("size: %d\n", accts.size());
        // System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));
        // System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet(); // Because the key for the map is a String
        Collection<BankAccount> values = accts.values();

        BankAccount name;

        // ? How to iterate keys - For Each Loop
        for (String acctId : keys) {
            name = accts.get(acctId); 
            System.out.printf("Account ID = %s, Name = %s \n", acctId, name.getName());
        }
    }
}