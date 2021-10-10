
public class SecondLargestElement {

	public static void main(String[] args) {
//		int size=5;
//		int []arr= {9,2,3,5,4};
//		int temp=0;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(arr[i] < arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}	
//			}
//			if(i==1)
//				break;
//		}
//		System.out.println("second largest digit : "+arr[1]);
		
		
		int [] arr= {6,7,2,90,34,65,77,3};
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i] > second_largest && arr[i] !=largest)
			{
				second_largest=arr[i];
			}
			
			
		}
		
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println(" There in no second largest element");
		}
		else
		{
			System.out.println("Second largest element : "+second_largest);
		}

	}

}
