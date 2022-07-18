import java.util.Date;
import java.util.List;

@Component
@configurationProperties(prefix='person')
public class Person{

    private String lastName;
    private Integer age;
    private Boolean bass;
    private Date birth;
    
    private Map<String,Object> maps;
    private List<Object> list;

    private Dog dog;

    public void setLastName(String name){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAge(Integer age){
        this.age=age;
    }

    public Integer getAge(){
        return age;
    }

    public void setBass(Boolean bass){
        this.bass=bass;
    }

    public String getBass(){
        return bass;
    }

    public void setBirth(Date birth){
        this.birth=birth;
    }

    public Date getBirth(){
        return birth;
    }

    public void setBass(Map<String,Object> maps){
        this.maps=maps;
    }

    public Map<String,Object>  getMaps(){
        return maps;
    }

    public void setList(List<Object> list){
        this.list=list;
    }

    public String getList(){
        return list<List>
    }
}