package com.AdvancedJava.Enum;
import java.util.Date;

// Simple Enum
public class Enum {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }

    public enum Organization{

        WHO("World Health Organization"), WTO("World Trade Organization"),
        UNICEF("United Nations Children's Fund"), WFP("World Food Programme");

        private String data;
        Organization(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

    }

    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        Date date = new Date();
        System.out.println(date);

        Organization who  = Organization.WHO;
        String value =  who.getData();
        System.out.println(who.name());
        System.out.println(who.getData() );
        for (Organization org: Organization.values()){
            System.out.println(  org.name() +": " + org.getData());
        }
}
}



