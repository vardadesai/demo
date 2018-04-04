package trial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeClass
	public void launch()
	{
		System.out.println("Launch the application");
	}
	
	@AfterClass
		public void quit(){
		System.out.println("close the application");
		}
	
	@BeforeMethod
	public void login(){
		System.out.println("login to the application");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("logout to the application");
	}
	
  @Test(groups={"reg","smk"})
  public void a_createcust() {
	  System.out.println("create a customer");
  }
  
  @Test(groups={"smk"})
  public void b_deletecust() {
	  System.out.println("delete a customer");
  }
  
  @Test(groups={"reg"})
  public void c_modifycust() {
	  System.out.println("modify a customer");
  }
  
}
