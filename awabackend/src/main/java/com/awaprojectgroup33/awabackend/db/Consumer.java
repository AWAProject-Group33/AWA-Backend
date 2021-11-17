package com.awaprojectgroup33.awabackend.db;

import javax.persistence.*;


@Entity(name = "Consumer")
@Table(
    name = "consumer",
    uniqueConstraints = {
        @UniqueConstraint(name = "consumer_email_unique", columnNames = "email")
    }
)
public class Consumer {

    @Id
    @SequenceGenerator(
        name = "consumer_sequence",
        sequenceName = "consumer_sequence",
        allocationSize = 1
        
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "consumer_sequence"
    )
    @Column(
        name = "id",
        updatable = false,
        nullable = false
    )
    private long id;

    @Column(
        name = "first_name",
        nullable = false
    )
    private String firstName;

    @Column(
        name = "last_name",
        nullable = false
    )
    private String lastName;

    @Column(
        name = "email",
        nullable = false
    )
    private String email;

    @Column(
        name = "encrypted_password",
        nullable = false,
        length = 1000
    )
    private String password;



    public Consumer() { //empty constructor
    }


    public Consumer(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /*
    public void selectConsumer() {

        String url = "jdbc:postgresql://localhost/awa_database";
        String user = "postgres";
        String password = "secure";

        try(Connection connection = DriverManager.getConnection(url, user, password)) {
            try(Statement statement = connection.createStatement()){
                String sql = "select * from consumer";
                try(ResultSet result = statement.executeQuery(sql)){
                    while(result.next()) {
                        String fname = result.getString("first_name");
                        long   consumer_id  = result.getlong  ("consumer_id");

						System.out.println(fname);
						System.out.println(consumer_id);
                    }
                }
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    } */   
}
