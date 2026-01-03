package Array_ArrayList;

public class findVowelconsonantspace {
    public static void main(String[] args){
        String str="Hello world with java";
        String vowel="AEIOUaeiou";
        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(vowel.indexOf(ch) !=-1){
                System.out.println(ch+" is vowel");
                vowelcount++;
            }else if(ch==' '){
                System.out.println("Space");
            }else{
                System.out.println(ch+" is consonant ");
                consonantcount++;
            }

        }
        System.out.println(vowelcount);
        System.out.println(consonantcount);


    }
}
