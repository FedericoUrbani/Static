package it.develhope.static01;

public class Tester {

    public static void main(String[] args) {
        Employee emp1= new Employee("Lucrezia","Rumore","Via Rumore 18");
        Employee emp2= new Employee("Federico","Milionario","Via dei ricconi 69");

        Badge badge1= new Badge(emp1);
        Badge badge2= new Badge(emp2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }

}
