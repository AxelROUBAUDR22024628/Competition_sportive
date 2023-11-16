package test.src;

import main.Participant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParticipantTest {

    @Test
    void testGetNom() {
        Participant participant = new Participant("John Doe", 50);
        Assertions.assertEquals("John Doe", participant.getNom());
    }

    @Test
    void testSetNom() {
        Participant participant = new Participant("John Doe", 50);
        participant.setNom("Jane Doe");
        Assertions.assertEquals("Jane Doe", participant.getNom());
    }

    @Test
    void testGetScore() {
        Participant participant = new Participant("John Doe", 50);
        Assertions.assertEquals(50, participant.getScore());
    }

    @Test
    void testSetScore() {
        Participant participant = new Participant("John Doe", 50);
        participant.setScore(60);
        Assertions.assertEquals(60, participant.getScore());
    }
}
