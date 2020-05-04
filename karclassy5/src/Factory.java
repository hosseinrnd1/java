public class Factory {
public static Calculate getoperator(char a) {
    switch (a) {
        case '+':
            return new CalcPlus();
        case '-':
            return new CalcMinus();
            default:
                return null;
    }
}
}
