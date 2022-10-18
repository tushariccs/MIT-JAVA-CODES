class UpperCaseException extends Exception {
    UpperCaseException(String str) {
        System.out.println(str);
        toString();
    }

    public String toString() {
        return "Error occured";
    }
}

class ExceptionQ7 {
    String str;

    public void toCheck(String str) throws UpperCaseException {
        this.str = str;
        char ch[] = new char[50];
        ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                throw new UpperCaseException("Error Ocurred.....");
            }

        }
        System.out.println("Word is in valid format");

    }

    public static void main(String[] args) {
        try {
            ExceptionQ7 ev = new ExceptionQ7();
            String str = args[0];
            ev.toCheck(str);

        } catch (UpperCaseException e) {
            System.out.println(e);
        }

    }
}