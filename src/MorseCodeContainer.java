import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeContainer {
    private HashMap<String,String> morseToEnglish=new HashMap<>();
    private HashMap<String,String> englishToMorse=new HashMap<>();
    private final static String morseCodeData="A:.-:B:-...:C:-.-.:D:-..:E:.:F:..-.:G:--.:H:....:I:..:J:.---:K:-.-:L:.-..:M:--:N:-.:O:---:P:.--.:Q:--.-:R:.-.:S:...:T:-:U:..-:V:...-:W:.--:X:-..-:Y:-.--:Z:--..:1:.----:2:..---:3:...--:4:....-:5:.....:6:-....:7:--...:8:---..:9:----.:0:-----:,:--..--:.:.-.-.-:?:..--..:/:-..-.:-:-....-:(:-.--.:):-.--.-";
    MorseCodeContainer()
    {
        String[]morseCodeDataSpilt=morseCodeData.split(":");
        for(int i=0;i<morseCodeDataSpilt.length;i+=2)
        {
            englishToMorse.put(morseCodeDataSpilt[i],morseCodeDataSpilt[i+1]);
            morseToEnglish.put(morseCodeDataSpilt[i+1],morseCodeDataSpilt[i]);
        }
    }

    public void englishToMorseConvertor(String text)
    {
        StringBuilder builder=new StringBuilder();
        for(char i:text.toCharArray())
        {
            String letter=Character.toString(i);
            builder.append(englishToMorse.get(letter)+" ");
        }
        System.out.println(text+" in english is : "+builder);
    }

    public void morseToEnglishConvertor(String text)
    {
        StringBuilder builder=new StringBuilder();
        String[] dataSplitArray=text.split(" ");
        for(String i:dataSplitArray)
        {
            builder.append(morseToEnglish.get(i));
        }
        System.out.println(text+" in morsecode is : "+builder);
    }
}
