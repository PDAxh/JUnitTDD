package OtherProjects.Bank.Backend.Entity;


import javax.persistence.*;

@Entity
@Table



public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String age;
    private double salary;
}
