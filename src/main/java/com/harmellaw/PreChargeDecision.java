package com.harmellaw;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {

    private Map<Suspect, OffenceAdvice> offenceAdvise = new HashMap<>();

    public void recordAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        offenceAdvise.put(suspect, advice);
    }

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvise.get(suspect);
    }

}
