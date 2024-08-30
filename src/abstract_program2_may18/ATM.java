package abstract_program2_may18;

public abstract class ATM implements Password {
	int balance=Password.balance;
	public ATM()
	{
	}
	@Override
	public boolean withdrawal_cash(int enterPassword,int enterBalance)
	{
		if(enterPassword==password)
		{
			if(enterBalance>0&&enterBalance<=balance)
			{
		     balance=balance-enterBalance;
				return true;
			}
			else
				return false;
		}
		else 
			return false;
	}
	@Override
	public boolean money_transfer(int enterPassword,int enterBalance)
	{
		if(enterPassword==password)
		{
			if(enterBalance>0&&enterBalance<=balance)
			{
			balance=balance-enterBalance;
				return true;
			}
			else
			    return false;
		}
		else
			return false;
	}

	public abstract void display();
	
}
