package com.assignment;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;	
		
	}	

}


class Player
{
	int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pguessNum=scan.nextInt();
		return pguessNum;
	}
}

class Umpire
{
	
	int numFromGuesser;
	
	int numFromPlayer[] = {0};
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer(int n)
	{
	
		Player playerobj[] = new Player[n];
		System.out.println("hi");
		
		for(int i=0;i<n;i++)
		{
			playerobj[i] = new Player();
		}

		//int numFromPlayer[] = new int[n];
		for(int i=0;i<n;i++)
		{
			numFromPlayer[i] = playerobj[i].guessNumber();
		}
		
	}
	
	void compare()
	{
		System.out.println(numFromPlayer[0]);
	
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Guesser Game");
		System.out.println("Enter number of Players");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer(n);
		u.compare();

	}

}