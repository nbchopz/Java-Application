//# 1. ArrayIndexOutOfBoundsException


public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}


//# 2. ClassCastException


public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object object = "Hello";
        try {
            int result = (int) object;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}

//# 3. NullPointerException

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String string = null;
        try {
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}


//# 4. NumberFormatException

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String string = "Hello";
        try {
            int result = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}


//# 5. RuntimeException

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("RuntimeException thrown");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}


//# 6. StringIndexOutOfBoundsException


public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String string = "Hello";
        try {
            System.out.println(string.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}


//# 7. TypeNotPresentException


public class TypeNotPresentExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}


//# 8. UnsupportedOperationException

public class UnsupportedOperationExceptionExample {
    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException("UnsupportedOperationException thrown");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException caught: " + e.getMessage());
        }
    }
}


//# 9. IllegalArgumentException


public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("IllegalArgumentException thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}



//# 10. InterruptedException


public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught: " + e.getMessage());
            }
        });
        thread.start();
        thread.interrupt();
    }
}


