package pom;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation_new.GenericFunctions;

public class Login {

	GenericFunctions genericFunctions;
	By toDoListBy = By.xpath("//input[@placeholder='What needs to be done?']");
	By activeButtonBy = By.xpath("//a[text()='Active']");
	By allButtonBy = By.xpath("//a[text()='All']");
	By completedButtonBy = By.xpath("//a[text()='Completed']");
	By clearCompletedBy = By.xpath("//button[@class='clear-completed']");
	By numberofListBy=By.xpath("//ul[@class='todo-list']/li");
	
	public Login()
	{
		genericFunctions = new GenericFunctions();
	}
	public void loginToURL(String ulr) throws Throwable
	{
		genericFunctions.navigateToUrl(ulr);
	}
	
	public void addToDoList(String list) throws InterruptedException
	{
		genericFunctions.enterText(toDoListBy, list);
	}
	public void clickActiveButton() {
		genericFunctions.click(activeButtonBy);
	}
	public void clickAllButton() {
		genericFunctions.click(allButtonBy);
	}
	public void clickCompletedButton() {
		genericFunctions.click(completedButtonBy);
	}
	public void selectEntryfromTodoList(String entryName)
	{
		genericFunctions.current_Driver.findElement(By.xpath("//label[text()='"+entryName+"']/preceding-sibling::input")).click();
		genericFunctions.click(clearCompletedBy);
	}
	public int numberofList() {
		int size = genericFunctions.findList(numberofListBy).size();
		return size;
	}
	public String getNameOfList(String lisName)
	{
//		String listName = genericFunctions.find(activeButtonBy)
		return genericFunctions.current_Driver.findElement(By.xpath("//label[text()='"+lisName+"']")).getText();
	}
}
