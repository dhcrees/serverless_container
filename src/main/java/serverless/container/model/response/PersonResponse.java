package serverless.container.model.response;

import serverless.container.adapters.StandardUkLocalDateTimeAdapter;
import serverless.container.model.person.Person;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PersonResponse {
    private String timeStamp;
    @XmlJavaTypeAdapter(StandardUkLocalDateTimeAdapter.class)  // Example using an adapter
    private LocalDateTime upDated;
    private Integer count;
    private List<Person> persons;


    public String getTimeStamp() {
        LocalDateTime today = LocalDateTime.now();
        return today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDateTime getUpDated() {
        return LocalDateTime.now();
    }

    public void setUpDated(LocalDateTime upDated) {
        this.upDated = upDated;
    }

    public Integer getCount() {
        return this.persons.size();
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
