package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.utilities.Driver;

public class UserPage {
	public UserPage(){
		   PageFactory.initElements(Driver.getDriver(), this);
		   
		  }  
		  public String acct1="";
		  public String acct2="";
	
	
		  @FindBy(linkText="Open New Account")
		  public WebElement openNewAccount;
	
		  
		  @FindBy(xpath="//select[@id='type']/option[@value='0']")
		  public WebElement selectChecking;
		  
		  @FindBy(xpath="//select[@id='type']/option[@value='1']")
		  public WebElement selectSaving;
		  
		  @FindBy(xpath="//input[@value='Open New Account']")
		  public WebElement createNewAccount;
		  
		  @FindBy(xpath="//a[@id='newAccountId']")
		  public WebElement newAccountId;
		  
		  @FindBy(linkText="Log Out")
		  public WebElement logout;
		  
		  
		  @FindBy(linkText="Transfer Funds")
		  public WebElement transferFundsLink;
		  
		  @FindBy(id="amount")
		  public WebElement transferAmount;
	
		  @FindBy(xpath="//input[@value='Transfer']")
		  public WebElement transferButton;
	
		  @FindBy(xpath="//select[@id='fromAccountId']/option[2]")
		  public WebElement CheckingAccount;
		  
		  @FindBy(xpath="//select[@id='fromAccountId']/option[3]")
		  public WebElement SavingingAccount;
		  
		  @FindBy(xpath="//table[@id='accountTable']/tbody/tr[3]/td[2]")
		  public WebElement savingAccountBalance;
		  
		  @FindBy(xpath="//table[@id='accountTable']/tbody/tr[2]/td[2]")
		  public WebElement checkingAccountBalance;
		  
		
		  @FindBy(xpath="//*[@id='fromAccountId']")
		  public WebElement fromAccountId;
		  
		  @FindBy(xpath="//*[@id='toAccountId']")
		  public WebElement toAccountId;
		
		  
	
		  
	
}
