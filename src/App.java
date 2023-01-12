import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"limão","maçã", "banana", "pessego","uva"};
        String[] array2 = new String[]{"melão", "maçã", "banana", "maçã","laranja","maçã"};

        List<String> answerArray = new ArrayList<>();

        for(int i = 0; i<array1.length;i++){
            for(int j = 0; j<array2.length;j++){
                if(array1[i]==array2[j]){
                    if(!answerArray.contains(array1[i])){
                        answerArray.add(array1[i]);
                    }
                }
            }
        }
        
        for(int i = 0; i<answerArray.size();i++){
            System.out.println(answerArray.get(i));
        }
    }
}
