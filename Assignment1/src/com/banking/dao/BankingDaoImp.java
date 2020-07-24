package com.banking.dao;

import com.banking.beans.Account;
import com.banking.beans.Loan;
import com.banking.beans.Transaction;

public class BankingDaoImp implements BankingDao {
	
	Transaction[] accounts = new Transaction[10];
	private static int i = 0;
	int amount = 0;

	@Override
	public int depositAmount(String accId, int amt) {
		
		for(Account acc : accounts) {
			if(acc.getAccountId().equals(accId)) {
				amount = acc.getDepositAmount()+amt;
				acc.setDepositAmount(acc.getDepositAmount()+amt);
				System.out.println("Deposit succesful");
				break;
			}
		}
		return amount;
	}

	@Override
	public int withdrawAmount(String accId, int amt) {
		// TODO Auto-generated method stub
		for(Account ac : accounts) {
			if(ac.getAccountId().equals(accId)) {
				amount = ac.getDepositAmount()-amt;
				ac.setDepositAmount(ac.getDepositAmount()+amt);
				System.out.println("Withdraw succesful");
				break;
			}
		}
		return amount;
	}

	@Override
	public Account showAccountDetails(String accountNo) {
		for(Account acc : accounts) {
			if(acc.getAccountId().equals(accountNo)) {
				return acc;
			}
		}
		return null;
	}

	@Override
	public void createAccount(Account account) {
		if(i<9)
			accounts[i++]=(Transaction) account;
		else
			System.out.println("Array size full");
		
	}

	@Override
	public int getLoan(long loanId, int lamt) {
		// TODO Auto-generated method stub
		int loanBal = 0;
		for(Loan l : accounts) {
			if(l.getLoanId()==loanId) {
				loanBal = l.getLoanAmount()+lamt;
				l.setLoanAmount(loanBal);
			}
		}
		return loanBal;
	}

	@Override
	public Loan showLoanDetails(long loanId) {
		for(Loan l : accounts) {
			if(l.getLoanId()==loanId) {
				return l;
			}
		}return null;
	}

	@Override
	public int payLoan(long loanId, int lamt) {
		int loanBal = 0;
		for(Loan l : accounts) {
			if(l.getLoanId()==loanId) {
				loanBal = l.getLoanAmount()-lamt;
				l.setLoanAmount(loanBal);
			}
		}
		return loanBal;
		
	}
}
