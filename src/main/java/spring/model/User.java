package spring.model;

import javax.persistence.*;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String imie;

}
