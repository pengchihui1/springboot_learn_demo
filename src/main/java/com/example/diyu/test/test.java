@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests{
 @Autowired
 Person person;
 
 @Test
 public void contextloads(){
     System.out.println(person)
 }

}

