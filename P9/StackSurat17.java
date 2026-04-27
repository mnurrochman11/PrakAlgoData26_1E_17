package P9;

public class StackSurat17 {
    Surat17[] stack;
    int top;
    int size;

    public StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat17 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean cari(String nama) {
    for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.trim().equalsIgnoreCase(nama.trim())) {
            return true;
        }
    }
    return false;
}
}