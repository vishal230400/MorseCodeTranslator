public class Main {
    public static void main(String[] args)
    {
        MorseCodeContainer morseCode=new MorseCodeContainer();
        if(args.length==2) {
            if (Integer.valueOf(args[0]) == 0)
                morseCode.englishToMorseConvertor(args[1]);
            else if (Integer.valueOf(args[0]) == 1)
                morseCode.morseToEnglishConvertor(args[1]);
        }
        else
            System.out.println("Arguments mismatch");
    }
}
