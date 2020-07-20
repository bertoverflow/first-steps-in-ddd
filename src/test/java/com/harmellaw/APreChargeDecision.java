package com.harmellaw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class APreChargeDecision {

    private Suspect suspect;
    private PreChargeDecision aPreChargeDecision;
    private OffenceAdvice offenceAdvice;

    @BeforeEach
    public void setup() {
        suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        offenceAdvice = new OffenceAdvice();
        aPreChargeDecision = new PreChargeDecision();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        aPreChargeDecision.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, aPreChargeDecision.getOffenceAdviceFor(suspect));
    }

}
