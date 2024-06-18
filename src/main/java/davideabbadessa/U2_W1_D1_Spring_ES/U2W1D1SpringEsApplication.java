package davideabbadessa.U2_W1_D1_Spring_ES;

import davideabbadessa.U2_W1_D1_Spring_ES.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1SpringEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(U2W1D1SpringEsApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigMenu.class);
        Menu menu = context.getBean(Menu.class);
        menu.stampaMenu();
    }

}
