package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorisationTest {
    DataBase db;
    Authorisation auth;
    @BeforeEach
    void setUp() {
        db = new DataBase();
        auth = new Authorisation();
    }

    @Test
    void authorise() {
        assertEquals(db.getUserData(), "hello");
        assertEquals(db.getStaticData(), "hello2");
        assertEquals(auth.authorise(db), true);
    }
}