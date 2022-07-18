package com.example.diyu.demo.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class CustomDateDeserializer extends JsonDeserializer<Date> {
    private static final Logger logger = LoggerFactory.getLogger(CustomDateDeserializer.class);

    @Override
    public Date deserialize(JsonParser parser, DeserializationContext arg1) throws IOException, JsonProcessingException {
        try {
            return DateUtils.parseDate(parser.getText(), new String []{Constants.DATE_FORMATTER});
        } catch (ParseException e) {
            logger.error("ParseException: ", e);
        }
        return null;
    }

}
