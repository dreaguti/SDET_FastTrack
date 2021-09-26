package Day3;

public class FindMistakeInMethod {
    public static void main(String[] args) {

    }

    //Find the mistake below:
    //answer: needs another return
    //compiler doesn't know math so we have to be specific with the conditions
    //if any of the conditions below aren't met, we have to write an "else statement"
    public static int camel(int n) {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return -1;
    }
}
