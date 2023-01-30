package w2retrieval.starterproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterProjectApplication implements CommandLineRunner {

  private WgAndTxStmtRepository w2repository;

  @Autowired
  public StarterProjectApplication(WgAndTxStmtRepository w2repository) {
    this.w2repository = w2repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(StarterProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    /* 
    // fetch all w-2s
    System.out.println("W-2s found with findAll():");
    System.out.println("-------------------------------");
    for (WageAndTaxStatement w2 : repository.findAll()) {
      System.out.println(w2);
    }
    System.out.println(); 
    */

    // fetch an individual customer
    System.out.println("W-2 found with findByEmployeeSocialSecurityNumber(\"480-47-6564\"):");
    System.out.println("--------------------------------");
    System.out.println(w2repository.findByEmployeeSocialSecurityNumber("480-47-6564"));

    System.out.println("W-2s found with findByEmployerAddressState(\"AZ\"):");
    System.out.println("--------------------------------");
    for (WageAndTaxStatement w2 : w2repository.findByEmployerAddressState("AZ")) {
      System.out.println(w2);
    }

  }

}