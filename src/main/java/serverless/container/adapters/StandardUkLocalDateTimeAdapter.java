package serverless.container.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StandardUkLocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    private static final String DMYHMS = "dd/MM/yyyy HH:mm:ss";

    /**
     * This adapter will convert a UK date to LocalDateTime for the SET.
     * For a GET it will convert the LocalDateTime to a String in the UK Date format.
     *
     * @param dateString String
     * @return LocalDateTime
     * @throws Exception Exception
     */
    @Override
    public LocalDateTime unmarshal(String dateString) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DMYHMS);
        return LocalDateTime.parse(dateString, formatter);
    }

    /**
     * This method will format the datetime into the format set by the static variable at the top
     * of the file.
     *
     * @param dateTime LocalDateTime
     * @return String
     * @throws Exception Exception
     */
    @Override
    public String marshal(LocalDateTime dateTime) throws Exception {
        if (dateTime != null) {
            return dateTime.format(DateTimeFormatter.ofPattern(DMYHMS));
        }
        return null;
    }
}
