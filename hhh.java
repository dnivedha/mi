public class TitleCase 
{

    String title(String sent)
    {   
        sent =sent.trim();
        sent = sent.toLowerCase();
        String[] str1=new String[sent.length()];
        for(int k=0;k<=str1.length-1;k++){
            str1[k]=sent.charAt(k)+"";
    }

        for(int i=0;i<=sent.length()-1;i++){
            if(i==0){
                String s= sent.charAt(i)+"";
                str1[i]=s.toUpperCase();
                }
            if(str1[i].equals(" ")){
                String s= sent.charAt(i+1)+"";
                str1[i+1]=s.toUpperCase();
                }

            System.out.print(str1[i]);
            }

        return "";
        }

    public static void main(String[] args) {
        TitleCase a = new TitleCase();
        System.out.println(a.title("enter your Statement!"));
    }
}
