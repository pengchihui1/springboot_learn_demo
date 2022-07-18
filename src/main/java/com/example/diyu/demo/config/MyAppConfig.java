@Configuration
public class MyAppConfig{
    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean 
    public HelloService helloService(){
       return new HelloService();
    }
}