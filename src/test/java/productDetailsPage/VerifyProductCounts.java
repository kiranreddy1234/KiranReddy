package productDetailsPage;

import org.testng.annotations.Test;

import com.Cubic.Ecommerce.Helper.assertion.AssertionHelper;
import com.Cubic.Ecommerce.pageObjects.ApplicationText;
import com.Cubic.Ecommerce.pageObjects.LoginPage;
import com.Cubic.Ecommerce.pageObjects.NavigationMenu;
import com.Cubic.Ecommerce.pageObjects.ProductCategoryPage;
import com.Cubic.Ecommerce.testBase.TestBase;

public class VerifyProductCounts extends TestBase{
	
	LoginPage loginPage;
	NavigationMenu navigationMenu;
	
	@Test
	public void testVerifyProductCounts(){
		
		navigationMenu = new NavigationMenu(driver);
		ProductCategoryPage pCate = navigationMenu.clickOnMenu(navigationMenu.womenMenu);
		
		pCate.selectColor(ApplicationText.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==3){
			AssertionHelper.markPass();
		}
		else{
			AssertionHelper.markFail("product count is not matching");
		}
	}

}
