package studydemo;



public class Kids extends ManKind
{
   int yearsOld;
   public void printAge() {
	   System.out.println(yearsOld);
   }
   public void setyearsold(int yearsold) {
	   this.yearsOld=yearsold;//¸øyearsOld¸³Öµ
   }
   public static void main(String args[]) {
	   Kids somekid=new Kids();
	   somekid.sex=1;
	   somekid.salary=1;
	   somekid.manorwoman(somekid.sex);
	   somekid.setyearsold(20);
	   somekid.printAge();
   }
}
