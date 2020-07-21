package com.wipro.ccbill.entity;
import com.wipro.ccbill.exception.*;
import java.util.Date;
public class CreditCardBill {
private String creditCardNo;
private String customerId;
private Date billDate;
private Transaction monthTransactions[];
public CreditCardBill()
{
	super();
}
public CreditCardBill(String creditCardNo,String customerId,Date billDate,Transaction monthTransactions[])
{
	this.creditCardNo=creditCardNo;
	this.customerId=customerId;
	this.billDate=billDate;
	this.monthTransactions=monthTransactions;
}
public String getCreditCardNo() {
	return creditCardNo;
}
public void setCreditCardNo(String creditCardNo) {
	this.creditCardNo = creditCardNo;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public Date getBillDate() {
	return billDate;
}
public void setBillDate(Date billDate) {
	this.billDate = billDate;
}
public Transaction[] getMonthTransactions() {
	return monthTransactions;
}
public void setMonthTransactions(Transaction[] monthTransactions) {
	this.monthTransactions = monthTransactions;
}
public double getTotalAmount(String transactionType)
{
	int len=monthTransactions.length;
	double sum=0;
	if(transactionType.equals("DB"))
	{
		for(Transaction t:monthTransactions) {
			if(t.getTransactionType().equals("DB")) {
			sum=sum+t.getTransactionAmount();
			}
	}
	}
	else if(transactionType.equals("CR"))
	{
		for(Transaction t:monthTransactions)
		{
			if(t.getTransactionType().equals("CR")) {
			sum=sum+t.getTransactionAmount();
			}
		}
	}
	return sum;
	
}
public String validateData()throws InputValidationException
{
	if(!(creditCardNo!=null && creditCardNo.length()==16 && customerId!=null && customerId.length()>=6))
	{
		throw new InputValidationException();
	}
	else
	{
		return "valid";
	}
}
public double calculateBillAmount()throws InputValidationException
{
if(!validateData().equals("valid"))	
{
	return 0.0;
}
if(monthTransactions.length==0 || monthTransactions==null)
{
	return 0.0;
}
double outstanding_amount=getTotalAmount("DB")-getTotalAmount("CR");
double interest=(outstanding_amount*(19.9/12))/100.0;
		return outstanding_amount+interest;
}
}
