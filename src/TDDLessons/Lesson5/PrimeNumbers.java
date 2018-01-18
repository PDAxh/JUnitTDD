package TDDLessons.Lesson5;

public class PrimeNumbers {

        public Boolean validate( int primeNumber){
            for (int i = 2; i < (primeNumber / 2); i++) {
                if (primeNumber % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
