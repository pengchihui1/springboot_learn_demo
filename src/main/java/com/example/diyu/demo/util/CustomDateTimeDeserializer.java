import com.example.diyu.demo.util.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

/**
 * json由日期字符串转换为日期对象时做的转换<br>
 */
public class CustomDateTimeDeserializer extends JsonDeserializer<Date> {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Date deserialize(JsonParser parser, DeserializationContext arg1) throws IOException, JsonProcessingException {
        try {
            return DateUtils.parseDate(parser.getText(), new String[]{Constants.DATE_TIME_FORMATTER});
        } catch (ParseException e) {
            logger.error("ParseException: ", e);
        }
        return null;
    }
}