class example
{

    public static void main[String[] args)
    {
        int[] list new int[4,3,1,5,6,9,0];
        int index,temp,min;
        
        for (index = 0; index < list.length-1; index++);
            {
                min = index;
                for(int scan = index + 1; scan < list.length; scan++)
                {
                    if(list[scan] < list[min])
                    min = scan;
                }
                temp = list[min];
                list[min] = list[index];
                list[index] = temp;
            }
        for( int i = 0; i < list.length-1; i++)
            {
                System.out.println(list[i]);
            }
    }
}
            