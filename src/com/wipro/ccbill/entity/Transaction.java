package com.wipro.ccbill.entity;
import java.util.Date;
public class Transaction {
private String creditCardNo;
private Date daateOfTransaction;
private String transactionDesc;
private double transactionAmount;
private String transactionType;
public Transaction()
{
	
}
public Transaction(String creditCardNo,Date daateOfTransaction,String transactionDesc,double transactionAmount,String transactionType)
{
	this.creditCardNo=creditCardNo;
	this.daateOfTransaction=daateOfTransaction;
	this.transactionDesc=transactionDesc;
	this.transactionAmount=transactionAmount;
	this.transactionType=transactionType;
}
public String getCreditCardNo() {
	return creditCardNo;
}
public void setCreditCardNo(String creditCardNo) {
	this.creditCardNo = creditCardNo;
}
public Date getDaateOfTransaction() {
	return daateOfTransaction;
}
public void setDaateOfTransaction(Date daateOfTransaction) {
	this.daateOfTransaction = daateOfTransaction;
}
public String getTransactionDesc() {
	return transactionDesc;
}
public void setTransactionDesc(String transactionDesc) {
	this.transactionDesc = transactionDesc;
}
public double getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(double transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

}
