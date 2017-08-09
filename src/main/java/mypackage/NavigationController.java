package mypackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController {
	public String moveToPage1() {
		return "page1";
	}
	
	public String moveToPage2() {
		return "page2";
	}
	
	public String moveToHomePage() {
		return "home";
	}
}
