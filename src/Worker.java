public class Worker {

    private String exp;
    private int num1;
    private int num2;
    private char operator;

    public Worker(String exp) {
        this.exp = exp;
        this.num1 = 0;
        this.num2 = 0;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void stringToDigit(){

        String[]words=new String[2];
        if (this.exp.length()!=0){
            words =  this.exp.split("[*]|[/]|[+]|[-]");
        }
        if((words[0].contains("I"))||(words[0].contains("V"))||(words[0].contains("X"))){
            if((words[1].contains("I"))||(words[1].contains("V"))||(words[1].contains("X"))) {
                this.num1 = parser(words[0]);
                this.num2 = parser(words[1]);
            }else {
                System.out.println("Неправильный ввод");
                System.exit(0);
            }

        }else{
            if((words[1].contains("I"))||(words[1].contains("V"))||(words[1].contains("X"))){
                System.out.println("Неправильный ввод");
                System.exit(0);

            }else {
                this.num1=Integer.parseInt(words[0]);
                this.num2=Integer.parseInt(words[1]);
            }
        }
        int operatorIndex = this.exp.length()-words[1].length()-1;
        this.operator = this.exp.charAt(operatorIndex);
    }

    public  int parser(String a){

        int answ = 0;


        switch (a){

            case "I":
                answ=1;
                break;

            case "II":
                answ=2;
                break;

            case "III":
                answ=3;
                break;

            case "IV":
                answ=4;
                break;

            case "V":
                answ=5;
                break;

            case "VI":
                answ=6;
                break;

            case "VII":
                answ=7;
                break;

            case "VIII":
                answ=8;
                break;

            case "IX":
                answ=9;
                break;

            case "X":
                answ=10;
                break;
        }
        return answ;
    }
}
