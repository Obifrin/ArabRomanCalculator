import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class ThatISRoman {
    TreeMap<Character,Integer > KeyMap = new TreeMap<>();

    ThatISRoman(){
        KeyMap.put('I',1);
        KeyMap.put('V',5);
        KeyMap.put('X',10);
        KeyMap.put('L',50);
        KeyMap.put('C',100);
        KeyMap.put('D',500);
        KeyMap.put('M',1000);

    }
    boolean MyRoman1(String number){
        return KeyMap.containsKey(number.charAt(0));
    }
}
class Main{
    static int answer;
    static int value1;
    static int value2;
    static String finalAnswer;

    public static String calc (String expression) throws Exception {
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<Integer,String> mapa2 = new HashMap<>();
        mapa.put("I",1);      mapa2.put(1,"I");
        mapa.put("II",2);     mapa2.put(2,"II");
        mapa.put("III",3);    mapa2.put(3,"III");
        mapa.put("IV",4);     mapa2.put(4,"IV");
        mapa.put("V",5);      mapa2.put(5,"V");
        mapa.put("VI",6);     mapa2.put(6,"VI");
        mapa.put("VII",7);     mapa2.put(7,"VII");
        mapa.put("VIII",8);     mapa2.put(8,"VIII");
        mapa.put("IX",9);     mapa2.put(9,"IX");
        mapa.put("X",10);     mapa2.put(10,"X");
        mapa.put("XI",11);    mapa2.put(11,"XI");
        mapa.put("XII",12);    mapa2.put(12,"XII");
        mapa.put("XIII",13);    mapa2.put(13,"XIII");
        mapa.put("XIV",14);    mapa2.put(14,"XIV");
        mapa.put("XV",15);    mapa2.put(15,"XV");
        mapa.put("XVI",16);    mapa2.put(16,"XVI");
        mapa.put("XVII",17);    mapa2.put(17,"XVII");
        mapa.put("XVIII",18);    mapa2.put(18,"XVIII");
        mapa.put("XIX",19);    mapa2.put(19,"XIX");
        mapa.put("XX",20);    mapa2.put(20,"XX");
        mapa.put("XXI",21);    mapa2.put(21,"XXI");
        mapa.put("XXII",22);    mapa2.put(22,"XXII");
        mapa.put("XXIII",23);    mapa2.put(23,"XXIII");
        mapa.put("XXIV",24);    mapa2.put(24,"XXIV");
        mapa.put("XXV",25);    mapa2.put(25,"XXV");
        mapa.put("XXVI",26);    mapa2.put(26,"XXVI");
        mapa.put("XXVII",27);    mapa2.put(27,"XXVII");
        mapa.put("XXVIII",28);    mapa2.put(28,"XXVIII");
        mapa.put("XXIX",29);    mapa2.put(29,"XXIX");
        mapa.put("XXX",30);    mapa2.put(30,"XXX");
        mapa.put("XXXI",31);    mapa2.put(31,"XXXI");
        mapa.put("XXXII",32);    mapa2.put(32,"XXXII");
        mapa.put("XXXIII",33);    mapa2.put(33,"XXXIII");
        mapa.put("XXXIV",34);    mapa2.put(34,"XXXIV");
        mapa.put("XXXV",35);    mapa2.put(35,"XXXV");
        mapa.put("XXXVI",36);    mapa2.put(36,"XXXVI");
        mapa.put("XXXVII",37);    mapa2.put(37,"XXXVII");
        mapa.put("XXXVIII",38);    mapa2.put(38,"XXXVIII");
        mapa.put("XXXIX",39);    mapa2.put(39,"XXXIX");
        mapa.put("XL",40);    mapa2.put(40,"XL");
        mapa.put("XLI",41);    mapa2.put(41,"XLI");
        mapa.put("XLII",42);    mapa2.put(42,"XLII");
        mapa.put("XLIII",43);    mapa2.put(43,"XLIII");
        mapa.put("XLIV",44);    mapa2.put(44,"XLIV");
        mapa.put("XLV",45);    mapa2.put(45,"XLV");
        mapa.put("XLVI",46);    mapa2.put(46,"XLVI");
        mapa.put("XLVII",47);    mapa2.put(47,"XLVII");
        mapa.put("XLVIII",48);    mapa2.put(48,"XLVIII");
        mapa.put("XLIX",49);    mapa2.put(49,"XLIX");
        mapa.put("L",50);    mapa2.put(50,"L");
        mapa.put("LI",51);    mapa2.put(51,"LI");
        mapa.put("LII",52);    mapa2.put(52,"LII");
        mapa.put("LIII",53);    mapa2.put(53,"LIII");
        mapa.put("LIV",54);    mapa2.put(54,"LIV");
        mapa.put("LV",55);    mapa2.put(55,"LV");
        mapa.put("LVI",56);    mapa2.put(56,"LVI");
        mapa.put("LVII",57);    mapa2.put(57,"LVII");
        mapa.put("LVIII",58);    mapa2.put(58,"LVIII");
        mapa.put("LIX",59);    mapa2.put(59,"LIX");
        mapa.put("LX",60);    mapa2.put(60,"LX");
        mapa.put("LXI",61);    mapa2.put(61,"IV");
        mapa.put("LXII",62);    mapa2.put(62,"IV");
        mapa.put("LXIII",63);    mapa2.put(63,"IV");
        mapa.put("LXIV",64);    mapa2.put(64,"IV");
        mapa.put("LXV",65);    mapa2.put(65,"IV");
        mapa.put("LXVI",66);    mapa2.put(66,"IV");
        mapa.put("LXVII",67);    mapa2.put(67,"IV");
        mapa.put("LXVIII",68);    mapa2.put(68,"IV");
        mapa.put("LXIX",69);    mapa2.put(69,"IV");
        mapa.put("LXX",70);    mapa2.put(70,"LXX");
        mapa.put("LXXI",71);    mapa2.put(71,"LXXI");
        mapa.put("LXXII",72);    mapa2.put(72,"LXXII");
        mapa.put("LXXIII",73);    mapa2.put(73,"LXXIII");
        mapa.put("LXXIV",74);    mapa2.put(74,"LXXIV");
        mapa.put("LXXV",75);    mapa2.put(75,"LXXV");
        mapa.put("LXXVI",76);    mapa2.put(76,"LXXVI");
        mapa.put("LXXVII",77);    mapa2.put(77,"LXXVII");
        mapa.put("LXXVIII",78);    mapa2.put(78,"LXXVIII");
        mapa.put("LXXIX",79);    mapa2.put(79,"LXXIX");
        mapa.put("LXXX",80);    mapa2.put(80,"LXXX");
        mapa.put("LXXXI",81);    mapa2.put(81,"LXXXI");
        mapa.put("LXXXII",82);    mapa2.put(82,"LXXXII");
        mapa.put("LXXXIII",83);    mapa2.put(83,"LXXXIII");
        mapa.put("LXXXIV",84);    mapa2.put(84,"LXXXIV");
        mapa.put("LXXXV",85);    mapa2.put(85,"LXXXV");
        mapa.put("LXXXVI",86);    mapa2.put(86,"LXXXVI");
        mapa.put("LXXXVII",87);    mapa2.put(87,"LXXXVII");
        mapa.put("LXXXVIII",88);    mapa2.put(88,"LXXXVIII");
        mapa.put("LXXXIX",89);    mapa2.put(89,"LXXXIX");
        mapa.put("XC",90);    mapa2.put(90,"XC");
        mapa.put("XCI",91);    mapa2.put(91,"XCI");
        mapa.put("XCII",92);    mapa2.put(92,"XCII");
        mapa.put("XCIII",93);    mapa2.put(93,"XCIII");
        mapa.put("XCIV",94);    mapa2.put(94,"XCIV");
        mapa.put("XCV",95);    mapa2.put(95,"XCV");
        mapa.put("XCVI",96);    mapa2.put(96,"XCVI");
        mapa.put("XCVII",97);    mapa2.put(97,"XCVII");
        mapa.put("XCVIII",98);    mapa2.put(98,"XCVIII");
        mapa.put("XCIX",99);    mapa2.put(99,"XCIX");
        mapa.put("C",100);   mapa2.put(100,"C");
        ThatISRoman ThatIsRoman = new ThatISRoman();
        String[] action = {"-","+","/","*"};
        String [] DanglingQuantifier = {"-","\\+","/","\\*"};
        int actionIndex = 100;
        for(int i = 0; i < action.length; i++){
            if(expression.contains(action[i])){
                actionIndex=i;
                break;
            }
        }
        if(actionIndex == 100)throw new Exception("Незадекларированная математичесая операция");
        String [] b = expression.split(DanglingQuantifier[actionIndex]);
        if(b.length !=2)throw new Exception("Только 2 целочисленных значения");
        if(!(ThatIsRoman.MyRoman1(b[0]) == ThatIsRoman.MyRoman1(b[1]))) throw new Exception("Значения должны быть из одной системы счисления");
        boolean Roman = ThatIsRoman.MyRoman1(b[0]);
            if(Roman){
                boolean last = mapa.containsKey(b[0]);
                boolean last1 = mapa.containsKey(b[1]);
                if(!(last) || !(last1))throw new Exception(" Введите число от 1 до 10(от I до X)");
                value1 = mapa.get(b[0]);
                value2 = mapa.get(b[1]);
                if(!(value1 > 0 && value1 < 11) || !(value2 > 0 && value2 < 11))throw new Exception("Введите число от 1 до 10(от I до X)");
                switch(actionIndex){
                        case 0:
                            answer = value1-value2;
                            if(answer < 1)throw new Exception("Ответ не может быть отрицательным");
                            return finalAnswer = mapa2.get(answer);
                        case 1:
                            answer = value1+value2;
                            break;
                        case 2:
                            answer = value1/value2;
                            break;
                        case 3:
                            answer = value1*value2;
                            break;
                    }
                finalAnswer = mapa2.get(answer);
            }else{
                value1 = Integer.parseInt(b[0]);
                value2 = Integer.parseInt(b[1]);
                if(!(value1 > 0 && value1 < 11) || !(value2 > 0 && value2 < 11))throw new Exception("Введите число от 1 до 10(от I до X)");
                switch(actionIndex){
                        case 0:
                            answer = value1-value2;
                            break;
                        case 1:
                            answer = value1+value2;
                            break;
                        case 2:
                            answer = value1/value2;
                            break;
                        case 3:
                            answer = value1*value2;
                            break;
                }
                finalAnswer = Integer.toString(answer);
            }
        return finalAnswer;
    }
}
public class Calk{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите математическое выражение используя цифры и числа от 1 до 10(от I до X)");
        String a = scan.next();
        Main main = new Main();
        System.out.println(Main.calc(a));
    }
}