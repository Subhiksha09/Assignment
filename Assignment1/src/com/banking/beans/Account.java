package com.banking.beans;


public class Account {
	
		private String accountId;
		private String accountName;
		private Address address;
		private int depositAmount;
		
		public String getDetails() {
			return getAccountName()+" "+getAccountId()+" "+address.getCity()+" "+address.getState()+" "+getDepositAmount();
		}
		
		public void shpowDetails() {
			System.out.println("Account Name :"+getAccountName());
			System.out.println("Account Id : "+getAccountId());
			System.out.println("Address : "+getAddress().getCity()+" "+getAddress().getState());
			System.out.println("Deposit Amount is :"+getDepositAmount());
		}
		
		
		
		@Override
		public String toString() {
			return "Account [accountId=" + accountId + ", accountName=" + accountName + ", city=" + address.getCity()+" state= "+address.getState()
					+ ", depositAmount=" + depositAmount + "]";
		}

		public String getAccountId() {
			return accountId;
		}
		public Account() {
			super();
		}
		public Account(String accountId, String accountName, Address addres, int depositAmount) {
			super();
			this.accountId = accountId;
			this.accountName = accountName;
			this.address = addres;
			this.depositAmount = depositAmount;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddres(Address addres) {
			this.address = addres;
		}
		public int getDepositAmount() {
			return depositAmount;
		}
		public void setDepositAmount(int depositAmount) {
			this.depositAmount = depositAmount;
		}
		
	}
