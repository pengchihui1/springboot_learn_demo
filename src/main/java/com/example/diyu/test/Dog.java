@Component
@configurationProperties(prefix='dog')
public class Dog{

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age){
        this.age=age;
    }

    public Integer getAge(){
        return age;
    }

}