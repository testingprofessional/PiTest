package emailapp;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Email email = new Email("Test", "Case");
	  assertEquals(500, email.getMailboxCapacity(), "Mailboxcapacity must be 500");
  }
  
  @Test
  public void g() {
	  Email email = new Email("Test", "Case");
	  assertEquals(100, email.getMailboxCapacity(), "Mailboxcapacity must be 100");
  }
} 
