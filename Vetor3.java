public class Vetor3 
{
    public static void main(String[] args) 
    {
    
        String meses[]={"Janeiro", "fevereiro", "março", "abril", "junho","julho", "agosto","setembro","outubro","novembro","dezembro"};
        System.out.println("1 semestre");
        for (int i = 0; i <(meses.length)/2; i++) 
        
        {
                System.out.println(meses[i]);

        }
        System.out.println("2 semestre");
        for (int i = 6; i < meses.length; i++) 
        {
            System.out.println(meses[i]);
        }
    }
    
}
