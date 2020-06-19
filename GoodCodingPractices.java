import java.io.*;
public class GoodCodingPractices
{
	public float calculateSimpleInterest(int principalAmount, float simpleInterestRate, int numberOfYears )
	{
		float simpleInterest = ( principalAmount * simpleInterestRate * numberOfYears ) /100;
		return simpleInterest;
	}
}
