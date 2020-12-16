package evaluation;

import java.util.Arrays;

/*
* Author : dani
*Date: Dec. 16, 2020
*/
public class evaluationmethode
	{

		public static void main(String[] args)
			{
				int []myTab= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
				System.out.println(Arrays.toString(myTab));
				System.out.println(moyenneNotes(myTab)); 
				

			}
		//methode pour identifier tout les nombres impairs
		
		static int [] nombreImpair(int [] a)
		{
				//trouver les nombres pairs
				int b=evaluationmethode.nombreImpairs(a);
				for (int i=b;i<a.length-1;i++)
				{
					a[i]=a[i+1]; //declarer les elements
				}
				return a;
				
		}
		
		static int nombreImpairs(int a[])
		{
			int cpt=0; //compteur
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2==0)//si le nombre est pair
				cpt++;
			}
			return cpt;
				
						
				
					
			}
		static double moyenneNotes(int [] a)
			{
				int somme=0;
				for(int i=0;i<a.length;i++)
				{
					somme+=a[i];  // somme = somme+a[i];
				}
				return somme/a.length;
				
			}
			
			
		}
		
		

