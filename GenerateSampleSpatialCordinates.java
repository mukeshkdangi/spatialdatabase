public class Epitrochoid {
   public static void main(String args[]) {
    double a=.5, b=.2, c=.5;
    for(double t=0.01;t<6*Math.PI;t=t+.01){
    double x = ((a + b)* Math.cos((t))) - (c*Math.cos(((a/b + 1)*t)))+ 34.019894;
    double y = ((a + b) *Math.sin((t))) - (c*Math.sin(((a/b + 1)*t)))-118.290726;
   System.out.println(y +"," + x +"," + 0+"");
 }
}