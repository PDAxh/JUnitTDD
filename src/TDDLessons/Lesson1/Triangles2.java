package TDDLessons.Lesson1;

public class Triangles2 {
    public static boolean triangles2(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return false;
        }

        return a == b || a == c || b == c;
    }
}
