public class Test {
    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.val = 1;
        obj.call(obj);
        System.out.println(obj.val);
        }
        }
        class MyClass{
        public int val;
        public void call (MyClass ref) {
        ref.val++;
        }
}
