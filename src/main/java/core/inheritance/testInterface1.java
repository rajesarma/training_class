package core.inheritance;

public interface testInterface1 {
   public abstract long task();



   default long task1() {
      return 0;
   }

   default long task2() {
      return 202;
   }

   static long testStatic() {
      return 100;
   }

   static long testStatic1() {
      return 101;
   }
}
