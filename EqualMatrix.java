public class EqualMatrix    
{    
    public static void main(String[] args) {    
        int z, c, x, v;    
        boolean flag = true;    
            
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
                    };    
              
        int b[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
            };    
              
    
          z = a.length;    
        c = a[0].length;    
            
    
          x = b.length;    
        v = b[0].length;    
            
        if(z != x || c != v){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for(int i = 0; i < z; i++){    
                for(int j = 0; j < c; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }    
    }    
}    