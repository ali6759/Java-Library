package ca.vanier.utils;

import org.springframework.data.repository.query.ReturnedType;

import ca.vanier.addresses.entity.*;

import ca.vanier.addresses.entity.Address;

public class NameItHelper {

    public static boolean isEligible(int age) {
        if (age > 17){
            return true ;
        }
            return false ;
        }

        public static boolean isReside(Customer c1 , Customer c2)
        {
         if(c1.getName().equals(c2.getName())){
            return true ;
        }
            return false;
        }


    public static String baseMyPath(String path) {

        Address address = new Address();
        address.setCity("Laval");

        return "http://localhost/" + path;
    }

}
