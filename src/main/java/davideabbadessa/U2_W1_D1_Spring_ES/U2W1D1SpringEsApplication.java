package davideabbadessa.U2_W1_D1_Spring_ES;

import davideabbadessa.U2_W1_D1_Spring_ES.entities.Menu;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Ordine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1SpringEsApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(U2W1D1SpringEsApplication.class);

    @Value("${costo.coperto}")
    private double costoCoperto;


    public static void main(String[] args) {
        SpringApplication.run(U2W1D1SpringEsApplication.class, args);

//        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigMenu.class);
//        Menu menu = context.getBean(Menu.class);
//        menu.stampaMenu();

    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigMenu.class);
        Menu menu = context.getBean(Menu.class);

        Ordine ordine1 = context.getBean("ordine1", Ordine.class);
        Ordine ordine2 = context.getBean("ordine2", Ordine.class);
        Ordine ordine3 = context.getBean("ordine3", Ordine.class);

        logger.info("Menù:");
        menu.stampaMenu();
        logger.info("\n\t<--------------->");

        logger.info("Ordine 1:");
        logger.info(ordine1.toString());
        logger.info("\n\t<--------------->");

        logger.info("Ordine 2:");
        logger.info(ordine2.toString());
        logger.info("\n\t<--------------->");

        logger.info("Ordine 3:");
        logger.info(ordine3.toString());
        logger.info("\n\t<--------------->");
    }

}
