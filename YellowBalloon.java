import java.util.Scanner;
public class YellowBalloon{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String[] list = new String[20];
        int i,cout;
        i = 0; 
        cout = 0;
        String text = "";
       while ( i < list.length ){
            text = s.nextLine();
            list[i] = text;
            if (text.equals("-1"))
                break;
            else{
                i = i+ 1;
            }
                cout = i;
       }
            
       i = 0;
      
       while (i < cout){
        System.out.print("\n");
        String line = list[i] ;
        int lineN = 0;
        line = line.replaceAll("[\\-\\?\\.\\^:\\;,']","");
        line = line.replaceAll("\\s+"," ");
   
     
        String [] parts = line.split(" ");
        int n = 0;
        for( String w : parts)
        {
            n++;        
        }
        i ++;
        System.out.print(n + " ");
        String x = line;
        
              x=x.toLowerCase(); 
              int strLength=x.length(); 
        
              char ch;
      
              int count=0;
              for(char character='a'; character<='z'; character++)
                  {
                      count = 0;
                      for(int j=0; j< strLength; j++)
                      {
                          ch=x.charAt(j); 
                          if(ch==character) 
                              count++; 
                      }
                    
                          System.out.print(count+" ");
                      
                  }
                
       }

    }
}