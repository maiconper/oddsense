package com.oddsense.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.oddsense.model.Bet;
import com.oddsense.model.FixtureBet;

import java.io.IOException;

public class FixtureBetSerializer extends JsonSerializer<FixtureBet> {

    @Override
    public void serialize(FixtureBet value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeObjectField("fixture", value.getFixture());
        gen.writeArrayFieldStart("bets");
        for (Bet bet : value.getFixtureBets()) {
            gen.writeStartObject();
            gen.writeNumberField("id", bet.getId());
            gen.writeNumberField("fixtureId", bet.getFixtureId());
            gen.writeNumberField("houseName", bet.getFixtureId());
            gen.writeNumberField("houseName", bet.getFixtureId());
            gen.writeNumberField("houseName", bet.getFixtureId());
            gen.writeNumberField("houseName", bet.getFixtureId());
            gen.writeNumberField("houseName", bet.getFixtureId());
            gen.writeEndObject();
        }
        gen.writeEndArray();
        gen.writeEndObject();
    }
}
